/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/video/transcoder/v1beta1/resources.proto

package com.google.cloud.video.transcoder.v1beta1;

public interface TextStreamOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.video.transcoder.v1beta1.TextStream)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The codec for this text stream. The default is `"webvtt"`.
   * Supported text codecs:
   * - 'srt'
   * - 'ttml'
   * - 'cea608'
   * - 'cea708'
   * - 'webvtt'
   * </pre>
   *
   * <code>string codec = 1;</code>
   *
   * @return The codec.
   */
  java.lang.String getCodec();
  /**
   *
   *
   * <pre>
   * The codec for this text stream. The default is `"webvtt"`.
   * Supported text codecs:
   * - 'srt'
   * - 'ttml'
   * - 'cea608'
   * - 'cea708'
   * - 'webvtt'
   * </pre>
   *
   * <code>string codec = 1;</code>
   *
   * @return The bytes for codec.
   */
  com.google.protobuf.ByteString getCodecBytes();

  /**
   *
   *
   * <pre>
   * Required. The BCP-47 language code, such as `"en-US"` or `"sr-Latn"`. For more
   * information, see
   * https://www.unicode.org/reports/tr35/#Unicode_locale_identifier.
   * </pre>
   *
   * <code>string language_code = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The languageCode.
   */
  java.lang.String getLanguageCode();
  /**
   *
   *
   * <pre>
   * Required. The BCP-47 language code, such as `"en-US"` or `"sr-Latn"`. For more
   * information, see
   * https://www.unicode.org/reports/tr35/#Unicode_locale_identifier.
   * </pre>
   *
   * <code>string language_code = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for languageCode.
   */
  com.google.protobuf.ByteString getLanguageCodeBytes();

  /**
   *
   *
   * <pre>
   * The mapping for the `Job.edit_list` atoms with text `EditAtom.inputs`.
   * </pre>
   *
   * <code>repeated .google.cloud.video.transcoder.v1beta1.TextStream.TextAtom mapping = 3;</code>
   */
  java.util.List<com.google.cloud.video.transcoder.v1beta1.TextStream.TextAtom> getMappingList();
  /**
   *
   *
   * <pre>
   * The mapping for the `Job.edit_list` atoms with text `EditAtom.inputs`.
   * </pre>
   *
   * <code>repeated .google.cloud.video.transcoder.v1beta1.TextStream.TextAtom mapping = 3;</code>
   */
  com.google.cloud.video.transcoder.v1beta1.TextStream.TextAtom getMapping(int index);
  /**
   *
   *
   * <pre>
   * The mapping for the `Job.edit_list` atoms with text `EditAtom.inputs`.
   * </pre>
   *
   * <code>repeated .google.cloud.video.transcoder.v1beta1.TextStream.TextAtom mapping = 3;</code>
   */
  int getMappingCount();
  /**
   *
   *
   * <pre>
   * The mapping for the `Job.edit_list` atoms with text `EditAtom.inputs`.
   * </pre>
   *
   * <code>repeated .google.cloud.video.transcoder.v1beta1.TextStream.TextAtom mapping = 3;</code>
   */
  java.util.List<? extends com.google.cloud.video.transcoder.v1beta1.TextStream.TextAtomOrBuilder>
      getMappingOrBuilderList();
  /**
   *
   *
   * <pre>
   * The mapping for the `Job.edit_list` atoms with text `EditAtom.inputs`.
   * </pre>
   *
   * <code>repeated .google.cloud.video.transcoder.v1beta1.TextStream.TextAtom mapping = 3;</code>
   */
  com.google.cloud.video.transcoder.v1beta1.TextStream.TextAtomOrBuilder getMappingOrBuilder(
      int index);
}
