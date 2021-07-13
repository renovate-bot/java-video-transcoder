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
// source: google/cloud/video/transcoder/v1/resources.proto

package com.google.cloud.video.transcoder.v1;

public interface AudioStreamOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.video.transcoder.v1.AudioStream)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The codec for this audio stream. The default is `"aac"`.
   * Supported audio codecs:
   * - 'aac'
   * - 'aac-he'
   * - 'aac-he-v2'
   * - 'mp3'
   * - 'ac3'
   * - 'eac3'
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
   * The codec for this audio stream. The default is `"aac"`.
   * Supported audio codecs:
   * - 'aac'
   * - 'aac-he'
   * - 'aac-he-v2'
   * - 'mp3'
   * - 'ac3'
   * - 'eac3'
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
   * Required. Audio bitrate in bits per second. Must be between 1 and 10,000,000.
   * </pre>
   *
   * <code>int32 bitrate_bps = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bitrateBps.
   */
  int getBitrateBps();

  /**
   *
   *
   * <pre>
   * Number of audio channels. Must be between 1 and 6. The default is 2.
   * </pre>
   *
   * <code>int32 channel_count = 3;</code>
   *
   * @return The channelCount.
   */
  int getChannelCount();

  /**
   *
   *
   * <pre>
   * A list of channel names specifying layout of the audio channels.
   * This only affects the metadata embedded in the container headers, if
   * supported by the specified format. The default is `["fl", "fr"]`.
   * Supported channel names:
   * - 'fl' - Front left channel
   * - 'fr' - Front right channel
   * - 'sl' - Side left channel
   * - 'sr' - Side right channel
   * - 'fc' - Front center channel
   * - 'lfe' - Low frequency
   * </pre>
   *
   * <code>repeated string channel_layout = 4;</code>
   *
   * @return A list containing the channelLayout.
   */
  java.util.List<java.lang.String> getChannelLayoutList();
  /**
   *
   *
   * <pre>
   * A list of channel names specifying layout of the audio channels.
   * This only affects the metadata embedded in the container headers, if
   * supported by the specified format. The default is `["fl", "fr"]`.
   * Supported channel names:
   * - 'fl' - Front left channel
   * - 'fr' - Front right channel
   * - 'sl' - Side left channel
   * - 'sr' - Side right channel
   * - 'fc' - Front center channel
   * - 'lfe' - Low frequency
   * </pre>
   *
   * <code>repeated string channel_layout = 4;</code>
   *
   * @return The count of channelLayout.
   */
  int getChannelLayoutCount();
  /**
   *
   *
   * <pre>
   * A list of channel names specifying layout of the audio channels.
   * This only affects the metadata embedded in the container headers, if
   * supported by the specified format. The default is `["fl", "fr"]`.
   * Supported channel names:
   * - 'fl' - Front left channel
   * - 'fr' - Front right channel
   * - 'sl' - Side left channel
   * - 'sr' - Side right channel
   * - 'fc' - Front center channel
   * - 'lfe' - Low frequency
   * </pre>
   *
   * <code>repeated string channel_layout = 4;</code>
   *
   * @param index The index of the element to return.
   * @return The channelLayout at the given index.
   */
  java.lang.String getChannelLayout(int index);
  /**
   *
   *
   * <pre>
   * A list of channel names specifying layout of the audio channels.
   * This only affects the metadata embedded in the container headers, if
   * supported by the specified format. The default is `["fl", "fr"]`.
   * Supported channel names:
   * - 'fl' - Front left channel
   * - 'fr' - Front right channel
   * - 'sl' - Side left channel
   * - 'sr' - Side right channel
   * - 'fc' - Front center channel
   * - 'lfe' - Low frequency
   * </pre>
   *
   * <code>repeated string channel_layout = 4;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the channelLayout at the given index.
   */
  com.google.protobuf.ByteString getChannelLayoutBytes(int index);

  /**
   *
   *
   * <pre>
   * The mapping for the `Job.edit_list` atoms with audio `EditAtom.inputs`.
   * </pre>
   *
   * <code>repeated .google.cloud.video.transcoder.v1.AudioStream.AudioMapping mapping = 5;</code>
   */
  java.util.List<com.google.cloud.video.transcoder.v1.AudioStream.AudioMapping> getMappingList();
  /**
   *
   *
   * <pre>
   * The mapping for the `Job.edit_list` atoms with audio `EditAtom.inputs`.
   * </pre>
   *
   * <code>repeated .google.cloud.video.transcoder.v1.AudioStream.AudioMapping mapping = 5;</code>
   */
  com.google.cloud.video.transcoder.v1.AudioStream.AudioMapping getMapping(int index);
  /**
   *
   *
   * <pre>
   * The mapping for the `Job.edit_list` atoms with audio `EditAtom.inputs`.
   * </pre>
   *
   * <code>repeated .google.cloud.video.transcoder.v1.AudioStream.AudioMapping mapping = 5;</code>
   */
  int getMappingCount();
  /**
   *
   *
   * <pre>
   * The mapping for the `Job.edit_list` atoms with audio `EditAtom.inputs`.
   * </pre>
   *
   * <code>repeated .google.cloud.video.transcoder.v1.AudioStream.AudioMapping mapping = 5;</code>
   */
  java.util.List<? extends com.google.cloud.video.transcoder.v1.AudioStream.AudioMappingOrBuilder>
      getMappingOrBuilderList();
  /**
   *
   *
   * <pre>
   * The mapping for the `Job.edit_list` atoms with audio `EditAtom.inputs`.
   * </pre>
   *
   * <code>repeated .google.cloud.video.transcoder.v1.AudioStream.AudioMapping mapping = 5;</code>
   */
  com.google.cloud.video.transcoder.v1.AudioStream.AudioMappingOrBuilder getMappingOrBuilder(
      int index);

  /**
   *
   *
   * <pre>
   * The audio sample rate in Hertz. The default is 48000 Hertz.
   * </pre>
   *
   * <code>int32 sample_rate_hertz = 6;</code>
   *
   * @return The sampleRateHertz.
   */
  int getSampleRateHertz();
}