package dev.hzain.tmbackend.translation;

import dev.hzain.tmbackend.translation.dto.CreateTranslationDto;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("translations")
public class TranslationController {
  private final TranslationService translationService;

  public TranslationController(TranslationService translationService) {
    this.translationService = translationService;
  }

  @GetMapping
  public List<Translation> getTranslations() {
    return translationService.getTranslations();
  }

  @PostMapping
  public Translation createTranslation(@RequestBody CreateTranslationDto createTranslationInput) {
    return translationService.createTranslation(createTranslationInput);
  }
}
