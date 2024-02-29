package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qt")
public class Class497 {

	@OriginalMember(owner = "client!qt", name = "hk", descriptor = "Lclient!anq;")
	public static Class35_Sub9 aClass35_Sub9_1;

	@OriginalMember(owner = "client!qt", name = "om", descriptor = "I")
	public static int anInt5063;

	@OriginalMember(owner = "client!qt", name = "es", descriptor = "Lclient!oj;")
	public static Class443 aClass443_2;

	@OriginalMember(owner = "client!qt", name = "c", descriptor = "I")
	public int anInt5058;

	@OriginalMember(owner = "client!qt", name = "v", descriptor = "I")
	public int anInt5059;

	@OriginalMember(owner = "client!qt", name = "p", descriptor = "B")
	byte aByte160;

	@OriginalMember(owner = "client!qt", name = "l", descriptor = "I")
	public int anInt5060;

	@OriginalMember(owner = "client!qt", name = "y", descriptor = "I")
	public int anInt5061;

	@OriginalMember(owner = "client!qt", name = "w", descriptor = "I")
	public int anInt5062;

	@OriginalMember(owner = "client!qt", name = "<init>", descriptor = "()V", line = 18)
	public Class497() {
	}

	@OriginalMember(owner = "client!qt", name = "<init>", descriptor = "(Lclient!akv;Lclient!adw;)V", line = 20)
	public Class497(@OriginalArg(0) Class77_Sub39 arg0, @OriginalArg(1) Class80_Sub1 arg1) {
		this.aByte160 = arg0.method22481();
		this.anInt5058 = arg0.method22483() * -1605307113;
		this.anInt5059 = arg0.method22500() * 2028508617;
		this.anInt5060 = arg0.method22500() * 417966351;
		this.anInt5061 = arg0.method22500() * 1701248651;
		this.anInt5062 = arg0.method22500() * 1870042833;
		if (arg1 != null) {
			Class329.method27585(arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!qt", name = "y", descriptor = "(Lclient!akv;Lclient!adw;)Lclient!aah;", line = 33)
	static Class9 method30165(@OriginalArg(0) Class77_Sub39 arg0, @OriginalArg(1) Class80_Sub1 arg1) {
		@Pc(4) Class9 local4 = new Class9(arg1);
		while (true) {
			@Pc(8) int local8 = arg0.method22478();
			if (local8 == 255) {
				return local4;
			}
			@Pc(18) Class489 local18 = (Class489) Class386.method28346(Class489.class, local8);
			while (true) {
				@Pc(22) int local22 = arg0.method22478();
				if (local22 == 255) {
					break;
				}
				arg0.anInt3089 -= -1387468933;
				@Pc(38) Class438 local38 = arg1.method1952(arg0, local18);
				if (local38 != null) {
					local4.method128(local38.anInt4927 * -608978823, local38.anObject19);
				}
			}
		}
	}

	@OriginalMember(owner = "client!qt", name = "l", descriptor = "(Lclient!akv;Lclient!adw;)Lclient!aah;", line = 33)
	static Class9 method30166(@OriginalArg(0) Class77_Sub39 arg0, @OriginalArg(1) Class80_Sub1 arg1) {
		@Pc(4) Class9 local4 = new Class9(arg1);
		while (true) {
			@Pc(8) int local8 = arg0.method22478();
			if (local8 == 255) {
				return local4;
			}
			@Pc(18) Class489 local18 = (Class489) Class386.method28346(Class489.class, local8);
			while (true) {
				@Pc(22) int local22 = arg0.method22478();
				if (local22 == 255) {
					break;
				}
				arg0.anInt3089 -= -1387468933;
				@Pc(38) Class438 local38 = arg1.method1952(arg0, local18);
				if (local38 != null) {
					local4.method128(local38.anInt4927 * -608978823, local38.anObject19);
				}
			}
		}
	}

	@OriginalMember(owner = "client!qt", name = "w", descriptor = "(Lclient!akv;Lclient!adw;)Lclient!aah;", line = 33)
	static Class9 method30167(@OriginalArg(0) Class77_Sub39 arg0, @OriginalArg(1) Class80_Sub1 arg1) {
		@Pc(4) Class9 local4 = new Class9(arg1);
		while (true) {
			@Pc(8) int local8 = arg0.method22478();
			if (local8 == 255) {
				return local4;
			}
			@Pc(18) Class489 local18 = (Class489) Class386.method28346(Class489.class, local8);
			while (true) {
				@Pc(22) int local22 = arg0.method22478();
				if (local22 == 255) {
					break;
				}
				arg0.anInt3089 -= -1387468933;
				@Pc(38) Class438 local38 = arg1.method1952(arg0, local18);
				if (local38 != null) {
					local4.method128(local38.anInt4927 * -608978823, local38.anObject19);
				}
			}
		}
	}

	@OriginalMember(owner = "client!qt", name = "t", descriptor = "()I", line = 52)
	public int method30168() {
		return this.aByte160 & 0x7;
	}

	@OriginalMember(owner = "client!qt", name = "c", descriptor = "(B)I", line = 52)
	public int method30169() {
		return this.aByte160 & 0x7;
	}

	@OriginalMember(owner = "client!qt", name = "v", descriptor = "(I)I", line = 56)
	public int method30170() {
		return (this.aByte160 & 0x8) == 8 ? 1 : 0;
	}

	@OriginalMember(owner = "client!qt", name = "q", descriptor = "()I", line = 56)
	public int method30171() {
		return (this.aByte160 & 0x8) == 8 ? 1 : 0;
	}

	@OriginalMember(owner = "client!qt", name = "x", descriptor = "()I", line = 56)
	public int method30172() {
		return (this.aByte160 & 0x8) == 8 ? 1 : 0;
	}

	@OriginalMember(owner = "client!qt", name = "s", descriptor = "(Ljava/lang/String;Ljava/lang/String;I)I", line = 184)
	public static int method30173(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1) {
		if (Class574.aBoolean807) {
			return Class230.method25826() == client.aClass82_2 ? Class529.aTwitchTV1.Login(arg0, arg1) : 42;
		} else {
			return 12;
		}
	}

	@OriginalMember(owner = "client!qt", name = "qc", descriptor = "(Lclient!yf;I)V", line = 7496)
	static final void method30174(@OriginalArg(0) Class665 arg0) {
		@Pc(8) Class662 local8 = arg0.aBoolean857 ? arg0.aClass662_1 : arg0.aClass662_2;
		@Pc(11) Class277 local11 = local8.aClass277_12;
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = local11.anInt3893 * -806242263;
	}

	@OriginalMember(owner = "client!qt", name = "su", descriptor = "(Lclient!yf;B)V", line = 7956)
	static final void method30175(@OriginalArg(0) Class665 arg0) {
		@Pc(12) int local12 = arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307];
		@Pc(16) Class277 local16 = Class155.method23628(local12);
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = local16.anInt3910 * 1843164247;
	}

	@OriginalMember(owner = "client!qt", name = "aaz", descriptor = "(Lclient!yf;B)V", line = 9311)
	static final void method30176(@OriginalArg(0) Class665 arg0) {
		arg0.anInt5784 -= 617999126;
		@Pc(13) int local13 = arg0.anIntArray536[arg0.anInt5784 * 2088438307];
		@Pc(28) boolean local28 = arg0.anIntArray536[arg0.anInt5784 * 2088438307 + 1] == 1;
		Class67.method974(local13, local28);
	}

	@OriginalMember(owner = "client!qt", name = "akz", descriptor = "(Lclient!yf;I)V", line = 11274)
	static final void method30177(@OriginalArg(0) Class665 arg0) {
		arg0.anInt5784 -= 1235998252;
		@Pc(13) int local13 = arg0.anIntArray536[arg0.anInt5784 * 2088438307];
		@Pc(23) int local23 = arg0.anIntArray536[arg0.anInt5784 * 2088438307 + 1];
		@Pc(33) int local33 = arg0.anIntArray536[arg0.anInt5784 * 2088438307 + 2];
		@Pc(43) int local43 = arg0.anIntArray536[arg0.anInt5784 * 2088438307 + 3];
		@Pc(47) Class595 local47 = client.aClass517_1.method30409();
		Class87.method4253((local13 >> 14 & 0x3FFF) - local47.anInt5504 * -424199969, (local13 & 0x3FFF) - local47.anInt5506 * -1166289421, local23 << 2, local33, local43, false);
		client.aBoolean612 = true;
	}

	@OriginalMember(owner = "client!qt", name = "alo", descriptor = "(Lclient!yf;I)V", line = 11501)
	static final void method30178(@OriginalArg(0) Class665 arg0) {
		@Pc(13) Class77_Sub36 local13 = (Class77_Sub36) arg0.anObjectArray45[(arg0.anInt5781 -= 1460193483) * 1485266147];
		if (Class597.aClass107_Sub1_2.method8880() != Class331.aClass331_5) {
			throw new RuntimeException();
		}
		@Pc(27) Class115_Sub2 local27 = (Class115_Sub2) Class597.aClass107_Sub1_2.method8871();
		local27.method10238(local13);
		client.aBoolean612 = true;
	}

	@OriginalMember(owner = "client!qt", name = "azs", descriptor = "(Lclient!yf;B)V", line = 13830)
	static final void method30179(@OriginalArg(0) Class665 arg0) {
		if (Class527.anIterator3 != null && Class527.anIterator3.hasNext()) {
			arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = (Integer) Class527.anIterator3.next();
		} else {
			arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = -1;
		}
	}
}
