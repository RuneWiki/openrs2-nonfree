package com.jagex;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ng")
public class Class344 {

	@OriginalMember(owner = "client!ng", name = "by", descriptor = "Ljava/lang/String;")
	public static String aString208;

	// $FF: synthetic field
	@OriginalMember(owner = "client!ng", name = "this$0", descriptor = "Lclient!nl;")
	final Class348 this$0;

	@OriginalMember(owner = "client!ng", name = "p", descriptor = "[B")
	byte[] aByteArray80;

	@OriginalMember(owner = "client!ng", name = "<init>", descriptor = "(Lclient!nl;Ljava/io/InputStream;Lclient!aok;Ljava/net/URL;)V", line = 111)
	Class344(@OriginalArg(0) Class348 arg0, @OriginalArg(1) InputStream arg1, @OriginalArg(2) Class3_Sub1_Sub12_Sub1 arg2, @OriginalArg(3) URL arg3) {
		this.this$0 = arg0;
		this.aByteArray80 = null;
		if (arg1 != null) {
			@Pc(12) short local12 = 10240;
			@Pc(18) Class3_Sub41 local18 = new Class3_Sub41(local12, true);
			@Pc(20) int local20 = 0;
			@Pc(24) byte[] local24 = Class548.method32656(1024);
			@Pc(54) int local54;
			while (local20 >= 0) {
				try {
					local20 = arg1.read(local24);
				} catch (@Pc(32) IOException local32) {
					local32.printStackTrace();
					local20 = -1;
				}
				if (local20 > 0) {
					if (local18.anInt2803 * 62066237 + local20 >= local18.aByteArray51.length) {
						local54 = local18.aByteArray51.length + 10240;
						@Pc(59) byte[] local59 = Class548.method32658(local54, true);
						System.arraycopy(local18.aByteArray51, 0, local59, 0, local18.anInt2803 * 62066237);
						Class548.method32655(local18.aByteArray51);
						local18.aByteArray51 = local59;
					}
					local18.method20248(local24, 0, local20);
				}
			}
			for (local54 = 0; local54 < arg2.anInt2847 * -1996618785; local54++) {
				local18.method20250(0);
			}
			@Pc(103) byte[] local103 = new byte[local18.anInt2803 * 62066237];
			System.arraycopy(local18.aByteArray51, 0, local103, 0, local18.anInt2803 * 62066237);
			local18.method20249();
			Class548.method32655(local24);
			this.aByteArray80 = local103;
			try {
				arg1.close();
			} catch (@Pc(130) IOException local130) {
				local130.printStackTrace();
			}
		}
		arg2.aBoolean516 = false;
		arg0.method26547();
	}

	@OriginalMember(owner = "client!ng", name = "p", descriptor = "(I)[B", line = 158)
	byte[] method26485() {
		return this.aByteArray80;
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "()[B", line = 158)
	byte[] method26486() {
		return this.aByteArray80;
	}

	@OriginalMember(owner = "client!ng", name = "g", descriptor = "()[B", line = 158)
	byte[] method26487() {
		return this.aByteArray80;
	}

