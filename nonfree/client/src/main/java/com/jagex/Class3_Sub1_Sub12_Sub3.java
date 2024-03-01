package com.jagex;

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aor")
public class Class3_Sub1_Sub12_Sub3 extends Class3_Sub1_Sub12 {

	@OriginalMember(owner = "client!aor", name = "c", descriptor = "B")
	byte aByte98;

	@OriginalMember(owner = "client!aor", name = "b", descriptor = "Lclient!ahb;")
	Class3_Sub41 aClass3_Sub41_14;

	@OriginalMember(owner = "client!aor", name = "<init>", descriptor = "()V", line = 9)
	Class3_Sub1_Sub12_Sub3() {
	}

	@OriginalMember(owner = "client!aor", name = "g", descriptor = "()[B", line = 12)
	@Override
	byte[] method21154() {
		if (this.aBoolean516 || this.aClass3_Sub41_14.anInt2803 * 62066237 < this.aClass3_Sub41_14.aByteArray51.length - this.aByte98) {
			throw new RuntimeException();
		}
		return this.aClass3_Sub41_14.aByteArray51;
	}

	@OriginalMember(owner = "client!aor", name = "p", descriptor = "(I)[B", line = 12)
	@Override
	byte[] method21157() {
		if (this.aBoolean516 || this.aClass3_Sub41_14.anInt2803 * 62066237 < this.aClass3_Sub41_14.aByteArray51.length - this.aByte98) {
			throw new RuntimeException();
		}
		return this.aClass3_Sub41_14.aByteArray51;
	}

	@OriginalMember(owner = "client!aor", name = "l", descriptor = "()[B", line = 12)
	@Override
	byte[] method21156() {
		if (this.aBoolean516 || this.aClass3_Sub41_14.anInt2803 * 62066237 < this.aClass3_Sub41_14.aByteArray51.length - this.aByte98) {
			throw new RuntimeException();
		}
		return this.aClass3_Sub41_14.aByteArray51;
	}

	@OriginalMember(owner = "client!aor", name = "a", descriptor = "(I)I", line = 19)
	@Override
	int method21155() {
		return this.aClass3_Sub41_14 == null ? 0 : this.aClass3_Sub41_14.anInt2803 * 1911656404 / (this.aClass3_Sub41_14.aByteArray51.length - this.aByte98);
	}

	@OriginalMember(owner = "client!aor", name = "x", descriptor = "()I", line = 19)
	@Override
	int method21159() {
		return this.aClass3_Sub41_14 == null ? 0 : this.aClass3_Sub41_14.anInt2803 * 1911656404 / (this.aClass3_Sub41_14.aByteArray51.length - this.aByte98);
	}

	@OriginalMember(owner = "client!aor", name = "h", descriptor = "()I", line = 19)
	@Override
	int method21158() {
		return this.aClass3_Sub41_14 == null ? 0 : this.aClass3_Sub41_14.anInt2803 * 1911656404 / (this.aClass3_Sub41_14.aByteArray51.length - this.aByte98);
	}
}
