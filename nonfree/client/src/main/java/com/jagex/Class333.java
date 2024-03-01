package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mv")
public class Class333 {

	@OriginalMember(owner = "client!mv", name = "l", descriptor = "F")
	public float aFloat281;

	@OriginalMember(owner = "client!mv", name = "a", descriptor = "F")
	public float aFloat282;

	@OriginalMember(owner = "client!mv", name = "p", descriptor = "F")
	public float aFloat283;

	@OriginalMember(owner = "client!mv", name = "g", descriptor = "F")
	public float aFloat284;

	@OriginalMember(owner = "client!mv", name = "<init>", descriptor = "()V", line = 9)
	public Class333() {
		this.method26254();
	}

	@OriginalMember(owner = "client!mv", name = "<init>", descriptor = "(FFFF)V", line = 13)
	public Class333(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3) {
		this.method26251(arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!mv", name = "p", descriptor = "(FFFF)V", line = 18)
	public void method26251(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3) {
		this.aFloat283 = arg0;
		this.aFloat282 = arg1;
		this.aFloat284 = arg2;
		this.aFloat281 = arg3;
	}

	@OriginalMember(owner = "client!mv", name = "u", descriptor = "(FFFF)V", line = 18)
	public void method26260(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3) {
		this.aFloat283 = arg0;
		this.aFloat282 = arg1;
		this.aFloat284 = arg2;
		this.aFloat281 = arg3;
	}

	@OriginalMember(owner = "client!mv", name = "y", descriptor = "(FFFF)V", line = 18)
	public void method26261(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3) {
		this.aFloat283 = arg0;
		this.aFloat282 = arg1;
		this.aFloat284 = arg2;
		this.aFloat281 = arg3;
	}

	@OriginalMember(owner = "client!mv", name = "a", descriptor = "(Lclient!mv;)V", line = 25)
	public void method26259(@OriginalArg(0) Class333 arg0) {
		this.method26251(arg0.aFloat283, arg0.aFloat282, arg0.aFloat284, arg0.aFloat281);
	}

	@OriginalMember(owner = "client!mv", name = "c", descriptor = "(Lclient!mv;)V", line = 25)
	public void method26263(@OriginalArg(0) Class333 arg0) {
		this.method26251(arg0.aFloat283, arg0.aFloat282, arg0.aFloat284, arg0.aFloat281);
	}

	@OriginalMember(owner = "client!mv", name = "z", descriptor = "(Lclient!mv;)V", line = 25)
	public void method26264(@OriginalArg(0) Class333 arg0) {
		this.method26251(arg0.aFloat283, arg0.aFloat282, arg0.aFloat284, arg0.aFloat281);
	}

	@OriginalMember(owner = "client!mv", name = "j", descriptor = "(Lclient!mv;)V", line = 25)
	public void method26265(@OriginalArg(0) Class333 arg0) {
		this.method26251(arg0.aFloat283, arg0.aFloat282, arg0.aFloat284, arg0.aFloat281);
	}

	@OriginalMember(owner = "client!mv", name = "b", descriptor = "(Lclient!mv;)V", line = 25)
	public void method26272(@OriginalArg(0) Class333 arg0) {
		this.method26251(arg0.aFloat283, arg0.aFloat282, arg0.aFloat284, arg0.aFloat281);
	}

	@OriginalMember(owner = "client!mv", name = "g", descriptor = "(I)V", line = 29)
	public void method26253(@OriginalArg(0) int arg0) {
		this.method26251((float) (arg0 >> 16 & 0xFF) * 0.003921569F, (float) (arg0 >> 8 & 0xFF) * 0.003921569F, (float) (arg0 >> 0 & 0xFF) * 0.003921569F, (float) (arg0 >> 24 & 0xFF) * 0.003921569F);
	}

	@OriginalMember(owner = "client!mv", name = "n", descriptor = "(I)V", line = 29)
	public void method26255(@OriginalArg(0) int arg0) {
		this.method26251((float) (arg0 >> 16 & 0xFF) * 0.003921569F, (float) (arg0 >> 8 & 0xFF) * 0.003921569F, (float) (arg0 >> 0 & 0xFF) * 0.003921569F, (float) (arg0 >> 24 & 0xFF) * 0.003921569F);
	}

	@OriginalMember(owner = "client!mv", name = "e", descriptor = "(I)V", line = 29)
	public void method26267(@OriginalArg(0) int arg0) {
		this.method26251((float) (arg0 >> 16 & 0xFF) * 0.003921569F, (float) (arg0 >> 8 & 0xFF) * 0.003921569F, (float) (arg0 >> 0 & 0xFF) * 0.003921569F, (float) (arg0 >> 24 & 0xFF) * 0.003921569F);
	}

	@OriginalMember(owner = "client!mv", name = "r", descriptor = "(I)V", line = 29)
	public void method26268(@OriginalArg(0) int arg0) {
		this.method26251((float) (arg0 >> 16 & 0xFF) * 0.003921569F, (float) (arg0 >> 8 & 0xFF) * 0.003921569F, (float) (arg0 >> 0 & 0xFF) * 0.003921569F, (float) (arg0 >> 24 & 0xFF) * 0.003921569F);
	}

	@OriginalMember(owner = "client!mv", name = "l", descriptor = "()V", line = 33)
	final void method26254() {
		this.aFloat281 = 0.0F;
		this.aFloat284 = 0.0F;
		this.aFloat282 = 0.0F;
		this.aFloat283 = 0.0F;
	}

	@OriginalMember(owner = "client!mv", name = "d", descriptor = "()V", line = 33)
	final void method26269() {
		this.aFloat281 = 0.0F;
		this.aFloat284 = 0.0F;
		this.aFloat282 = 0.0F;
		this.aFloat283 = 0.0F;
	}

	@OriginalMember(owner = "client!mv", name = "q", descriptor = "()V", line = 33)
	final void method26270() {
		this.aFloat281 = 0.0F;
		this.aFloat284 = 0.0F;
		this.aFloat282 = 0.0F;
		this.aFloat283 = 0.0F;
	}

	@OriginalMember(owner = "client!mv", name = "v", descriptor = "()V", line = 40)
	public final void method26250() {
		this.aFloat283 = -this.aFloat283;
		this.aFloat282 = -this.aFloat282;
		this.aFloat284 = -this.aFloat284;
		this.aFloat281 = -this.aFloat281;
	}

	@OriginalMember(owner = "client!mv", name = "h", descriptor = "()V", line = 40)
	public final void method26266() {
		this.aFloat283 = -this.aFloat283;
		this.aFloat282 = -this.aFloat282;
		this.aFloat284 = -this.aFloat284;
		this.aFloat281 = -this.aFloat281;
	}

	@OriginalMember(owner = "client!mv", name = "m", descriptor = "()V", line = 40)
	public final void method26271() {
		this.aFloat283 = -this.aFloat283;
		this.aFloat282 = -this.aFloat282;
		this.aFloat284 = -this.aFloat284;
		this.aFloat281 = -this.aFloat281;
	}

	@OriginalMember(owner = "client!mv", name = "t", descriptor = "(F)V", line = 47)
	public final void method26252(@OriginalArg(0) float arg0) {
		this.aFloat283 *= arg0;
		this.aFloat282 *= arg0;
		this.aFloat284 *= arg0;
		this.aFloat281 *= arg0;
	}

	@OriginalMember(owner = "client!mv", name = "x", descriptor = "(F)V", line = 47)
	public final void method26256(@OriginalArg(0) float arg0) {
		this.aFloat283 *= arg0;
		this.aFloat282 *= arg0;
		this.aFloat284 *= arg0;
		this.aFloat281 *= arg0;
	}

	@OriginalMember(owner = "client!mv", name = "w", descriptor = "(F)V", line = 47)
	public final void method26273(@OriginalArg(0) float arg0) {
		this.aFloat283 *= arg0;
		this.aFloat282 *= arg0;
		this.aFloat284 *= arg0;
		this.aFloat281 *= arg0;
	}

	@OriginalMember(owner = "client!mv", name = "o", descriptor = "(F)V", line = 47)
	public final void method26274(@OriginalArg(0) float arg0) {
		this.aFloat283 *= arg0;
		this.aFloat282 *= arg0;
		this.aFloat284 *= arg0;
		this.aFloat281 *= arg0;
	}

	@OriginalMember(owner = "client!mv", name = "s", descriptor = "(Lclient!mq;)V", line = 54)
	public final void method26257(@OriginalArg(0) Class328 arg0) {
		@Pc(2) float local2 = this.aFloat283;
		@Pc(5) float local5 = this.aFloat282;
		@Pc(8) float local8 = this.aFloat284;
		@Pc(11) float local11 = this.aFloat281;
		this.aFloat283 = arg0.aFloatArray106[0] * local2 + arg0.aFloatArray106[4] * local5 + arg0.aFloatArray106[8] * local8 + arg0.aFloatArray106[12] * local11;
		this.aFloat282 = arg0.aFloatArray106[1] * local2 + arg0.aFloatArray106[5] * local5 + arg0.aFloatArray106[9] * local8 + arg0.aFloatArray106[13] * local11;
		this.aFloat284 = arg0.aFloatArray106[2] * local2 + arg0.aFloatArray106[6] * local5 + arg0.aFloatArray106[10] * local8 + arg0.aFloatArray106[14] * local11;
		this.aFloat281 = arg0.aFloatArray106[3] * local2 + arg0.aFloatArray106[7] * local5 + arg0.aFloatArray106[11] * local8 + arg0.aFloatArray106[15] * local11;
	}

	@OriginalMember(owner = "client!mv", name = "i", descriptor = "(Lclient!mq;)V", line = 54)
	public final void method26258(@OriginalArg(0) Class328 arg0) {
		@Pc(2) float local2 = this.aFloat283;
		@Pc(5) float local5 = this.aFloat282;
		@Pc(8) float local8 = this.aFloat284;
		@Pc(11) float local11 = this.aFloat281;
		this.aFloat283 = arg0.aFloatArray106[0] * local2 + arg0.aFloatArray106[4] * local5 + arg0.aFloatArray106[8] * local8 + arg0.aFloatArray106[12] * local11;
		this.aFloat282 = arg0.aFloatArray106[1] * local2 + arg0.aFloatArray106[5] * local5 + arg0.aFloatArray106[9] * local8 + arg0.aFloatArray106[13] * local11;
		this.aFloat284 = arg0.aFloatArray106[2] * local2 + arg0.aFloatArray106[6] * local5 + arg0.aFloatArray106[10] * local8 + arg0.aFloatArray106[14] * local11;
		this.aFloat281 = arg0.aFloatArray106[3] * local2 + arg0.aFloatArray106[7] * local5 + arg0.aFloatArray106[11] * local8 + arg0.aFloatArray106[15] * local11;
	}

	@OriginalMember(owner = "client!mv", name = "ox", descriptor = "()Ljava/lang/String;", line = 66)
	public String method26249() {
		return this.aFloat283 + "," + this.aFloat282 + "," + this.aFloat284 + "," + this.aFloat281;
	}

	@OriginalMember(owner = "client!mv", name = "toString", descriptor = "()Ljava/lang/String;", line = 66)
	@Override
	public String toString() {
		return this.aFloat283 + "," + this.aFloat282 + "," + this.aFloat284 + "," + this.aFloat281;
	}

	@OriginalMember(owner = "client!mv", name = "ou", descriptor = "()Ljava/lang/String;", line = 66)
	public String method26262() {
		return this.aFloat283 + "," + this.aFloat282 + "," + this.aFloat284 + "," + this.aFloat281;
	}
}
