package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fv")
class Class260 implements Interface41 {

	@OriginalMember(owner = "client!fv", name = "e", descriptor = "Lclient!dj;")
	public static Class94 aClass94_8;

	// $FF: synthetic field
	@OriginalMember(owner = "client!fv", name = "this$0", descriptor = "Lclient!fw;")
	final Class261 this$0;

	@OriginalMember(owner = "client!fv", name = "dp", descriptor = "(Lclient!hl;I)Z", line = 358)
	static boolean method26251(@OriginalArg(0) Class302 arg0) {
		if (arg0 == null) {
			return false;
		}
		if (arg0.anIntArray420 != null) {
			arg0 = arg0.method27153(Class136_Sub1.anInterface17_2, Class136_Sub1.anInterface19_2);
			if (arg0 == null) {
				return false;
			}
		}
		if (!arg0.aBoolean693) {
			return false;
		} else if (!arg0.method27136(Class136_Sub1.anInterface17_2, Class136_Sub1.anInterface19_2)) {
			return false;
		} else if (Class136_Sub1.aClass12_15.method173((long) (arg0.anInt4018 * 1390042623)) != null) {
			return false;
		} else if (Class136_Sub1.aClass12_16.method173((long) (arg0.anInt4027 * -15128681)) == null) {
			if (arg0.aString189 != null) {
				if (arg0.anInt4031 * 638004337 == 0 && Class136_Sub1.aBoolean346) {
					return false;
				}
				if (arg0.anInt4031 * 638004337 == 1 && Class136_Sub1.aBoolean347) {
					return false;
				}
				if (arg0.anInt4031 * 638004337 == 2 && Class136_Sub1.aBoolean348) {
					return false;
				}
			}
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!fv", name = "<init>", descriptor = "(Lclient!fw;)V", line = 475)
	Class260(@OriginalArg(0) Class261 arg0) {
		this.this$0 = arg0;
	}

	@OriginalMember(owner = "client!fv", name = "p", descriptor = "(S)F", line = 477)
	@Override
	public float method26249() {
		return (float) Class35_Sub6.aClass77_Sub35_45.aClass143_Sub27_4.method15901() / 255.0F;
	}

	@OriginalMember(owner = "client!fv", name = "c", descriptor = "()F", line = 477)
	@Override
	public float method26250() {
		return (float) Class35_Sub6.aClass77_Sub35_45.aClass143_Sub27_4.method15901() / 255.0F;
	}

	@OriginalMember(owner = "client!fv", name = "yr", descriptor = "(Lclient!yf;I)V", line = 8914)
	static final void method26252(@OriginalArg(0) Class665 arg0) {
		@Pc(13) String local13 = (String) arg0.anObjectArray45[(arg0.anInt5781 -= 1460193483) * 1485266147];
		Class533.method30779(local13);
	}
}
