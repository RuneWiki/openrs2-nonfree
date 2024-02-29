package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!or")
public class Class450 {

	@OriginalMember(owner = "client!or", name = "p", descriptor = "F")
	public float aFloat279;

	@OriginalMember(owner = "client!or", name = "c", descriptor = "F")
	public float aFloat280;

	@OriginalMember(owner = "client!or", name = "l", descriptor = "F")
	public float aFloat281;

	@OriginalMember(owner = "client!or", name = "v", descriptor = "F")
	public float aFloat282;

	@OriginalMember(owner = "client!or", name = "<init>", descriptor = "()V", line = 9)
	public Class450() {
		this.method29245();
	}

	@OriginalMember(owner = "client!or", name = "<init>", descriptor = "(FFFF)V", line = 13)
	public Class450(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3) {
		this.method29234(arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!or", name = "p", descriptor = "(FFFF)V", line = 18)
	public void method29234(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3) {
		this.aFloat279 = arg0;
		this.aFloat280 = arg1;
		this.aFloat282 = arg2;
		this.aFloat281 = arg3;
	}

	@OriginalMember(owner = "client!or", name = "q", descriptor = "(FFFF)V", line = 18)
	public void method29235(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3) {
		this.aFloat279 = arg0;
		this.aFloat280 = arg1;
		this.aFloat282 = arg2;
		this.aFloat281 = arg3;
	}

	@OriginalMember(owner = "client!or", name = "x", descriptor = "(FFFF)V", line = 18)
	public void method29236(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3) {
		this.aFloat279 = arg0;
		this.aFloat280 = arg1;
		this.aFloat282 = arg2;
		this.aFloat281 = arg3;
	}

	@OriginalMember(owner = "client!or", name = "d", descriptor = "(FFFF)V", line = 18)
	public void method29237(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3) {
		this.aFloat279 = arg0;
		this.aFloat280 = arg1;
		this.aFloat282 = arg2;
		this.aFloat281 = arg3;
	}

	@OriginalMember(owner = "client!or", name = "c", descriptor = "(Lclient!or;)V", line = 25)
	public void method29238(@OriginalArg(0) Class450 arg0) {
		this.method29234(arg0.aFloat279, arg0.aFloat280, arg0.aFloat282, arg0.aFloat281);
	}

	@OriginalMember(owner = "client!or", name = "r", descriptor = "(Lclient!or;)V", line = 25)
	public void method29239(@OriginalArg(0) Class450 arg0) {
		this.method29234(arg0.aFloat279, arg0.aFloat280, arg0.aFloat282, arg0.aFloat281);
	}

	@OriginalMember(owner = "client!or", name = "s", descriptor = "(Lclient!or;)V", line = 25)
	public void method29240(@OriginalArg(0) Class450 arg0) {
		this.method29234(arg0.aFloat279, arg0.aFloat280, arg0.aFloat282, arg0.aFloat281);
	}

	@OriginalMember(owner = "client!or", name = "g", descriptor = "(I)V", line = 29)
	public void method29241(@OriginalArg(0) int arg0) {
		this.method29234((float) (arg0 >> 16 & 0xFF) * 0.003921569F, (float) (arg0 >> 8 & 0xFF) * 0.003921569F, (float) (arg0 >> 0 & 0xFF) * 0.003921569F, (float) (arg0 >> 24 & 0xFF) * 0.003921569F);
	}

	@OriginalMember(owner = "client!or", name = "z", descriptor = "(I)V", line = 29)
	public void method29242(@OriginalArg(0) int arg0) {
		this.method29234((float) (arg0 >> 16 & 0xFF) * 0.003921569F, (float) (arg0 >> 8 & 0xFF) * 0.003921569F, (float) (arg0 >> 0 & 0xFF) * 0.003921569F, (float) (arg0 >> 24 & 0xFF) * 0.003921569F);
	}

	@OriginalMember(owner = "client!or", name = "v", descriptor = "(I)V", line = 29)
	public void method29243(@OriginalArg(0) int arg0) {
		this.method29234((float) (arg0 >> 16 & 0xFF) * 0.003921569F, (float) (arg0 >> 8 & 0xFF) * 0.003921569F, (float) (arg0 >> 0 & 0xFF) * 0.003921569F, (float) (arg0 >> 24 & 0xFF) * 0.003921569F);
	}

	@OriginalMember(owner = "client!or", name = "i", descriptor = "()V", line = 33)
	final void method29244() {
		this.aFloat281 = 0.0F;
		this.aFloat282 = 0.0F;
		this.aFloat280 = 0.0F;
		this.aFloat279 = 0.0F;
	}

	@OriginalMember(owner = "client!or", name = "l", descriptor = "()V", line = 33)
	final void method29245() {
		this.aFloat281 = 0.0F;
		this.aFloat282 = 0.0F;
		this.aFloat280 = 0.0F;
		this.aFloat279 = 0.0F;
	}

	@OriginalMember(owner = "client!or", name = "j", descriptor = "()V", line = 33)
	final void method29246() {
		this.aFloat281 = 0.0F;
		this.aFloat282 = 0.0F;
		this.aFloat280 = 0.0F;
		this.aFloat279 = 0.0F;
	}

	@OriginalMember(owner = "client!or", name = "k", descriptor = "()V", line = 33)
	final void method29247() {
		this.aFloat281 = 0.0F;
		this.aFloat282 = 0.0F;
		this.aFloat280 = 0.0F;
		this.aFloat279 = 0.0F;
	}

	@OriginalMember(owner = "client!or", name = "u", descriptor = "()V", line = 33)
	final void method29248() {
		this.aFloat281 = 0.0F;
		this.aFloat282 = 0.0F;
		this.aFloat280 = 0.0F;
		this.aFloat279 = 0.0F;
	}

	@OriginalMember(owner = "client!or", name = "o", descriptor = "()V", line = 40)
	public final void method29249() {
		this.aFloat279 = -this.aFloat279;
		this.aFloat280 = -this.aFloat280;
		this.aFloat282 = -this.aFloat282;
		this.aFloat281 = -this.aFloat281;
	}

	@OriginalMember(owner = "client!or", name = "y", descriptor = "()V", line = 40)
	public final void method29250() {
		this.aFloat279 = -this.aFloat279;
		this.aFloat280 = -this.aFloat280;
		this.aFloat282 = -this.aFloat282;
		this.aFloat281 = -this.aFloat281;
	}

	@OriginalMember(owner = "client!or", name = "e", descriptor = "()V", line = 40)
	public final void method29251() {
		this.aFloat279 = -this.aFloat279;
		this.aFloat280 = -this.aFloat280;
		this.aFloat282 = -this.aFloat282;
		this.aFloat281 = -this.aFloat281;
	}

	@OriginalMember(owner = "client!or", name = "f", descriptor = "()V", line = 40)
	public final void method29252() {
		this.aFloat279 = -this.aFloat279;
		this.aFloat280 = -this.aFloat280;
		this.aFloat282 = -this.aFloat282;
		this.aFloat281 = -this.aFloat281;
	}

	@OriginalMember(owner = "client!or", name = "w", descriptor = "(F)V", line = 47)
	public final void method29253(@OriginalArg(0) float arg0) {
		this.aFloat279 *= arg0;
		this.aFloat280 *= arg0;
		this.aFloat282 *= arg0;
		this.aFloat281 *= arg0;
	}

	@OriginalMember(owner = "client!or", name = "b", descriptor = "(F)V", line = 47)
	public final void method29254(@OriginalArg(0) float arg0) {
		this.aFloat279 *= arg0;
		this.aFloat280 *= arg0;
		this.aFloat282 *= arg0;
		this.aFloat281 *= arg0;
	}

	@OriginalMember(owner = "client!or", name = "t", descriptor = "(Lclient!oi;)V", line = 54)
	public final void method29255(@OriginalArg(0) Class442 arg0) {
		@Pc(2) float local2 = this.aFloat279;
		@Pc(5) float local5 = this.aFloat280;
		@Pc(8) float local8 = this.aFloat282;
		@Pc(11) float local11 = this.aFloat281;
		this.aFloat279 = arg0.aFloatArray109[0] * local2 + arg0.aFloatArray109[4] * local5 + arg0.aFloatArray109[8] * local8 + arg0.aFloatArray109[12] * local11;
		this.aFloat280 = arg0.aFloatArray109[1] * local2 + arg0.aFloatArray109[5] * local5 + arg0.aFloatArray109[9] * local8 + arg0.aFloatArray109[13] * local11;
		this.aFloat282 = arg0.aFloatArray109[2] * local2 + arg0.aFloatArray109[6] * local5 + arg0.aFloatArray109[10] * local8 + arg0.aFloatArray109[14] * local11;
		this.aFloat281 = arg0.aFloatArray109[3] * local2 + arg0.aFloatArray109[7] * local5 + arg0.aFloatArray109[11] * local8 + arg0.aFloatArray109[15] * local11;
	}

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(Lclient!oi;)V", line = 54)
	public final void method29256(@OriginalArg(0) Class442 arg0) {
		@Pc(2) float local2 = this.aFloat279;
		@Pc(5) float local5 = this.aFloat280;
		@Pc(8) float local8 = this.aFloat282;
		@Pc(11) float local11 = this.aFloat281;
		this.aFloat279 = arg0.aFloatArray109[0] * local2 + arg0.aFloatArray109[4] * local5 + arg0.aFloatArray109[8] * local8 + arg0.aFloatArray109[12] * local11;
		this.aFloat280 = arg0.aFloatArray109[1] * local2 + arg0.aFloatArray109[5] * local5 + arg0.aFloatArray109[9] * local8 + arg0.aFloatArray109[13] * local11;
		this.aFloat282 = arg0.aFloatArray109[2] * local2 + arg0.aFloatArray109[6] * local5 + arg0.aFloatArray109[10] * local8 + arg0.aFloatArray109[14] * local11;
		this.aFloat281 = arg0.aFloatArray109[3] * local2 + arg0.aFloatArray109[7] * local5 + arg0.aFloatArray109[11] * local8 + arg0.aFloatArray109[15] * local11;
	}

	@OriginalMember(owner = "client!or", name = "n", descriptor = "(Lclient!oi;)V", line = 54)
	public final void method29257(@OriginalArg(0) Class442 arg0) {
		@Pc(2) float local2 = this.aFloat279;
		@Pc(5) float local5 = this.aFloat280;
		@Pc(8) float local8 = this.aFloat282;
		@Pc(11) float local11 = this.aFloat281;
		this.aFloat279 = arg0.aFloatArray109[0] * local2 + arg0.aFloatArray109[4] * local5 + arg0.aFloatArray109[8] * local8 + arg0.aFloatArray109[12] * local11;
		this.aFloat280 = arg0.aFloatArray109[1] * local2 + arg0.aFloatArray109[5] * local5 + arg0.aFloatArray109[9] * local8 + arg0.aFloatArray109[13] * local11;
		this.aFloat282 = arg0.aFloatArray109[2] * local2 + arg0.aFloatArray109[6] * local5 + arg0.aFloatArray109[10] * local8 + arg0.aFloatArray109[14] * local11;
		this.aFloat281 = arg0.aFloatArray109[3] * local2 + arg0.aFloatArray109[7] * local5 + arg0.aFloatArray109[11] * local8 + arg0.aFloatArray109[15] * local11;
	}

	@OriginalMember(owner = "client!or", name = "toString", descriptor = "()Ljava/lang/String;", line = 66)
	@Override
	public String toString() {
		return this.aFloat279 + "," + this.aFloat280 + "," + this.aFloat282 + "," + this.aFloat281;
	}

	@OriginalMember(owner = "client!or", name = "rs", descriptor = "()Ljava/lang/String;", line = 66)
	public String method29258() {
		return this.aFloat279 + "," + this.aFloat280 + "," + this.aFloat282 + "," + this.aFloat281;
	}

	@OriginalMember(owner = "client!or", name = "ro", descriptor = "()Ljava/lang/String;", line = 66)
	public String method29259() {
		return this.aFloat279 + "," + this.aFloat280 + "," + this.aFloat282 + "," + this.aFloat281;
	}
}
