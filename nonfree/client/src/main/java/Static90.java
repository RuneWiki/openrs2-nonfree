import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static90 {

	@OriginalMember(owner = "client!ee", name = "e", descriptor = "[I")
	public static int[] anIntArray125;

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "[I")
	public static final int[] anIntArray122 = new int[200];

	@OriginalMember(owner = "client!ee", name = "b", descriptor = "[I")
	public static int[] anIntArray123 = new int[2];

	@OriginalMember(owner = "client!ee", name = "c", descriptor = "[I")
	public static final int[] anIntArray124 = new int[4096];

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(IILclient!of;Lclient!bp;I)V")
	public static void method1490(@OriginalArg(0) int arg0, @OriginalArg(2) Class4_Sub30_Sub1 arg1, @OriginalArg(3) Class6_Sub2_Sub1_Sub1 arg2, @OriginalArg(4) int arg3) {
		@Pc(13) int local13;
		if ((arg3 & 0x400) != 0) {
			local13 = arg1.method4877();
			arg2.anInt6093 = arg1.method4854();
			arg2.anInt6138 = arg1.method4864();
			arg2.aBoolean420 = (local13 & 0x8000) != 0;
			arg2.anInt6096 = local13 & 0x7FFF;
			arg2.anInt6104 = arg2.anInt6093 + Static175.anInt3261 + arg2.anInt6096;
		}
		@Pc(51) byte local51 = -1;
		if ((arg3 & 0x10) != 0) {
			arg2.anInt971 = arg1.method4877();
			if (arg2.anInt6147 == 0) {
				arg2.method4753(arg2.anInt971);
				arg2.anInt971 = -1;
			}
		}
		if ((arg3 & 0x8) != 0) {
			local13 = arg1.method4880();
			if (local13 == 65535) {
				local13 = -1;
			}
			arg2.anInt6081 = local13;
		}
		if ((arg3 & 0x1000) != 0) {
			arg2.anInt6130 = arg1.method4865();
			arg2.anInt6143 = arg1.method4865();
			arg2.anInt6086 = arg1.method4865();
			arg2.anInt6092 = arg1.method4876();
			arg2.anInt6105 = arg1.method4852() + Static175.anInt3261;
			arg2.anInt6087 = arg1.method4856() + Static175.anInt3261;
			arg2.anInt6115 = arg1.method4864();
			if (arg2.aBoolean52) {
				arg2.anInt6143 += arg2.anInt980;
				arg2.anInt6130 += arg2.anInt993;
				arg2.anInt6092 += arg2.anInt980;
				arg2.anInt6086 += arg2.anInt993;
				arg2.anInt6147 = 0;
			} else {
				arg2.anInt6143 += arg2.anIntArray537[0];
				arg2.anInt6130 += arg2.anIntArray536[0];
				arg2.anInt6086 += arg2.anIntArray536[0];
				arg2.anInt6147 = 1;
				arg2.anInt6092 += arg2.anIntArray537[0];
			}
			arg2.anInt6145 = 0;
		}
		@Pc(224) int local224;
		@Pc(228) int local228;
		if ((arg3 & 0x40) != 0) {
			local13 = arg1.method4877();
			local224 = arg1.method4882();
			local228 = arg1.method4829();
			@Pc(231) int local231 = arg1.anInt6244;
			@Pc(239) boolean local239 = (local13 & 0x8000) != 0;
			if (arg2.aString11 != null && arg2.aClass188_1 != null) {
				@Pc(247) boolean local247 = false;
				if (local224 <= 1) {
					if (!local239 && (Static386.aBoolean448 && !Static146.aBoolean200 || Static444.aBoolean494)) {
						local247 = true;
					} else if (Static367.method5077(arg2.aString11)) {
						local247 = true;
					}
				}
				if (!local247 && Static339.anInt5973 == 0) {
					Static145.aClass4_Sub30_3.anInt6244 = 0;
					arg1.method4863(local228, Static145.aClass4_Sub30_3.aByteArray79);
					Static145.aClass4_Sub30_3.anInt6244 = 0;
					@Pc(293) int local293 = -1;
					@Pc(312) String local312;
					if (local239) {
						local13 &= 0x7FFF;
						@Pc(303) Class180 local303 = Static397.method5287(Static145.aClass4_Sub30_3);
						local293 = local303.anInt5303;
						local312 = local303.aClass4_Sub1_Sub10_1.method3464(Static145.aClass4_Sub30_3);
					} else {
						local312 = Static257.method3525(Static92.method1505(Static145.aClass4_Sub30_3));
					}
					arg2.aString56 = local312.trim();
					arg2.anInt6140 = local13 & 0xFF;
					arg2.anInt6133 = 150;
					arg2.anInt6094 = local13 >> 8;
					@Pc(353) int local353;
					if (local224 == 1 || local224 == 2) {
						local353 = local239 ? 17 : 1;
					} else {
						local353 = local239 ? 17 : 2;
					}
					if (local224 == 2) {
						Static313.method4325(local312, local293, 0, "<img=1>" + arg2.method709(), "<img=1>" + arg2.method706(), null, local353);
					} else if (local224 == 1) {
						Static313.method4325(local312, local293, 0, "<img=0>" + arg2.method709(), "<img=0>" + arg2.method706(), null, local353);
					} else {
						Static313.method4325(local312, local293, 0, arg2.method709(), arg2.method706(), null, local353);
					}
				}
			}
			arg1.anInt6244 = local231 + local228;
		}
		if ((arg3 & 0x80) != 0) {
			local13 = arg1.method4844();
			local224 = arg1.method4829();
			arg2.method4764(local13, local224, Static175.anInt3261);
			arg2.anInt6119 = Static175.anInt3261 + 300;
			arg2.anInt6090 = arg1.method4864();
		}
		if ((arg3 & 0x4) != 0) {
			Static251.aByteArray45[arg0] = arg1.method4879();
		}
		if ((arg3 & 0x20) != 0) {
			local13 = arg1.method4877();
			if (local13 == 65535) {
				local13 = -1;
			}
			local224 = arg1.method4882();
			Static443.method5694(local224, local13, arg2);
		}
		if ((arg3 & 0x1) != 0) {
			local13 = arg1.method4854();
			@Pc(524) byte[] local524 = new byte[local13];
			@Pc(529) Class4_Sub30 local529 = new Class4_Sub30(local524);
			arg1.method4851(local524, local13);
			Static165.aClass4_Sub30Array1[arg0] = local529;
			arg2.method716(local529);
		}
		if ((arg3 & 0x4000) != 0) {
			local51 = arg1.method4876();
		}
		if ((arg3 & 0x10000) != 0) {
			arg2.aByte87 = arg1.method4879();
			arg2.aByte89 = arg1.method4866();
			arg2.aByte90 = arg1.method4865();
			arg2.aByte88 = (byte) arg1.method4854();
			arg2.anInt6075 = Static175.anInt3261 + arg1.method4880();
			arg2.anInt6114 = Static175.anInt3261 + arg1.method4856();
		}
		if ((arg3 & 0x8000) != 0) {
			local13 = arg1.method4880();
			if (local13 == 65535) {
				local13 = -1;
			}
			local224 = arg1.method4837();
			local228 = arg1.method4854();
			arg2.method4756(local224, local228, local13, false);
		}
		if ((arg3 & 0x40000) != 0) {
			local13 = arg1.method4877();
			local224 = arg1.method4837();
			if (local13 == 65535) {
				local13 = -1;
			}
			local228 = arg1.method4854();
			arg2.method4756(local224, local228, local13, true);
		}
		if ((arg3 & 0x100) != 0) {
			arg2.aString56 = arg1.method4867();
			if (arg2.aString56.charAt(0) == '~') {
				arg2.aString56 = arg2.aString56.substring(1);
				Static262.method3576(arg2.aString56, arg2.method709(), 2, 0, arg2.method706());
			} else if (arg2 == Static375.aClass6_Sub2_Sub1_Sub1_3) {
				Static262.method3576(arg2.aString56, arg2.method709(), 2, 0, arg2.method706());
			}
			arg2.anInt6133 = 150;
			arg2.anInt6140 = 0;
			arg2.anInt6094 = 0;
		}
		if ((arg3 & 0x800) != 0) {
			local13 = Static175.anInt3261;
			local224 = arg1.method4844();
			local228 = arg1.method4854();
			arg2.method4764(local224, local228, local13);
		}
		if ((arg3 & 0x2000) != 0) {
			arg2.aBoolean54 = arg1.method4854() == 1;
		}
		if ((arg3 & 0x20000) != 0) {
			local13 = arg1.method4829();
			@Pc(777) int[] local777 = new int[local13];
			@Pc(780) int[] local780 = new int[local13];
			@Pc(783) int[] local783 = new int[local13];
			for (@Pc(785) int local785 = 0; local785 < local13; local785++) {
				@Pc(791) int local791 = arg1.method4852();
				if (local791 == 65535) {
					local791 = -1;
				}
				local777[local785] = local791;
				local780[local785] = arg1.method4882();
				local783[local785] = arg1.method4877();
			}
			Static370.method5085(local780, local777, arg2, local783);
		}
		if (!arg2.aBoolean52) {
			return;
		}
		if (local51 == 127) {
			arg2.method715(arg2.anInt993, arg2.anInt980);
			return;
		}
		@Pc(840) byte local840;
		if (local51 == -1) {
			local840 = Static251.aByteArray45[arg0];
		} else {
			local840 = local51;
		}
		arg2.method713(local840, arg2.anInt980, arg2.anInt993);
	}
}