	@OriginalMember(owner = "client!ng", name = "cq", descriptor = "(Lclient!vs;I)V", line = 4434)
	static final void method26493(@OriginalArg(0) Class536 arg0) {
		@Pc(12) int local12 = arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381];
		@Pc(16) Class178 local16 = Class375.method27235(local12);
		@Pc(22) Class186 local22 = Class178.aClass186Array1[local12 >> 16];
		Class315.method25831(local16, local22, arg0);
	}

	@OriginalMember(owner = "client!ng", name = "dn", descriptor = "(Lclient!vs;I)V", line = 4770)
	static final void method26488(@OriginalArg(0) Class536 arg0) {
		@Pc(12) int local12 = arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381];
		@Pc(16) Class178 local16 = Class375.method27235(local12);
		@Pc(22) Class186 local22 = Class178.aClass186Array1[local12 >> 16];
		Class494.method29315(local16, local22, arg0);
	}

	@OriginalMember(owner = "client!ng", name = "gk", descriptor = "(Lclient!vs;I)V", line = 5249)
	static final void method26494(@OriginalArg(0) Class536 arg0) {
		@Pc(8) Class534 local8 = arg0.aBoolean822 ? arg0.aClass534_2 : arg0.aClass534_1;
		@Pc(11) Class178 local11 = local8.aClass178_18;
		arg0.anInt5319 -= 624249098;
		@Pc(25) int local25 = arg0.anIntArray496[arg0.anInt5319 * 960738381];
		@Pc(35) int local35 = arg0.anIntArray496[arg0.anInt5319 * 960738381 + 1];
		@Pc(40) Class630 local40 = Class3_Sub20.aClass625_1.method33783(local25);
		if (local40.anInt5585 * 100041865 == local35) {
			local11.method23445(local25);
		} else {
			local11.method23443(local25, local35);
		}
	}

	@OriginalMember(owner = "client!ng", name = "ig", descriptor = "(Lclient!fo;Lclient!fw;Lclient!vs;I)V", line = 5568)
	static final void method26489(@OriginalArg(0) Class178 arg0, @OriginalArg(1) Class186 arg1, @OriginalArg(2) Class536 arg2) {
		arg0.anInt3513 = -1505688221;
		arg0.anInt3514 = client.anInt3115 * -1892412517;
		arg0.anInt3493 = 0;
		if (arg0.anInt3491 * 18828465 == -1 && !arg1.aBoolean657) {
			Class401.method27610(arg0.anInt3570 * 954808515);
		}
	}

	@OriginalMember(owner = "client!ng", name = "pd", descriptor = "(Lclient!vs;I)V", line = 6802)
	static final void method26490(@OriginalArg(0) Class536 arg0) {
		@Pc(8) Class534 local8 = arg0.aBoolean822 ? arg0.aClass534_2 : arg0.aClass534_1;
		@Pc(11) Class178 local11 = local8.aClass178_18;
		@Pc(14) Class186 local14 = local8.aClass186_4;
		Class458.method28528(local11, local14, arg0);
	}

	@OriginalMember(owner = "client!ng", name = "qp", descriptor = "(Lclient!vs;I)V", line = 7104)
	static final void method26491(@OriginalArg(0) Class536 arg0) {
		@Pc(8) Class534 local8 = arg0.aBoolean822 ? arg0.aClass534_2 : arg0.aClass534_1;
		@Pc(11) Class178 local11 = local8.aClass178_18;
		Class418.method27832(local11, arg0);
	}

	@OriginalMember(owner = "client!ng", name = "wy", descriptor = "(Lclient!vs;I)V", line = 8198)
	static final void method26492(@OriginalArg(0) Class536 arg0) {
		arg0.anInt5319 -= 1560622745;
		@Pc(13) int local13 = arg0.anIntArray496[arg0.anInt5319 * 960738381];
		@Pc(23) int local23 = arg0.anIntArray496[arg0.anInt5319 * 960738381 + 1];
		@Pc(33) int local33 = arg0.anIntArray496[arg0.anInt5319 * 960738381 + 2];
		@Pc(43) int local43 = arg0.anIntArray496[arg0.anInt5319 * 960738381 + 3];
		@Pc(53) int local53 = arg0.anIntArray496[arg0.anInt5319 * 960738381 + 4];
		if (local33 == -1) {
			throw new RuntimeException();
		}
		@Pc(65) Class574 local65 = Class438.aClass589_1.method33297(local33);
		if (local65.aChar13 != local23) {
			throw new RuntimeException();
		} else if (local13 == local65.aChar14) {
			@Pc(87) int[] local87 = local65.method33085(local43);
			if (local53 < 0 || local87 == null || local87.length <= local53) {
				throw new RuntimeException();
			}
			arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = local87[local53];
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ng", name = "xn", descriptor = "(Lclient!vs;B)V", line = 8287)
	static final void method26495(@OriginalArg(0) Class536 arg0) {
		@Pc(12) int local12 = arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381];
		if (client.anInt3194 * 963130851 != 2 || local12 >= client.anInt3042 * -1645830611) {
			arg0.anObjectArray42[(arg0.anInt5315 += 790013775) * 996806575 - 1] = "";
			arg0.anObjectArray42[(arg0.anInt5315 += 790013775) * 996806575 - 1] = "";
			return;
		}
		@Pc(26) Class313 local26 = client.aClass313Array1[local12];
		arg0.anObjectArray42[(arg0.anInt5315 += 790013775) * 996806575 - 1] = local26.aString202;
		if (local26.aString200 == null) {
			arg0.anObjectArray42[(arg0.anInt5315 += 790013775) * 996806575 - 1] = "";
		} else {
			arg0.anObjectArray42[(arg0.anInt5315 += 790013775) * 996806575 - 1] = local26.aString200;
		}
	}
}
