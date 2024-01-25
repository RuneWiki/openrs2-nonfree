import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static97 {

	@OriginalMember(owner = "client!eu", name = "u", descriptor = "Lclient!ao;")
	public static final Class12 aClass12_105 = new Class12(62, 5);

	@OriginalMember(owner = "client!eu", name = "w", descriptor = "I")
	public static int anInt1902 = 0;

	@OriginalMember(owner = "client!eu", name = "x", descriptor = "Lclient!gf;")
	public static final Class96 aClass96_36 = new Class96("Opened title screen", "Titelbild geöffnet.", "Écran-titre ouvert", "Tela título aberta");

	@OriginalMember(owner = "client!eu", name = "y", descriptor = "I")
	public static int anInt1903 = 0;

	@OriginalMember(owner = "client!eu", name = "z", descriptor = "I")
	public static int anInt1904 = 0;

	@OriginalMember(owner = "client!eu", name = "A", descriptor = "Z")
	public static boolean aBoolean142 = false;

	@OriginalMember(owner = "client!eu", name = "a", descriptor = "(Lclient!tp;Z)Z")
	public static boolean method1543(@OriginalArg(0) Class47_Sub1 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(6) boolean local6 = Static256.aClass70Array2 == Static315.aClass70Array3;
		@Pc(8) int local8 = 0;
		@Pc(10) byte local10 = 0;
		@Pc(12) byte local12 = 0;
		arg0.method5446();
		if (arg0.aShort104 < 0 || arg0.aShort105 < 0 || arg0.aShort107 >= Static251.anInt4344 || arg0.aShort106 >= Static219.anInt3872) {
			return false;
		}
		@Pc(38) int local38;
		for (@Pc(34) int local34 = arg0.aShort104; local34 <= arg0.aShort107; local34++) {
			for (local38 = arg0.aShort105; local38 <= arg0.aShort106; local38++) {
				@Pc(45) Class137 local45 = Static266.method5735(arg0.aByte97, local34, local38);
				if (local45 != null) {
					@Pc(49) int local49 = 0;
					if (local34 > arg0.aShort104) {
						local49++;
					}
					if (local34 < arg0.aShort107) {
						local49 += 4;
					}
					if (local38 > arg0.aShort105) {
						local49 += 8;
					}
					if (local38 < arg0.aShort106) {
						local49 += 2;
					}
					@Pc(74) Class167 local74 = Static212.method3192(local49, arg0);
					@Pc(77) Class167 local77 = local45.aClass167_1;
					if (local77 == null) {
						local45.aClass167_1 = local74;
					} else {
						while (local77.aClass167_2 != null) {
							local77 = local77.aClass167_2;
						}
						local77.aClass167_2 = local74;
					}
					local45.aByte47 = (byte) (local45.aByte47 | local49);
					if (local6 && (Static283.anIntArrayArray32[local34][local38] & 0xFF000000) != 0) {
						local8 = Static283.anIntArrayArray32[local34][local38];
						local10 = Static376.aByteArrayArray26[local34][local38];
						local12 = Static152.aByteArrayArray13[local34][local38];
					}
				}
			}
		}
		if (local6 && (local8 & 0xFF000000) != 0) {
			for (local38 = arg0.aShort104; local38 <= arg0.aShort107; local38++) {
				for (@Pc(150) int local150 = arg0.aShort105; local150 <= arg0.aShort106; local150++) {
					if ((Static283.anIntArrayArray32[local38][local150] & 0xFF000000) == 0) {
						Static283.anIntArrayArray32[local38][local150] = local8;
						Static376.aByteArrayArray26[local38][local150] = local10;
						Static152.aByteArrayArray13[local38][local150] = local12;
					}
				}
			}
		}
		if (arg1) {
			Static83.aClass47_Sub1Array6[Static93.anInt1805++] = arg0;
		}
		return true;
	}

	@OriginalMember(owner = "client!eu", name = "a", descriptor = "(Lclient!db;Lclient!da;ILclient!qa;)V")
	public static void method1545(@OriginalArg(0) Class52 arg0, @OriginalArg(1) Class1_Sub8 arg1, @OriginalArg(3) Class121 arg2) {
		@Pc(10) Class78 local10 = arg0.method982(arg2);
		if (local10 == null) {
			return;
		}
		@Pc(16) int local16 = local10.UA();
		if (local10.qa() > local16) {
			local16 = local10.qa();
		}
		@Pc(28) int local28 = arg1.anInt1164;
		@Pc(31) int local31 = arg1.anInt1169;
		@Pc(33) int local33 = 0;
		@Pc(35) int local35 = 0;
		@Pc(37) int local37 = 0;
		@Pc(51) int local51;
		@Pc(78) int local78;
		if (arg0.aString26 != null) {
			local33 = Static396.aClass62_9.method1158(Static69.aStringArray11, null, arg0.aString26, null);
			for (local51 = 0; local51 < local33; local51++) {
				@Pc(57) String local57 = Static69.aStringArray11[local51];
				if (local33 - 1 > local51) {
					local57 = local57.substring(0, local57.length() - 4);
				}
				local78 = Static251.aClass251_7.method5664(local57);
				if (local35 < local78) {
					local35 = local78;
				}
			}
			local37 = Static251.aClass251_7.method5663() * local33 + Static251.aClass251_7.method5662() / 2;
		}
		local51 = arg1.anInt1164 + local16 / 2;
		@Pc(112) int local112 = arg1.anInt1169;
		if (local28 < Static350.anInt6643 + local16) {
			local51 = local35 / 2 + local16 / 2 + Static350.anInt6643 + 5 + 10;
			local28 = Static350.anInt6643;
		} else if (local28 > Static350.anInt6632 - local16) {
			local28 = Static350.anInt6632 - local16;
			local51 = Static350.anInt6632 - local16 / 2 - local35 / 2 - 10 - 5;
		}
		if (local31 < local16 + Static350.anInt6641) {
			local31 = Static350.anInt6641;
			local112 = local16 / 2 + Static350.anInt6641 + 10;
		} else if (local31 > Static350.anInt6642 - local16) {
			local31 = Static350.anInt6642 - local16;
			local112 = Static350.anInt6642 - local37 - local16 / 2 - 10;
		}
		local78 = (int) (Math.atan2((double) (local28 - arg1.anInt1164), (double) (local31 - arg1.anInt1169)) / 3.141592653589793D * 32767.0D) & 0xFFFF;
		local10.method6004((float) local28 + (float) local16 / 2.0F, (float) local16 / 2.0F + (float) local31, 4096, local78);
		@Pc(252) int local252 = -2;
		@Pc(254) int local254 = -2;
		@Pc(256) int local256 = -2;
		@Pc(266) int local266 = -2;
		if (arg0.aString26 != null) {
			local254 = local112;
			local252 = local51 - local35 / 2 - 5;
			local266 = local112 + local33 * Static251.aClass251_7.method5663() + 3;
			local256 = local35 + local252 + 10;
			if (arg0.anInt1207 != 0) {
				arg2.method4600(local256 - local252, local252, arg0.anInt1207, local266 - local112, local112);
			}
			if (arg0.anInt1185 != 0) {
				arg2.method4601(local266 - local112, local252, local256 - local252, arg0.anInt1185, local112);
			}
			for (@Pc(337) int local337 = 0; local337 < local33; local337++) {
				@Pc(343) String local343 = Static69.aStringArray11[local337];
				if (local33 - 1 > local337) {
					local343 = local343.substring(0, local343.length() - 4);
				}
				Static251.aClass251_7.method5661(arg2, local343, local51, local112, arg0.anInt1182);
				local112 += Static251.aClass251_7.method5663();
			}
		}
		if (arg0.anInt1197 == -1 && arg0.aString26 == null) {
			return;
		}
		local16 >>= 0x1;
		@Pc(395) Class1_Sub41 local395 = new Class1_Sub41(arg1);
		local395.anInt7090 = local31 - local16;
		local395.anInt7092 = local16 + local31;
		local395.anInt7097 = local28 + local16;
		local395.anInt7096 = local256;
		local395.anInt7089 = local254;
		local395.anInt7088 = local266;
		local395.anInt7095 = local252;
		local395.anInt7094 = local28 - local16;
		Static115.aClass142_15.method3212(local395);
	}
}
