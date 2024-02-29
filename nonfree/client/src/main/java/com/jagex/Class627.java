package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wq")
public class Class627 {

	@OriginalMember(owner = "client!wq", name = "c", descriptor = "I")
	public static final int anInt5651 = 1;

	@OriginalMember(owner = "client!wq", name = "p", descriptor = "I")
	public static final int anInt5652 = 0;

	@OriginalMember(owner = "client!wq", name = "v", descriptor = "I")
	static final int anInt5653 = 2;

	@OriginalMember(owner = "client!wq", name = "qq", descriptor = "I")
	static int anInt5654;

	@OriginalMember(owner = "client!wq", name = "l", descriptor = "[I")
	public int[] anIntArray519;

	@OriginalMember(owner = "client!wq", name = "t", descriptor = "[I")
	public int[] anIntArray520;

	@OriginalMember(owner = "client!wq", name = "q", descriptor = "[I")
	public int[] anIntArray521;

	@OriginalMember(owner = "client!wq", name = "y", descriptor = "I")
	public int anInt5649 = -944395377;

	@OriginalMember(owner = "client!wq", name = "w", descriptor = "I")
	public int anInt5650 = -509807721;

	@OriginalMember(owner = "client!wq", name = "<init>", descriptor = "(Lclient!pw;)V", line = 16)
	public Class627(@OriginalArg(0) Class478 arg0) {
		@Pc(15) byte[] local15 = arg0.method29745(Class614.aClass614_6.anInt5587 * -448671533);
		this.method32535(new Class77_Sub39(local15));
	}

	@OriginalMember(owner = "client!wq", name = "p", descriptor = "(Lclient!akv;B)V", line = 23)
	void method32535(@OriginalArg(0) Class77_Sub39 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method22478();
			if (local3 == 0) {
				if (this.anIntArray519 == null) {
					throw new RuntimeException("");
				}
				return;
			}
			@Pc(14) int local14;
			if (local3 == 1) {
				local14 = arg0.method22478();
				this.anIntArray519 = new int[local14];
				for (@Pc(20) int local20 = 0; local20 < this.anIntArray519.length; local20++) {
					this.anIntArray519[local20] = arg0.method22478();
					if (this.anIntArray519[local20] != 0 && this.anIntArray519[local20] == 2) {
					}
				}
			} else if (local3 == 3) {
				this.anInt5649 = arg0.method22478() * 944395377;
			} else if (local3 == 4) {
				this.anInt5650 = arg0.method22478() * 509807721;
			} else if (local3 == 5) {
				this.anIntArray520 = new int[arg0.method22478()];
				for (local14 = 0; local14 < this.anIntArray520.length; local14++) {
					this.anIntArray520[local14] = arg0.method22478();
				}
			} else if (local3 == 6) {
				this.anIntArray521 = new int[arg0.method22478()];
				for (local14 = 0; local14 < this.anIntArray521.length; local14++) {
					this.anIntArray521[local14] = arg0.method22478();
				}
			}
		}
	}

	@OriginalMember(owner = "client!wq", name = "c", descriptor = "(Lclient!akv;)V", line = 23)
	void method32536(@OriginalArg(0) Class77_Sub39 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method22478();
			if (local3 == 0) {
				if (this.anIntArray519 == null) {
					throw new RuntimeException("");
				}
				return;
			}
			@Pc(14) int local14;
			if (local3 == 1) {
				local14 = arg0.method22478();
				this.anIntArray519 = new int[local14];
				for (@Pc(20) int local20 = 0; local20 < this.anIntArray519.length; local20++) {
					this.anIntArray519[local20] = arg0.method22478();
					if (this.anIntArray519[local20] != 0 && this.anIntArray519[local20] == 2) {
					}
				}
			} else if (local3 == 3) {
				this.anInt5649 = arg0.method22478() * 944395377;
			} else if (local3 == 4) {
				this.anInt5650 = arg0.method22478() * 509807721;
			} else if (local3 == 5) {
				this.anIntArray520 = new int[arg0.method22478()];
				for (local14 = 0; local14 < this.anIntArray520.length; local14++) {
					this.anIntArray520[local14] = arg0.method22478();
				}
			} else if (local3 == 6) {
				this.anIntArray521 = new int[arg0.method22478()];
				for (local14 = 0; local14 < this.anIntArray521.length; local14++) {
					this.anIntArray521[local14] = arg0.method22478();
				}
			}
		}
	}

	@OriginalMember(owner = "client!wq", name = "ach", descriptor = "(Lclient!yf;I)V", line = 9680)
	static final void method32537(@OriginalArg(0) Class665 arg0) {
		@Pc(13) String local13 = (String) arg0.anObjectArray45[(arg0.anInt5781 -= 1460193483) * 1485266147];
		@Pc(26) int local26 = arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307];
		arg0.anObjectArray45[(arg0.anInt5781 += 1460193483) * 1485266147 - 1] = local13 + Class341.method27761(local26, true);
	}

	@OriginalMember(owner = "client!wq", name = "afu", descriptor = "(Lclient!yf;I)V", line = 10027)
	static final void method32538(@OriginalArg(0) Class665 arg0) {
		arg0.anInt5784 -= 617999126;
		@Pc(13) int local13 = arg0.anIntArray536[arg0.anInt5784 * 2088438307];
		@Pc(23) int local23 = arg0.anIntArray536[arg0.anInt5784 * 2088438307 + 1];
		@Pc(29) Class67 local29 = (Class67) Class77_Sub13_Sub12.aClass35_Sub22_1.method18319(local23);
		if (local29.method968()) {
			arg0.anObjectArray45[(arg0.anInt5781 += 1460193483) * 1485266147 - 1] = ((Class333) Class578.aClass35_Sub3_1.method18319(local13)).method27638(local23, local29.aString13);
		} else {
			arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = ((Class333) Class578.aClass35_Sub3_1.method18319(local13)).method27635(local23, local29.anInt198 * 263946597);
		}
	}

	@OriginalMember(owner = "client!wq", name = "amm", descriptor = "(Lclient!yf;B)V", line = 11814)
	static final void method32539(@OriginalArg(0) Class665 arg0) throws Exception_Sub2 {
		arg0.anInt5784 -= 1235998252;
		@Pc(14) float local14 = (float) arg0.anIntArray536[arg0.anInt5784 * 2088438307];
		@Pc(25) float local25 = (float) arg0.anIntArray536[arg0.anInt5784 * 2088438307 + 1];
		@Pc(36) float local36 = (float) arg0.anIntArray536[arg0.anInt5784 * 2088438307 + 2];
		@Pc(49) float local49 = (float) arg0.anIntArray536[arg0.anInt5784 * 2088438307 + 3] / 1000.0F;
		Class597.aClass107_Sub1_2.method8832(Class447.method29120(local14, local25, local36), local49);
	}

	@OriginalMember(owner = "client!wq", name = "mb", descriptor = "(I)V", line = 12289)
	static void method32540() {
		@Pc(2) Class82 local2 = Class230.method25826();
		@Pc(8) Class77_Sub20 local8 = Class365.method28132(Class414.aClass414_122, local2.aClass16_1);
		local8.aClass77_Sub39_Sub1_2.method22417(client.anInt3435 * -983036913);
		local2.method2004(local8);
	}
}
