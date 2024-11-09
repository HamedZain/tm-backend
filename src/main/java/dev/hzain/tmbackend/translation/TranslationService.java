package dev.hzain.tmbackend.translation;

import dev.hzain.tmbackend.translation.dto.CreateTranslationDto;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TranslationService {
  private final TranslationRepository translationRepository;

  public TranslationService(TranslationRepository translationRepository) {
    this.translationRepository = translationRepository;
  }

  public List<Translation> getTranslations() {
    return translationRepository.findAll();
  }

  public Optional<Translation> getTranslationById(Long id) {
    return translationRepository.findById(id);
  }

  public Translation createTranslation(CreateTranslationDto createTranslationInput) {
    return translationRepository.save(createTranslationInput.toTranslation());
  }
}

