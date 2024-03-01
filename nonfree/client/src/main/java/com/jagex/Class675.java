package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!xz")
public class Class675 {

	@OriginalMember(owner = "client!xz", name = "e", descriptor = "I")
	static final int anInt5879 = 2000000000;

	@OriginalMember(owner = "client!xz", name = "k", descriptor = "I")
	int anInt5881 = 0;

	@OriginalMember(owner = "client!xz", name = "f", descriptor = "I")
	int anInt5880 = -2010621225;

	@OriginalMember(owner = "client!xz", name = "w", descriptor = "I")
	int anInt5882 = 1180966377;

	@OriginalMember(owner = "client!xz", name = "n", descriptor = "Lclient!wm;")
	final Class640 aClass640_1;

	@OriginalMember(owner = "client!xz", name = "m", descriptor = "Z")
	final boolean aBoolean874;

	@OriginalMember(owner = "client!xz", name = "<init>", descriptor = "(Lclient!wm;Z)V", line = 14)
	public Class675(@OriginalArg(0) Class640 arg0, @OriginalArg(1) boolean arg1) {
		this.aClass640_1 = arg0;
		this.aBoolean874 = arg1;
	}

	@OriginalMember(owner = "client!xz", name = "d", descriptor = "()I", line = 20)
	public int method33136() {
		return this.anInt5881 * -1812448473;
	}

	@OriginalMember(owner = "client!xz", name = "z", descriptor = "()I", line = 20)
	public int method33143() {
		return this.anInt5881 * -1812448473;
	}

	@OriginalMember(owner = "client!xz", name = "p", descriptor = "()I", line = 20)
	public int method33144() {
		return this.anInt5881 * -1812448473;
	}

	@OriginalMember(owner = "client!xz", name = "e", descriptor = "(I)I", line = 20)
	public int method33152() {
		return this.anInt5881 * -1812448473;
	}

	@OriginalMember(owner = "client!xz", name = "n", descriptor = "(Lclient!zu;B)I", line = 24)
	public int method33140(@OriginalArg(0) Class718 arg0) {
		if (Class718.aClass718_2 == arg0 && this.aClass640_1.method32470() && this.aClass640_1.method32487()) {
			@Pc(17) int local17 = this.aClass640_1.method32471();
			if (!this.aBoolean874) {
				local17 /= 10;
			}
			if (this.anInt5881 * -1812448473 > local17) {
				return local17;
			}
		}
		return this.anInt5881 * -1812448473;
	}

	@OriginalMember(owner = "client!xz", name = "c", descriptor = "(Lclient!zu;)I", line = 24)
	public int method33145(@OriginalArg(0) Class718 arg0) {
		if (Class718.aClass718_2 == arg0 && this.aClass640_1.method32470() && this.aClass640_1.method32487()) {
			@Pc(17) int local17 = this.aClass640_1.method32471();
			if (!this.aBoolean874) {
				local17 /= 10;
			}
			if (this.anInt5881 * -1812448473 > local17) {
				return local17;
			}
		}
		return this.anInt5881 * -1812448473;
	}

	@OriginalMember(owner = "client!xz", name = "r", descriptor = "(Lclient!zu;)I", line = 24)
	public int method33147(@OriginalArg(0) Class718 arg0) {
		if (Class718.aClass718_2 == arg0 && this.aClass640_1.method32470() && this.aClass640_1.method32487()) {
			@Pc(17) int local17 = this.aClass640_1.method32471();
			if (!this.aBoolean874) {
				local17 /= 10;
			}
			if (this.anInt5881 * -1812448473 > local17) {
				return local17;
			}
		}
		return this.anInt5881 * -1812448473;
	}

	@OriginalMember(owner = "client!xz", name = "v", descriptor = "(Lclient!zu;)I", line = 24)
	public int method33148(@OriginalArg(0) Class718 arg0) {
		if (Class718.aClass718_2 == arg0 && this.aClass640_1.method32470() && this.aClass640_1.method32487()) {
			@Pc(17) int local17 = this.aClass640_1.method32471();
			if (!this.aBoolean874) {
				local17 /= 10;
			}
			if (this.anInt5881 * -1812448473 > local17) {
				return local17;
			}
		}
		return this.anInt5881 * -1812448473;
	}

