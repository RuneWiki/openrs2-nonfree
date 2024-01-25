import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static9 {

	@OriginalMember(owner = "client!ai", name = "h", descriptor = "Lclient!pp;")
	public static Class194 aClass194_1;

	@OriginalMember(owner = "client!ai", name = "k", descriptor = "I")
	public static int anInt280;

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(ILclient!hq;I)V")
	public static void method186(@OriginalArg(1) Class2_Sub20_Sub1 arg0, @OriginalArg(2) int arg1) {
		@Pc(17) boolean local17 = arg0.method2505(1) == 1;
		if (local17) {
			Static389.anIntArray456[Static390.anInt6850++] = arg1;
		}
		@Pc(32) int local32 = arg0.method2505(2);
		@Pc(36) Class4_Sub2_Sub2_Sub1 local36 = Static129.aClass4_Sub2_Sub2_Sub1Array27[arg1];
		if (local32 != 0) {
			@Pc(145) int local145;
			@Pc(150) int local150;
			@Pc(155) int local155;
			if (local32 == 1) {
				local145 = arg0.method2505(3);
				local150 = local36.anIntArray436[0];
				local155 = local36.anIntArray437[0];
				if (local145 == 0) {
					local155--;
					local150--;
				} else if (local145 == 1) {
					local155--;
				} else if (local145 == 2) {
					local150++;
					local155--;
				} else if (local145 == 3) {
					local150--;
				} else if (local145 == 4) {
					local150++;
				} else if (local145 == 5) {
					local155++;
					local150--;
				} else if (local145 == 6) {
					local155++;
				} else if (local145 == 7) {
					local150++;
					local155++;
				}
				if (local17) {
					local36.anInt5736 = local150;
					local36.anInt5751 = local155;
					local36.aBoolean508 = true;
				} else {
					local36.method4598(Static349.aByteArray171[arg1], local150, local155);
				}
			} else if (local32 == 2) {
				local145 = arg0.method2505(4);
				local150 = local36.anIntArray436[0];
				local155 = local36.anIntArray437[0];
				if (local145 == 0) {
					local155 -= 2;
					local150 -= 2;
				} else if (local145 == 1) {
					local155 -= 2;
					local150--;
				} else if (local145 == 2) {
					local155 -= 2;
				} else if (local145 == 3) {
					local150++;
					local155 -= 2;
				} else if (local145 == 4) {
					local155 -= 2;
					local150 += 2;
				} else if (local145 == 5) {
					local155--;
					local150 -= 2;
				} else if (local145 == 6) {
					local150 += 2;
					local155--;
				} else if (local145 == 7) {
					local150 -= 2;
				} else if (local145 == 8) {
					local150 += 2;
				} else if (local145 == 9) {
					local150 -= 2;
					local155++;
				} else if (local145 == 10) {
					local150 += 2;
					local155++;
				} else if (local145 == 11) {
					local150 -= 2;
					local155 += 2;
				} else if (local145 == 12) {
					local155 += 2;
					local150--;
				} else if (local145 == 13) {
					local155 += 2;
				} else if (local145 == 14) {
					local155 += 2;
					local150++;
				} else if (local145 == 15) {
					local150 += 2;
					local155 += 2;
				}
				if (local17) {
					local36.aBoolean508 = true;
					local36.anInt5736 = local150;
					local36.anInt5751 = local155;
				} else {
					local36.method4598(Static349.aByteArray171[arg1], local150, local155);
				}
			} else {
				local145 = arg0.method2505(1);
				@Pc(424) int local424;
				@Pc(432) int local432;
				@Pc(443) int local443;
				@Pc(450) int local450;
				if (local145 == 0) {
					local150 = arg0.method2505(12);
					local155 = local150 >> 10;
					local424 = local150 >> 5 & 0x1F;
					if (local424 > 15) {
						local424 -= 32;
					}
					local432 = local150 & 0x1F;
					if (local432 > 15) {
						local432 -= 32;
					}
					local443 = local36.anIntArray436[0] + local424;
					local450 = local36.anIntArray437[0] + local432;
					if (local17) {
						local36.anInt5751 = local450;
						local36.aBoolean508 = true;
						local36.anInt5736 = local443;
					} else {
						local36.method4598(Static349.aByteArray171[arg1], local443, local450);
					}
					local36.aByte92 = (byte) (local155 + local36.aByte92 & 0x3);
					if (Static393.anInt6881 == arg1) {
						Static301.anInt5383 = local36.aByte92;
					}
				} else {
					local150 = arg0.method2505(30);
					local155 = local150 >> 28;
					local424 = local150 >> 14 & 0x3FFF;
					local432 = local150 & 0x3FFF;
					local443 = (local36.anIntArray436[0] + Static173.anInt3340 + local424 & 0x3FFF) - Static173.anInt3340;
					local450 = (local432 + local36.anIntArray437[0] + Static379.anInt6721 & 0x3FFF) - Static379.anInt6721;
					if (local17) {
						local36.anInt5736 = local443;
						local36.anInt5751 = local450;
						local36.aBoolean508 = true;
					} else {
						local36.method4598(Static349.aByteArray171[arg1], local443, local450);
					}
					local36.aByte92 = (byte) (local155 + local36.aByte92 & 0x3);
					if (Static393.anInt6881 == arg1) {
						Static301.anInt5383 = local36.aByte92;
					}
				}
			}
		} else if (local17) {
			local36.aBoolean508 = false;
		} else if (Static393.anInt6881 == arg1) {
			throw new RuntimeException("s:lr");
		} else {
			@Pc(60) Class260 local60 = Static329.aClass260Array1[arg1] = new Class260();
			local60.anInt7531 = (local36.anIntArray436[0] + Static173.anInt3340 >> 6 << 14) + (local36.aByte92 << 28) + (local36.anIntArray437[0] + Static379.anInt6721 >> 6);
			if (local36.anInt5733 == -1) {
				local60.anInt7526 = local36.aClass157_7.method3616();
			} else {
				local60.anInt7526 = local36.anInt5733;
			}
			local60.anInt7527 = local36.anInt6481;
			local60.aBoolean643 = local36.aBoolean510;
			if (local36.anInt5726 > 0) {
				Static255.method3890(local36);
			}
			Static129.aClass4_Sub2_Sub2_Sub1Array27[arg1] = null;
			if (arg0.method2505(1) != 0) {
				Static427.method5777(arg1, arg0);
			}
		}
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(IIII)V")
	public static void method187(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg0 == 0) {
			Static448.method6059(Static410.aClass44_87);
		}
		if (arg0 == 1) {
			Static448.method6059(Static166.aClass44_44);
		}
		Static98.aClass2_Sub20_Sub1_1.method3687(arg1 + Static379.anInt6721);
		Static98.aClass2_Sub20_Sub1_1.method3708(Static428.aClass52_1.method1347(82) ? 1 : 0);
		Static98.aClass2_Sub20_Sub1_1.method3745(arg2 + Static173.anInt3340);
		Static425.anInt5530 = arg2;
		Static176.anInt3417 = arg1;
		Static226.aBoolean362 = false;
		Static143.method5897();
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(IZ)Lclient!bp;")
	public static Class27 method188(@OriginalArg(0) int arg0) {
		@Pc(15) Class27 local15 = (Class27) Static43.aClass129_5.method3023((long) arg0);
		if (local15 != null) {
			return local15;
		}
		@Pc(25) byte[] local25 = Static118.aClass188_36.method4283(1, arg0);
		local15 = new Class27();
		local15.anInt978 = arg0;
		if (local25 != null) {
			local15.method709(new Class2_Sub20(local25));
		}
		local15.method716();
		if (local15.anInt980 == 2 && Static367.aClass240_30.method5439((long) arg0) == null) {
			Static367.aClass240_30.method5430((long) arg0, new Class2_Sub16(Static49.anInt1357));
			Static171.aClass27Array1[Static49.anInt1357++] = local15;
		}
		Static43.aClass129_5.method3029(local15, (long) arg0);
		return local15;
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(Ljava/awt/Frame;ZLclient!js;)V")
	public static void method189(@OriginalArg(0) Frame arg0, @OriginalArg(2) Class131 arg1) {
		while (true) {
			@Pc(10) Class128 local10 = arg1.method3054(arg0);
			while (local10.anInt3727 == 0) {
				Static443.method5991(10L);
			}
			if (local10.anInt3727 == 1) {
				arg0.setVisible(false);
				arg0.dispose();
				return;
			}
			Static443.method5991(100L);
		}
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(Ljava/lang/String;I)J")
	public static long method190(@OriginalArg(0) String arg0) {
		@Pc(16) int local16 = arg0.length();
		@Pc(18) long local18 = 0L;
		for (@Pc(20) int local20 = 0; local20 < local16; local20++) {
			local18 = (local18 << 5) + (long) arg0.charAt(local20) - local18;
		}
		return local18;
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(Ljava/lang/String;ILclient!md;)I")
	public static int method191(@OriginalArg(0) String arg0, @OriginalArg(2) Class2_Sub20 arg1) {
		@Pc(13) int local13 = arg1.anInt4608;
		@Pc(17) byte[] local17 = Static449.method1961(arg0);
		arg1.method3702(local17.length);
		arg1.anInt4608 += Static260.aClass248_1.method5551(local17, local17.length, arg1.aByteArray136, arg1.anInt4608, 0);
		return arg1.anInt4608 - local13;
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(ILclient!pc;)I")
	public static int method192(@OriginalArg(1) Class188 arg0) {
		@Pc(5) int local5 = 0;
		if (arg0.method4296(Static119.anInt2385)) {
			local5++;
		}
		if (arg0.method4296(Static419.anInt7349)) {
			local5++;
		}
		if (arg0.method4296(Static352.anInt7235)) {
			local5++;
		}
		if (arg0.method4296(Static406.anInt7052)) {
			local5++;
		}
		if (arg0.method4296(Static99.anInt1741)) {
			local5++;
		}
		if (arg0.method4296(Static397.anInt6958)) {
			local5++;
		}
		if (arg0.method4296(Static139.anInt2700)) {
			local5++;
		}
		if (arg0.method4296(Static151.anInt2929)) {
			local5++;
		}
		if (arg0.method4296(Static339.anInt5985)) {
			local5++;
		}
		if (arg0.method4296(Static294.anInt4185)) {
			local5++;
		}
		if (arg0.method4296(Static358.anInt6320)) {
			local5++;
		}
		if (arg0.method4296(Static369.anInt6559)) {
			local5++;
		}
		if (arg0.method4296(Static312.anInt2864)) {
			local5++;
		}
		if (arg0.method4296(Static143.anInt7606)) {
			local5++;
		}
		if (arg0.method4296(Static447.anInt4686)) {
			local5++;
		}
		if (arg0.method4296(Static439.anInt7664)) {
			local5++;
		}
		return local5;
	}
}
