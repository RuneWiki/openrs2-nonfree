package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!afs")
public class Class96_Sub16 extends Class96 {

	@OriginalMember(owner = "client!afs", name = "iy", descriptor = "Lclient!wo;")
	public static Class625 aClass625_1;

	@OriginalMember(owner = "client!afs", name = "c", descriptor = "I")
	final int anInt899;

	@OriginalMember(owner = "client!afs", name = "v", descriptor = "I")
	final int anInt898;

	@OriginalMember(owner = "client!afs", name = "l", descriptor = "I")
	final int anInt897;

	@OriginalMember(owner = "client!afs", name = "y", descriptor = "I")
	final int anInt895;

	@OriginalMember(owner = "client!afs", name = "w", descriptor = "I")
	final int anInt896;

	@OriginalMember(owner = "client!afs", name = "<init>", descriptor = "(Lclient!akv;)V", line = 15)
	Class96_Sub16(@OriginalArg(0) Class77_Sub39 arg0) {
		super(arg0);
		this.anInt899 = arg0.method22483() * 1773019115;
		@Pc(13) int local13 = arg0.method22478();
		if ((local13 & 0x1) == 0) {
			this.anInt898 = -152065885;
			this.anInt897 = -422393943;
		} else {
			this.anInt898 = arg0.method22483() * 152065885;
			this.anInt897 = arg0.method22483() * 422393943;
		}
		if ((local13 & 0x2) == 0) {
			this.anInt895 = 838380475;
			this.anInt896 = -1758895609;
		} else {
			this.anInt895 = arg0.method22483() * -838380475;
			this.anInt896 = arg0.method22483() * 1758895609;
		}
		if ((local13 & 0x4) != 0) {
			@Pc(73) int local73 = arg0.method22483();
			@Pc(77) int local77 = arg0.method22483();
			@Pc(83) int local83 = local73 * 255 / local77;
			if (local73 > 0 && local83 < 1) {
				@Pc(90) boolean local90 = true;
			}
		}
	}

	@OriginalMember(owner = "client!afs", name = "c", descriptor = "(I)V", line = 44)
	@Override
	public void method19911() {
		@Pc(8) Class104_Sub1_Sub1_Sub1 local8 = Class589.aClass222Array1[this.anInt899 * -1839394621].method25755();
		local8.method21088(this.anInt898 * -910445323, this.anInt897 * 1861432167, this.anInt895 * -1855676787, this.anInt896 * 360813641, client.anInt3414, 0);
	}

	@OriginalMember(owner = "client!afs", name = "y", descriptor = "()V", line = 44)
	@Override
	public void method19912() {
		@Pc(8) Class104_Sub1_Sub1_Sub1 local8 = Class589.aClass222Array1[this.anInt899 * -1839394621].method25755();
		local8.method21088(this.anInt898 * -910445323, this.anInt897 * 1861432167, this.anInt895 * -1855676787, this.anInt896 * 360813641, client.anInt3414, 0);
	}

	@OriginalMember(owner = "client!afs", name = "w", descriptor = "()V", line = 44)
	@Override
	public void method19913() {
		@Pc(8) Class104_Sub1_Sub1_Sub1 local8 = Class589.aClass222Array1[this.anInt899 * -1839394621].method25755();
		local8.method21088(this.anInt898 * -910445323, this.anInt897 * 1861432167, this.anInt895 * -1855676787, this.anInt896 * 360813641, client.anInt3414, 0);
	}

	@OriginalMember(owner = "client!afs", name = "ep", descriptor = "(B)I", line = 873)
	public static int method7533() {
		if ((double) Class136_Sub1.aFloat152 == 2.0D) {
			return 25;
		} else if ((double) Class136_Sub1.aFloat152 == 3.0D) {
			return 37;
		} else if ((double) Class136_Sub1.aFloat152 == 4.0D) {
			return 50;
		} else if ((double) Class136_Sub1.aFloat152 == 6.0D) {
			return 75;
		} else if ((double) Class136_Sub1.aFloat152 == 8.0D) {
			return 100;
		} else {
			return 200;
		}
	}
}
