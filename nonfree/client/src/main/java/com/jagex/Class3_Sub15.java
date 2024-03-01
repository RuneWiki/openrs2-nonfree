package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!afz")
public class Class3_Sub15 extends Class3 {

	@OriginalMember(owner = "client!afz", name = "l", descriptor = "Lclient!mh;")
	public Class320 aClass320_45 = new Class320();

	@OriginalMember(owner = "client!afz", name = "h", descriptor = "I")
	int anInt1244;

	@OriginalMember(owner = "client!afz", name = "x", descriptor = "I")
	int anInt1245;

	@OriginalMember(owner = "client!afz", name = "s", descriptor = "F")
	float aFloat142;

	@OriginalMember(owner = "client!afz", name = "<init>", descriptor = "(IIIIIF)V", line = 12)
	Class3_Sub15(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		this.aClass320_45.method25863((float) arg0, (float) arg1, (float) arg2);
		this.anInt1244 = arg3 * -1574416851;
		this.anInt1245 = arg4 * 1614977027;
		this.aFloat142 = arg5;
	}

	@OriginalMember(owner = "client!afz", name = "p", descriptor = "(I)I", line = 20)
	public final int method11280() {
		return (int) this.aClass320_45.aFloat259;
	}

	@OriginalMember(owner = "client!afz", name = "z", descriptor = "()I", line = 20)
	public final int method11284() {
		return (int) this.aClass320_45.aFloat259;
	}

	@OriginalMember(owner = "client!afz", name = "y", descriptor = "()I", line = 20)
	public final int method11287() {
		return (int) this.aClass320_45.aFloat259;
	}

	@OriginalMember(owner = "client!afz", name = "b", descriptor = "()I", line = 20)
	public final int method11288() {
		return (int) this.aClass320_45.aFloat259;
	}

	@OriginalMember(owner = "client!afz", name = "c", descriptor = "()I", line = 20)
	public final int method11289() {
		return (int) this.aClass320_45.aFloat259;
	}

	@OriginalMember(owner = "client!afz", name = "j", descriptor = "()I", line = 20)
	public final int method11299() {
		return (int) this.aClass320_45.aFloat259;
	}

	@OriginalMember(owner = "client!afz", name = "a", descriptor = "(B)I", line = 24)
	public final int method11281() {
		return (int) this.aClass320_45.aFloat260;
	}

	@OriginalMember(owner = "client!afz", name = "n", descriptor = "()I", line = 24)
	public final int method11295() {
		return (int) this.aClass320_45.aFloat260;
	}

	@OriginalMember(owner = "client!afz", name = "g", descriptor = "(I)I", line = 28)
	public final int method11282() {
		return (int) this.aClass320_45.aFloat261;
	}

	@OriginalMember(owner = "client!afz", name = "i", descriptor = "()I", line = 28)
	public final int method11293() {
		return (int) this.aClass320_45.aFloat261;
	}

	@OriginalMember(owner = "client!afz", name = "f", descriptor = "()I", line = 28)
	public final int method11294() {
		return (int) this.aClass320_45.aFloat261;
	}

	@OriginalMember(owner = "client!afz", name = "l", descriptor = "(I)I", line = 32)
	public final int method11291() {
		return this.anInt1244 * -508874331;
	}

	@OriginalMember(owner = "client!afz", name = "at", descriptor = "()I", line = 32)
	public final int method11296() {
		return this.anInt1244 * -508874331;
	}

	@OriginalMember(owner = "client!afz", name = "k", descriptor = "()I", line = 32)
	public final int method11297() {
		return this.anInt1244 * -508874331;
	}

	@OriginalMember(owner = "client!afz", name = "h", descriptor = "(I)I", line = 36)
	public final int method11279() {
		return this.anInt1245 * -700001621;
	}

	@OriginalMember(owner = "client!afz", name = "af", descriptor = "()I", line = 36)
	public final int method11290() {
		return this.anInt1245 * -700001621;
	}

	@OriginalMember(owner = "client!afz", name = "aa", descriptor = "()F", line = 40)
	public final float method11283() {
		return this.aFloat142;
	}

	@OriginalMember(owner = "client!afz", name = "ak", descriptor = "()F", line = 40)
	public final float method11298() {
		return this.aFloat142;
	}

	@OriginalMember(owner = "client!afz", name = "x", descriptor = "(I)F", line = 40)
	public final float method11300() {
		return this.aFloat142;
	}

	@OriginalMember(owner = "client!afz", name = "s", descriptor = "(FI)V", line = 44)
	public void method11285(@OriginalArg(0) float arg0) {
		this.aFloat142 = arg0;
	}

	@OriginalMember(owner = "client!afz", name = "u", descriptor = "(IIII)V", line = 48)
	public void method11286(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass320_45.method25863((float) arg0, (float) arg1, (float) arg2);
	}

	@OriginalMember(owner = "client!afz", name = "ah", descriptor = "(III)V", line = 48)
	public void method11292(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass320_45.method25863((float) arg0, (float) arg1, (float) arg2);
	}
}
