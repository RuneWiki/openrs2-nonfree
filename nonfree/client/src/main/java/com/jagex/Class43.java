package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!abs")
public class Class43 {

	@OriginalMember(owner = "client!abs", name = "p", descriptor = "I")
	final int anInt168;

	@OriginalMember(owner = "client!abs", name = "c", descriptor = "I")
	final int anInt166;

	@OriginalMember(owner = "client!abs", name = "v", descriptor = "I")
	final int anInt167;

	@OriginalMember(owner = "client!abs", name = "l", descriptor = "I")
	final int anInt169;

	@OriginalMember(owner = "client!abs", name = "y", descriptor = "I")
	final int anInt165;

	@OriginalMember(owner = "client!abs", name = "<init>", descriptor = "(IIIII)V", line = 309)
	Class43(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.anInt168 = arg0 * -180607987;
		this.anInt166 = arg1 * 11460085;
		this.anInt167 = arg2 * 364796277;
		this.anInt169 = arg3 * -166810125;
		this.anInt165 = arg4 * 1744337009;
	}

	@OriginalMember(owner = "client!abs", name = "rr", descriptor = "()I", line = 318)
	public int method712() {
		return this.anInt168 * -1780561211;
	}

	@OriginalMember(owner = "client!abs", name = "hashCode", descriptor = "()I", line = 318)
	@Override
	public int hashCode() {
		return this.anInt168 * -1780561211;
	}
}
