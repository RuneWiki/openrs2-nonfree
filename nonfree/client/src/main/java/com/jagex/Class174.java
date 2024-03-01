package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fj")
public class Class174 {

	@OriginalMember(owner = "client!fj", name = "or", descriptor = "Z")
	public static boolean aBoolean625;

	@OriginalMember(owner = "client!fj", name = "qg", descriptor = "I")
	static int anInt3472;

	@OriginalMember(owner = "client!fj", name = "p", descriptor = "[B")
	byte[] aByteArray68;

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "I")
	int anInt3471;

	@OriginalMember(owner = "client!fj", name = "l", descriptor = "(B)V", line = 99)
	static void method23401() {
		if (Class360.anIntArray422 != null) {
			return;
		}
		Class360.anIntArray422 = new int[65536];
		Class179.anIntArray372 = new int[65536];
		@Pc(17) double local17 = Math.random() * 0.03D - 0.015D + 0.7D;
		for (@Pc(19) int local19 = 0; local19 < 65536; local19++) {
			@Pc(33) double local33 = (double) (local19 >> 10 & 0x3F) / 64.0D + 0.0078125D;
			@Pc(44) double local44 = (double) (local19 >> 7 & 0x7) / 8.0D + 0.0625D;
			@Pc(51) double local51 = (double) (local19 & 0x7F) / 128.0D;
			@Pc(53) double local53 = local51;
			@Pc(55) double local55 = local51;
			@Pc(57) double local57 = local51;
			if (local44 != 0.0D) {
				@Pc(71) double local71;
				if (local51 < 0.5D) {
					local71 = local51 * (local44 + 1.0D);
				} else {
					local71 = local44 + local51 - local51 * local44;
				}
				@Pc(86) double local86 = local51 * 2.0D - local71;
				@Pc(90) double local90 = local33 + 0.3333333333333333D;
				if (local90 > 1.0D) {
					local90--;
				}
				@Pc(104) double local104 = local33 - 0.3333333333333333D;
				if (local104 < 0.0D) {
					local104++;
				}
				if (local90 * 6.0D < 1.0D) {
					local53 = (local71 - local86) * 6.0D * local90 + local86;
				} else if (local90 * 2.0D < 1.0D) {
					local53 = local71;
				} else if (local90 * 3.0D < 2.0D) {
					local53 = local86 + (local71 - local86) * (0.6666666666666666D - local90) * 6.0D;
				} else {
					local53 = local86;
				}
				if (local33 * 6.0D < 1.0D) {
					local55 = (local71 - local86) * 6.0D * local33 + local86;
				} else if (local33 * 2.0D < 1.0D) {
					local55 = local71;
				} else if (local33 * 3.0D < 2.0D) {
					local55 = local86 + (local71 - local86) * 6.0D * (0.6666666666666666D - local33);
				} else {
					local55 = local86;
				}
				if (local104 * 6.0D < 1.0D) {
					local57 = (local71 - local86) * 6.0D * local104 + local86;
				} else if (local104 * 2.0D < 1.0D) {
					local57 = local71;
				} else if (local104 * 3.0D < 2.0D) {
					local57 = (local71 - local86) * 6.0D * (0.6666666666666666D - local104) + local86;
				} else {
					local57 = local86;
				}
			}
			local53 = Math.pow(local53, local17);
			local55 = Math.pow(local55, local17);
			local57 = Math.pow(local57, local17);
			@Pc(270) int local270 = (int) (local53 * 256.0D);
			@Pc(275) int local275 = (int) (local55 * 256.0D);
			@Pc(280) int local280 = (int) (local57 * 256.0D);
			@Pc(290) int local290 = local280 + (local270 << 16) + (local275 << 8);
			Class360.anIntArray422[local19] = local290 & 0xFFFFFF;
			@Pc(306) int local306 = (local280 << 16) + (local275 << 8) + local270;
			Class179.anIntArray372[local19] = local306;
		}
	}

	@OriginalMember(owner = "client!fj", name = "<init>", descriptor = "([B)V", line = 124)
	Class174(@OriginalArg(0) byte[] arg0) {
		this.aByteArray68 = arg0;
		this.anInt3471 = 0;
	}

	@OriginalMember(owner = "client!fj", name = "g", descriptor = "()I", line = 130)
	int method23392() {
		@Pc(1) short local1 = 0;
		for (@Pc(3) int local3 = 0; local3 < 2; local3++) {
			local1 = (short) (local1 | (this.aByteArray68[(this.anInt3471 += -313019193) * -1424044809 - 1] & 0xFF) << local3 * 8);
		}
		return local1;
	}

	@OriginalMember(owner = "client!fj", name = "p", descriptor = "(I)I", line = 130)
	int method23393() {
		@Pc(1) short local1 = 0;
		for (@Pc(3) int local3 = 0; local3 < 2; local3++) {
			local1 = (short) (local1 | (this.aByteArray68[(this.anInt3471 += -313019193) * -1424044809 - 1] & 0xFF) << local3 * 8);
		}
		return local1;
	}

	@OriginalMember(owner = "client!fj", name = "l", descriptor = "()Ljava/lang/String;", line = 136)
	String method23390() {
		@Pc(3) int local3 = this.method23393();
		if (local3 == -1) {
			return null;
		} else if (local3 > 256) {
			throw new RuntimeException_Sub4();
		} else {
			@Pc(26) String local26 = new String(this.aByteArray68, this.anInt3471 * -1424044809, local3);
			this.anInt3471 += local3 * -313019193;
			return local26;
		}
	}

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(I)Ljava/lang/String;", line = 136)
	String method23391() {
		@Pc(3) int local3 = this.method23393();
		if (local3 == -1) {
			return null;
		} else if (local3 > 256) {
			throw new RuntimeException_Sub4();
		} else {
			@Pc(26) String local26 = new String(this.aByteArray68, this.anInt3471 * -1424044809, local3);
			this.anInt3471 += local3 * -313019193;
			return local26;
		}
	}

	@OriginalMember(owner = "client!fj", name = "h", descriptor = "()Ljava/lang/String;", line = 136)
	String method23394() {
		@Pc(3) int local3 = this.method23393();
		if (local3 == -1) {
			return null;
		} else if (local3 > 256) {
			throw new RuntimeException_Sub4();
		} else {
			@Pc(26) String local26 = new String(this.aByteArray68, this.anInt3471 * -1424044809, local3);
			this.anInt3471 += local3 * -313019193;
			return local26;
		}
	}

	@OriginalMember(owner = "client!fj", name = "go", descriptor = "(I)V", line = 3523)
	public static final void method23400() {
		if (!client.aBoolean585) {
			client.aFloat239 += (24.0F - client.aFloat239) / 2.0F;
			client.aBoolean586 = true;
			client.aBoolean585 = true;
		}
	}

	@OriginalMember(owner = "client!fj", name = "hi", descriptor = "(Lclient!fo;Lclient!fw;ZILclient!vs;B)V", line = 5322)
	static final void method23395(@OriginalArg(0) Class178 arg0, @OriginalArg(1) Class186 arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class536 arg4) {
		arg4.anInt5319 -= 624249098;
		@Pc(13) int local13 = arg4.anIntArray496[arg4.anInt5319 * 960738381];
		@Pc(23) int local23 = arg4.anIntArray496[arg4.anInt5319 * 960738381 + 1];
		if (arg0.anInt3491 * 18828465 == -1 && !arg1.aBoolean657) {
			Class148.method23120(arg0.anInt3570 * 954808515);
			Class192.method24067(arg0.anInt3570 * 954808515);
			Class399.method27569(arg0.anInt3570 * 954808515);
		}
		arg0.anInt3476 = -1383761065;
		if (local13 == -1) {
			arg0.anInt3513 = 557855815;
			arg0.anInt3514 = -1702990945;
			arg0.anInt3559 = 1433497693;
			return;
		}
		arg0.anInt3559 = local13 * -1433497693;
		arg0.anInt3563 = local23 * 1153713167;
		arg0.aBoolean642 = arg2;
		@Pc(84) Class594 local84 = Class44_Sub3.aClass596_1.method33435(local13);
		arg0.anInt3518 = local84.anInt5469 * 1634329055;
		arg0.anInt3519 = local84.anInt5470 * -1218654275;
		arg0.anInt3520 = local84.anInt5462 * -78497461;
		arg0.anInt3561 = local84.anInt5488 * -100996781;
		arg0.anInt3517 = local84.anInt5472 * 846904517;
		arg0.anInt3523 = local84.anInt5512 * 739834489;
		arg0.anInt3501 = arg3 * -860629181;
		if (arg0.anInt3524 * -1898374355 > 0) {
			arg0.anInt3523 = arg0.anInt3523 * -251747168 / (-1898374355 * arg0.anInt3524) * -1002365267;
		} else if (arg0.anInt3495 * 1566866781 > 0) {
			arg0.anInt3523 = -251747168 * arg0.anInt3523 / (arg0.anInt3495 * 1566866781) * -1002365267;
		}
	}

	@OriginalMember(owner = "client!fj", name = "px", descriptor = "(Lclient!vs;B)V", line = 6910)
	static final void method23396(@OriginalArg(0) Class536 arg0) {
		@Pc(8) Class534 local8 = arg0.aBoolean822 ? arg0.aClass534_2 : arg0.aClass534_1;
		@Pc(11) Class178 local11 = local8.aClass178_18;
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = local11.anInt3523 * 260568357;
	}

	@OriginalMember(owner = "client!fj", name = "ss", descriptor = "(Lclient!vs;B)V", line = 7338)
	static final void method23402(@OriginalArg(0) Class536 arg0) {
		@Pc(12) int local12 = arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381];
		@Pc(16) Class178 local16 = Class375.method27235(local12);
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = local16.anInt3561 * -1625983971;
	}

	@OriginalMember(owner = "client!fj", name = "xs", descriptor = "(Lclient!vs;I)V", line = 8358)
	static final void method23397(@OriginalArg(0) Class536 arg0) {
		arg0.anInt5315 -= 1580027550;
		@Pc(14) String local14 = (String) arg0.anObjectArray42[arg0.anInt5315 * 996806575];
		@Pc(25) String local25 = (String) arg0.anObjectArray42[arg0.anInt5315 * 996806575 + 1];
		Class541.method32588(local14, local25);
	}

	@OriginalMember(owner = "client!fj", name = "ajq", descriptor = "(Lclient!vs;I)V", line = 10715)
	static final void method23398(@OriginalArg(0) Class536 arg0) throws Exception_Sub4 {
		arg0.anInt5319 -= 624249098;
		@Pc(13) int local13 = arg0.anIntArray496[arg0.anInt5319 * 960738381];
		@Pc(21) Class320 local21 = Class320.method25891((float) local13, (float) local13, (float) local13);
		Class80.aClass23_Sub1_1.method5812(local21);
		local21.method25874();
	}

	@OriginalMember(owner = "client!fj", name = "ast", descriptor = "(Lclient!vs;I)V", line = 12244)
	static final void method23399(@OriginalArg(0) Class536 arg0) {
		@Pc(12) int local12 = arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381];
		if (local12 != -1) {
			Class10.method717(local12);
		}
	}
}
