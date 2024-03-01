package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!alr")
public abstract class Class3_Sub19_Sub1 extends Class3_Sub19 {

	@OriginalMember(owner = "client!alr", name = "x", descriptor = "Lclient!fa;")
	Class166 aClass166_6;

	@OriginalMember(owner = "client!alr", name = "s", descriptor = "Ljava/lang/String;")
	String aString128;

	@OriginalMember(owner = "client!alr", name = "u", descriptor = "Ljava/lang/String;")
	String aString127;

	@OriginalMember(owner = "client!alr", name = "y", descriptor = "I")
	int anInt2840;

	@OriginalMember(owner = "client!alr", name = "b", descriptor = "Lclient!fa;")
	Class166 aClass166_5;

	@OriginalMember(owner = "client!alr", name = "<init>", descriptor = "(Lclient!fr;)V", line = 15)
	Class3_Sub19_Sub1(@OriginalArg(0) Class181 arg0) {
		this.aClass166_6 = arg0.aClass166_132;
		this.aString128 = arg0.aString175;
		this.aString127 = arg0.aString176;
		this.anInt2840 = arg0.anInt3584 * -1008903707;
		this.aClass166_5 = arg0.aClass166_133;
	}

	@OriginalMember(owner = "client!alr", name = "toString", descriptor = "()Ljava/lang/String;", line = 26)
	@Override
	public String toString() {
		@Pc(13) String local13 = this.aClass166_6.toString() + " " + this.aString128;
		if (this.aString127 != null && !"".equals(this.aString127)) {
			local13 = local13 + " : " + this.aString127;
		}
		return local13;
	}

	@OriginalMember(owner = "client!alr", name = "ox", descriptor = "()Ljava/lang/String;", line = 26)
	public String method20816() {
		@Pc(13) String local13 = this.aClass166_6.toString() + " " + this.aString128;
		if (this.aString127 != null && !"".equals(this.aString127)) {
			local13 = local13 + " : " + this.aString127;
		}
		return local13;
	}

	@OriginalMember(owner = "client!alr", name = "ou", descriptor = "()Ljava/lang/String;", line = 26)
	public String method20823() {
		@Pc(13) String local13 = this.aClass166_6.toString() + " " + this.aString128;
		if (this.aString127 != null && !"".equals(this.aString127)) {
			local13 = local13 + " : " + this.aString127;
		}
		return local13;
	}

	@OriginalMember(owner = "client!alr", name = "a", descriptor = "(I)Ljava/lang/String;", line = 34)
	String method20812() {
		return this.aString128;
	}

	@OriginalMember(owner = "client!alr", name = "s", descriptor = "()Ljava/lang/String;", line = 34)
	String method20818() {
		return this.aString128;
	}

	@OriginalMember(owner = "client!alr", name = "u", descriptor = "()Ljava/lang/String;", line = 34)
	String method20819() {
		return this.aString128;
	}

	@OriginalMember(owner = "client!alr", name = "y", descriptor = "()Lclient!fa;", line = 38)
	public Class166 method20820() {
		return this.aClass166_6;
	}

	@OriginalMember(owner = "client!alr", name = "g", descriptor = "(I)Lclient!fa;", line = 38)
	public Class166 method20826() {
		return this.aClass166_6;
	}

	@OriginalMember(owner = "client!alr", name = "l", descriptor = "(I)Lclient!fa;", line = 42)
	public Class166 method20813() {
		return this.aClass166_5;
	}

	@OriginalMember(owner = "client!alr", name = "c", descriptor = "()Lclient!fa;", line = 42)
	public Class166 method20821() {
		return this.aClass166_5;
	}

	@OriginalMember(owner = "client!alr", name = "b", descriptor = "()Lclient!fa;", line = 42)
	public Class166 method20827() {
		return this.aClass166_5;
	}

	@OriginalMember(owner = "client!alr", name = "z", descriptor = "()I", line = 46)
	public int method20817() {
		if (Class166.aClass166_93 != this.aClass166_6) {
			throw new IllegalArgumentException_Sub1(this, this.aClass166_6.toString().toLowerCase());
		}
		return this.anInt2840 * -84442329;
	}

	@OriginalMember(owner = "client!alr", name = "h", descriptor = "(I)I", line = 46)
	public int method20822() {
		if (Class166.aClass166_93 != this.aClass166_6) {
			throw new IllegalArgumentException_Sub1(this, this.aClass166_6.toString().toLowerCase());
		}
		return this.anInt2840 * -84442329;
	}

	@OriginalMember(owner = "client!alr", name = "f", descriptor = "(I)I")
	public abstract int method20810(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!alr", name = "p", descriptor = "(I)Z")
	public abstract boolean method20811(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!alr", name = "n", descriptor = "(I)I")
	public abstract int method20814(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!alr", name = "x", descriptor = "(I)I")
	public abstract int method20815(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!alr", name = "j", descriptor = "(I)I")
	public abstract int method20824(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!alr", name = "i", descriptor = "(I)I")
	public abstract int method20825(@OriginalArg(0) int arg0);
}
