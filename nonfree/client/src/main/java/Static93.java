import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static93 {

	@OriginalMember(owner = "client!ke", name = "G", descriptor = "Lclient!rf;")
	private static Class70 aClass70_889 = Static49.method1293("Ok");

	@OriginalMember(owner = "client!ke", name = "K", descriptor = "Lclient!rf;")
	public static Class70 aClass70_890 = aClass70_889;

	@OriginalMember(owner = "client!ke", name = "L", descriptor = "Lclient!rf;")
	public static Class70 aClass70_891 = Static49.method1293("Cabbage");

	@OriginalMember(owner = "client!ke", name = "N", descriptor = "I")
	public static int anInt2709 = 0;

	@OriginalMember(owner = "client!ke", name = "P", descriptor = "[[I")
	public static int[][] anIntArrayArray24 = new int[104][104];

	@OriginalMember(owner = "client!ke", name = "Q", descriptor = "Lclient!rf;")
	public static Class70 aClass70_892 = Static49.method1293("::");

	@OriginalMember(owner = "client!ke", name = "f", descriptor = "(I)Z")
	public static boolean method2006() {
		if (Static85.aClass43_22 == null) {
			return false;
		}
		@Pc(143) int local143;
		try {
			@Pc(13) int local13 = Static85.aClass43_22.method2041();
			if (local13 == 0) {
				return false;
			}
			if (Static98.anInt2835 == -1) {
				Static85.aClass43_22.method2047(0, 1, Static98.aClass1_Sub9_Sub1_2.aByteArray25);
				local13--;
				Static98.aClass1_Sub9_Sub1_2.anInt1592 = 0;
				Static98.anInt2835 = Static98.aClass1_Sub9_Sub1_2.method1292();
				Static69.anInt2127 = Static161.anIntArray400[Static98.anInt2835];
			}
			if (Static69.anInt2127 == -1) {
				if (local13 <= 0) {
					return false;
				}
				local13--;
				Static85.aClass43_22.method2047(0, 1, Static98.aClass1_Sub9_Sub1_2.aByteArray25);
				Static69.anInt2127 = Static98.aClass1_Sub9_Sub1_2.aByteArray25[0] & 0xFF;
			}
			if (Static69.anInt2127 == -2) {
				if (local13 <= 1) {
					return false;
				}
				local13 -= 2;
				Static85.aClass43_22.method2047(0, 2, Static98.aClass1_Sub9_Sub1_2.aByteArray25);
				Static98.aClass1_Sub9_Sub1_2.anInt1592 = 0;
				Static69.anInt2127 = Static98.aClass1_Sub9_Sub1_2.method1280();
			}
			if (local13 < Static69.anInt2127) {
				return false;
			}
			Static98.aClass1_Sub9_Sub1_2.anInt1592 = 0;
			Static85.aClass43_22.method2047(0, Static69.anInt2127, Static98.aClass1_Sub9_Sub1_2.aByteArray25);
			Static6.anInt276 = 0;
			Static149.anInt3999 = anInt2709;
			anInt2709 = Static181.anInt4516;
			Static181.anInt4516 = Static98.anInt2835;
			if (Static98.anInt2835 == 8) {
				Static146.method2862();
				Static54.anInt1755 = Static98.aClass1_Sub9_Sub1_2.method1234();
				Static98.anInt2835 = -1;
				Static13.anInt431 = Static58.anInt1875;
				return true;
			}
			@Pc(139) int local139;
			@Pc(147) int local147;
			@Pc(154) Class1_Sub14 local154;
			if (Static98.anInt2835 == 54) {
				local139 = Static98.aClass1_Sub9_Sub1_2.method1228();
				local143 = Static98.aClass1_Sub9_Sub1_2.method1273();
				local147 = Static98.aClass1_Sub9_Sub1_2.method1280();
				local154 = (Class1_Sub14) Static128.aClass30_14.method1467((long) local143);
				if (local154 != null) {
					Static32.method819(local154.anInt2467 != local147, local154);
				}
				Static41.method1032(local143, local139, local147);
				Static98.anInt2835 = -1;
				return true;
			}
			@Pc(197) int local197;
			@Pc(205) int local205;
			@Pc(311) int local311;
			@Pc(406) int local406;
			@Pc(189) long local189;
			@Pc(304) int local304;
			@Pc(352) int local352;
			if (Static98.anInt2835 == 88) {
				local189 = Static98.aClass1_Sub9_Sub1_2.method1269();
				local147 = Static98.aClass1_Sub9_Sub1_2.method1280();
				local197 = Static98.aClass1_Sub9_Sub1_2.method1234();
				@Pc(203) Class70 local203 = Static108.method2267(local189).method2898();
				for (local205 = 0; local205 < Static164.anInt4267; local205++) {
					if (Static79.aLongArray4[local205] == local189) {
						if (local147 != Static107.anIntArray296[local205]) {
							Static107.anIntArray296[local205] = local147;
							if (local147 > 0) {
								Static41.method1036(Static160.method3210(new Class70[] { local203, Static38.aClass70_427 }), Static35.aClass70_632, 5);
							}
							if (local147 == 0) {
								Static41.method1036(Static160.method3210(new Class70[] { local203, Static77.aClass70_781 }), Static35.aClass70_632, 5);
							}
						}
						Static48.anIntArray168[local205] = local197;
						local203 = null;
						break;
					}
				}
				if (local203 != null && Static164.anInt4267 < 200) {
					Static79.aLongArray4[Static164.anInt4267] = local189;
					Static80.aClass70Array13[Static164.anInt4267] = local203;
					Static107.anIntArray296[Static164.anInt4267] = local147;
					Static48.anIntArray168[Static164.anInt4267] = local197;
					Static164.anInt4267++;
				}
				Static102.anInt2901 = Static58.anInt1875;
				local304 = Static164.anInt4267;
				while (local304 > 0) {
					@Pc(308) boolean local308 = true;
					local304--;
					for (local311 = 0; local311 < local304; local311++) {
						if (Static26.anInt708 != Static107.anIntArray296[local311] && Static26.anInt708 == Static107.anIntArray296[local311 + 1] || Static107.anIntArray296[local311] == 0 && Static107.anIntArray296[local311 + 1] != 0) {
							local308 = false;
							local352 = Static107.anIntArray296[local311];
							Static107.anIntArray296[local311] = Static107.anIntArray296[local311 + 1];
							Static107.anIntArray296[local311 + 1] = local352;
							@Pc(370) Class70 local370 = Static80.aClass70Array13[local311];
							Static80.aClass70Array13[local311] = Static80.aClass70Array13[local311 + 1];
							Static80.aClass70Array13[local311 + 1] = local370;
							@Pc(388) long local388 = Static79.aLongArray4[local311];
							Static79.aLongArray4[local311] = Static79.aLongArray4[local311 + 1];
							Static79.aLongArray4[local311 + 1] = local388;
							local406 = Static48.anIntArray168[local311];
							Static48.anIntArray168[local311] = Static48.anIntArray168[local311 + 1];
							Static48.anIntArray168[local311 + 1] = local406;
						}
					}
					if (local308) {
						break;
					}
				}
				Static98.anInt2835 = -1;
				return true;
			}
			@Pc(466) int local466;
			if (Static98.anInt2835 == 135) {
				local139 = Static98.aClass1_Sub9_Sub1_2.method1234();
				local143 = Static98.aClass1_Sub9_Sub1_2.method1234();
				local147 = Static98.aClass1_Sub9_Sub1_2.method1234();
				local197 = Static98.aClass1_Sub9_Sub1_2.method1234();
				local466 = Static98.aClass1_Sub9_Sub1_2.method1280();
				Static24.aBooleanArray2[local139] = true;
				Static55.anIntArray179[local139] = local143;
				Static75.anIntArray216[local139] = local147;
				Static20.anIntArray33[local139] = local197;
				Static105.anIntArray289[local139] = local466;
				Static98.anInt2835 = -1;
				return true;
			}
			if (Static98.anInt2835 == 94) {
				local139 = Static98.aClass1_Sub9_Sub1_2.method1229();
				Static117.aClass18_6 = Static9.aClass32_1.method1477(local139);
				Static98.anInt2835 = -1;
				return true;
			}
			@Pc(537) boolean local537;
			@Pc(535) long local535;
			@Pc(531) Class70 local531;
			@Pc(517) Class70 local517;
			if (Static98.anInt2835 == 33) {
				local517 = Static98.aClass1_Sub9_Sub1_2.method1253();
				if (local517.method2907(Static118.aClass70_1077)) {
					local531 = local517.method2903(local517.method2902(Static139.aClass70_1242), 0);
					local535 = local531.method2925();
					local537 = false;
					for (local205 = 0; local205 < Static25.anInt695; local205++) {
						if (Static120.aLongArray7[local205] == local535) {
							local537 = true;
							break;
						}
					}
					if (!local537 && Static90.anInt2638 == 0) {
						Static41.method1036(Static28.aClass70_291, local531, 4);
					}
				} else if (local517.method2907(Static56.aClass70_563)) {
					local531 = local517.method2903(local517.method2902(Static139.aClass70_1242), 0);
					local535 = local531.method2925();
					local537 = false;
					for (local205 = 0; local205 < Static25.anInt695; local205++) {
						if (local535 == Static120.aLongArray7[local205]) {
							local537 = true;
							break;
						}
					}
					if (!local537 && Static90.anInt2638 == 0) {
						@Pc(645) Class70 local645 = local517.method2903(local517.method2896() - 9, local517.method2902(Static139.aClass70_1242) + 1);
						Static41.method1036(local645, local531, 8);
					}
				} else if (local517.method2907(Static60.aClass70_602)) {
					local537 = false;
					local531 = local517.method2903(local517.method2902(Static139.aClass70_1242), 0);
					local535 = local531.method2925();
					for (local205 = 0; local205 < Static25.anInt695; local205++) {
						if (local535 == Static120.aLongArray7[local205]) {
							local537 = true;
							break;
						}
					}
					if (!local537 && Static90.anInt2638 == 0) {
						Static41.method1036(Static35.aClass70_632, local531, 10);
					}
				} else if (local517.method2907(Static144.aClass70_1298)) {
					local531 = local517.method2903(local517.method2902(Static144.aClass70_1298), 0);
					Static41.method1036(local531, Static35.aClass70_632, 11);
				} else if (local517.method2907(Static55.aClass70_559)) {
					local531 = local517.method2903(local517.method2902(Static55.aClass70_559), 0);
					if (Static90.anInt2638 == 0) {
						Static41.method1036(local531, Static35.aClass70_632, 12);
					}
				} else if (local517.method2907(Static109.aClass70_998)) {
					local531 = local517.method2903(local517.method2902(Static109.aClass70_998), 0);
					if (Static90.anInt2638 == 0) {
						Static41.method1036(local531, Static35.aClass70_632, 13);
					}
				} else if (local517.method2907(Static123.aClass70_1129)) {
					local531 = local517.method2903(local517.method2902(Static139.aClass70_1242), 0);
					local535 = local531.method2925();
					local537 = false;
					for (local205 = 0; local205 < Static25.anInt695; local205++) {
						if (Static120.aLongArray7[local205] == local535) {
							local537 = true;
							break;
						}
					}
					if (!local537 && Static90.anInt2638 == 0) {
						Static41.method1036(Static35.aClass70_632, local531, 14);
					}
				} else if (local517.method2907(Static8.aClass70_96)) {
					local531 = local517.method2903(local517.method2902(Static139.aClass70_1242), 0);
					local535 = local531.method2925();
					local537 = false;
					for (local205 = 0; local205 < Static25.anInt695; local205++) {
						if (local535 == Static120.aLongArray7[local205]) {
							local537 = true;
							break;
						}
					}
					if (!local537 && Static90.anInt2638 == 0) {
						Static41.method1036(Static35.aClass70_632, local531, 15);
					}
				} else if (local517.method2907(Static96.aClass70_913)) {
					local531 = local517.method2903(local517.method2902(Static139.aClass70_1242), 0);
					local537 = false;
					local535 = local531.method2925();
					for (local205 = 0; local205 < Static25.anInt695; local205++) {
						if (Static120.aLongArray7[local205] == local535) {
							local537 = true;
							break;
						}
					}
					if (!local537 && Static90.anInt2638 == 0) {
						Static41.method1036(Static35.aClass70_632, local531, 16);
					}
				} else {
					Static41.method1036(local517, Static35.aClass70_632, 0);
				}
				Static98.anInt2835 = -1;
				return true;
			}
			if (Static98.anInt2835 == 241) {
				Static53.anInt1710 = Static98.aClass1_Sub9_Sub1_2.method1234();
				Static110.anInt3088 = Static98.aClass1_Sub9_Sub1_2.method1234();
				Static164.anInt4264 = Static98.aClass1_Sub9_Sub1_2.method1234();
				Static98.anInt2835 = -1;
				return true;
			}
			@Pc(996) Class39 local996;
			if (Static98.anInt2835 == 44) {
				local139 = Static98.aClass1_Sub9_Sub1_2.method1273();
				local143 = Static98.aClass1_Sub9_Sub1_2.method1272();
				local147 = Static98.aClass1_Sub9_Sub1_2.method1239();
				if (local147 == 65535) {
					local147 = -1;
				}
				local996 = Static128.method3227(local143);
				@Pc(1011) Class1_Sub1_Sub2 local1011;
				if (local996.aBoolean89) {
					local996.anInt2373 = local147;
					local996.anInt2360 = local139;
					local1011 = Static90.method1963(local147);
					local996.anInt2359 = local1011.anInt171;
					local996.anInt2345 = local1011.anInt166;
					local996.anInt2336 = local1011.anInt181;
					local996.anInt2334 = local1011.anInt170;
					local996.anInt2363 = local1011.anInt188;
					local996.anInt2335 = local1011.anInt191;
					if (local996.anInt2340 > 0) {
						local996.anInt2363 = local996.anInt2363 * 32 / local996.anInt2340;
					}
					Static171.method3407(local996);
				} else if (local147 == -1) {
					Static98.anInt2835 = -1;
					local996.anInt2370 = 0;
					return true;
				} else {
					local1011 = Static90.method1963(local147);
					local996.anInt2370 = 4;
					local996.anInt2334 = local1011.anInt170;
					local996.anInt2358 = local147;
					local996.anInt2336 = local1011.anInt181;
					local996.anInt2363 = local1011.anInt188 * 100 / local139;
					Static171.method3407(local996);
				}
				Static98.anInt2835 = -1;
				return true;
			}
			@Pc(1118) Class39 local1118;
			if (Static98.anInt2835 == 151) {
				local139 = Static98.aClass1_Sub9_Sub1_2.method1257();
				if (local139 == 65535) {
					local139 = -1;
				}
				local143 = Static98.aClass1_Sub9_Sub1_2.method1266();
				local1118 = Static128.method3227(local143);
				if (local1118.anInt2370 != 1 || local139 != local1118.anInt2358) {
					local1118.anInt2370 = 1;
					local1118.anInt2358 = local139;
					Static171.method3407(local1118);
				}
				Static98.anInt2835 = -1;
				return true;
			}
			if (Static98.anInt2835 == 215) {
				for (local139 = 0; local139 < Static158.anInt4151; local139++) {
					@Pc(1152) Class1_Sub1_Sub9 local1152 = Static86.method1914(local139);
					if (local1152 != null && local1152.anInt2122 == 0) {
						Static100.anIntArray270[local139] = 0;
						Static133.anIntArray330[local139] = 0;
					}
				}
				Static146.method2862();
				Static6.anInt275 += 32;
				Static98.anInt2835 = -1;
				return true;
			}
			if (Static98.anInt2835 == 250) {
				local139 = Static98.aClass1_Sub9_Sub1_2.method1280();
				local143 = Static98.aClass1_Sub9_Sub1_2.method1272();
				local1118 = Static128.method3227(local143);
				if (local1118 != null && local1118.anInt2342 == 0) {
					if (local139 > local1118.anInt2353 - local1118.anInt2369) {
						local139 = local1118.anInt2353 - local1118.anInt2369;
					}
					if (local139 < 0) {
						local139 = 0;
					}
					if (local139 != local1118.anInt2341) {
						local1118.anInt2341 = local139;
						Static171.method3407(local1118);
					}
				}
				Static98.anInt2835 = -1;
				return true;
			}
			if (Static98.anInt2835 == 61) {
				local139 = Static98.aClass1_Sub9_Sub1_2.method1257();
				local143 = Static98.aClass1_Sub9_Sub1_2.method1257();
				local147 = Static98.aClass1_Sub9_Sub1_2.method1266();
				local197 = Static98.aClass1_Sub9_Sub1_2.method1277();
				@Pc(1270) Class39 local1270 = Static128.method3227(local147);
				if (local1270.anInt2336 != local143 || local139 != local1270.anInt2334 || local1270.anInt2363 != local197) {
					local1270.anInt2363 = local197;
					local1270.anInt2334 = local139;
					local1270.anInt2336 = local143;
					Static171.method3407(local1270);
				}
				Static98.anInt2835 = -1;
				return true;
			}
			if (Static98.anInt2835 == 1) {
				local139 = Static98.aClass1_Sub9_Sub1_2.method1280();
				local143 = Static98.aClass1_Sub9_Sub1_2.method1234();
				if (local139 == 65535) {
					local139 = -1;
				}
				local147 = Static98.aClass1_Sub9_Sub1_2.method1280();
				Static156.method3140(local139, local147, local143);
				Static98.anInt2835 = -1;
				return true;
			}
			if (Static98.anInt2835 == 225) {
				local139 = Static98.aClass1_Sub9_Sub1_2.method1266();
				local143 = Static98.aClass1_Sub9_Sub1_2.method1239();
				local147 = local143 >> 10 & 0x1F;
				local197 = local143 >> 5 & 0x1F;
				local466 = local143 & 0x1F;
				local205 = (local197 << 11) + ((local147 << 19) + (local466 << 3));
				@Pc(1379) Class39 local1379 = Static128.method3227(local139);
				if (local205 != local1379.anInt2380) {
					local1379.anInt2380 = local205;
					Static171.method3407(local1379);
				}
				Static98.anInt2835 = -1;
				return true;
			}
			if (Static98.anInt2835 == 157) {
				Static152.anInt2185 = Static98.aClass1_Sub9_Sub1_2.method1234();
				Static100.anInt2854 = Static98.aClass1_Sub9_Sub1_2.method1228();
				Static98.anInt2835 = -1;
				return true;
			}
			if (Static98.anInt2835 == 203) {
				local139 = Static98.aClass1_Sub9_Sub1_2.method1234();
				if (Static98.aClass1_Sub9_Sub1_2.method1234() == 0) {
					Static66.aClass29Array1[local139] = new Class29();
				} else {
					Static98.aClass1_Sub9_Sub1_2.anInt1592--;
					Static66.aClass29Array1[local139] = new Class29(Static98.aClass1_Sub9_Sub1_2);
				}
				Static12.anInt397 = Static58.anInt1875;
				Static98.anInt2835 = -1;
				return true;
			}
			if (Static98.anInt2835 == 7) {
				for (local139 = 0; local139 < Static133.anIntArray330.length; local139++) {
					if (Static133.anIntArray330[local139] != Static100.anIntArray270[local139]) {
						Static133.anIntArray330[local139] = Static100.anIntArray270[local139];
						Static102.method2151(local139);
						Static6.anIntArray20[Static6.anInt275++ & 0x1F] = local139;
					}
				}
				Static98.anInt2835 = -1;
				return true;
			}
			if (Static98.anInt2835 == 130) {
				Static146.method2862();
				local139 = Static98.aClass1_Sub9_Sub1_2.method1268();
				local143 = Static98.aClass1_Sub9_Sub1_2.method1273();
				local147 = Static98.aClass1_Sub9_Sub1_2.method1268();
				Static10.anIntArray24[local139] = local143;
				Static85.anIntArray246[local139] = local147;
				Static164.anIntArray407[local139] = 1;
				for (local197 = 0; local197 < 98; local197++) {
					if (Class1_Sub2_Sub8.anIntArray44[local197] <= local143) {
						Static164.anIntArray407[local139] = local197 + 2;
					}
				}
				Static124.anIntArray325[Static170.anInt4396++ & 0x1F] = local139;
				Static98.anInt2835 = -1;
				return true;
			}
			if (Static98.anInt2835 == 208) {
				Static100.anInt2854 = Static98.aClass1_Sub9_Sub1_2.method1240();
				Static152.anInt2185 = Static98.aClass1_Sub9_Sub1_2.method1268();
				for (local139 = Static152.anInt2185; local139 < Static152.anInt2185 + 8; local139++) {
					for (local143 = Static100.anInt2854; local143 < Static100.anInt2854 + 8; local143++) {
						if (Static64.aClass4ArrayArrayArray2[Static56.anInt1784][local139][local143] != null) {
							Static64.aClass4ArrayArrayArray2[Static56.anInt1784][local139][local143] = null;
							Static81.method1834(local143, local139);
						}
					}
				}
				for (@Pc(1618) Class1_Sub11 local1618 = (Class1_Sub11) Static14.aClass4_1.method174(); local1618 != null; local1618 = (Class1_Sub11) Static14.aClass4_1.method181()) {
					if (Static152.anInt2185 <= local1618.anInt1936 && local1618.anInt1936 < Static152.anInt2185 + 8 && Static100.anInt2854 <= local1618.anInt1924 && local1618.anInt1924 < Static100.anInt2854 + 8 && Static56.anInt1784 == local1618.anInt1935) {
						local1618.anInt1932 = 0;
					}
				}
				Static98.anInt2835 = -1;
				return true;
			}
			if (Static98.anInt2835 == 201) {
				local139 = Static98.aClass1_Sub9_Sub1_2.method1228();
				local143 = Static98.aClass1_Sub9_Sub1_2.method1268();
				local147 = Static98.aClass1_Sub9_Sub1_2.method1234();
				Static56.anInt1784 = local143 >> 1;
				Static52.aClass1_Sub1_Sub4_Sub2_Sub1_1.method1514(local139, local147, (local143 & 0x1) == 1);
				Static98.anInt2835 = -1;
				return true;
			}
			@Pc(1745) long local1745;
			@Pc(1730) long local1730;
			if (Static98.anInt2835 == 79) {
				local189 = Static98.aClass1_Sub9_Sub1_2.method1269();
				Static98.aClass1_Sub9_Sub1_2.method1243();
				local535 = Static98.aClass1_Sub9_Sub1_2.method1269();
				local1730 = Static98.aClass1_Sub9_Sub1_2.method1280();
				@Pc(1735) long local1735 = (long) Static98.aClass1_Sub9_Sub1_2.method1230();
				local311 = Static98.aClass1_Sub9_Sub1_2.method1234();
				local1745 = (local1730 << 32) + local1735;
				@Pc(1747) boolean local1747 = false;
				for (@Pc(1749) int local1749 = 0; local1749 < 100; local1749++) {
					if (Static172.aLongArray10[local1749] == local1745) {
						local1747 = true;
						break;
					}
				}
				if (local311 <= 1) {
					for (local406 = 0; local406 < Static25.anInt695; local406++) {
						if (local189 == Static120.aLongArray7[local406]) {
							local1747 = true;
							break;
						}
					}
				}
				if (!local1747 && Static90.anInt2638 == 0) {
					Static172.aLongArray10[Static75.anInt2276] = local1745;
					Static75.anInt2276 = (Static75.anInt2276 + 1) % 100;
					@Pc(1812) Class70 local1812 = Static76.method2394(Static31.method794(Static98.aClass1_Sub9_Sub1_2).method2904());
					if (local311 == 2 || local311 == 3) {
						Static119.method2422(local1812, Static108.method2267(local535).method2898(), 9, Static160.method3210(new Class70[] { Static37.aClass70_417, Static108.method2267(local189).method2898() }));
					} else if (local311 == 1) {
						Static119.method2422(local1812, Static108.method2267(local535).method2898(), 9, Static160.method3210(new Class70[] { Static26.aClass70_248, Static108.method2267(local189).method2898() }));
					} else {
						Static119.method2422(local1812, Static108.method2267(local535).method2898(), 9, Static108.method2267(local189).method2898());
					}
				}
				Static98.anInt2835 = -1;
				return true;
			}
			if (Static98.anInt2835 == 188) {
				Static146.method2862();
				Static37.anInt1313 = Static98.aClass1_Sub9_Sub1_2.method1279();
				Static13.anInt431 = Static58.anInt1875;
				Static98.anInt2835 = -1;
				return true;
			}
			if (Static98.anInt2835 == 75) {
				Static44.method1093(true);
				Static98.anInt2835 = -1;
				return true;
			}
			if (Static98.anInt2835 == 153) {
				local139 = Static98.aClass1_Sub9_Sub1_2.method1239();
				local143 = Static98.aClass1_Sub9_Sub1_2.method1277();
				local147 = Static98.aClass1_Sub9_Sub1_2.method1229();
				local996 = Static128.method3227(local147);
				Static98.anInt2835 = -1;
				local996.anInt2377 = local139 + (local143 << 16);
				return true;
			}
			if (Static98.anInt2835 == 242) {
				Static176.aBoolean176 = true;
				Static149.anInt3997 = Static98.aClass1_Sub9_Sub1_2.method1234();
				Static16.anInt467 = Static98.aClass1_Sub9_Sub1_2.method1234();
				Static176.anInt4472 = Static98.aClass1_Sub9_Sub1_2.method1280();
				Static61.anInt1947 = Static98.aClass1_Sub9_Sub1_2.method1234();
				Static109.anInt3068 = Static98.aClass1_Sub9_Sub1_2.method1234();
				if (Static109.anInt3068 >= 100) {
					Static79.anInt2448 = Static149.anInt3997 * 128 + 64;
					Static83.anInt4536 = Static16.anInt467 * 128 + 64;
					Static33.anInt1073 = Static156.method3142(Static79.anInt2448, Static56.anInt1784, Static83.anInt4536) - Static176.anInt4472;
				}
				Static98.anInt2835 = -1;
				return true;
			}
			if (Static98.anInt2835 == 213) {
				Static166.anInt4305 = Static98.aClass1_Sub9_Sub1_2.method1277() * 30;
				Static13.anInt431 = Static58.anInt1875;
				Static98.anInt2835 = -1;
				return true;
			}
			if (Static98.anInt2835 == 166) {
				Static19.method436();
				Static98.anInt2835 = -1;
				return true;
			}
			if (Static98.anInt2835 == 218) {
				local517 = Static98.aClass1_Sub9_Sub1_2.method1253();
				@Pc(2051) Object[] local2051 = new Object[local517.method2896() + 1];
				for (local147 = local517.method2896() - 1; local147 >= 0; local147--) {
					if (local517.method2899(local147) == 115) {
						local2051[local147 + 1] = Static98.aClass1_Sub9_Sub1_2.method1253();
					} else {
						local2051[local147 + 1] = Integer.valueOf(Static98.aClass1_Sub9_Sub1_2.method1273());
					}
				}
				local2051[0] = Integer.valueOf(Static98.aClass1_Sub9_Sub1_2.method1273());
				@Pc(2106) Class1_Sub19 local2106 = new Class1_Sub19();
				local2106.anObjectArray27 = local2051;
				Static60.method1460(local2106);
				Static98.anInt2835 = -1;
				return true;
			}
			if (Static98.anInt2835 == 162) {
				local139 = Static98.aClass1_Sub9_Sub1_2.method1266();
				local143 = Static98.aClass1_Sub9_Sub1_2.method1256();
				local1118 = Static128.method3227(local139);
				if (local143 != local1118.anInt2378 || local143 == -1) {
					local1118.anInt2378 = local143;
					local1118.anInt2319 = 0;
					local1118.anInt2357 = 0;
					Static171.method3407(local1118);
				}
				Static98.anInt2835 = -1;
				return true;
			}
			if (Static98.anInt2835 == 104) {
				if (Static58.anInt1865 != -1) {
					Static31.method792(0, Static58.anInt1865);
				}
				Static98.anInt2835 = -1;
				return true;
			}
			@Pc(2183) Class39 local2183;
			if (Static98.anInt2835 == 172) {
				local139 = Static98.aClass1_Sub9_Sub1_2.method1229();
				local2183 = Static128.method3227(local139);
				local2183.anInt2370 = 3;
				local2183.anInt2358 = Static52.aClass1_Sub1_Sub4_Sub2_Sub1_1.aClass49_1.method2220();
				Static171.method3407(local2183);
				Static98.anInt2835 = -1;
				return true;
			}
			if (Static98.anInt2835 == 192) {
				for (local139 = 0; local139 < Static113.aClass1_Sub1_Sub4_Sub2_Sub1Array1.length; local139++) {
					if (Static113.aClass1_Sub1_Sub4_Sub2_Sub1Array1[local139] != null) {
						Static113.aClass1_Sub1_Sub4_Sub2_Sub1Array1[local139].anInt2041 = -1;
					}
				}
				for (local143 = 0; local143 < Static165.aClass1_Sub1_Sub4_Sub2_Sub2Array1.length; local143++) {
					if (Static165.aClass1_Sub1_Sub4_Sub2_Sub2Array1[local143] != null) {
						Static165.aClass1_Sub1_Sub4_Sub2_Sub2Array1[local143].anInt2041 = -1;
					}
				}
				Static98.anInt2835 = -1;
				return true;
			}
			if (Static98.anInt2835 == 13) {
				local139 = Static98.aClass1_Sub9_Sub1_2.method1228();
				local531 = Static98.aClass1_Sub9_Sub1_2.method1253();
				local147 = Static98.aClass1_Sub9_Sub1_2.method1228();
				if (local147 >= 1 && local147 <= 8) {
					if (local531.method2905(Static80.aClass70_816)) {
						local531 = null;
					}
					Static8.aClass70Array4[local147 - 1] = local531;
					Static140.aBooleanArray16[local147 - 1] = local139 == 0;
				}
				Static98.anInt2835 = -1;
				return true;
			}
			if (Static98.anInt2835 == 226) {
				Static159.method3181();
				Static98.anInt2835 = -1;
				return true;
			}
			if (Static98.anInt2835 == 232) {
				local139 = Static98.aClass1_Sub9_Sub1_2.method1273();
				@Pc(2321) Class1_Sub14 local2321 = (Class1_Sub14) Static128.aClass30_14.method1467((long) local139);
				if (local2321 != null) {
					Static32.method819(true, local2321);
				}
				if (Static81.aClass39_25 != null) {
					Static171.method3407(Static81.aClass39_25);
					Static81.aClass39_25 = null;
				}
				Static98.anInt2835 = -1;
				return true;
			}
			@Pc(2359) int local2359;
			@Pc(2369) int local2369;
			if (Static98.anInt2835 == 186) {
				local189 = Static98.aClass1_Sub9_Sub1_2.method1269();
				local535 = Static98.aClass1_Sub9_Sub1_2.method1280();
				local1730 = Static98.aClass1_Sub9_Sub1_2.method1230();
				local2359 = Static98.aClass1_Sub9_Sub1_2.method1234();
				@Pc(2365) long local2365 = local1730 + (local535 << 32);
				@Pc(2367) boolean local2367 = false;
				for (local2369 = 0; local2369 < 100; local2369++) {
					if (local2365 == Static172.aLongArray10[local2369]) {
						local2367 = true;
						break;
					}
				}
				if (local2359 <= 1) {
					for (@Pc(2396) int local2396 = 0; local2396 < Static25.anInt695; local2396++) {
						if (Static120.aLongArray7[local2396] == local189) {
							local2367 = true;
							break;
						}
					}
				}
				if (!local2367 && Static90.anInt2638 == 0) {
					Static172.aLongArray10[Static75.anInt2276] = local2365;
					Static75.anInt2276 = (Static75.anInt2276 + 1) % 100;
					@Pc(2433) Class70 local2433 = Static76.method2394(Static31.method794(Static98.aClass1_Sub9_Sub1_2).method2904());
					if (local2359 == 2 || local2359 == 3) {
						Static41.method1036(local2433, Static160.method3210(new Class70[] { Static37.aClass70_417, Static108.method2267(local189).method2898() }), 7);
					} else if (local2359 == 1) {
						Static41.method1036(local2433, Static160.method3210(new Class70[] { Static26.aClass70_248, Static108.method2267(local189).method2898() }), 7);
					} else {
						Static41.method1036(local2433, Static108.method2267(local189).method2898(), 3);
					}
				}
				Static98.anInt2835 = -1;
				return true;
			}
			if (Static98.anInt2835 == 108) {
				Static4.anInt199 = Static98.aClass1_Sub9_Sub1_2.method1234();
				if (Static4.anInt199 == 1) {
					Static20.anInt552 = Static98.aClass1_Sub9_Sub1_2.method1280();
				}
				if (Static4.anInt199 >= 2 && Static4.anInt199 <= 6) {
					if (Static4.anInt199 == 2) {
						Static129.anInt4430 = 64;
						Static172.anInt4449 = 64;
					}
					if (Static4.anInt199 == 3) {
						Static129.anInt4430 = 64;
						Static172.anInt4449 = 0;
					}
					if (Static4.anInt199 == 4) {
						Static172.anInt4449 = 128;
						Static129.anInt4430 = 64;
					}
					if (Static4.anInt199 == 5) {
						Static129.anInt4430 = 0;
						Static172.anInt4449 = 64;
					}
					if (Static4.anInt199 == 6) {
						Static129.anInt4430 = 128;
						Static172.anInt4449 = 64;
					}
					Static4.anInt199 = 2;
					Static101.anInt2869 = Static98.aClass1_Sub9_Sub1_2.method1280();
					Static182.anInt4528 = Static98.aClass1_Sub9_Sub1_2.method1280();
					Static86.anInt2583 = Static98.aClass1_Sub9_Sub1_2.method1234();
				}
				if (Static4.anInt199 == 10) {
					Static123.anInt3341 = Static98.aClass1_Sub9_Sub1_2.method1280();
				}
				Static98.anInt2835 = -1;
				return true;
			}
			if (Static98.anInt2835 == 111) {
				local139 = Static98.aClass1_Sub9_Sub1_2.method1277();
				local143 = Static98.aClass1_Sub9_Sub1_2.method1273();
				Static100.anIntArray270[local139] = local143;
				if (Static133.anIntArray330[local139] != local143) {
					Static133.anIntArray330[local139] = local143;
					Static102.method2151(local139);
				}
				Static6.anIntArray20[Static6.anInt275++ & 0x1F] = local139;
				Static98.anInt2835 = -1;
				return true;
			}
			if (Static98.anInt2835 == 71) {
				local139 = Static98.aClass1_Sub9_Sub1_2.method1280();
				@Pc(2647) byte local2647 = Static98.aClass1_Sub9_Sub1_2.method1271();
				Static100.anIntArray270[local139] = local2647;
				if (Static133.anIntArray330[local139] != local2647) {
					Static133.anIntArray330[local139] = local2647;
					Static102.method2151(local139);
				}
				Static6.anIntArray20[Static6.anInt275++ & 0x1F] = local139;
				Static98.anInt2835 = -1;
				return true;
			}
			if (Static98.anInt2835 == 117) {
				local139 = Static98.aClass1_Sub9_Sub1_2.method1229();
				local531 = Static98.aClass1_Sub9_Sub1_2.method1253();
				local1118 = Static128.method3227(local139);
				if (!local531.method2910(local1118.aClass70_772)) {
					local1118.aClass70_772 = local531;
					Static171.method3407(local1118);
				}
				Static98.anInt2835 = -1;
				return true;
			}
			if (Static98.anInt2835 == 77) {
				Static115.anInt3168 = Static58.anInt1875;
				local189 = Static98.aClass1_Sub9_Sub1_2.method1269();
				if (local189 == 0L) {
					Static98.anInt2835 = -1;
					Static70.anInt2162 = 0;
					Static157.aClass1_Sub25Array3 = null;
					Static61.aClass70_609 = null;
					Static105.aClass70_966 = null;
					return true;
				}
				local535 = Static98.aClass1_Sub9_Sub1_2.method1269();
				Static61.aClass70_609 = Static108.method2267(local535);
				Static105.aClass70_966 = Static108.method2267(local189);
				Static143.aByte6 = Static98.aClass1_Sub9_Sub1_2.method1243();
				local466 = Static98.aClass1_Sub9_Sub1_2.method1234();
				if (local466 == 255) {
					Static98.anInt2835 = -1;
					return true;
				}
				@Pc(2771) Class1_Sub25[] local2771 = new Class1_Sub25[100];
				Static70.anInt2162 = local466;
				for (local2359 = 0; local2359 < Static70.anInt2162; local2359++) {
					local2771[local2359] = new Class1_Sub25();
					local2771[local2359].aLong147 = Static98.aClass1_Sub9_Sub1_2.method1269();
					local2771[local2359].aClass70_1580 = Static108.method2267(local2771[local2359].aLong147);
					local2771[local2359].anInt4531 = Static98.aClass1_Sub9_Sub1_2.method1280();
					local2771[local2359].aByte9 = Static98.aClass1_Sub9_Sub1_2.method1243();
					if (Static90.aLong80 == local2771[local2359].aLong147) {
						Static181.aByte8 = local2771[local2359].aByte9;
					}
				}
				local352 = Static70.anInt2162;
				while (local352 > 0) {
					local352--;
					@Pc(2843) boolean local2843 = true;
					for (local2369 = 0; local2369 < local352; local2369++) {
						if (local2771[local2369].aClass70_1580.method2922(local2771[local2369 + 1].aClass70_1580) > 0) {
							local2843 = false;
							@Pc(2866) Class1_Sub25 local2866 = local2771[local2369];
							local2771[local2369] = local2771[local2369 + 1];
							local2771[local2369 + 1] = local2866;
						}
					}
					if (local2843) {
						break;
					}
				}
				Static157.aClass1_Sub25Array3 = local2771;
				Static98.anInt2835 = -1;
				return true;
			}
			if (Static98.anInt2835 == 86) {
				local139 = Static98.aClass1_Sub9_Sub1_2.anInt1592 + Static69.anInt2127;
				local143 = Static98.aClass1_Sub9_Sub1_2.method1280();
				local147 = Static98.aClass1_Sub9_Sub1_2.method1280();
				if (Static58.anInt1865 != local143) {
					Static58.anInt1865 = local143;
					Static112.method3352(Static58.anInt1865);
					Static40.method1026(Static58.anInt1865);
					for (local197 = 0; local197 < 100; local197++) {
						Static161.aBooleanArray18[local197] = true;
					}
				}
				while (local147-- > 0) {
					local197 = Static98.aClass1_Sub9_Sub1_2.method1273();
					local466 = Static98.aClass1_Sub9_Sub1_2.method1280();
					local205 = Static98.aClass1_Sub9_Sub1_2.method1234();
					@Pc(2968) Class1_Sub14 local2968 = (Class1_Sub14) Static128.aClass30_14.method1467((long) local197);
					if (local2968 != null && local2968.anInt2467 != local466) {
						Static32.method819(true, local2968);
						local2968 = null;
					}
					if (local2968 == null) {
						local2968 = Static41.method1032(local197, local205, local466);
					}
					local2968.aBoolean92 = true;
				}
				for (local154 = (Class1_Sub14) Static128.aClass30_14.method1470(); local154 != null; local154 = (Class1_Sub14) Static128.aClass30_14.method1473()) {
					if (local154.aBoolean92) {
						local154.aBoolean92 = false;
					} else {
						Static32.method819(true, local154);
					}
				}
				Static6.aClass30_1 = new Class30(512);
				while (local139 > Static98.aClass1_Sub9_Sub1_2.anInt1592) {
					local466 = Static98.aClass1_Sub9_Sub1_2.method1273();
					local205 = Static98.aClass1_Sub9_Sub1_2.method1280();
					local2359 = Static98.aClass1_Sub9_Sub1_2.method1280();
					local304 = Static98.aClass1_Sub9_Sub1_2.method1273();
					for (local311 = local205; local311 <= local2359; local311++) {
						local1745 = (long) local311 + ((long) local466 << 32);
						Static6.aClass30_1.method1464(new Class1_Sub4(local304), local1745);
					}
				}
				Static98.anInt2835 = -1;
				return true;
			}
			if (Static98.anInt2835 == 196) {
				local139 = Static98.aClass1_Sub9_Sub1_2.method1273();
				@Pc(3105) boolean local3105 = Static98.aClass1_Sub9_Sub1_2.method1268() == 1;
				local1118 = Static128.method3227(local139);
				if (local3105 != local1118.aBoolean83) {
					local1118.aBoolean83 = local3105;
					Static171.method3407(local1118);
				}
				Static98.anInt2835 = -1;
				return true;
			}
			if (Static98.anInt2835 == 124) {
				Static105.anInt2980 = 0;
				Static98.anInt2835 = -1;
				return true;
			}
			if (Static98.anInt2835 == 219) {
				Static38.method976();
				Static98.anInt2835 = -1;
				return false;
			}
			if (Static98.anInt2835 == 87) {
				Static176.aBoolean176 = true;
				Static179.anInt4503 = Static98.aClass1_Sub9_Sub1_2.method1234();
				Static161.anInt4211 = Static98.aClass1_Sub9_Sub1_2.method1234();
				Static42.anInt1421 = Static98.aClass1_Sub9_Sub1_2.method1280();
				Static126.anInt818 = Static98.aClass1_Sub9_Sub1_2.method1234();
				Static42.anInt1425 = Static98.aClass1_Sub9_Sub1_2.method1234();
				if (Static42.anInt1425 >= 100) {
					local143 = Static161.anInt4211 * 128 + 64;
					local139 = Static179.anInt4503 * 128 + 64;
					local147 = Static156.method3142(local139, Static56.anInt1784, local143) - Static42.anInt1421;
					local466 = local147 - Static33.anInt1073;
					local197 = local139 - Static79.anInt2448;
					local205 = local143 - Static83.anInt4536;
					local2359 = (int) Math.sqrt((double) (local197 * local197 + local205 * local205));
					Static42.anInt1424 = (int) (Math.atan2((double) local466, (double) local2359) * 325.949D) & 0x7FF;
					Static60.anInt1934 = (int) (-325.949D * Math.atan2((double) local197, (double) local205)) & 0x7FF;
					if (Static42.anInt1424 < 128) {
						Static42.anInt1424 = 128;
					}
					if (Static42.anInt1424 > 383) {
						Static42.anInt1424 = 383;
					}
				}
				Static98.anInt2835 = -1;
				return true;
			}
			if (Static98.anInt2835 == 156) {
				local189 = Static98.aClass1_Sub9_Sub1_2.method1269();
				local147 = Static98.aClass1_Sub9_Sub1_2.method1280();
				local537 = false;
				@Pc(3279) byte local3279 = Static98.aClass1_Sub9_Sub1_2.method1243();
				if ((Long.MIN_VALUE & local189) != 0L) {
					local537 = true;
				}
				if (local537) {
					if (Static70.anInt2162 == 0) {
						Static98.anInt2835 = -1;
						return true;
					}
					local189 &= Long.MAX_VALUE;
					for (local205 = 0; Static70.anInt2162 > local205 && (local189 != Static157.aClass1_Sub25Array3[local205].aLong147 || local147 != Static157.aClass1_Sub25Array3[local205].anInt4531); local205++) {
					}
					if (Static70.anInt2162 > local205) {
						while (local205 < Static70.anInt2162 - 1) {
							Static157.aClass1_Sub25Array3[local205] = Static157.aClass1_Sub25Array3[local205 + 1];
							local205++;
						}
						Static70.anInt2162--;
						Static157.aClass1_Sub25Array3[Static70.anInt2162] = null;
					}
				} else {
					@Pc(3359) Class1_Sub25 local3359 = new Class1_Sub25();
					local3359.aLong147 = local189;
					local3359.aClass70_1580 = Static108.method2267(local3359.aLong147);
					local3359.aByte9 = local3279;
					local3359.anInt4531 = local147;
					for (local2359 = Static70.anInt2162 - 1; local2359 >= 0; local2359--) {
						local304 = Static157.aClass1_Sub25Array3[local2359].aClass70_1580.method2922(local3359.aClass70_1580);
						if (local304 == 0) {
							Static157.aClass1_Sub25Array3[local2359].anInt4531 = local147;
							Static157.aClass1_Sub25Array3[local2359].aByte9 = local3279;
							Static98.anInt2835 = -1;
							if (Static90.aLong80 == local189) {
								Static181.aByte8 = local3279;
							}
							Static115.anInt3168 = Static58.anInt1875;
							return true;
						}
						if (local304 < 0) {
							break;
						}
					}
					if (Static70.anInt2162 >= Static157.aClass1_Sub25Array3.length) {
						Static98.anInt2835 = -1;
						return true;
					}
					for (local304 = Static70.anInt2162 - 1; local304 > local2359; local304--) {
						Static157.aClass1_Sub25Array3[local304 + 1] = Static157.aClass1_Sub25Array3[local304];
					}
					if (Static70.anInt2162 == 0) {
						Static157.aClass1_Sub25Array3 = new Class1_Sub25[100];
					}
					Static157.aClass1_Sub25Array3[local2359 + 1] = local3359;
					if (Static90.aLong80 == local189) {
						Static181.aByte8 = local3279;
					}
					Static70.anInt2162++;
				}
				Static98.anInt2835 = -1;
				Static115.anInt3168 = Static58.anInt1875;
				return true;
			}
			if (Static98.anInt2835 == 129) {
				Static18.anInt491 = Static98.aClass1_Sub9_Sub1_2.method1234();
				Static98.anInt2835 = -1;
				return true;
			}
			if (Static98.anInt2835 == 116) {
				local139 = Static98.aClass1_Sub9_Sub1_2.method1280();
				if (local139 == 65535) {
					local139 = -1;
				}
				local143 = Static98.aClass1_Sub9_Sub1_2.method1229();
				local147 = Static98.aClass1_Sub9_Sub1_2.method1272();
				local197 = Static98.aClass1_Sub9_Sub1_2.method1257();
				if (local197 == 65535) {
					local197 = -1;
				}
				for (local466 = local197; local466 <= local139; local466++) {
					@Pc(3541) long local3541 = ((long) local143 << 32) + ((long) local466);
					@Pc(3546) Class1 local3546 = Static6.aClass30_1.method1467(local3541);
					if (local3546 != null) {
						local3546.method3499();
					}
					Static6.aClass30_1.method1464(new Class1_Sub4(local147), local3541);
				}
				Static98.anInt2835 = -1;
				return true;
			}
			if (Static98.anInt2835 == 42) {
				Static115.method2331(Static9.aClass32_1, Static69.anInt2127, Static98.aClass1_Sub9_Sub1_2);
				Static98.anInt2835 = -1;
				return true;
			}
			if (Static98.anInt2835 == 243) {
				local139 = Static98.aClass1_Sub9_Sub1_2.method1257();
				Static58.anInt1865 = local139;
				Static112.method3352(local139);
				Static40.method1026(Static58.anInt1865);
				for (local143 = 0; local143 < 100; local143++) {
					Static161.aBooleanArray18[local143] = true;
				}
				Static98.anInt2835 = -1;
				return true;
			}
			if (Static98.anInt2835 == 78) {
				local139 = Static98.aClass1_Sub9_Sub1_2.method1229();
				local2183 = Static128.method3227(local139);
				for (local147 = 0; local147 < local2183.anIntArray228.length; local147++) {
					local2183.anIntArray228[local147] = -1;
					local2183.anIntArray228[local147] = 0;
				}
				Static171.method3407(local2183);
				Static98.anInt2835 = -1;
				return true;
			}
			if (Static98.anInt2835 == 84) {
				local139 = Static98.aClass1_Sub9_Sub1_2.method1273();
				local143 = Static98.aClass1_Sub9_Sub1_2.method1280();
				if (local139 < -70000) {
					local143 += 32768;
				}
				if (local139 >= 0) {
					local1118 = Static128.method3227(local139);
				} else {
					local1118 = null;
				}
				while (Static98.aClass1_Sub9_Sub1_2.anInt1592 < Static69.anInt2127) {
					local197 = Static98.aClass1_Sub9_Sub1_2.method1244();
					local205 = 0;
					local466 = Static98.aClass1_Sub9_Sub1_2.method1280();
					if (local466 != 0) {
						local205 = Static98.aClass1_Sub9_Sub1_2.method1234();
						if (local205 == 255) {
							local205 = Static98.aClass1_Sub9_Sub1_2.method1273();
						}
					}
					if (local1118 != null && local197 >= 0 && local1118.anIntArray228.length > local197) {
						local1118.anIntArray228[local197] = local466;
						local1118.anIntArray231[local197] = local205;
					}
					Static96.method2078(local143, local197, local466 - 1, local205);
				}
				if (local1118 != null) {
					Static171.method3407(local1118);
				}
				Static146.method2862();
				Static112.anIntArray418[Static92.anInt2687++ & 0x1F] = local143 & 0x7FFF;
				Static98.anInt2835 = -1;
				return true;
			}
			if (Static98.anInt2835 == 50) {
				Static25.anInt695 = Static69.anInt2127 / 8;
				for (local139 = 0; local139 < Static25.anInt695; local139++) {
					Static120.aLongArray7[local139] = Static98.aClass1_Sub9_Sub1_2.method1269();
					Static51.aClass70Array8[local139] = Static108.method2267(Static120.aLongArray7[local139]);
				}
				Static98.anInt2835 = -1;
				Static102.anInt2901 = Static58.anInt1875;
				return true;
			}
			if (Static98.anInt2835 == 20) {
				local139 = Static98.aClass1_Sub9_Sub1_2.method1280();
				Static41.method1033(local139);
				Static112.anIntArray418[Static92.anInt2687++ & 0x1F] = local139 & 0x7FFF;
				Static98.anInt2835 = -1;
				return true;
			}
			if (Static98.anInt2835 == 121 || Static98.anInt2835 == 198 || Static98.anInt2835 == 212 || Static98.anInt2835 == 27 || Static98.anInt2835 == 179 || Static98.anInt2835 == 83 || Static98.anInt2835 == 109 || Static98.anInt2835 == 248 || Static98.anInt2835 == 127 || Static98.anInt2835 == 53 || Static98.anInt2835 == 107) {
				Static112.method3349();
				Static98.anInt2835 = -1;
				return true;
			}
			if (Static98.anInt2835 == 112) {
				local139 = Static98.aClass1_Sub9_Sub1_2.method1261();
				local143 = Static98.aClass1_Sub9_Sub1_2.method1261();
				local147 = Static98.aClass1_Sub9_Sub1_2.method1229();
				local996 = Static128.method3227(local147);
				local205 = local996.anInt2386 + local139;
				local466 = local996.anInt2356 + local143;
				if (local996.anInt2326 != local466 || local996.anInt2338 != local205) {
					local996.anInt2326 = local466;
					local996.anInt2338 = local205;
					Static171.method3407(local996);
				}
				Static98.anInt2835 = -1;
				return true;
			}
			if (Static98.anInt2835 == 34) {
				Static5.anInt212 = Static98.aClass1_Sub9_Sub1_2.method1234();
				Static98.anInt2835 = -1;
				Static102.anInt2901 = Static58.anInt1875;
				return true;
			}
			if (Static98.anInt2835 == 25) {
				Static121.method2466(Static98.aClass1_Sub9_Sub1_2);
				Static98.anInt2835 = -1;
				return true;
			}
			if (Static98.anInt2835 == 35) {
				Static100.anInt2854 = Static98.aClass1_Sub9_Sub1_2.method1228();
				Static152.anInt2185 = Static98.aClass1_Sub9_Sub1_2.method1234();
				while (Static69.anInt2127 > Static98.aClass1_Sub9_Sub1_2.anInt1592) {
					Static98.anInt2835 = Static98.aClass1_Sub9_Sub1_2.method1234();
					Static112.method3349();
				}
				Static98.anInt2835 = -1;
				return true;
			}
			if (Static98.anInt2835 == 82) {
				Static44.method1093(false);
				Static98.anInt2835 = -1;
				return true;
			}
			if (Static98.anInt2835 == 110) {
				Static176.aBoolean176 = false;
				for (local139 = 0; local139 < 5; local139++) {
					Static24.aBooleanArray2[local139] = false;
				}
				Static98.anInt2835 = -1;
				return true;
			}
			if (Static98.anInt2835 == 11) {
				local189 = Static98.aClass1_Sub9_Sub1_2.method1269();
				@Pc(4060) Class70 local4060 = Static76.method2394(Static31.method794(Static98.aClass1_Sub9_Sub1_2).method2904());
				Static41.method1036(local4060, Static108.method2267(local189).method2898(), 6);
				Static98.anInt2835 = -1;
				return true;
			}
			if (Static98.anInt2835 == 23) {
				local139 = Static98.aClass1_Sub9_Sub1_2.method1280();
				if (local139 == 65535) {
					local139 = -1;
				}
				Static55.method1370(local139);
				Static98.anInt2835 = -1;
				return true;
			}
			if (Static98.anInt2835 == 91) {
				local139 = Static98.aClass1_Sub9_Sub1_2.method1248();
				local143 = Static98.aClass1_Sub9_Sub1_2.method1280();
				if (local143 == 65535) {
					local143 = -1;
				}
				Static100.method2117(local139, local143);
				Static98.anInt2835 = -1;
				return true;
			}
			if (Static98.anInt2835 == 62) {
				local139 = Static98.aClass1_Sub9_Sub1_2.method1273();
				local143 = Static98.aClass1_Sub9_Sub1_2.method1280();
				if (local139 < -70000) {
					local143 += 32768;
				}
				if (local139 < 0) {
					local1118 = null;
				} else {
					local1118 = Static128.method3227(local139);
				}
				if (local1118 != null) {
					for (local197 = 0; local197 < local1118.anIntArray228.length; local197++) {
						local1118.anIntArray228[local197] = 0;
						local1118.anIntArray231[local197] = 0;
					}
				}
				Static135.method2644(local143);
				local197 = Static98.aClass1_Sub9_Sub1_2.method1280();
				for (local466 = 0; local466 < local197; local466++) {
					local205 = Static98.aClass1_Sub9_Sub1_2.method1280();
					local2359 = Static98.aClass1_Sub9_Sub1_2.method1240();
					if (local2359 == 255) {
						local2359 = Static98.aClass1_Sub9_Sub1_2.method1266();
					}
					if (local1118 != null && local466 < local1118.anIntArray228.length) {
						local1118.anIntArray228[local466] = local205;
						local1118.anIntArray231[local466] = local2359;
					}
					Static96.method2078(local143, local466, local205 - 1, local2359);
				}
				if (local1118 != null) {
					Static171.method3407(local1118);
				}
				Static146.method2862();
				Static112.anIntArray418[Static92.anInt2687++ & 0x1F] = local143 & 0x7FFF;
				Static98.anInt2835 = -1;
				return true;
			}
			if (Static98.anInt2835 == 29) {
				local139 = Static98.aClass1_Sub9_Sub1_2.method1272();
				local143 = Static98.aClass1_Sub9_Sub1_2.method1239();
				if (local143 == 65535) {
					local143 = -1;
				}
				local1118 = Static128.method3227(local139);
				if (local1118.anInt2370 != 2 || local143 != local1118.anInt2358) {
					local1118.anInt2370 = 2;
					local1118.anInt2358 = local143;
					Static171.method3407(local1118);
				}
				Static98.anInt2835 = -1;
				return true;
			}
			Static141.method2762(null, "T1 - " + Static98.anInt2835 + "," + anInt2709 + "," + Static149.anInt3999 + " - " + Static69.anInt2127);
			Static38.method976();
		} catch (@Pc(4324) IOException local4324) {
			Static109.method2272();
		} catch (@Pc(4328) Exception local4328) {
			@Pc(4368) String local4368 = "T2 - " + Static98.anInt2835 + "," + anInt2709 + "," + Static149.anInt3999 + " - " + Static69.anInt2127 + "," + (Static154.anInt4068 + Static52.aClass1_Sub1_Sub4_Sub2_Sub1_1.anIntArray197[0]) + "," + (Static64.anInt987 + Static52.aClass1_Sub1_Sub4_Sub2_Sub1_1.anIntArray199[0]) + " - ";
			for (local143 = 0; Static69.anInt2127 > local143 && local143 < 50; local143++) {
				local4368 = local4368 + Static98.aClass1_Sub9_Sub1_2.aByteArray25[local143] + ",";
			}
			Static141.method2762(local4328, local4368);
			Static38.method976();
		}
		return true;
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(IIIIIIIILclient!s;IZJ)Z")
	public static boolean method2007(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) Class1_Sub1_Sub4 arg8, @OriginalArg(9) int arg9, @OriginalArg(10) boolean arg10, @OriginalArg(11) long arg11) {
		for (@Pc(1) int local1 = arg1; local1 < arg1 + arg3; local1++) {
			for (@Pc(4) int local4 = arg2; local4 < arg2 + arg4; local4++) {
				if (local1 < 0 || local4 < 0 || local1 >= Static73.anInt2250 || local4 >= Static85.anInt2550) {
					return false;
				}
				@Pc(25) Class1_Sub17 local25 = Static90.aClass1_Sub17ArrayArrayArray1[arg0][local1][local4];
				if (local25 != null && local25.anInt2953 >= 5) {
					return false;
				}
			}
		}
		@Pc(49) Class53 local49 = new Class53();
		local49.aLong99 = arg11;
		local49.anInt3113 = arg0;
		local49.anInt3102 = arg5;
		local49.anInt3100 = arg6;
		local49.anInt3108 = arg7;
		local49.aClass1_Sub1_Sub4_4 = arg8;
		local49.anInt3112 = arg9;
		local49.anInt3109 = arg1;
		local49.anInt3107 = arg2;
		local49.anInt3111 = arg1 + arg3 - 1;
		local49.anInt3101 = arg2 + arg4 - 1;
		for (@Pc(92) int local92 = arg1; local92 < arg1 + arg3; local92++) {
			for (@Pc(95) int local95 = arg2; local95 < arg2 + arg4; local95++) {
				@Pc(98) int local98 = 0;
				if (local92 > arg1) {
					local98++;
				}
				if (local92 < arg1 + arg3 - 1) {
					local98 += 4;
				}
				if (local95 > arg2) {
					local98 += 8;
				}
				if (local95 < arg2 + arg4 - 1) {
					local98 += 2;
				}
				for (@Pc(124) int local124 = arg0; local124 >= 0; local124--) {
					if (Static90.aClass1_Sub17ArrayArrayArray1[local124][local92][local95] == null) {
						Static90.aClass1_Sub17ArrayArrayArray1[local124][local92][local95] = new Class1_Sub17(local124, local92, local95);
					}
				}
				@Pc(157) Class1_Sub17 local157 = Static90.aClass1_Sub17ArrayArrayArray1[arg0][local92][local95];
				local157.aClass53Array2[local157.anInt2953] = local49;
				local157.anIntArray288[local157.anInt2953] = local98;
				local157.anInt2949 |= local98;
				local157.anInt2953++;
			}
		}
		if (arg10) {
			Static20.aClass53Array1[Static139.anInt3674++] = local49;
		}
		return true;
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(Z)V")
	public static void method2008() {
		anIntArrayArray24 = null;
		aClass70_892 = null;
		aClass70_889 = null;
		aClass70_890 = null;
		aClass70_891 = null;
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(ILclient!de;)V")
	public static void method2009(@OriginalArg(1) Class1_Sub1_Sub4_Sub2 arg0) {
		arg0.anInt2015 = 0;
		if (arg0.anInt2005 == 0) {
			arg0.anInt2047 = 1024;
		}
		if (arg0.anInt2005 == 1) {
			arg0.anInt2047 = 1536;
		}
		@Pc(28) int local28 = arg0.anInt1996 - Static47.anInt1654;
		if (arg0.anInt2005 == 2) {
			arg0.anInt2047 = 0;
		}
		if (arg0.anInt2005 == 3) {
			arg0.anInt2047 = 512;
		}
		@Pc(53) int local53 = arg0.anInt2028 * 128 + arg0.anInt2004 * 64;
		arg0.anInt2030 += (local53 - arg0.anInt2030) / local28;
		@Pc(75) int local75 = arg0.anInt1998 * 128 + arg0.anInt2004 * 64;
		arg0.anInt2001 += (local75 - arg0.anInt2001) / local28;
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "([Lclient!rf;B[S)V")
	public static void method2012(@OriginalArg(0) Class70[] arg0, @OriginalArg(2) short[] arg1) {
		Static12.method339(arg0.length - 1, 0, arg0, arg1);
	}
}
