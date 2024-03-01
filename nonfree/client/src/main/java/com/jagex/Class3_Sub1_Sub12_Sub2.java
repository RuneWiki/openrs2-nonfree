package com.jagex;

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aom")
public class Class3_Sub1_Sub12_Sub2 extends Class3_Sub1_Sub12 {

	@OriginalMember(owner = "client!aom", name = "c", descriptor = "I")
	static final int anInt2862 = 2;

	@OriginalMember(owner = "client!aom", name = "z", descriptor = "I")
	static final int anInt2863 = 3;

	@OriginalMember(owner = "client!aom", name = "b", descriptor = "I")
	static final int anInt2865 = 1;

	@OriginalMember(owner = "client!aom", name = "e", descriptor = "[B")
	byte[] aByteArray53;

	@OriginalMember(owner = "client!aom", name = "j", descriptor = "I")
	int anInt2864;

	@OriginalMember(owner = "client!aom", name = "n", descriptor = "Lclient!qa;")
	Class403 aClass403_8;

	@OriginalMember(owner = "client!aom", name = "<init>", descriptor = "()V", line = 13)
	Class3_Sub1_Sub12_Sub2() {
	}

	@OriginalMember(owner = "client!aom", name = "l", descriptor = "()[B", line = 16)
	@Override
	byte[] method21156() {
		if (this.aBoolean516) {
			throw new RuntimeException();
		}
		return this.aByteArray53;
	}

	@OriginalMember(owner = "client!aom", name = "g", descriptor = "()[B", line = 16)
	@Override
	byte[] method21154() {
		if (this.aBoolean516) {
			throw new RuntimeException();
		}
		return this.aByteArray53;
	}

	@OriginalMember(owner = "client!aom", name = "p", descriptor = "(I)[B", line = 16)
	@Override
	byte[] method21157() {
		if (this.aBoolean516) {
			throw new RuntimeException();
		}
		return this.aByteArray53;
	}

	@OriginalMember(owner = "client!aom", name = "a", descriptor = "(I)I", line = 23)
	@Override
	int method21155() {
		return this.aBoolean516 ? 0 : 100;
	}

	@OriginalMember(owner = "client!aom", name = "h", descriptor = "()I", line = 23)
	@Override
	int method21158() {
		return this.aBoolean516 ? 0 : 100;
	}

	@OriginalMember(owner = "client!aom", name = "x", descriptor = "()I", line = 23)
	@Override
	int method21159() {
		return this.aBoolean516 ? 0 : 100;
	}
}