	@OriginalMember(owner = "client!xz", name = "o", descriptor = "(I)V", line = 33)
	public void method33134(@OriginalArg(0) int arg0) {
		this.anInt5881 = arg0 * -1771862889;
		if (this.anInt5881 * -1812448473 < 0) {
			this.anInt5881 = 0;
		} else if (this.aBoolean874 && this.anInt5881 * -1812448473 > 2000000000) {
			this.anInt5881 = 753552384;
		} else if (!this.aBoolean874 && this.anInt5881 * -1812448473 > 200000000) {
			this.anInt5881 = -1642631680;
		}
		this.method33142();
	}

	@OriginalMember(owner = "client!xz", name = "m", descriptor = "(II)V", line = 33)
	public void method33137(@OriginalArg(0) int arg0) {
		this.anInt5881 = arg0 * -1771862889;
		if (this.anInt5881 * -1812448473 < 0) {
			this.anInt5881 = 0;
		} else if (this.aBoolean874 && this.anInt5881 * -1812448473 > 2000000000) {
			this.anInt5881 = 753552384;
		} else if (!this.aBoolean874 && this.anInt5881 * -1812448473 > 200000000) {
			this.anInt5881 = -1642631680;
		}
		this.method33142();
	}

	@OriginalMember(owner = "client!xz", name = "s", descriptor = "(I)V", line = 33)
	public void method33150(@OriginalArg(0) int arg0) {
		this.anInt5881 = arg0 * -1771862889;
		if (this.anInt5881 * -1812448473 < 0) {
			this.anInt5881 = 0;
		} else if (this.aBoolean874 && this.anInt5881 * -1812448473 > 2000000000) {
			this.anInt5881 = 753552384;
		} else if (!this.aBoolean874 && this.anInt5881 * -1812448473 > 200000000) {
			this.anInt5881 = -1642631680;
		}
		this.method33142();
	}

	@OriginalMember(owner = "client!xz", name = "k", descriptor = "(I)I", line = 41)
	public int method33138() {
		return this.anInt5880 * -165594905;
	}

	@OriginalMember(owner = "client!xz", name = "y", descriptor = "()I", line = 41)
	public int method33151() {
		return this.anInt5880 * -165594905;
	}

	@OriginalMember(owner = "client!xz", name = "x", descriptor = "()I", line = 41)
	public int method33153() {
		return this.anInt5880 * -165594905;
	}

	@OriginalMember(owner = "client!xz", name = "h", descriptor = "()I", line = 41)
	public int method33155() {
		return this.anInt5880 * -165594905;
	}

	@OriginalMember(owner = "client!xz", name = "q", descriptor = "()I", line = 41)
	public int method33156() {
		return this.anInt5880 * -165594905;
	}

	@OriginalMember(owner = "client!xz", name = "b", descriptor = "()I", line = 41)
	public int method33164() {
		return this.anInt5880 * -165594905;
	}

	@OriginalMember(owner = "client!xz", name = "f", descriptor = "(Lclient!zu;B)I", line = 45)
	public int method33135(@OriginalArg(0) Class718 arg0) {
		if (Class718.aClass718_2 == arg0 && this.aClass640_1.method32470() && this.aClass640_1.method32487()) {
			@Pc(17) int local17 = this.aClass640_1.method32472();
			if (this.anInt5880 * -165594905 > local17) {
				return local17;
			}
		}
		return this.anInt5880 * -165594905;
	}

	@OriginalMember(owner = "client!xz", name = "a", descriptor = "(Lclient!zu;)I", line = 45)
	public int method33154(@OriginalArg(0) Class718 arg0) {
		if (Class718.aClass718_2 == arg0 && this.aClass640_1.method32470() && this.aClass640_1.method32487()) {
			@Pc(17) int local17 = this.aClass640_1.method32472();
			if (this.anInt5880 * -165594905 > local17) {
				return local17;
			}
		}
		return this.anInt5880 * -165594905;
	}

	@OriginalMember(owner = "client!xz", name = "g", descriptor = "(Lclient!zu;)I", line = 45)
	public int method33157(@OriginalArg(0) Class718 arg0) {
		if (Class718.aClass718_2 == arg0 && this.aClass640_1.method32470() && this.aClass640_1.method32487()) {
			@Pc(17) int local17 = this.aClass640_1.method32472();
			if (this.anInt5880 * -165594905 > local17) {
				return local17;
			}
		}
		return this.anInt5880 * -165594905;
	}

	@OriginalMember(owner = "client!xz", name = "i", descriptor = "(Lclient!zu;)I", line = 45)
	public int method33158(@OriginalArg(0) Class718 arg0) {
		if (Class718.aClass718_2 == arg0 && this.aClass640_1.method32470() && this.aClass640_1.method32487()) {
			@Pc(17) int local17 = this.aClass640_1.method32472();
			if (this.anInt5880 * -165594905 > local17) {
				return local17;
			}
		}
		return this.anInt5880 * -165594905;
	}

