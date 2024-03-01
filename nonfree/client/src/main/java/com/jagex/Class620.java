package com.jagex;

import java.util.Iterator;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!zi")
public class Class620 {

	@OriginalMember(owner = "client!zi", name = "p", descriptor = "I")
	public int anInt5570 = 0;

	@OriginalMember(owner = "client!zi", name = "a", descriptor = "I")
	public int anInt5569 = 0;

	@OriginalMember(owner = "client!zi", name = "g", descriptor = "I")
	public int anInt5568 = 582039552;

	@OriginalMember(owner = "client!zi", name = "l", descriptor = "I")
	public int anInt5571 = 1823053824;

	@OriginalMember(owner = "client!zi", name = "<init>", descriptor = "()V", line = 12)
	Class620() {
	}

	@OriginalMember(owner = "client!zi", name = "p", descriptor = "(Lclient!ahb;B)V", line = 16)
	void method33753(@OriginalArg(0) Class3_Sub41 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method20269();
			if (local3 == 0) {
				return;
			}
			this.method33755(arg0, local3);
		}
	}

	@OriginalMember(owner = "client!zi", name = "l", descriptor = "(Lclient!ahb;I)V", line = 23)
	void method33752(@OriginalArg(0) Class3_Sub41 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.anInt5570 = arg0.method20269() * -138545153;
		} else if (arg1 == 2) {
			this.anInt5571 = arg0.method20271() * 1594725683;
		} else if (arg1 == 3) {
			this.anInt5568 = arg0.method20271() * 2103727655;
		} else if (arg1 == 4) {
			this.anInt5569 = arg0.method20272() * 1911730999;
		}
	}

	@OriginalMember(owner = "client!zi", name = "g", descriptor = "(Lclient!ahb;I)V", line = 23)
	void method33754(@OriginalArg(0) Class3_Sub41 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.anInt5570 = arg0.method20269() * -138545153;
		} else if (arg1 == 2) {
			this.anInt5571 = arg0.method20271() * 1594725683;
		} else if (arg1 == 3) {
			this.anInt5568 = arg0.method20271() * 2103727655;
		} else if (arg1 == 4) {
			this.anInt5569 = arg0.method20272() * 1911730999;
		}
	}

	@OriginalMember(owner = "client!zi", name = "a", descriptor = "(Lclient!ahb;II)V", line = 23)
	void method33755(@OriginalArg(0) Class3_Sub41 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.anInt5570 = arg0.method20269() * -138545153;
		} else if (arg1 == 2) {
			this.anInt5571 = arg0.method20271() * 1594725683;
		} else if (arg1 == 3) {
			this.anInt5568 = arg0.method20271() * 2103727655;
		} else if (arg1 == 4) {
			this.anInt5569 = arg0.method20272() * 1911730999;
		}
	}

	@OriginalMember(owner = "client!zi", name = "it", descriptor = "(I)V", line = 5322)
	static final void method33756() {
		@Pc(2) Iterator local2 = client.aClass581_18.iterator();
		while (local2.hasNext()) {
			@Pc(9) Class3_Sub1_Sub16 local9 = (Class3_Sub1_Sub16) local2.next();
			@Pc(12) Class26_Sub1_Sub1_Sub4 local12 = local9.aClass26_Sub1_Sub1_Sub4_1;
			if (client.aClass370_1.method26950() != null && local12.method20593()) {
				client.aClass370_1.method26950().method28054(local12, true);
			}
		}
	}
}
