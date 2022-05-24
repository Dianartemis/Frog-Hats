import processing.sound.*;

SoundFile file;
PImage[] rick = new PImage[100];

void setup() {
  //file = new SoundFile(this, "roll.mp3");  /* <-- uncomment this for sound */
  //file.play();  /* <-- uncomment this for sound */
  
  /*
  * if you do choose to play the sound,
  * beware that it may run slower and
  * take longer to load
  */
   
  size(800, 570);
  smooth();
  rick[0] = loadImage("Frames/frame_000_delay-0.1s.gif");
  rick[1] = loadImage("Frames/frame_001_delay-0.1s.gif");
  rick[2] = loadImage("Frames/frame_002_delay-0.1s.gif");
  rick[3] = loadImage("Frames/frame_003_delay-0.1s.gif");
  rick[4] = loadImage("Frames/frame_004_delay-0.1s.gif");
  rick[5] = loadImage("Frames/frame_005_delay-0.1s.gif");
  rick[6] = loadImage("Frames/frame_006_delay-0.1s.gif");
  rick[7] = loadImage("Frames/frame_007_delay-0.1s.gif");
  rick[8] = loadImage("Frames/frame_008_delay-0.1s.gif");
  rick[9] = loadImage("Frames/frame_009_delay-0.1s.gif");
  rick[10] = loadImage("Frames/frame_010_delay-0.1s.gif");
  rick[11] = loadImage("Frames/frame_011_delay-0.1s.gif");
  rick[12] = loadImage("Frames/frame_012_delay-0.1s.gif");
  rick[13] = loadImage("Frames/frame_013_delay-0.1s.gif");
  rick[14] = loadImage("Frames/frame_014_delay-0.1s.gif");
  rick[15] = loadImage("Frames/frame_015_delay-0.1s.gif");
  rick[16] = loadImage("Frames/frame_016_delay-0.1s.gif");
  rick[17] = loadImage("Frames/frame_017_delay-0.1s.gif");
  rick[18] = loadImage("Frames/frame_018_delay-0.1s.gif");
  rick[19] = loadImage("Frames/frame_019_delay-0.1s.gif");
  rick[20] = loadImage("Frames/frame_020_delay-0.1s.gif");
  rick[21] = loadImage("Frames/frame_021_delay-0.1s.gif");
  rick[22] = loadImage("Frames/frame_022_delay-0.1s.gif");
  rick[23] = loadImage("Frames/frame_023_delay-0.1s.gif");
  rick[24] = loadImage("Frames/frame_024_delay-0.1s.gif");
  rick[25] = loadImage("Frames/frame_025_delay-0.1s.gif");
  rick[26] = loadImage("Frames/frame_026_delay-0.1s.gif");
  rick[27] = loadImage("Frames/frame_027_delay-0.1s.gif");
  rick[28] = loadImage("Frames/frame_028_delay-0.1s.gif");
  rick[29] = loadImage("Frames/frame_029_delay-0.1s.gif");
  rick[30] = loadImage("Frames/frame_030_delay-0.1s.gif");
  rick[31] = loadImage("Frames/frame_031_delay-0.1s.gif");
  rick[32] = loadImage("Frames/frame_032_delay-0.1s.gif");
  rick[33] = loadImage("Frames/frame_033_delay-0.1s.gif");
  rick[34] = loadImage("Frames/frame_034_delay-0.1s.gif");
  rick[35] = loadImage("Frames/frame_035_delay-0.1s.gif");
  rick[36] = loadImage("Frames/frame_036_delay-0.1s.gif");
  rick[37] = loadImage("Frames/frame_037_delay-0.1s.gif");
  rick[38] = loadImage("Frames/frame_038_delay-0.1s.gif");
  rick[39] = loadImage("Frames/frame_039_delay-0.1s.gif");
  rick[40] = loadImage("Frames/frame_040_delay-0.1s.gif");
  rick[41] = loadImage("Frames/frame_041_delay-0.1s.gif");
  rick[42] = loadImage("Frames/frame_042_delay-0.1s.gif");
  rick[43] = loadImage("Frames/frame_043_delay-0.1s.gif");
  rick[44] = loadImage("Frames/frame_044_delay-0.1s.gif");
  rick[45] = loadImage("Frames/frame_045_delay-0.1s.gif");
  rick[46] = loadImage("Frames/frame_046_delay-0.1s.gif");
  rick[47] = loadImage("Frames/frame_047_delay-0.1s.gif");
  rick[48] = loadImage("Frames/frame_048_delay-0.1s.gif");
  rick[49] = loadImage("Frames/frame_049_delay-0.1s.gif");
  rick[50] = loadImage("Frames/frame_050_delay-0.1s.gif");
  rick[51] = loadImage("Frames/frame_051_delay-0.1s.gif");
  rick[52] = loadImage("Frames/frame_052_delay-0.1s.gif");
  rick[53] = loadImage("Frames/frame_053_delay-0.1s.gif");
  rick[54] = loadImage("Frames/frame_054_delay-0.1s.gif");
  rick[55] = loadImage("Frames/frame_055_delay-0.1s.gif");
  rick[56] = loadImage("Frames/frame_056_delay-0.1s.gif");
  rick[57] = loadImage("Frames/frame_057_delay-0.1s.gif");
  rick[58] = loadImage("Frames/frame_058_delay-0.1s.gif");
  rick[59] = loadImage("Frames/frame_059_delay-0.1s.gif");
  rick[60] = loadImage("Frames/frame_060_delay-0.1s.gif");
  rick[61] = loadImage("Frames/frame_061_delay-0.1s.gif");
  rick[62] = loadImage("Frames/frame_062_delay-0.1s.gif");
  rick[63] = loadImage("Frames/frame_063_delay-0.1s.gif");
  rick[64] = loadImage("Frames/frame_064_delay-0.1s.gif");
  rick[65] = loadImage("Frames/frame_065_delay-0.1s.gif");
  rick[66] = loadImage("Frames/frame_066_delay-0.1s.gif");
  rick[67] = loadImage("Frames/frame_067_delay-0.1s.gif");
  rick[68] = loadImage("Frames/frame_068_delay-0.1s.gif");
  rick[69] = loadImage("Frames/frame_069_delay-0.1s.gif");
  rick[70] = loadImage("Frames/frame_070_delay-0.1s.gif");
  rick[71] = loadImage("Frames/frame_071_delay-0.1s.gif");
  rick[72] = loadImage("Frames/frame_072_delay-0.1s.gif");
  rick[73] = loadImage("Frames/frame_073_delay-0.1s.gif");
  rick[74] = loadImage("Frames/frame_074_delay-0.1s.gif");
  rick[75] = loadImage("Frames/frame_075_delay-0.1s.gif");
  rick[76] = loadImage("Frames/frame_076_delay-0.1s.gif");
  rick[77] = loadImage("Frames/frame_077_delay-0.1s.gif");
  rick[78] = loadImage("Frames/frame_078_delay-0.1s.gif");
  rick[79] = loadImage("Frames/frame_079_delay-0.1s.gif");
  rick[80] = loadImage("Frames/frame_080_delay-0.1s.gif");
  rick[81] = loadImage("Frames/frame_081_delay-0.1s.gif");
  rick[82] = loadImage("Frames/frame_082_delay-0.1s.gif");
  rick[83] = loadImage("Frames/frame_083_delay-0.1s.gif");
  rick[84] = loadImage("Frames/frame_084_delay-0.1s.gif");
  rick[85] = loadImage("Frames/frame_085_delay-0.1s.gif");
  rick[86] = loadImage("Frames/frame_086_delay-0.1s.gif");
  rick[87] = loadImage("Frames/frame_087_delay-0.1s.gif");
  rick[88] = loadImage("Frames/frame_088_delay-0.1s.gif");
  rick[89] = loadImage("Frames/frame_089_delay-0.1s.gif");
  rick[90] = loadImage("Frames/frame_090_delay-0.1s.gif");
  rick[91] = loadImage("Frames/frame_091_delay-0.1s.gif");
  rick[92] = loadImage("Frames/frame_092_delay-0.1s.gif");
  rick[93] = loadImage("Frames/frame_093_delay-0.1s.gif");
  rick[94] = loadImage("Frames/frame_094_delay-0.1s.gif");
  rick[95] = loadImage("Frames/frame_095_delay-0.1s.gif");
  rick[96] = loadImage("Frames/frame_096_delay-0.1s.gif");
  rick[97] = loadImage("Frames/frame_097_delay-0.1s.gif");
  rick[98] = loadImage("Frames/frame_098_delay-0.1s.gif");
  rick[99] = loadImage("Frames/frame_099_delay-0.1s.gif");
  frameRate(10);
}

void draw() {
  image(rick[frameCount%100], 100, 100);
}