	@OriginalMember(owner = "client!xz", name = "w", descriptor = "(B)I", line = 53)
	public int method33146() {
		return this.anInt5882 * 1900186201;
	}

	@OriginalMember(owner = "client!xz", name = "j", descriptor = "()I", line = 53)
	public int method33159() {
		return this.anInt5882 * 1900186201;
	}

	@OriginalMember(owner = "client!xz", name = "l", descriptor = "(II)V", line = 57)
	public void method33141(@OriginalArg(0) int arg0) {
		this.anInt5882 = arg0 * 1180966377;
	}

	@OriginalMember(owner = "client!xz", name = "t", descriptor = "(I)V", line = 57)
	public void method33160(@OriginalArg(0) int arg0) {
		this.anInt5882 = arg0 * 1180966377;
	}

	@OriginalMember(owner = "client!xz", name = "ae", descriptor = "(I)V", line = 57)
	public void method33161(@OriginalArg(0) int arg0) {
		this.anInt5882 = arg0 * 1180966377;
	}

	@OriginalMember(owner = "client!xz", name = "ag", descriptor = "(I)V", line = 57)
	public void method33162(@OriginalArg(0) int arg0) {
		this.anInt5882 = arg0 * 1180966377;
	}

	@OriginalMember(owner = "client!xz", name = "ah", descriptor = "()V", line = 61)
	void method33139() {
		if (this.aBoolean874) {
			this.anInt5880 = this.aClass640_1.method32468(this.anInt5881 * -1812448473) * -2010621225;
		} else {
			this.anInt5880 = this.aClass640_1.method32474(this.anInt5881 * -1812448473) * -2010621225;
		}
	}

	@OriginalMember(owner = "client!xz", name = "u", descriptor = "(I)V", line = 61)
	void method33142() {
		if (this.aBoolean874) {
			this.anInt5880 = this.aClass640_1.method32468(this.anInt5881 * -1812448473) * -2010621225;
		} else {
			this.anInt5880 = this.aClass640_1.method32474(this.anInt5881 * -1812448473) * -2010621225;
		}
	}

	@OriginalMember(owner = "client!xz", name = "ac", descriptor = "()V", line = 61)
	void method33149() {
		if (this.aBoolean874) {
			this.anInt5880 = this.aClass640_1.method32468(this.anInt5881 * -1812448473) * -2010621225;
		} else {
			this.anInt5880 = this.aClass640_1.method32474(this.anInt5881 * -1812448473) * -2010621225;
		}
	}

	@OriginalMember(owner = "client!xz", name = "al", descriptor = "()V", line = 61)
	void method33163() {
		if (this.aBoolean874) {
			this.anInt5880 = this.aClass640_1.method32468(this.anInt5881 * -1812448473) * -2010621225;
		} else {
			this.anInt5880 = this.aClass640_1.method32474(this.anInt5881 * -1812448473) * -2010621225;
		}
	}

	@OriginalMember(owner = "client!xz", name = "ai", descriptor = "()V", line = 61)
	void method33165() {
		if (this.aBoolean874) {
			this.anInt5880 = this.aClass640_1.method32468(this.anInt5881 * -1812448473) * -2010621225;
		} else {
			this.anInt5880 = this.aClass640_1.method32474(this.anInt5881 * -1812448473) * -2010621225;
		}
	}

	@OriginalMember(owner = "client!xz", name = "lx", descriptor = "(Lclient!hf;Lclient!hq;Lclient!yf;I)V", line = 7085)
	static final void method33166(@OriginalArg(0) Class312 arg0, @OriginalArg(1) Class320 arg1, @OriginalArg(2) Class681 arg2) {
		arg0.anInt3988 = arg2.anIntArray519[(arg2.anInt5891 -= 1189701933) * -1497248091] * 1588517483;
	}

	@OriginalMember(owner = "client!xz", name = "ot", descriptor = "(Lclient!yf;I)V", line = 7542)
	static final void method33167(@OriginalArg(0) Class681 arg0) {
		@Pc(8) Class677 local8 = arg0.aBoolean875 ? arg0.aClass677_2 : arg0.aClass677_1;
		@Pc(11) Class312 local11 = local8.aClass312_13;
		@Pc(14) Class320 local14 = local8.aClass320_4;
		Class714.method36865(local11, local14, arg0);
	}
}
