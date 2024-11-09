package dev.hzain.tmbackend.localization;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("localizations")
public class LocalizationController {
  private final LocalizationService localizationService;

  public LocalizationController(LocalizationService localizationService) {
    this.localizationService = localizationService;
  }

  @GetMapping
  public List<Localization> getLocalizations() {
    return localizationService.getLocalizations();
  }

  @PostMapping
  public Localization addLocalization(@RequestBody Localization localization) {
    return localizationService.createLocalization(localization);
  }
}
