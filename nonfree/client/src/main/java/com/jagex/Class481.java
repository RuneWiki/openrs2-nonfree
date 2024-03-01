package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ti")
public class Class481 implements Interface52 {

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "Lclient!tc;")
	Class475 aClass475_4 = Class475.aClass475_1;

	@OriginalMember(owner = "client!ti", name = "l", descriptor = "Lclient!ny;")
	Class359 aClass359_88;

	@OriginalMember(owner = "client!ti", name = "g", descriptor = "I")
	int anInt5150;

	@OriginalMember(owner = "client!ti", name = "p", descriptor = "Lclient!ju;")
	Class48 aClass48_4;

	@OriginalMember(owner = "client!ti", name = "h", descriptor = "Lclient!sv;")
	Interface51 anInterface51_1;

	@OriginalMember(owner = "client!ti", name = "p", descriptor = "(Lclient!ahb;I)Lclient!kr;", line = 13)
	public static Class286 method29079(@OriginalArg(0) Class3_Sub41 arg0) {
		@Pc(3) int local3 = arg0.method20275();
		return new Class286(local3);
	}

	@OriginalMember(owner = "client!ti", name = "<init>", descriptor = "(Lclient!ny;ILclient!ju;Lclient!sv;)V", line = 16)
	public Class481(@OriginalArg(0) Class359 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class48 arg2, @OriginalArg(3) Interface51 arg3) {
		this.aClass359_88 = arg0;
		this.anInt5150 = arg1 * 773060289;
		this.aClass48_4 = arg2;
		this.anInterface51_1 = arg3;
		this.aClass475_4 = Class475.aClass475_2;
	}

	@OriginalMember(owner = "client!ti", name = "p", descriptor = "(I)V", line = 25)
	@Override
	public void method29116() {
		if (Class475.aClass475_2 != this.aClass475_4) {
			return;
		}
		this.method29075();
		this.aClass475_4 = Class475.aClass475_3;
		if (this.anInterface51_1 != null) {
			this.anInterface51_1.method23112(this, 0, this.anInt5150 * -390751935, true);
		}
	}

	@OriginalMember(owner = "client!ti", name = "m", descriptor = "()V", line = 25)
	@Override
	public void method29157() {
		if (Class475.aClass475_2 != this.aClass475_4) {
			return;
		}
		this.method29075();
		this.aClass475_4 = Class475.aClass475_3;
		if (this.anInterface51_1 != null) {
			this.anInterface51_1.method23112(this, 0, this.anInt5150 * -390751935, true);
		}
	}

	@OriginalMember(owner = "client!ti", name = "v", descriptor = "()V", line = 25)
	@Override
	public void method29129() {
		if (Class475.aClass475_2 != this.aClass475_4) {
			return;
		}
		this.method29075();
		this.aClass475_4 = Class475.aClass475_3;
		if (this.anInterface51_1 != null) {
			this.anInterface51_1.method23112(this, 0, this.anInt5150 * -390751935, true);
		}
	}

	@OriginalMember(owner = "client!ti", name = "t", descriptor = "()V", line = 25)
	@Override
	public void method29130() {
		if (Class475.aClass475_2 != this.aClass475_4) {
			return;
		}
		this.method29075();
		this.aClass475_4 = Class475.aClass475_3;
		if (this.anInterface51_1 != null) {
			this.anInterface51_1.method23112(this, 0, this.anInt5150 * -390751935, true);
		}
	}

	@OriginalMember(owner = "client!ti", name = "w", descriptor = "()V", line = 25)
	@Override
	public void method29150() {
		if (Class475.aClass475_2 != this.aClass475_4) {
			return;
		}
		this.method29075();
		this.aClass475_4 = Class475.aClass475_3;
		if (this.anInterface51_1 != null) {
			this.anInterface51_1.method23112(this, 0, this.anInt5150 * -390751935, true);
		}
	}

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(B)Lclient!oh;", line = 35)
	@Override
	public Class366 method29122() {
		@Pc(5) Class366 local5 = new Class366(this.aClass48_4);
		local5.method26815(this);
		return local5;
	}

	@OriginalMember(owner = "client!ti", name = "o", descriptor = "()Lclient!oh;", line = 35)
	@Override
	public Class366 method29139() {
		@Pc(5) Class366 local5 = new Class366(this.aClass48_4);
		local5.method26815(this);
		return local5;
	}

	@OriginalMember(owner = "client!ti", name = "i", descriptor = "()Lclient!oh;", line = 35)
	@Override
	public Class366 method29133() {
		@Pc(5) Class366 local5 = new Class366(this.aClass48_4);
		local5.method26815(this);
		return local5;
	}

	@OriginalMember(owner = "client!ti", name = "f", descriptor = "()Lclient!tc;", line = 41)
	@Override
	public Class475 method29134() {
		return this.aClass475_4;
	}

	@OriginalMember(owner = "client!ti", name = "g", descriptor = "(I)Lclient!tc;", line = 41)
	@Override
	public Class475 method29156() {
		return this.aClass475_4;
	}

	@OriginalMember(owner = "client!ti", name = "l", descriptor = "(I)Z", line = 45)
	@Override
	public boolean method29115() {
		return true;
	}

	@OriginalMember(owner = "client!ti", name = "k", descriptor = "()Z", line = 45)
	@Override
	public boolean method29135() {
		return true;
	}

	@OriginalMember(owner = "client!ti", name = "at", descriptor = "()Z", line = 45)
	@Override
	public boolean method29136() {
		return true;
	}

	@OriginalMember(owner = "client!ti", name = "h", descriptor = "(B)V", line = 48)
	void method29075() {
	}

	@OriginalMember(owner = "client!ti", name = "d", descriptor = "()V", line = 48)
	void method29076() {
	}

	@OriginalMember(owner = "client!ti", name = "q", descriptor = "()V", line = 48)
	void method29077() {
	}

	@OriginalMember(owner = "client!ti", name = "af", descriptor = "()V", line = 48)
	void method29078() {
	}

	@OriginalMember(owner = "client!ti", name = "s", descriptor = "(I)I", line = 51)
	@Override
	public int method29118() {
		return 0;
	}

	@OriginalMember(owner = "client!ti", name = "as", descriptor = "()I", line = 51)
	@Override
	public int method29146() {
		return 0;
	}

	@OriginalMember(owner = "client!ti", name = "an", descriptor = "()I", line = 51)
	@Override
	public int method29114() {
		return 0;
	}

	@OriginalMember(owner = "client!ti", name = "aj", descriptor = "()I", line = 51)
	@Override
	public int method29142() {
		return 0;
	}

	@OriginalMember(owner = "client!ti", name = "u", descriptor = "(I)Lclient!nu;", line = 55)
	@Override
	public Class357 method29119() {
		return Class357.aClass357_2;
	}

	@OriginalMember(owner = "client!ti", name = "ai", descriptor = "()Lclient!nu;", line = 55)
	@Override
	public Class357 method29138() {
		return Class357.aClass357_2;
	}

	@OriginalMember(owner = "client!ti", name = "aq", descriptor = "()Lclient!nu;", line = 55)
	@Override
	public Class357 method29153() {
		return Class357.aClass357_2;
	}

	@OriginalMember(owner = "client!ti", name = "av", descriptor = "()I", line = 59)
	@Override
	public int method29143() {
		return this.anInt5150 * -390751935;
	}

	@OriginalMember(owner = "client!ti", name = "al", descriptor = "()I", line = 59)
	@Override
	public int method29141() {
		return this.anInt5150 * -390751935;
	}

	@OriginalMember(owner = "client!ti", name = "ax", descriptor = "()I", line = 59)
	@Override
	public int method29164() {
		return this.anInt5150 * -390751935;
	}

	@OriginalMember(owner = "client!ti", name = "ao", descriptor = "()I", line = 59)
	@Override
	public int method29147() {
		return this.anInt5150 * -390751935;
	}

	@OriginalMember(owner = "client!ti", name = "y", descriptor = "(B)I", line = 59)
	@Override
	public int method29120() {
		return this.anInt5150 * -390751935;
	}

	@OriginalMember(owner = "client!ti", name = "az", descriptor = "()I", line = 59)
	@Override
	public int method29145() {
		return this.anInt5150 * -390751935;
	}

	@OriginalMember(owner = "client!ti", name = "ap", descriptor = "()I", line = 59)
	@Override
	public int method29131() {
		return this.anInt5150 * -390751935;
	}

	@OriginalMember(owner = "client!ti", name = "x", descriptor = "(II)[B", line = 63)
	@Override
	public byte[] method29117(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = arg0;
		if (arg0 == 0) {
			local1 = this.anInt5150 * -390751935;
		}
		return this.aClass359_88.method26705(local1);
	}

	@OriginalMember(owner = "client!ti", name = "ah", descriptor = "(I)[B", line = 63)
	@Override
	public byte[] method29137(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = arg0;
		if (arg0 == 0) {
			local1 = this.anInt5150 * -390751935;
		}
		return this.aClass359_88.method26705(local1);
	}

	@OriginalMember(owner = "client!ti", name = "b", descriptor = "(Lclient!ahb;I)V", line = 68)
	@Override
	public void method29121(@OriginalArg(0) Class3_Sub41 arg0) {
	}

	@OriginalMember(owner = "client!ti", name = "ab", descriptor = "(Lclient!ahb;)V", line = 68)
	@Override
	public void method29149(@OriginalArg(0) Class3_Sub41 arg0) {
	}

	@OriginalMember(owner = "client!ti", name = "au", descriptor = "(I)Lclient!ahb;", line = 71)
	@Override
	public Class3_Sub41 method29161(@OriginalArg(0) int arg0) {
		return null;
	}

	@OriginalMember(owner = "client!ti", name = "c", descriptor = "(IB)Lclient!ahb;", line = 71)
	@Override
	public Class3_Sub41 method29151(@OriginalArg(0) int arg0) {
		return null;
	}

	@OriginalMember(owner = "client!ti", name = "ay", descriptor = "(I)Lclient!ahb;", line = 71)
	@Override
	public Class3_Sub41 method29113(@OriginalArg(0) int arg0) {
		return null;
	}

	@OriginalMember(owner = "client!ti", name = "am", descriptor = "(I)Lclient!ahb;", line = 71)
	@Override
	public Class3_Sub41 method29128(@OriginalArg(0) int arg0) {
		return null;
	}

	@OriginalMember(owner = "client!ti", name = "ag", descriptor = "(I)Lclient!ahb;", line = 71)
	@Override
	public Class3_Sub41 method29152(@OriginalArg(0) int arg0) {
		return null;
	}

	@OriginalMember(owner = "client!ti", name = "z", descriptor = "(IB)Z", line = 75)
	@Override
	public boolean method29124(@OriginalArg(0) int arg0) {
		return false;
	}

	@OriginalMember(owner = "client!ti", name = "ae", descriptor = "(I)Z", line = 75)
	@Override
	public boolean method29155(@OriginalArg(0) int arg0) {
		return false;
	}

	@OriginalMember(owner = "client!ti", name = "ar", descriptor = "(I)Z", line = 75)
	@Override
	public boolean method29154(@OriginalArg(0) int arg0) {
		return false;
	}

	@OriginalMember(owner = "client!ti", name = "bg", descriptor = "()Z", line = 79)
	@Override
	public boolean method29163() {
		return false;
	}

	@OriginalMember(owner = "client!ti", name = "j", descriptor = "(I)Z", line = 79)
	@Override
	public boolean method29123() {
		return false;
	}

	@OriginalMember(owner = "client!ti", name = "br", descriptor = "()Z", line = 79)
	@Override
	public boolean method29140() {
		return false;
	}

	@OriginalMember(owner = "client!ti", name = "bt", descriptor = "()Z", line = 79)
	@Override
	public boolean method29132() {
		return false;
	}

	@OriginalMember(owner = "client!ti", name = "bk", descriptor = "()Z", line = 79)
	@Override
	public boolean method29162() {
		return false;
	}

	@OriginalMember(owner = "client!ti", name = "n", descriptor = "(B)I", line = 83)
	@Override
	public int method29125() {
		return 0;
	}

	@OriginalMember(owner = "client!ti", name = "ad", descriptor = "()I", line = 83)
	@Override
	public int method29127() {
		return 0;
	}

	@OriginalMember(owner = "client!ti", name = "aw", descriptor = "()I", line = 83)
	@Override
	public int method29144() {
		return 0;
	}

	@OriginalMember(owner = "client!ti", name = "e", descriptor = "(ZI)V", line = 86)
	@Override
	public void method29126(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!ti", name = "ac", descriptor = "(Z)V", line = 86)
	@Override
	public void method29158(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!ti", name = "bw", descriptor = "(Z)V", line = 86)
	@Override
	public void method29159(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!ti", name = "r", descriptor = "(I)Z", line = 89)
	@Override
	public boolean method29148() {
		return false;
	}

	@OriginalMember(owner = "client!ti", name = "bp", descriptor = "()Z", line = 89)
	@Override
	public boolean method29160() {
		return false;
	}

	@OriginalMember(owner = "client!ti", name = "c", descriptor = "(Ljava/lang/CharSequence;S)I", line = 147)
	public static int method29081(@OriginalArg(0) CharSequence arg0) {
		@Pc(2) int local2 = arg0.length();
		@Pc(4) int local4 = 0;
		for (@Pc(6) int local6 = 0; local6 < local2; local6++) {
			local4 = (local4 << 5) - local4 + arg0.charAt(local6);
		}
		return local4;
	}

	@OriginalMember(owner = "client!ti", name = "lh", descriptor = "(Lclient!fo;Lclient!fw;Lclient!vs;B)V", line = 6169)
	static final void method29082(@OriginalArg(0) Class178 arg0, @OriginalArg(1) Class186 arg1, @OriginalArg(2) Class536 arg2) {
		@Pc(13) String local13 = (String) arg2.anObjectArray42[(arg2.anInt5315 -= 790013775) * 996806575];
		if (Class201.method24159(local13, arg2) != null) {
			local13 = local13.substring(0, local13.length() - 1);
		}
		arg0.anObjectArray12 = Class484.method29109(local13, arg2);
		arg0.aBoolean644 = true;
	}

	@OriginalMember(owner = "client!ti", name = "aoz", descriptor = "(Lclient!vs;B)V", line = 11619)
	static final void method29080(@OriginalArg(0) Class536 arg0) {
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = Class510.aClass3_Sub45_37.aClass60_Sub6_1.method12966() == 1 ? 1 : 0;
	}
}
