import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static86 {

	@OriginalMember(owner = "client!ja", name = "b", descriptor = "I")
	public static int anInt2170;

	@OriginalMember(owner = "client!ja", name = "m", descriptor = "Lclient!bj;")
	public static Class15_Sub1 aClass15_Sub1_57;

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "Lclient!i;")
	public static Class41 aClass41_641 = Static184.method2923("Hidden)2");

	@OriginalMember(owner = "client!ja", name = "c", descriptor = "J")
	public static long aLong64 = 0L;

	@OriginalMember(owner = "client!ja", name = "f", descriptor = "Z")
	public static boolean aBoolean115 = false;

	@OriginalMember(owner = "client!ja", name = "i", descriptor = "[[S")
	public static short[][] aShortArrayArray4 = new short[][] { { 18322, 17304, 16289, 15929, 6569, 7613, 7630, 6364, 7054, 7079, 5056, 6988, 8481, 7475, 7364, 8412, -21990, -21969, -21952, -22182, -27211, -27198, -27186, -27302, 542, 555, 941, 951, 8076, 6936, 5675, 5440, 10014, 11179, 11197, 11096, 10258, 10776, 10661, 10419, -10984, -11095, -11072, -6630, -5467, -6473, -6838, -32318, -26069, -25925, -25669, 11202, 22193, 123, 111, 99, 4, 12, 24, 37, 49, 61, 74, 86, 4, 12, 24, 37, 49, 61, 74, 86, -25437, -26445, -27450, 9694, 21824, 123, 111, 99, 17814, 16801, 17837, 16697, 7341, 7496, 5330, 7384, 5268, 3230, 2223, 72, 10277, 8377, 8394, 7384, -22370, -22221, -22196, -22314, -29637, -27434, -29604, -25491, 662, 796, 933, 819, 10258, 6430, 5425, 5314, 10917, 10925, 10935, 10471, 10258, 10524, 10415, 10301, -11108, -11093, -11203, -8034, -5839, -6836, -5934, -32674, -14444, -15455, -15697, -15557, -15424, -11622, -11601, -11450, 7054, 7079, 5056, 6988, 8481, -30054, -30159, -30019, -21734, -21845, -21707, -21690, -21564, -24921, -24775, -24640, 662, 794, 811, 945, 827, 957, 5425, 5314, 11032, 10921, 11183, 11069, 11200, 4775, 3891, 3904, -18792, -19799, -20807, -20677, -20534, 123, 111, 99, 4, 12, 24, 37, 49, 61, 74, 86, 20366, 21274, 21415, 20401, 6569, 7613, 7630, 6364, 119, 92, 66, 39, 20, 4, 955, 1845, 4032, 7101, 10178, 14272, 17341, 21433, 27581, 30651, -31811, -27717, -24640, -21581, -17603, -13383, 794, 5020, 7062, 1160, 15128, 17940, 30614, -30952, -26728, -23662, -18536, -14440, -9324, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 18322, 17304, 16289, 15929, 6569, 7613, 7630, 6364, 7054, 7079, 5056, 6988, 8481, 7475, 7364, 8412, -21990, -21969, -21952, -22182, -27211, -27198, -27186, -27302, 542, 555, 941, 951, 8076, 6936, 5675, 5440, 10014, 11179, 11197, 11096, 10258, 10776, 10661, 10419, -10984, -11095, -11072, -6630, -5467, -6473, -6838, -32318, -26069, -25925, -25669, 11202, 22193, 123, 111, 99, 4, 12, 24, 37, 49, 61, 74, 86, 4, 12, 24, 37, 49, 61, 74, 86, -25437, -26445, -27450, 9694, 21824, 123, 111, 99, 17814, 16801, 17837, 16697, 7341, 7496, 5330, 7384, 5268, 3230, 2223, 72, 10277, 8377, 8394, 7384, -22370, -22221, -22196, -22314, -29637, -27434, -29604, -25491, 662, 796, 933, 819, 10258, 6430, 5425, 5314, 10917, 10925, 10935, 10471, 10258, 10524, 10415, 10301, -11108, -11093, -11203, -8034, -5839, -6836, -5934, -32674, -14444, -15455, -15697, -15557, -15424, -11622, -11601, -11450, 7054, 7079, 5056, 6988, 8481, -30054, -30159, -30019, -21734, -21845, -21707, -21690, -21564, -24921, -24775, -24640, 662, 794, 811, 945, 827, 957, 5425, 5314, 11032, 10921, 11183, 11069, 11200, 4775, 3891, 3904, -18792, -19799, -20807, -20677, -20534, 123, 111, 99, 4, 12, 24, 37, 49, 61, 74, 86, 20366, 21274, 21415, 20401, 6569, 7613, 7630, 6364, 10347, 10582, 10429, 10407, 10359, 8414, 9540, 10456, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 18322, 17304, 16289, 15929, 6569, 7613, 7630, 6364, 7054, 7079, 5056, 6988, 8481, 7475, 7364, 8412, -21990, -21969, -21952, -22182, -27211, -27198, -27186, -27302, 542, 555, 941, 951, 8076, 6936, 5675, 5440, 10014, 11179, 11197, 11096, 10258, 10776, 10661, 10419, -10984, -11095, -11072, -6630, -5467, -6473, -6838, -32318, -26069, -25925, -25669, 11202, 22193, 123, 111, 99, 4, 12, 24, 37, 49, 61, 74, 86, 4, 12, 24, 37, 49, 61, 74, 86, -25437, -26445, -27450, 9694, 21824, 123, 111, 99, 17814, 16801, 17837, 16697, 7341, 7496, 5330, 7384, 5268, 3230, 2223, 72, 10277, 8377, 8394, 7384, -22370, -22221, -22196, -22314, -29637, -27434, -29604, -25491, 662, 796, 933, 819, 10258, 6430, 5425, 5314, 10917, 10925, 10935, 10471, 10258, 10524, 10415, 10301, -11108, -11093, -11203, -8034, -5839, -6836, -5934, -32674, -14444, -15455, -15697, -15557, -15424, -11622, -11601, -11450, 7054, 7079, 5056, 6988, 8481, -30054, -30159, -30019, -21734, -21845, -21707, -21690, -21564, -24921, -24775, -24640, 662, 794, 811, 945, 827, 957, 5425, 5314, 11032, 10921, 11183, 11069, 11200, 4775, 3891, 3904, -18792, -19799, -20807, -20677, -20534, 123, 111, 99, 4, 12, 24, 37, 49, 61, 74, 86, 20366, 21274, 21415, 20401, 6569, 7613, 7630, 6364, 119, 92, 66, 39, 20, 4, 823, 809, 796, 2749, 2733, 2712, 4934, 4911, 4888, 8004, 8099, 11078, 11053, 10008, 18231, 18339, 18196, 30402, 30379, 29458, -31168, -32217, -32238, -25916, -25933, -25956, -21824, -22869, -21864, -17980, -18005, -18026, -11838, -11861, -10858, 23318, 21910, 21776, 1502, 4570, 8670, 13788, 25827, 31969, -28196, -21028, -15908, -7466, 7977, 8732, 8596, 4894, 5908, 794, 1686, -22623, -23014, 14866 }, { 4300, 3294, 3303, 3264, 4506, 4382, 4387, 5293, 7622, 7384, 8412, 7496, 86, 123, 111, 99, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4, 12, 24, 37, 49, 61, 74, 86, -25437, -26445, -27450, 9694, 21824, 123, 111, 99, 17814, 16801, 17837, 16697, 7341, 7496, 5330, 7384, 5268, 3230, 2223, 72, 10277, 8377, 8394, 7384, -22370, -22221, -22196, -22314, -29637, -27434, -29604, -25491, 662, 796, 933, 819, 10258, 6430, 5425, 5314, 10917, 10925, 10935, 10471, 10258, 10524, 10415, 10301, -11108, -11093, -11203, -8034, -5839, -6836, -5934, -32674, -14444, -15455, -15697, -15557, -15424, -11622, -11601, -11450, 7054, 7079, 5056, 6988, 8481, -30054, -30159, -30019, -21734, -21845, -21707, -21690, -21564, -24921, -24775, -24640, 662, 794, 811, 945, 827, 957, 5425, 5314, 11032, 10921, 11183, 11069, 11200, 4775, 3891, 3904, -18792, -19799, -20807, -20677, -20534, 123, 111, 99, 4, 12, 24, 37, 49, 61, 74, 86, 20366, 21274, 21415, 20401, 6569, 7613, 7630, 6364, 13766, 13745, 13726, 13890, 13743, 13852, 17602, 18605, 21660, 24000, 24997, 24088, 27972, 25903, 26904, 27193, 27175, 27156, 30020, 28975, 29976, 12482, 13485, 10392, 10692, 10669, 10776, 6717, 6695, 7830, 6971, 6951, 5910, 3389, 3369, 3356, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 18322, 17304, 16289, 15929, 6569, 7613, 7630, 6364, 7054, 7079, 5056, 6988, 8481, 7475, 7364, 8412, -21990, -21969, -21952, -22182, -27211, -27198, -27186, -27302, 542, 555, 941, 951, 8076, 6936, 5675, 5440, 10014, 11179, 11197, 11096, 10258, 10776, 10661, 10419, -10984, -11095, -11072, -6630, -5467, -6473, -6838, -32318, -26069, -25925, -25669, 11202, 22193, 123, 111, 99, 4, 12, 24, 37, 49, 61, 74, 86, 22461, -21571, 11200, 957, -10317, 5056, -31808, 123, 22453, -21579, 11191, 949, -10325, 4023, -31817, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 20366, 20401, 662, 827, 7054, 5056, -21734, -21564, -14444, -15424, 11032, 11200, 4, 123, 61, -18792, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 119, 92, 66, 39, 20, 4, 823, 809, 796, 2749, 2733, 2712, 4934, 4911, 4888, 8004, 8099, 11078, 11053, 10008, 18231, 18339, 18196, 30402, 30379, 29458, -31168, -32217, -32238, -25916, -25933, -25956, -21824, -22869, -21864, -17980, -18005, -18026, -11838, -11861, -10858, 23318, 21910, 21776, 1502, 4570, 8670, 13788, 25827, 31969, -28196, -21028, -15908, -7466, 7977, 8732, 8596, 4894, 5908, 794, 1686, -22623, -23014, 14866 } };

	@OriginalMember(owner = "client!ja", name = "l", descriptor = "Lclient!i;")
	private static Class41 aClass41_643 = Static184.method2923("Starting 3d library");

	@OriginalMember(owner = "client!ja", name = "k", descriptor = "Lclient!i;")
	public static Class41 aClass41_642 = aClass41_643;

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(I)Z")
	public static boolean method1532() {
		@Pc(8) long local8 = Static182.method2903();
		@Pc(19) int local19 = (int) (local8 - Static71.aLong52);
		if (local19 > 200) {
			local19 = 200;
		}
		Static135.anInt3153 += local19;
		Static71.aLong52 = local8;
		if (Static205.anInt4573 == 0 && Static179.anInt4160 == 0 && Static195.anInt4422 == 0 && Static184.anInt4236 == 0) {
			return true;
		} else if (Static189.aClass63_4 == null) {
			return false;
		} else {
			try {
				if (Static135.anInt3153 > 30000) {
					throw new IOException();
				}
				@Pc(61) Class2_Sub2_Sub7 local61;
				@Pc(66) Class2_Sub3 local66;
				while (Static179.anInt4160 < 20 && Static184.anInt4236 > 0) {
					local61 = (Class2_Sub2_Sub7) Static214.aClass70_18.method2203();
					local66 = new Class2_Sub3(4);
					local66.method208(1);
					local66.method199((int) local61.aLong150);
					Static189.aClass63_4.method2037(4, local66.aByteArray4);
					Static136.aClass70_11.method2208(local61.aLong150, local61);
					Static184.anInt4236--;
					Static179.anInt4160++;
				}
				while (Static205.anInt4573 < 20 && Static195.anInt4422 > 0) {
					local61 = (Class2_Sub2_Sub7) Static123.aClass89_2.method2843();
					local66 = new Class2_Sub3(4);
					local66.method208(0);
					local66.method199((int) local61.aLong150);
					Static189.aClass63_4.method2037(4, local66.aByteArray4);
					local61.method3320();
					Static94.aClass70_6.method2208(local61.aLong150, local61);
					Static205.anInt4573++;
					Static195.anInt4422--;
				}
				for (@Pc(165) int local165 = 0; local165 < 100; local165++) {
					@Pc(173) int local173 = Static189.aClass63_4.method2035();
					if (local173 < 0) {
						throw new IOException();
					}
					if (local173 == 0) {
						break;
					}
					@Pc(186) byte local186 = 0;
					Static135.anInt3153 = 0;
					if (Static48.aClass2_Sub2_Sub7_1 == null) {
						local186 = 8;
					} else if (Static26.anInt664 == 0) {
						local186 = 1;
					}
					@Pc(209) int local209;
					@Pc(233) int local233;
					@Pc(281) int local281;
					@Pc(296) int local296;
					if (local186 > 0) {
						local209 = local186 - Static68.aClass2_Sub3_3.anInt239;
						if (local173 < local209) {
							local209 = local173;
						}
						Static189.aClass63_4.method2039(Static68.aClass2_Sub3_3.anInt239, Static68.aClass2_Sub3_3.aByteArray4, local209);
						if (Static17.aByte1 != 0) {
							for (local233 = 0; local233 < local209; local233++) {
								Static68.aClass2_Sub3_3.aByteArray4[Static68.aClass2_Sub3_3.anInt239 + local233] ^= Static17.aByte1;
							}
						}
						Static68.aClass2_Sub3_3.anInt239 += local209;
						if (local186 > Static68.aClass2_Sub3_3.anInt239) {
							break;
						}
						if (Static48.aClass2_Sub2_Sub7_1 == null) {
							Static68.aClass2_Sub3_3.anInt239 = 0;
							local233 = Static68.aClass2_Sub3_3.method209();
							local281 = Static68.aClass2_Sub3_3.method163();
							@Pc(288) long local288 = (long) (local281 + (local233 << 16));
							@Pc(292) int local292 = Static68.aClass2_Sub3_3.method209();
							local296 = Static68.aClass2_Sub3_3.method185();
							@Pc(302) Class2_Sub2_Sub7 local302 = (Class2_Sub2_Sub7) Static136.aClass70_11.method2205(local288);
							Static123.aBoolean52 = true;
							if (local302 == null) {
								local302 = (Class2_Sub2_Sub7) Static94.aClass70_6.method2205(local288);
								Static123.aBoolean52 = false;
							}
							if (local302 == null) {
								throw new IOException();
							}
							Static48.aClass2_Sub2_Sub7_1 = local302;
							@Pc(333) int local333 = local292 == 0 ? 5 : 9;
							Static134.aClass2_Sub3_5 = new Class2_Sub3(local296 + local333 + Static48.aClass2_Sub2_Sub7_1.aByte4);
							Static134.aClass2_Sub3_5.method208(local292);
							Static134.aClass2_Sub3_5.method200(local296);
							Static68.aClass2_Sub3_3.anInt239 = 0;
							Static26.anInt664 = 8;
						} else if (Static26.anInt664 == 0) {
							if (Static68.aClass2_Sub3_3.aByteArray4[0] == -1) {
								Static68.aClass2_Sub3_3.anInt239 = 0;
								Static26.anInt664 = 1;
							} else {
								Static48.aClass2_Sub2_Sub7_1 = null;
							}
						}
					} else {
						local209 = Static134.aClass2_Sub3_5.aByteArray4.length - Static48.aClass2_Sub2_Sub7_1.aByte4;
						local233 = 512 - Static26.anInt664;
						if (local233 > local209 - Static134.aClass2_Sub3_5.anInt239) {
							local233 = local209 - Static134.aClass2_Sub3_5.anInt239;
						}
						if (local173 < local233) {
							local233 = local173;
						}
						Static189.aClass63_4.method2039(Static134.aClass2_Sub3_5.anInt239, Static134.aClass2_Sub3_5.aByteArray4, local233);
						if (Static17.aByte1 != 0) {
							for (local281 = 0; local281 < local233; local281++) {
								Static134.aClass2_Sub3_5.aByteArray4[local281 + Static134.aClass2_Sub3_5.anInt239] ^= Static17.aByte1;
							}
						}
						Static134.aClass2_Sub3_5.anInt239 += local233;
						Static26.anInt664 += local233;
						if (Static134.aClass2_Sub3_5.anInt239 == local209) {
							if (Static48.aClass2_Sub2_Sub7_1.aLong150 == 16711935L) {
								Static69.aClass2_Sub3_4 = Static134.aClass2_Sub3_5;
								for (local281 = 0; local281 < 256; local281++) {
									@Pc(490) Class15_Sub1 local490 = Static9.aClass15_Sub1Array1[local281];
									if (local490 != null) {
										Static69.aClass2_Sub3_4.anInt239 = local281 * 8 + 5;
										local296 = Static69.aClass2_Sub3_4.method185();
										@Pc(507) int local507 = Static69.aClass2_Sub3_4.method185();
										local490.method425(local296, local507);
									}
								}
							} else {
								Static80.aCRC32_1.reset();
								Static80.aCRC32_1.update(Static134.aClass2_Sub3_5.aByteArray4, 0, local209);
								local281 = (int) Static80.aCRC32_1.getValue();
								if (Static48.aClass2_Sub2_Sub7_1.anInt2159 != local281) {
									try {
										Static189.aClass63_4.method2043();
									} catch (@Pc(543) Exception local543) {
									}
									Static17.aByte1 = (byte) (Math.random() * 255.0D + 1.0D);
									Static136.anInt3164++;
									Static189.aClass63_4 = null;
									return false;
								}
								Static136.anInt3164 = 0;
								Static67.anInt1762 = 0;
								Static48.aClass2_Sub2_Sub7_1.aClass15_Sub1_55.method421((int) (Static48.aClass2_Sub2_Sub7_1.aLong150 & 0xFFFFL), Static134.aClass2_Sub3_5.aByteArray4, Static123.aBoolean52, (Static48.aClass2_Sub2_Sub7_1.aLong150 & 0xFF0000L) == 16711680L);
							}
							Static48.aClass2_Sub2_Sub7_1.method3314();
							Static26.anInt664 = 0;
							if (Static123.aBoolean52) {
								Static179.anInt4160--;
							} else {
								Static205.anInt4573--;
							}
							Static48.aClass2_Sub2_Sub7_1 = null;
							Static134.aClass2_Sub3_5 = null;
						} else {
							if (Static26.anInt664 != 512) {
								break;
							}
							Static26.anInt664 = 0;
						}
					}
				}
				return true;
			} catch (@Pc(617) IOException local617) {
				try {
					Static189.aClass63_4.method2043();
				} catch (@Pc(622) Exception local622) {
				}
				Static67.anInt1762++;
				Static189.aClass63_4 = null;
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(B)V")
	public static void method1533() {
		Static176.method2833(Static160.aClass80_13);
		Static201.anInt4512++;
		if (Static134.aBoolean180 && Static27.aBoolean122) {
			@Pc(28) int local28 = Static26.anInt663;
			local28 -= Static133.anInt3047;
			if (Static112.anInt2697 > local28) {
				local28 = Static112.anInt2697;
			}
			@Pc(39) int local39 = Static212.anInt4711;
			local39 -= Static183.anInt1328;
			if (Static26.anInt658 > local39) {
				local39 = Static26.anInt658;
			}
			if (local39 + Static160.aClass80_13.anInt3660 > Static45.aClass80_4.anInt3660 + Static26.anInt658) {
				local39 = Static26.anInt658 + Static45.aClass80_4.anInt3660 - Static160.aClass80_13.anInt3660;
			}
			@Pc(76) int local76 = local39 - Static120.anInt2895;
			@Pc(79) int local79 = Static160.aClass80_13.anInt3653;
			if (Static160.aClass80_13.anInt3635 + local28 > Static112.anInt2697 - -Static45.aClass80_4.anInt3635) {
				local28 = Static45.aClass80_4.anInt3635 + Static112.anInt2697 - Static160.aClass80_13.anInt3635;
			}
			@Pc(110) int local110 = local39 + Static45.aClass80_4.anInt3655 - Static26.anInt658;
			@Pc(118) int local118 = Static45.aClass80_4.anInt3642 + local28 - Static112.anInt2697;
			@Pc(123) int local123 = local28 - Static13.anInt407;
			if (Static201.anInt4512 > Static160.aClass80_13.anInt3681 && (local123 > local79 || local123 < -local79 || local76 > local79 || -local79 > local76)) {
				Static179.aBoolean258 = true;
			}
			@Pc(160) Class2_Sub5 local160;
			if (Static160.aClass80_13.anObjectArray20 != null && Static179.aBoolean258) {
				local160 = new Class2_Sub5();
				local160.anObjectArray3 = Static160.aClass80_13.anObjectArray20;
				local160.anInt947 = local110;
				local160.anInt950 = local118;
				local160.aClass80_3 = Static160.aClass80_13;
				Static176.method2835(local160);
			}
			if (Static141.anInt3252 == 0) {
				if (Static179.aBoolean258) {
					if (Static160.aClass80_13.anObjectArray9 != null) {
						local160 = new Class2_Sub5();
						local160.anObjectArray3 = Static160.aClass80_13.anObjectArray9;
						local160.aClass80_3 = Static160.aClass80_13;
						local160.anInt950 = local118;
						local160.anInt947 = local110;
						local160.aClass80_2 = Static108.aClass80_9;
						Static176.method2835(local160);
					}
					if (Static108.aClass80_9 != null && Static76.method586(Static160.aClass80_13) != null) {
						Static131.aClass2_Sub3_Sub1_2.method221(135);
						Static131.aClass2_Sub3_Sub1_2.method176(Static160.aClass80_13.anInt3649);
						Static131.aClass2_Sub3_Sub1_2.method178(Static160.aClass80_13.anInt3661);
						Static131.aClass2_Sub3_Sub1_2.method178(Static108.aClass80_9.anInt3661);
						Static131.aClass2_Sub3_Sub1_2.method206(Static108.aClass80_9.anInt3649);
					}
				} else if ((Static179.anInt4148 == 1 || Static208.method3215(Static179.anInt4150 - 1)) && Static179.anInt4150 > 2) {
					Static121.method3317();
				} else if (Static179.anInt4150 > 0) {
					Static157.method2554(Static179.anInt4150 - 1);
				}
				Static160.aClass80_13 = null;
			}
		} else if (Static201.anInt4512 > 1) {
			Static160.aClass80_13 = null;
		}
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(IIIIIIIIIIIZ)Z")
	public static boolean method1535(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) boolean arg10) {
		@Pc(11) int local11;
		for (@Pc(7) int local7 = 0; local7 < 104; local7++) {
			for (local11 = 0; local11 < 104; local11++) {
				Static168.anIntArrayArray35[local7][local11] = 0;
				Static202.anIntArrayArray15[local7][local11] = 99999999;
			}
		}
		Static168.anIntArrayArray35[arg3][arg2] = 99;
		local11 = arg3;
		Static202.anIntArrayArray15[arg3][arg2] = 0;
		@Pc(51) int local51 = arg2;
		@Pc(53) byte local53 = 0;
		Static106.anIntArray254[0] = arg3;
		@Pc(64) int local64 = 0;
		@Pc(67) int local67 = local53 + 1;
		Static84.anIntArray209[0] = arg2;
		@Pc(74) int[][] local74 = Static149.aClass42Array1[Static134.anInt3147].anIntArrayArray19;
		@Pc(76) boolean local76 = false;
		@Pc(192) int local192;
		while (local64 != local67) {
			local51 = Static84.anIntArray209[local64];
			local11 = Static106.anIntArray254[local64];
			local64 = local64 + 1 & 0xFFF;
			if (local11 == arg4 && arg0 == local51) {
				local76 = true;
				break;
			}
			if (arg1 != 0) {
				if ((arg1 < 5 || arg1 == 10) && Static149.aClass42Array1[Static134.anInt3147].method1429(local51, arg1 - 1, arg4, arg0, 1, arg6, local11)) {
					local76 = true;
					break;
				}
				if (arg1 < 10 && Static149.aClass42Array1[Static134.anInt3147].method1437(arg6, local11, arg1 - 1, arg0, 1, local51, arg4)) {
					local76 = true;
					break;
				}
			}
			if (arg7 != 0 && arg5 != 0 && Static149.aClass42Array1[Static134.anInt3147].method1439(1, arg0, arg7, local51, arg5, local11, arg4, arg9)) {
				local76 = true;
				break;
			}
			local192 = Static202.anIntArrayArray15[local11][local51] + 1;
			if (local11 > 0 && Static168.anIntArrayArray35[local11 - 1][local51] == 0 && (local74[local11 - 1][local51] & 0x12C0108) == 0) {
				Static106.anIntArray254[local67] = local11 - 1;
				Static84.anIntArray209[local67] = local51;
				local67 = local67 + 1 & 0xFFF;
				Static168.anIntArrayArray35[local11 - 1][local51] = 2;
				Static202.anIntArrayArray15[local11 - 1][local51] = local192;
			}
			if (local11 < 103 && Static168.anIntArrayArray35[local11 + 1][local51] == 0 && (local74[local11 + 1][local51] & 0x12C0180) == 0) {
				Static106.anIntArray254[local67] = local11 + 1;
				Static84.anIntArray209[local67] = local51;
				local67 = local67 + 1 & 0xFFF;
				Static168.anIntArrayArray35[local11 + 1][local51] = 8;
				Static202.anIntArrayArray15[local11 + 1][local51] = local192;
			}
			if (local51 > 0 && Static168.anIntArrayArray35[local11][local51 - 1] == 0 && (local74[local11][local51 - 1] & 0x12C0102) == 0) {
				Static106.anIntArray254[local67] = local11;
				Static84.anIntArray209[local67] = local51 - 1;
				local67 = local67 + 1 & 0xFFF;
				Static168.anIntArrayArray35[local11][local51 - 1] = 1;
				Static202.anIntArrayArray15[local11][local51 - 1] = local192;
			}
			if (local51 < 103 && Static168.anIntArrayArray35[local11][local51 + 1] == 0 && (local74[local11][local51 + 1] & 0x12C0120) == 0) {
				Static106.anIntArray254[local67] = local11;
				Static84.anIntArray209[local67] = local51 + 1;
				Static168.anIntArrayArray35[local11][local51 + 1] = 4;
				local67 = local67 + 1 & 0xFFF;
				Static202.anIntArrayArray15[local11][local51 + 1] = local192;
			}
			if (local11 > 0 && local51 > 0 && Static168.anIntArrayArray35[local11 - 1][local51 - 1] == 0 && (local74[local11 - 1][local51 - 1] & 0x12C010E) == 0 && (local74[local11 - 1][local51] & 0x12C0108) == 0 && (local74[local11][local51 - 1] & 0x12C0102) == 0) {
				Static106.anIntArray254[local67] = local11 - 1;
				Static84.anIntArray209[local67] = local51 - 1;
				local67 = local67 + 1 & 0xFFF;
				Static168.anIntArrayArray35[local11 - 1][local51 - 1] = 3;
				Static202.anIntArrayArray15[local11 - 1][local51 - 1] = local192;
			}
			if (local11 < 103 && local51 > 0 && Static168.anIntArrayArray35[local11 + 1][local51 - 1] == 0 && (local74[local11 + 1][local51 - 1] & 0x12C0183) == 0 && (local74[local11 + 1][local51] & 0x12C0180) == 0 && (local74[local11][local51 - 1] & 0x12C0102) == 0) {
				Static106.anIntArray254[local67] = local11 + 1;
				Static84.anIntArray209[local67] = local51 - 1;
				local67 = local67 + 1 & 0xFFF;
				Static168.anIntArrayArray35[local11 + 1][local51 - 1] = 9;
				Static202.anIntArrayArray15[local11 + 1][local51 - 1] = local192;
			}
			if (local11 > 0 && local51 < 103 && Static168.anIntArrayArray35[local11 - 1][local51 + 1] == 0 && (local74[local11 - 1][local51 + 1] & 0x12C0138) == 0 && (local74[local11 - 1][local51] & 0x12C0108) == 0 && (local74[local11][local51 + 1] & 0x12C0120) == 0) {
				Static106.anIntArray254[local67] = local11 - 1;
				Static84.anIntArray209[local67] = local51 + 1;
				local67 = local67 + 1 & 0xFFF;
				Static168.anIntArrayArray35[local11 - 1][local51 + 1] = 6;
				Static202.anIntArrayArray15[local11 - 1][local51 + 1] = local192;
			}
			if (local11 < 103 && local51 < 103 && Static168.anIntArrayArray35[local11 + 1][local51 + 1] == 0 && (local74[local11 + 1][local51 + 1] & 0x12C01E0) == 0 && (local74[local11 + 1][local51] & 0x12C0180) == 0 && (local74[local11][local51 + 1] & 0x12C0120) == 0) {
				Static106.anIntArray254[local67] = local11 + 1;
				Static84.anIntArray209[local67] = local51 + 1;
				Static168.anIntArrayArray35[local11 + 1][local51 + 1] = 12;
				Static202.anIntArrayArray15[local11 + 1][local51 + 1] = local192;
				local67 = local67 + 1 & 0xFFF;
			}
		}
		Static106.anInt2579 = 0;
		@Pc(815) int local815;
		if (!local76) {
			if (!arg10) {
				return false;
			}
			local192 = 1000;
			local815 = 100;
			for (@Pc(822) int local822 = arg4 - 10; local822 <= arg4 + 10; local822++) {
				for (@Pc(829) int local829 = arg0 - 10; local829 <= arg0 + 10; local829++) {
					if (local822 >= 0 && local829 >= 0 && local822 < 104 && local829 < 104 && Static202.anIntArrayArray15[local822][local829] < 100) {
						@Pc(850) int local850 = 0;
						if (local822 < arg4) {
							local850 = arg4 - local822;
						} else if (arg7 + arg4 - 1 < local822) {
							local850 = local822 + 1 - arg7 - arg4;
						}
						@Pc(883) int local883 = 0;
						if (local829 < arg0) {
							local883 = arg0 - local829;
						} else if (local829 > arg5 + arg0 - 1) {
							local883 = local829 + 1 - arg0 - arg5;
						}
						@Pc(921) int local921 = local883 * local883 + local850 * local850;
						if (local192 > local921 || local192 == local921 && local815 > Static202.anIntArrayArray15[local822][local829]) {
							local815 = Static202.anIntArrayArray15[local822][local829];
							local192 = local921;
							local51 = local829;
							local11 = local822;
						}
					}
				}
			}
			if (local192 == 1000) {
				return false;
			}
			if (arg3 == local11 && local51 == arg2) {
				return false;
			}
			Static106.anInt2579 = 1;
		}
		@Pc(991) byte local991 = 0;
		Static106.anIntArray254[0] = local11;
		local64 = local991 + 1;
		Static84.anIntArray209[0] = local51;
		local192 = local815 = Static168.anIntArrayArray35[local11][local51];
		while (arg3 != local11 || local51 != arg2) {
			if (local815 != local192) {
				Static106.anIntArray254[local64] = local11;
				local815 = local192;
				Static84.anIntArray209[local64++] = local51;
			}
			if ((local192 & 0x1) != 0) {
				local51++;
			} else if ((local192 & 0x4) != 0) {
				local51--;
			}
			if ((local192 & 0x2) != 0) {
				local11++;
			} else if ((local192 & 0x8) != 0) {
				local11--;
			}
			local192 = Static168.anIntArrayArray35[local11][local51];
		}
		if (local64 > 0) {
			Static220.method3323(arg8, Static106.anIntArray254, Static84.anIntArray209, local64);
			return true;
		} else if (arg8 == 1) {
			return false;
		} else {
			return true;
		}
	}
}
