package com.jagex;

import java.nio.ByteBuffer;
import java.util.Arrays;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!za")
public class Class3_Sub1_Sub19 extends Class3_Sub1 implements Interface1 {

	@OriginalMember(owner = "client!za", name = "ov", descriptor = "I")
	public static int anInt5551;

	@OriginalMember(owner = "client!za", name = "h", descriptor = "[I")
	public int[] anIntArray525;

	@OriginalMember(owner = "client!za", name = "x", descriptor = "[I")
	public int[] anIntArray526;

	@OriginalMember(owner = "client!za", name = "l", descriptor = "I")
	public int anInt5550 = 0;

	@OriginalMember(owner = "client!za", name = "s", descriptor = "I")
	public int anInt5549 = 0;

	@OriginalMember(owner = "client!za", name = "<init>", descriptor = "()V", line = 13)
	Class3_Sub1_Sub19() {
	}

	@OriginalMember(owner = "client!za", name = "l", descriptor = "(Lclient!ahb;)V", line = 17)
	void method33676(@OriginalArg(0) Class3_Sub41 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method20269();
			if (local3 == 0) {
				return;
			}
			this.method33675(arg0, local3);
		}
	}

	@OriginalMember(owner = "client!za", name = "g", descriptor = "(Lclient!ahb;)V", line = 17)
	void method33677(@OriginalArg(0) Class3_Sub41 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method20269();
			if (local3 == 0) {
				return;
			}
			this.method33675(arg0, local3);
		}
	}

	@OriginalMember(owner = "client!za", name = "p", descriptor = "(Lclient!ahb;I)V", line = 17)
	void method33679(@OriginalArg(0) Class3_Sub41 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method20269();
			if (local3 == 0) {
				return;
			}
			this.method33675(arg0, local3);
		}
	}

	@OriginalMember(owner = "client!za", name = "a", descriptor = "(Lclient!ahb;II)V", line = 24)
	void method33675(@OriginalArg(0) Class3_Sub41 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 2) {
			this.anInt5549 = arg0.method20271() * 1215851009;
		} else if (arg1 == 4) {
			this.anInt5550 = arg0.method20269() * -292279713;
			this.anIntArray525 = new int[this.anInt5550 * 1511174559];
			this.anIntArray526 = new int[this.anInt5550 * 1511174559];
			for (@Pc(36) int local36 = 0; local36 < this.anInt5550 * 1511174559; local36++) {
				this.anIntArray525[local36] = arg0.method20271();
				this.anIntArray526[local36] = arg0.method20271();
			}
		}
	}

	@OriginalMember(owner = "client!za", name = "h", descriptor = "(Lclient!ahb;I)V", line = 24)
	void method33678(@OriginalArg(0) Class3_Sub41 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 2) {
			this.anInt5549 = arg0.method20271() * 1215851009;
		} else if (arg1 == 4) {
			this.anInt5550 = arg0.method20269() * -292279713;
			this.anIntArray525 = new int[this.anInt5550 * 1511174559];
			this.anIntArray526 = new int[this.anInt5550 * 1511174559];
			for (@Pc(36) int local36 = 0; local36 < this.anInt5550 * 1511174559; local36++) {
				this.anIntArray525[local36] = arg0.method20271();
				this.anIntArray526[local36] = arg0.method20271();
			}
		}
	}

	@OriginalMember(owner = "client!za", name = "x", descriptor = "(Lclient!ahb;I)V", line = 24)
	void method33680(@OriginalArg(0) Class3_Sub41 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 2) {
			this.anInt5549 = arg0.method20271() * 1215851009;
		} else if (arg1 == 4) {
			this.anInt5550 = arg0.method20269() * -292279713;
			this.anIntArray525 = new int[this.anInt5550 * 1511174559];
			this.anIntArray526 = new int[this.anInt5550 * 1511174559];
			for (@Pc(36) int local36 = 0; local36 < this.anInt5550 * 1511174559; local36++) {
				this.anIntArray525[local36] = arg0.method20271();
				this.anIntArray526[local36] = arg0.method20271();
			}
		}
	}

	@OriginalMember(owner = "client!za", name = "a", descriptor = "(Ljava/lang/Object;ZI)[B", line = 25)
	public static byte[] method33681(@OriginalArg(0) Object arg0, @OriginalArg(1) boolean arg1) {
		if (arg0 == null) {
			return null;
		} else if (arg0 instanceof byte[]) {
			@Pc(11) byte[] local11 = (byte[]) arg0;
			return arg1 ? Arrays.copyOf(local11, local11.length) : local11;
		} else if (arg0 instanceof ByteBuffer) {
			@Pc(26) ByteBuffer local26 = (ByteBuffer) arg0;
			@Pc(30) byte[] local30 = new byte[local26.capacity()];
			local26.position(0);
			local26.get(local30);
			return local30;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!za", name = "akh", descriptor = "(Lclient!vs;I)V", line = 11054)
	static final void method33682(@OriginalArg(0) Class536 arg0) throws Exception_Sub4 {
		Class80.aClass23_Sub1_1.method5806((float) arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381] / 1000.0F);
	}
}
