package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!all")
public class Class3_Sub24_Sub7 extends Class3_Sub24 {

	// $FF: synthetic field
	@OriginalMember(owner = "client!all", name = "this$0", descriptor = "Lclient!iq;")
	final Class242 this$0;

	@OriginalMember(owner = "client!all", name = "l", descriptor = "J")
	long aLong121;

	@OriginalMember(owner = "client!all", name = "h", descriptor = "Ljava/lang/String;")
	String aString83;

	@OriginalMember(owner = "client!all", name = "<init>", descriptor = "(Lclient!iq;)V", line = 75)
	Class3_Sub24_Sub7(@OriginalArg(0) Class242 arg0) {
		this.this$0 = arg0;
		this.aLong121 = -1467701202719171407L;
		this.aString83 = null;
	}

	@OriginalMember(owner = "client!all", name = "p", descriptor = "(Lclient!ahb;B)V", line = 78)
	@Override
	void method18644(@OriginalArg(0) Class3_Sub41 arg0) {
		if (arg0.method20269() != 255) {
			arg0.anInt2803 -= -918980331;
			this.aLong121 = arg0.method20371() * 1467701202719171407L;
		}
		this.aString83 = arg0.method20282();
	}

	@OriginalMember(owner = "client!all", name = "g", descriptor = "(Lclient!ahb;)V", line = 78)
	@Override
	void method18649(@OriginalArg(0) Class3_Sub41 arg0) {
		if (arg0.method20269() != 255) {
			arg0.anInt2803 -= -918980331;
			this.aLong121 = arg0.method20371() * 1467701202719171407L;
		}
		this.aString83 = arg0.method20282();
	}

	@OriginalMember(owner = "client!all", name = "h", descriptor = "(Lclient!ahb;)V", line = 78)
	@Override
	void method18647(@OriginalArg(0) Class3_Sub41 arg0) {
		if (arg0.method20269() != 255) {
			arg0.anInt2803 -= -918980331;
			this.aLong121 = arg0.method20371() * 1467701202719171407L;
		}
		this.aString83 = arg0.method20282();
	}

	@OriginalMember(owner = "client!all", name = "x", descriptor = "(Lclient!ahb;)V", line = 78)
	@Override
	void method18645(@OriginalArg(0) Class3_Sub41 arg0) {
		if (arg0.method20269() != 255) {
			arg0.anInt2803 -= -918980331;
			this.aLong121 = arg0.method20371() * 1467701202719171407L;
		}
		this.aString83 = arg0.method20282();
	}

	@OriginalMember(owner = "client!all", name = "l", descriptor = "(Lclient!ahb;)V", line = 78)
	@Override
	void method18646(@OriginalArg(0) Class3_Sub41 arg0) {
		if (arg0.method20269() != 255) {
			arg0.anInt2803 -= -918980331;
			this.aLong121 = arg0.method20371() * 1467701202719171407L;
		}
		this.aString83 = arg0.method20282();
	}

	@OriginalMember(owner = "client!all", name = "s", descriptor = "(Lclient!iu;)V", line = 86)
	@Override
	void method18648(@OriginalArg(0) Class245 arg0) {
		arg0.method24810(this.aLong121 * -7505488152843136081L, this.aString83, 0);
	}

	@OriginalMember(owner = "client!all", name = "a", descriptor = "(Lclient!iu;I)V", line = 86)
	@Override
	void method18643(@OriginalArg(0) Class245 arg0) {
		arg0.method24810(this.aLong121 * -7505488152843136081L, this.aString83, 0);
	}

	@OriginalMember(owner = "client!all", name = "aui", descriptor = "(Lclient!vs;I)V", line = 12533)
	static final void method18245(@OriginalArg(0) Class536 arg0) {
		@Pc(3) Class26_Sub1_Sub1_Sub1_Sub1 local3 = (Class26_Sub1_Sub1_Sub1_Sub1) arg0.aClass26_Sub1_Sub1_Sub1_4;
		@Pc(6) String local6 = local3.aString72;
		@Pc(9) Class571 local9 = local3.aClass571_1;
		if (local9.anIntArray508 != null) {
			local9 = local9.method33044(Class424.aClass165_1, Class424.aClass165_1);
			if (local9 == null) {
				local6 = "";
			} else {
				local6 = local9.aString239;
			}
		}
		if (local6 == null) {
			local6 = "";
		}
		arg0.anObjectArray42[(arg0.anInt5315 += 790013775) * 996806575 - 1] = local6;
	}
}
