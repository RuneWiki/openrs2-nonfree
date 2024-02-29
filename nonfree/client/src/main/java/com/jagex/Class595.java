package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vh")
public class Class595 {

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "I")
	static int anInt5507;

	@OriginalMember(owner = "client!vh", name = "aw", descriptor = "[Ljava/lang/String;")
	static String[] aStringArray33;

	@OriginalMember(owner = "client!vh", name = "c", descriptor = "I")
	public int anInt5504;

	@OriginalMember(owner = "client!vh", name = "v", descriptor = "I")
	public int anInt5506;

	@OriginalMember(owner = "client!vh", name = "p", descriptor = "I")
	public int anInt5505;

	@OriginalMember(owner = "client!vh", name = "<init>", descriptor = "()V", line = 8)
	public Class595() {
		this.anInt5505 = -1658782973;
	}

	@OriginalMember(owner = "client!vh", name = "<init>", descriptor = "(III)V", line = 12)
	public Class595(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt5505 = arg0 * 1658782973;
		this.anInt5504 = arg1 * -1962245345;
		this.anInt5506 = arg2 * -277165253;
	}

	@OriginalMember(owner = "client!vh", name = "<init>", descriptor = "(I)V", line = 18)
	public Class595(@OriginalArg(0) int arg0) {
		if (arg0 == -1) {
			this.anInt5505 = -1658782973;
		} else {
			this.anInt5505 = (arg0 >> 28 & 0x3) * 1658782973;
			this.anInt5504 = (arg0 >> 14 & 0x3FFF) * -1962245345;
			this.anInt5506 = (arg0 & 0x3FFF) * -277165253;
		}
	}

	@OriginalMember(owner = "client!vh", name = "p", descriptor = "(Lclient!aks;B)V", line = 28)
	public void method31898(@OriginalArg(0) Class77_Sub36 arg0) {
		this.anInt5505 = arg0.anInt1776 * 603752099;
		this.anInt5504 = (arg0.anInt1777 * 599803149 >> 9) * -1962245345;
		this.anInt5506 = (arg0.anInt1779 * 33298755 >> 9) * -277165253;
	}

	@OriginalMember(owner = "client!vh", name = "l", descriptor = "(Lclient!aks;)V", line = 28)
	public void method31899(@OriginalArg(0) Class77_Sub36 arg0) {
		this.anInt5505 = arg0.anInt1776 * 603752099;
		this.anInt5504 = (arg0.anInt1777 * 599803149 >> 9) * -1962245345;
		this.anInt5506 = (arg0.anInt1779 * 33298755 >> 9) * -277165253;
	}

	@OriginalMember(owner = "client!vh", name = "y", descriptor = "()I", line = 34)
	public int method31900() {
		return this.anInt5505 * -217302955 << 28 | this.anInt5504 * -424199969 << 14 | this.anInt5506 * -1166289421;
	}

	@OriginalMember(owner = "client!vh", name = "c", descriptor = "(B)I", line = 34)
	public int method31901() {
		return this.anInt5505 * -217302955 << 28 | this.anInt5504 * -424199969 << 14 | this.anInt5506 * -1166289421;
	}

	@OriginalMember(owner = "client!vh", name = "t", descriptor = "()I", line = 34)
	public int method31902() {
		return this.anInt5505 * -217302955 << 28 | this.anInt5504 * -424199969 << 14 | this.anInt5506 * -1166289421;
	}

	@OriginalMember(owner = "client!vh", name = "w", descriptor = "()I", line = 34)
	public int method31903() {
		return this.anInt5505 * -217302955 << 28 | this.anInt5504 * -424199969 << 14 | this.anInt5506 * -1166289421;
	}

	@OriginalMember(owner = "client!vh", name = "equals", descriptor = "(Ljava/lang/Object;)Z", line = 38)
	@Override
	public boolean equals(@OriginalArg(0) Object arg0) {
		if (arg0 == this) {
			return true;
		} else if (arg0 instanceof Class595) {
			return this.method31908((Class595) arg0);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!vh", name = "hi", descriptor = "(Ljava/lang/Object;)Z", line = 38)
	public boolean method31904(@OriginalArg(0) Object arg0) {
		if (arg0 == this) {
			return true;
		} else if (arg0 instanceof Class595) {
			return this.method31908((Class595) arg0);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!vh", name = "hn", descriptor = "(Ljava/lang/Object;)Z", line = 38)
	public boolean method31905(@OriginalArg(0) Object arg0) {
		if (arg0 == this) {
			return true;
		} else if (arg0 instanceof Class595) {
			return this.method31908((Class595) arg0);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!vh", name = "hf", descriptor = "(Ljava/lang/Object;)Z", line = 38)
	public boolean method31906(@OriginalArg(0) Object arg0) {
		if (arg0 == this) {
			return true;
		} else if (arg0 instanceof Class595) {
			return this.method31908((Class595) arg0);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!vh", name = "ha", descriptor = "(Ljava/lang/Object;)Z", line = 38)
	public boolean method31907(@OriginalArg(0) Object arg0) {
		if (arg0 == this) {
			return true;
		} else if (arg0 instanceof Class595) {
			return this.method31908((Class595) arg0);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!vh", name = "v", descriptor = "(Lclient!vh;B)Z", line = 44)
	boolean method31908(@OriginalArg(0) Class595 arg0) {
		if (arg0.anInt5505 * -217302955 != this.anInt5505 * -217302955) {
			return false;
		} else if (arg0.anInt5504 * -424199969 == this.anInt5504 * -424199969) {
			return arg0.anInt5506 * -1166289421 == this.anInt5506 * -1166289421;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!vh", name = "q", descriptor = "(Lclient!vh;)Z", line = 44)
	boolean method31909(@OriginalArg(0) Class595 arg0) {
		if (arg0.anInt5505 * -217302955 != this.anInt5505 * -217302955) {
			return false;
		} else if (arg0.anInt5504 * -424199969 == this.anInt5504 * -424199969) {
			return arg0.anInt5506 * -1166289421 == this.anInt5506 * -1166289421;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!vh", name = "hashCode", descriptor = "()I", line = 51)
	@Override
	public int hashCode() {
		return this.method31901();
	}

	@OriginalMember(owner = "client!vh", name = "rr", descriptor = "()I", line = 51)
	public int method31910() {
		return this.method31901();
	}

	@OriginalMember(owner = "client!vh", name = "rs", descriptor = "()Ljava/lang/String;", line = 56)
	public String method31911() {
		return this.anInt5505 * -217302955 + "," + (this.anInt5504 * -424199969 >> 6) + "," + (this.anInt5506 * -1166289421 >> 6) + "," + (this.anInt5504 * -424199969 & 0x3F) + "," + (this.anInt5506 * -1166289421 & 0x3F);
	}

	@OriginalMember(owner = "client!vh", name = "toString", descriptor = "()Ljava/lang/String;", line = 56)
	@Override
	public String toString() {
		return this.anInt5505 * -217302955 + "," + (this.anInt5504 * -424199969 >> 6) + "," + (this.anInt5506 * -1166289421 >> 6) + "," + (this.anInt5504 * -424199969 & 0x3F) + "," + (this.anInt5506 * -1166289421 & 0x3F);
	}

	@OriginalMember(owner = "client!vh", name = "ro", descriptor = "()Ljava/lang/String;", line = 56)
	public String method31912() {
		return this.anInt5505 * -217302955 + "," + (this.anInt5504 * -424199969 >> 6) + "," + (this.anInt5506 * -1166289421 >> 6) + "," + (this.anInt5504 * -424199969 & 0x3F) + "," + (this.anInt5506 * -1166289421 & 0x3F);
	}

	@OriginalMember(owner = "client!vh", name = "lq", descriptor = "(Lclient!gm;Lclient!gh;Lclient!yf;I)V", line = 6633)
	static final void method31913(@OriginalArg(0) Class277 arg0, @OriginalArg(1) Class273 arg1, @OriginalArg(2) Class665 arg2) {
		@Pc(13) String local13 = (String) arg2.anObjectArray45[(arg2.anInt5781 -= 1460193483) * 1485266147];
		if (Class139.method14334(local13, arg2) != null) {
			local13 = local13.substring(0, local13.length() - 1);
		}
		arg0.anObjectArray21 = Class73.method1040(local13, arg2);
		arg0.aBoolean681 = true;
	}

	@OriginalMember(owner = "client!vh", name = "ou", descriptor = "(Lclient!yf;B)V", line = 7149)
	static final void method31914(@OriginalArg(0) Class665 arg0) {
		@Pc(12) int local12 = arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307];
		@Pc(16) Class277 local16 = Class155.method23628(local12);
		@Pc(22) Class273 local22 = Class35_Sub11.aClass273Array1[local12 >> 16];
		Class341.method27764(local16, local22, arg0);
	}

	@OriginalMember(owner = "client!vh", name = "tp", descriptor = "(Lclient!yf;I)V", line = 8092)
	static final void method31915(@OriginalArg(0) Class665 arg0) {
		arg0.anInt5784 -= 617999126;
		@Pc(13) int local13 = arg0.anIntArray536[arg0.anInt5784 * 2088438307];
		@Pc(23) int local23 = arg0.anIntArray536[arg0.anInt5784 * 2088438307 + 1];
		@Pc(32) Class662 local32 = arg0.aBoolean857 ? arg0.aClass662_1 : arg0.aClass662_2;
		Class143_Sub37.method16141(local32.aClass277_12, local13, local23);
	}

	@OriginalMember(owner = "client!vh", name = "ud", descriptor = "(Lclient!yf;I)V", line = 8316)
	static final void method31916(@OriginalArg(0) Class665 arg0) {
		arg0.anInt5784 -= 617999126;
		@Pc(13) int local13 = arg0.anIntArray536[arg0.anInt5784 * 2088438307];
		@Pc(23) int local23 = arg0.anIntArray536[arg0.anInt5784 * 2088438307 + 1];
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = Class96_Sub23.method8562(local13, local23, false);
	}

	@OriginalMember(owner = "client!vh", name = "xx", descriptor = "(Lclient!yf;I)V", line = 8806)
	static final void method31917(@OriginalArg(0) Class665 arg0) {
		@Pc(13) String local13 = (String) arg0.anObjectArray45[(arg0.anInt5781 -= 1460193483) * 1485266147];
		@Pc(19) Class77_Sub20 local19 = Class365.method28132(Class414.aClass414_104, client.aClass82_1.aClass16_1);
		local19.aClass77_Sub39_Sub1_2.method22403(Class664.method33107(local13));
		local19.aClass77_Sub39_Sub1_2.method22440(local13);
		client.aClass82_1.method2004(local19);
	}
}
