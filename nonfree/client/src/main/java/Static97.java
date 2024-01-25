import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static97 {

	@OriginalMember(owner = "client!cu", name = "g", descriptor = "Lclient!pc;")
	public static final Class281 aClass281_2 = new Class281();

	@OriginalMember(owner = "client!cu", name = "o", descriptor = "Lclient!jia;")
	public static final Class186 aClass186_25 = new Class186(99, -1);

	@OriginalMember(owner = "client!cu", name = "b", descriptor = "(II)V")
	public static void method1288(@OriginalArg(0) int arg0) {
		Static707.anInt11053 = arg0;
		Static293.anInt5245 = 2;
		Static167.aClass400_1 = Static532.aClass400_3;
		@Pc(11) String local11 = null;
		if (Static12.aByteArray2 != null) {
			@Pc(18) Class3_Sub28 local18 = new Class3_Sub28(Static12.aByteArray2);
			local11 = Static479.method7005(local18.method5287());
			Static669.aLong366 = local18.method5287();
		}
		if (local11 == null) {
			Static422.method6222(35);
		} else {
			Static441.method6405(true, "", false, local11);
		}
	}

	@OriginalMember(owner = "client!cu", name = "a", descriptor = "(Lclient!cea;ILclient!rba;I)V")
	public static void method1289(@OriginalArg(0) Class47 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class3_Sub28 arg2) {
		@Pc(16) Class3_Sub9 local16 = new Class3_Sub9();
		local16.anInt698 = arg2.method5322(-85);
		local16.anInt697 = arg2.method5312();
		local16.anIntArray39 = new int[local16.anInt698];
		local16.anIntArray40 = new int[local16.anInt698];
		local16.aClass201Array2 = new Class201[local16.anInt698];
		local16.aClass201Array1 = new Class201[local16.anInt698];
		local16.anIntArray38 = new int[local16.anInt698];
		local16.aByteArrayArrayArray2 = new byte[local16.anInt698][][];
		for (@Pc(58) int local58 = 0; local58 < local16.anInt698; local58++) {
			try {
				@Pc(64) int local64 = arg2.method5322(-79);
				@Pc(90) String local90;
				@Pc(94) String local94;
				@Pc(98) int local98;
				if (local64 == 0 || local64 == 1 || local64 == 2) {
					local90 = arg2.method5295();
					local94 = arg2.method5295();
					local98 = 0;
					if (local64 == 1) {
						local98 = arg2.method5312();
					}
					local16.anIntArray38[local58] = local64;
					local16.anIntArray39[local58] = local98;
					local16.aClass201Array2[local58] = arg0.method953(Static156.method2471(local90), local94);
				} else if (local64 == 3 || local64 == 4) {
					local90 = arg2.method5295();
					local94 = arg2.method5295();
					local98 = arg2.method5322(-120);
					@Pc(101) String[] local101 = new String[local98];
					for (@Pc(103) int local103 = 0; local103 < local98; local103++) {
						local101[local103] = arg2.method5295();
					}
					@Pc(124) byte[][] local124 = new byte[local98][];
					@Pc(137) int local137;
					if (local64 == 3) {
						for (@Pc(131) int local131 = 0; local131 < local98; local131++) {
							local137 = arg2.method5312();
							local124[local131] = new byte[local137];
							arg2.method5271(local124[local131], local137, 0);
						}
					}
					local16.anIntArray38[local58] = local64;
					@Pc(168) Class[] local168 = new Class[local98];
					for (local137 = 0; local137 < local98; local137++) {
						local168[local137] = Static156.method2471(local101[local137]);
					}
					local16.aClass201Array1[local58] = arg0.method943(local168, Static156.method2471(local90), local94);
					local16.aByteArrayArrayArray2[local58] = local124;
				}
			} catch (@Pc(257) ClassNotFoundException local257) {
				local16.anIntArray40[local58] = -1;
			} catch (@Pc(264) SecurityException local264) {
				local16.anIntArray40[local58] = -2;
			} catch (@Pc(271) NullPointerException local271) {
				local16.anIntArray40[local58] = -3;
			} catch (@Pc(278) Exception local278) {
				local16.anIntArray40[local58] = -4;
			} catch (@Pc(285) Throwable local285) {
				local16.anIntArray40[local58] = -5;
			}
		}
		Static42.aClass357_3.method8401(local16);
	}

	@OriginalMember(owner = "client!cu", name = "a", descriptor = "(IIIZ[BIII[B)V")
	public static void method1290(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) byte[] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) byte[] arg7) {
		@Pc(17) int local17 = -(arg1 >> 2);
		@Pc(22) int local22 = -(arg1 & 0x3);
		for (@Pc(25) int local25 = -arg0; local25 < 0; local25++) {
			@Pc(33) int local33;
			for (@Pc(29) int local29 = local17; local29 < 0; local29++) {
				local33 = arg2++;
				arg3[local33] = (byte) (arg3[local33] - arg7[arg5++]);
				@Pc(46) int local46 = arg2++;
				arg3[local46] = (byte) (arg3[local46] - arg7[arg5++]);
				@Pc(59) int local59 = arg2++;
				arg3[local59] = (byte) (arg3[local59] - arg7[arg5++]);
				@Pc(72) int local72 = arg2++;
				arg3[local72] = (byte) (arg3[local72] - arg7[arg5++]);
			}
			for (@Pc(93) int local93 = local22; local93 < 0; local93++) {
				local33 = arg2++;
				arg3[local33] = (byte) (arg3[local33] - arg7[arg5++]);
			}
			arg2 += arg6;
			arg5 += arg4;
		}
	}

	@OriginalMember(owner = "client!cu", name = "a", descriptor = "(ZILclient!av;)V")
	public static void method1292(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class20 arg1) {
		@Pc(20) int local20 = arg1.anInt580 == 0 ? arg1.anInt509 : arg1.anInt580;
		@Pc(30) int local30 = arg1.anInt571 == 0 ? arg1.anInt569 : arg1.anInt571;
		Static56.method719(local20, Static403.aClass20ArrayArray2[arg1.anInt600 >> 16], arg1.anInt600, arg0, local30);
		if (arg1.aClass20Array2 != null) {
			Static56.method719(local20, arg1.aClass20Array2, arg1.anInt600, arg0, local30);
		}
		@Pc(65) Class3_Sub52 local65 = (Class3_Sub52) Static170.aClass136_19.method3503((long) arg1.anInt600);
		if (local65 != null) {
			Static608.method8325(local30, arg0, local65.anInt10202, local20);
		}
	}

	@OriginalMember(owner = "client!cu", name = "a", descriptor = "(Lclient!cea;Ljava/lang/String;ILjava/lang/String;I)Lclient!ke;")
	public static Class201 method1297(@OriginalArg(0) Class47 arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) String arg3) {
		if (arg2 == 0) {
			return arg0.method951(arg3);
		}
		@Pc(42) Class201 local42;
		if (arg2 == 1) {
			try {
				@Pc(31) Object local31 = Static733.method8727(new Object[] { (new URL(Static395.anApplet1.getCodeBase(), arg3)).toString() }, arg1, Static395.anApplet1);
				if (local31 == null) {
					throw new RuntimeException();
				}
				local42 = new Class201();
				local42.anInt5729 = 1;
				return local42;
			} catch (@Pc(48) Throwable local48) {
				@Pc(52) Class201 local52 = new Class201();
				local52.anInt5729 = 2;
				return local52;
			}
		} else if (arg2 == 2) {
			try {
				Static395.anApplet1.getAppletContext().showDocument(new URL(Static395.anApplet1.getCodeBase(), arg3), "_blank");
				local42 = new Class201();
				local42.anInt5729 = 1;
				return local42;
			} catch (@Pc(92) Exception local92) {
				local42 = new Class201();
				local42.anInt5729 = 2;
				return local42;
			}
		} else if (arg2 == 3) {
			try {
				Static733.method8728(Static395.anApplet1, "loggedout");
			} catch (@Pc(115) Throwable local115) {
			}
			try {
				Static395.anApplet1.getAppletContext().showDocument(new URL(Static395.anApplet1.getCodeBase(), arg3), "_top");
				local42 = new Class201();
				local42.anInt5729 = 1;
				return local42;
			} catch (@Pc(137) Exception local137) {
				local42 = new Class201();
				local42.anInt5729 = 2;
				return local42;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}
}
