import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static93 {

	@OriginalMember(owner = "client!cv", name = "e", descriptor = "I")
	public static int anInt2118;

	@OriginalMember(owner = "client!cv", name = "d", descriptor = "Lclient!uw;")
	public static final Class359 aClass359_30 = new Class359(61, 3);

	@OriginalMember(owner = "client!cv", name = "a", descriptor = "(ILclient!tia;I)V")
	public static void method1914(@OriginalArg(0) int arg0, @OriginalArg(1) Class5_Sub41_Sub2 arg1) {
		@Pc(17) boolean local17 = arg1.method7871(1) == 1;
		if (local17) {
			Static675.anIntArray611[Static311.anInt5915++] = arg0;
		}
		@Pc(32) int local32 = arg1.method7871(2);
		@Pc(36) Class28_Sub1_Sub4_Sub2_Sub2 local36 = Static351.aClass28_Sub1_Sub4_Sub2_Sub2Array2[arg0];
		if (local32 != 0) {
			@Pc(153) int local153;
			@Pc(158) int local158;
			@Pc(163) int local163;
			if (local32 == 1) {
				local153 = arg1.method7871(3);
				local158 = local36.anIntArray308[0];
				local163 = local36.anIntArray307[0];
				if (local153 == 0) {
					local158--;
					local163--;
				} else if (local153 == 1) {
					local163--;
				} else if (local153 == 2) {
					local163--;
					local158++;
				} else if (local153 == 3) {
					local158--;
				} else if (local153 == 4) {
					local158++;
				} else if (local153 == 5) {
					local163++;
					local158--;
				} else if (local153 == 6) {
					local163++;
				} else if (local153 == 7) {
					local163++;
					local158++;
				}
				if (local17) {
					local36.anInt5560 = local163;
					local36.anInt5544 = local158;
					local36.aBoolean474 = true;
				} else {
					local36.method4604(local158, Static598.aByteArray100[arg0], local163);
				}
			} else if (local32 == 2) {
				local153 = arg1.method7871(4);
				local158 = local36.anIntArray308[0];
				local163 = local36.anIntArray307[0];
				if (local153 == 0) {
					local158 -= 2;
					local163 -= 2;
				} else if (local153 == 1) {
					local163 -= 2;
					local158--;
				} else if (local153 == 2) {
					local163 -= 2;
				} else if (local153 == 3) {
					local158++;
					local163 -= 2;
				} else if (local153 == 4) {
					local158 += 2;
					local163 -= 2;
				} else if (local153 == 5) {
					local158 -= 2;
					local163--;
				} else if (local153 == 6) {
					local163--;
					local158 += 2;
				} else if (local153 == 7) {
					local158 -= 2;
				} else if (local153 == 8) {
					local158 += 2;
				} else if (local153 == 9) {
					local158 -= 2;
					local163++;
				} else if (local153 == 10) {
					local158 += 2;
					local163++;
				} else if (local153 == 11) {
					local158 -= 2;
					local163 += 2;
				} else if (local153 == 12) {
					local163 += 2;
					local158--;
				} else if (local153 == 13) {
					local163 += 2;
				} else if (local153 == 14) {
					local158++;
					local163 += 2;
				} else if (local153 == 15) {
					local163 += 2;
					local158 += 2;
				}
				if (local17) {
					local36.aBoolean474 = true;
					local36.anInt5560 = local163;
					local36.anInt5544 = local158;
				} else {
					local36.method4604(local158, Static598.aByteArray100[arg0], local163);
				}
			} else {
				local153 = arg1.method7871(1);
				@Pc(418) int local418;
				@Pc(426) int local426;
				@Pc(439) int local439;
				@Pc(446) int local446;
				if (local153 == 0) {
					local158 = arg1.method7871(12);
					local163 = local158 >> 10;
					local418 = local158 >> 5 & 0x1F;
					if (local418 > 15) {
						local418 -= 32;
					}
					local426 = local158 & 0x1F;
					if (local426 > 15) {
						local426 -= 32;
					}
					local439 = local418 + local36.anIntArray308[0];
					local446 = local426 + local36.anIntArray307[0];
					if (local17) {
						local36.anInt5560 = local446;
						local36.anInt5544 = local439;
						local36.aBoolean474 = true;
					} else {
						local36.method4604(local439, Static598.aByteArray100[arg0], local446);
					}
					local36.aByte145 = local36.aByte144 = (byte) (local36.aByte145 + local163 & 0x3);
					if (Static599.method8200(local446, local439)) {
						local36.aByte144++;
					}
					if (Static216.anInt4046 == arg0) {
						if (local36.aByte145 != Static481.anInt8082) {
							Static375.aBoolean591 = true;
						}
						Static481.anInt8082 = local36.aByte145;
					}
				} else {
					local158 = arg1.method7871(30);
					local163 = local158 >> 28;
					local418 = local158 >> 14 & 0x3FFF;
					local426 = local158 & 0x3FFF;
					local439 = (local36.anIntArray308[0] + Static153.anInt3147 + local418 & 0x3FFF) - Static153.anInt3147;
					local446 = (Static201.anInt3839 + local36.anIntArray307[0] + local426 & 0x3FFF) - Static201.anInt3839;
					if (local17) {
						local36.anInt5560 = local446;
						local36.aBoolean474 = true;
						local36.anInt5544 = local439;
					} else {
						local36.method4604(local439, Static598.aByteArray100[arg0], local446);
					}
					local36.aByte145 = local36.aByte144 = (byte) (local36.aByte145 + local163 & 0x3);
					if (Static599.method8200(local446, local439)) {
						local36.aByte144++;
					}
					if (Static216.anInt4046 == arg0) {
						Static481.anInt8082 = local36.aByte145;
					}
				}
			}
		} else if (local17) {
			local36.aBoolean474 = false;
		} else if (Static216.anInt4046 == arg0) {
			throw new RuntimeException("s:lr");
		} else {
			@Pc(60) Class33 local60 = Static95.aClass33Array8[arg0] = new Class33();
			local60.anInt620 = (local36.aByte145 << 28) + (Static153.anInt3147 + local36.anIntArray308[0] >> 6 << 14) + (Static201.anInt3839 - -local36.anIntArray307[0] >> 6);
			if (local36.anInt5543 == -1) {
				local60.anInt616 = local36.aClass306_7.method7389();
			} else {
				local60.anInt616 = local36.anInt5543;
			}
			local60.aBoolean42 = local36.aBoolean476;
			local60.anInt618 = local36.anInt5500;
			local60.aBoolean44 = local36.aBoolean475;
			if (local36.anInt5536 > 0) {
				Static216.method3440(local36);
			}
			Static351.aClass28_Sub1_Sub4_Sub2_Sub2Array2[arg0] = null;
			if (arg1.method7871(1) != 0) {
				Static591.method8114(arg1, arg0);
			}
		}
	}
}
