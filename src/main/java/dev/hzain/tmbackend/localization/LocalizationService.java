package dev.hzain.tmbackend.localization;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LocalizationService {
  private final LocalizationRepository localizationsRepository;

  public LocalizationService(LocalizationRepository localizationsRepository) {
    this.localizationsRepository = localizationsRepository;
  }

  public List<Localization> getLocalizations() {
    return localizationsRepository.findAll();
  }

  public Localization createLocalization(Localization localization) {
    return localizationsRepository.save(localization);
  }
}
