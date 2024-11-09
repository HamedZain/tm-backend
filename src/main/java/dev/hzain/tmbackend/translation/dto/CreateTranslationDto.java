package dev.hzain.tmbackend.translation.dto;

import dev.hzain.tmbackend.translation.Translation;
import lombok.Data;

@Data
public class CreateTranslationDto {
  private String key;

  public Translation toTranslation() {
    Translation translation = new Translation();
    translation.setKey(key);
    return translation;
  }
}
