package com.jagex;

import java.util.Arrays;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oi")
public final class Class442 {

	@OriginalMember(owner = "client!oi", name = "c", descriptor = "Lclient!oi;")
	public static final Class442 aClass442_97 = new Class442();

	@OriginalMember(owner = "client!oi", name = "p", descriptor = "[F")
	public float[] aFloatArray109 = new float[16];

	@OriginalMember(owner = "client!oi", name = "<init>", descriptor = "()V", line = 9)
	public Class442() {
		this.method28951();
	}

	@OriginalMember(owner = "client!oi", name = "<init>", descriptor = "(Lclient!oi;)V", line = 13)
	public Class442(@OriginalArg(0) Class442 arg0) {
		this.method28954(arg0);
	}

	@OriginalMember(owner = "client!oi", name = "p", descriptor = "()V", line = 18)
	public void method28951() {
		this.aFloatArray109[0] = 1.0F;
		this.aFloatArray109[1] = 0.0F;
		this.aFloatArray109[2] = 0.0F;
		this.aFloatArray109[3] = 0.0F;
		this.aFloatArray109[4] = 0.0F;
		this.aFloatArray109[5] = 1.0F;
		this.aFloatArray109[6] = 0.0F;
		this.aFloatArray109[7] = 0.0F;
		this.aFloatArray109[8] = 0.0F;
		this.aFloatArray109[9] = 0.0F;
		this.aFloatArray109[10] = 1.0F;
		this.aFloatArray109[11] = 0.0F;
		this.aFloatArray109[12] = 0.0F;
		this.aFloatArray109[13] = 0.0F;
		this.aFloatArray109[14] = 0.0F;
		this.aFloatArray109[15] = 1.0F;
	}

	@OriginalMember(owner = "client!oi", name = "ac", descriptor = "()V", line = 18)
	public void method28952() {
		this.aFloatArray109[0] = 1.0F;
		this.aFloatArray109[1] = 0.0F;
		this.aFloatArray109[2] = 0.0F;
		this.aFloatArray109[3] = 0.0F;
		this.aFloatArray109[4] = 0.0F;
		this.aFloatArray109[5] = 1.0F;
		this.aFloatArray109[6] = 0.0F;
		this.aFloatArray109[7] = 0.0F;
		this.aFloatArray109[8] = 0.0F;
		this.aFloatArray109[9] = 0.0F;
		this.aFloatArray109[10] = 1.0F;
		this.aFloatArray109[11] = 0.0F;
		this.aFloatArray109[12] = 0.0F;
		this.aFloatArray109[13] = 0.0F;
		this.aFloatArray109[14] = 0.0F;
		this.aFloatArray109[15] = 1.0F;
	}

	@OriginalMember(owner = "client!oi", name = "av", descriptor = "()V", line = 18)
	public void method28953() {
		this.aFloatArray109[0] = 1.0F;
		this.aFloatArray109[1] = 0.0F;
		this.aFloatArray109[2] = 0.0F;
		this.aFloatArray109[3] = 0.0F;
		this.aFloatArray109[4] = 0.0F;
		this.aFloatArray109[5] = 1.0F;
		this.aFloatArray109[6] = 0.0F;
		this.aFloatArray109[7] = 0.0F;
		this.aFloatArray109[8] = 0.0F;
		this.aFloatArray109[9] = 0.0F;
		this.aFloatArray109[10] = 1.0F;
		this.aFloatArray109[11] = 0.0F;
		this.aFloatArray109[12] = 0.0F;
		this.aFloatArray109[13] = 0.0F;
		this.aFloatArray109[14] = 0.0F;
		this.aFloatArray109[15] = 1.0F;
	}

	@OriginalMember(owner = "client!oi", name = "c", descriptor = "(Lclient!oi;)V", line = 37)
	public void method28954(@OriginalArg(0) Class442 arg0) {
		System.arraycopy(arg0.aFloatArray109, 0, this.aFloatArray109, 0, 16);
	}

	@OriginalMember(owner = "client!oi", name = "at", descriptor = "(Lclient!oi;)V", line = 37)
	public void method28955(@OriginalArg(0) Class442 arg0) {
		System.arraycopy(arg0.aFloatArray109, 0, this.aFloatArray109, 0, 16);
	}

	@OriginalMember(owner = "client!oi", name = "v", descriptor = "(Lclient!oi;)V", line = 41)
	public void method28956(@OriginalArg(0) Class442 arg0) {
		System.arraycopy(arg0.aFloatArray109, 0, this.aFloatArray109, 0, 11);
		this.aFloatArray109[3] = 0.0F;
		this.aFloatArray109[7] = 0.0F;
		this.aFloatArray109[11] = 0.0F;
		this.aFloatArray109[12] = 0.0F;
		this.aFloatArray109[13] = 0.0F;
		this.aFloatArray109[14] = 0.0F;
		this.aFloatArray109[15] = 1.0F;
	}

	@OriginalMember(owner = "client!oi", name = "ae", descriptor = "(Lclient!oi;)V", line = 41)
	public void method28957(@OriginalArg(0) Class442 arg0) {
		System.arraycopy(arg0.aFloatArray109, 0, this.aFloatArray109, 0, 11);
		this.aFloatArray109[3] = 0.0F;
		this.aFloatArray109[7] = 0.0F;
		this.aFloatArray109[11] = 0.0F;
		this.aFloatArray109[12] = 0.0F;
		this.aFloatArray109[13] = 0.0F;
		this.aFloatArray109[14] = 0.0F;
		this.aFloatArray109[15] = 1.0F;
	}

	@OriginalMember(owner = "client!oi", name = "ah", descriptor = "(Lclient!oi;)V", line = 41)
	public void method28958(@OriginalArg(0) Class442 arg0) {
		System.arraycopy(arg0.aFloatArray109, 0, this.aFloatArray109, 0, 11);
		this.aFloatArray109[3] = 0.0F;
		this.aFloatArray109[7] = 0.0F;
		this.aFloatArray109[11] = 0.0F;
		this.aFloatArray109[12] = 0.0F;
		this.aFloatArray109[13] = 0.0F;
		this.aFloatArray109[14] = 0.0F;
		this.aFloatArray109[15] = 1.0F;
	}

	@OriginalMember(owner = "client!oi", name = "as", descriptor = "(Lclient!oi;)V", line = 41)
	public void method28959(@OriginalArg(0) Class442 arg0) {
		System.arraycopy(arg0.aFloatArray109, 0, this.aFloatArray109, 0, 11);
		this.aFloatArray109[3] = 0.0F;
		this.aFloatArray109[7] = 0.0F;
		this.aFloatArray109[11] = 0.0F;
		this.aFloatArray109[12] = 0.0F;
		this.aFloatArray109[13] = 0.0F;
		this.aFloatArray109[14] = 0.0F;
		this.aFloatArray109[15] = 1.0F;
	}

	@OriginalMember(owner = "client!oi", name = "l", descriptor = "(Lclient!oi;Lclient!oi;)V", line = 52)
	public void method28960(@OriginalArg(0) Class442 arg0, @OriginalArg(1) Class442 arg1) {
		@Pc(39) float local39 = arg0.aFloatArray109[0] * arg1.aFloatArray109[0] + arg0.aFloatArray109[1] * arg1.aFloatArray109[4] + arg0.aFloatArray109[2] * arg1.aFloatArray109[8] + arg0.aFloatArray109[3] * arg1.aFloatArray109[12];
		@Pc(79) float local79 = arg0.aFloatArray109[0] * arg1.aFloatArray109[1] + arg0.aFloatArray109[1] * arg1.aFloatArray109[5] + arg0.aFloatArray109[2] * arg1.aFloatArray109[9] + arg0.aFloatArray109[3] * arg1.aFloatArray109[13];
		@Pc(119) float local119 = arg0.aFloatArray109[0] * arg1.aFloatArray109[2] + arg0.aFloatArray109[1] * arg1.aFloatArray109[6] + arg0.aFloatArray109[2] * arg1.aFloatArray109[10] + arg0.aFloatArray109[3] * arg1.aFloatArray109[14];
		@Pc(159) float local159 = arg0.aFloatArray109[0] * arg1.aFloatArray109[3] + arg0.aFloatArray109[1] * arg1.aFloatArray109[7] + arg0.aFloatArray109[2] * arg1.aFloatArray109[11] + arg0.aFloatArray109[3] * arg1.aFloatArray109[15];
		@Pc(199) float local199 = arg0.aFloatArray109[4] * arg1.aFloatArray109[0] + arg0.aFloatArray109[5] * arg1.aFloatArray109[4] + arg0.aFloatArray109[6] * arg1.aFloatArray109[8] + arg0.aFloatArray109[7] * arg1.aFloatArray109[12];
		@Pc(239) float local239 = arg0.aFloatArray109[4] * arg1.aFloatArray109[1] + arg0.aFloatArray109[5] * arg1.aFloatArray109[5] + arg0.aFloatArray109[6] * arg1.aFloatArray109[9] + arg0.aFloatArray109[7] * arg1.aFloatArray109[13];
		@Pc(279) float local279 = arg0.aFloatArray109[4] * arg1.aFloatArray109[2] + arg0.aFloatArray109[5] * arg1.aFloatArray109[6] + arg0.aFloatArray109[6] * arg1.aFloatArray109[10] + arg0.aFloatArray109[7] * arg1.aFloatArray109[14];
		@Pc(319) float local319 = arg0.aFloatArray109[4] * arg1.aFloatArray109[3] + arg0.aFloatArray109[5] * arg1.aFloatArray109[7] + arg0.aFloatArray109[6] * arg1.aFloatArray109[11] + arg0.aFloatArray109[7] * arg1.aFloatArray109[15];
		@Pc(359) float local359 = arg0.aFloatArray109[8] * arg1.aFloatArray109[0] + arg0.aFloatArray109[9] * arg1.aFloatArray109[4] + arg0.aFloatArray109[10] * arg1.aFloatArray109[8] + arg0.aFloatArray109[11] * arg1.aFloatArray109[12];
		@Pc(399) float local399 = arg0.aFloatArray109[8] * arg1.aFloatArray109[1] + arg0.aFloatArray109[9] * arg1.aFloatArray109[5] + arg0.aFloatArray109[10] * arg1.aFloatArray109[9] + arg0.aFloatArray109[11] * arg1.aFloatArray109[13];
		@Pc(439) float local439 = arg0.aFloatArray109[8] * arg1.aFloatArray109[2] + arg0.aFloatArray109[9] * arg1.aFloatArray109[6] + arg0.aFloatArray109[10] * arg1.aFloatArray109[10] + arg0.aFloatArray109[11] * arg1.aFloatArray109[14];
		@Pc(479) float local479 = arg0.aFloatArray109[8] * arg1.aFloatArray109[3] + arg0.aFloatArray109[9] * arg1.aFloatArray109[7] + arg0.aFloatArray109[10] * arg1.aFloatArray109[11] + arg0.aFloatArray109[11] * arg1.aFloatArray109[15];
		@Pc(519) float local519 = arg0.aFloatArray109[12] * arg1.aFloatArray109[0] + arg0.aFloatArray109[13] * arg1.aFloatArray109[4] + arg0.aFloatArray109[14] * arg1.aFloatArray109[8] + arg0.aFloatArray109[15] * arg1.aFloatArray109[12];
		@Pc(559) float local559 = arg0.aFloatArray109[12] * arg1.aFloatArray109[1] + arg0.aFloatArray109[13] * arg1.aFloatArray109[5] + arg0.aFloatArray109[14] * arg1.aFloatArray109[9] + arg0.aFloatArray109[15] * arg1.aFloatArray109[13];
		@Pc(599) float local599 = arg0.aFloatArray109[12] * arg1.aFloatArray109[2] + arg0.aFloatArray109[13] * arg1.aFloatArray109[6] + arg0.aFloatArray109[14] * arg1.aFloatArray109[10] + arg0.aFloatArray109[15] * arg1.aFloatArray109[14];
		@Pc(639) float local639 = arg0.aFloatArray109[12] * arg1.aFloatArray109[3] + arg0.aFloatArray109[13] * arg1.aFloatArray109[7] + arg0.aFloatArray109[14] * arg1.aFloatArray109[11] + arg0.aFloatArray109[15] * arg1.aFloatArray109[15];
		this.aFloatArray109[0] = local39;
		this.aFloatArray109[1] = local79;
		this.aFloatArray109[2] = local119;
		this.aFloatArray109[3] = local159;
		this.aFloatArray109[4] = local199;
		this.aFloatArray109[5] = local239;
		this.aFloatArray109[6] = local279;
		this.aFloatArray109[7] = local319;
		this.aFloatArray109[8] = local359;
		this.aFloatArray109[9] = local399;
		this.aFloatArray109[10] = local439;
		this.aFloatArray109[11] = local479;
		this.aFloatArray109[12] = local519;
		this.aFloatArray109[13] = local559;
		this.aFloatArray109[14] = local599;
		this.aFloatArray109[15] = local639;
	}

	@OriginalMember(owner = "client!oi", name = "aq", descriptor = "(Lclient!oi;Lclient!oi;)V", line = 52)
	public void method28961(@OriginalArg(0) Class442 arg0, @OriginalArg(1) Class442 arg1) {
		@Pc(39) float local39 = arg0.aFloatArray109[0] * arg1.aFloatArray109[0] + arg0.aFloatArray109[1] * arg1.aFloatArray109[4] + arg0.aFloatArray109[2] * arg1.aFloatArray109[8] + arg0.aFloatArray109[3] * arg1.aFloatArray109[12];
		@Pc(79) float local79 = arg0.aFloatArray109[0] * arg1.aFloatArray109[1] + arg0.aFloatArray109[1] * arg1.aFloatArray109[5] + arg0.aFloatArray109[2] * arg1.aFloatArray109[9] + arg0.aFloatArray109[3] * arg1.aFloatArray109[13];
		@Pc(119) float local119 = arg0.aFloatArray109[0] * arg1.aFloatArray109[2] + arg0.aFloatArray109[1] * arg1.aFloatArray109[6] + arg0.aFloatArray109[2] * arg1.aFloatArray109[10] + arg0.aFloatArray109[3] * arg1.aFloatArray109[14];
		@Pc(159) float local159 = arg0.aFloatArray109[0] * arg1.aFloatArray109[3] + arg0.aFloatArray109[1] * arg1.aFloatArray109[7] + arg0.aFloatArray109[2] * arg1.aFloatArray109[11] + arg0.aFloatArray109[3] * arg1.aFloatArray109[15];
		@Pc(199) float local199 = arg0.aFloatArray109[4] * arg1.aFloatArray109[0] + arg0.aFloatArray109[5] * arg1.aFloatArray109[4] + arg0.aFloatArray109[6] * arg1.aFloatArray109[8] + arg0.aFloatArray109[7] * arg1.aFloatArray109[12];
		@Pc(239) float local239 = arg0.aFloatArray109[4] * arg1.aFloatArray109[1] + arg0.aFloatArray109[5] * arg1.aFloatArray109[5] + arg0.aFloatArray109[6] * arg1.aFloatArray109[9] + arg0.aFloatArray109[7] * arg1.aFloatArray109[13];
		@Pc(279) float local279 = arg0.aFloatArray109[4] * arg1.aFloatArray109[2] + arg0.aFloatArray109[5] * arg1.aFloatArray109[6] + arg0.aFloatArray109[6] * arg1.aFloatArray109[10] + arg0.aFloatArray109[7] * arg1.aFloatArray109[14];
		@Pc(319) float local319 = arg0.aFloatArray109[4] * arg1.aFloatArray109[3] + arg0.aFloatArray109[5] * arg1.aFloatArray109[7] + arg0.aFloatArray109[6] * arg1.aFloatArray109[11] + arg0.aFloatArray109[7] * arg1.aFloatArray109[15];
		@Pc(359) float local359 = arg0.aFloatArray109[8] * arg1.aFloatArray109[0] + arg0.aFloatArray109[9] * arg1.aFloatArray109[4] + arg0.aFloatArray109[10] * arg1.aFloatArray109[8] + arg0.aFloatArray109[11] * arg1.aFloatArray109[12];
		@Pc(399) float local399 = arg0.aFloatArray109[8] * arg1.aFloatArray109[1] + arg0.aFloatArray109[9] * arg1.aFloatArray109[5] + arg0.aFloatArray109[10] * arg1.aFloatArray109[9] + arg0.aFloatArray109[11] * arg1.aFloatArray109[13];
		@Pc(439) float local439 = arg0.aFloatArray109[8] * arg1.aFloatArray109[2] + arg0.aFloatArray109[9] * arg1.aFloatArray109[6] + arg0.aFloatArray109[10] * arg1.aFloatArray109[10] + arg0.aFloatArray109[11] * arg1.aFloatArray109[14];
		@Pc(479) float local479 = arg0.aFloatArray109[8] * arg1.aFloatArray109[3] + arg0.aFloatArray109[9] * arg1.aFloatArray109[7] + arg0.aFloatArray109[10] * arg1.aFloatArray109[11] + arg0.aFloatArray109[11] * arg1.aFloatArray109[15];
		@Pc(519) float local519 = arg0.aFloatArray109[12] * arg1.aFloatArray109[0] + arg0.aFloatArray109[13] * arg1.aFloatArray109[4] + arg0.aFloatArray109[14] * arg1.aFloatArray109[8] + arg0.aFloatArray109[15] * arg1.aFloatArray109[12];
		@Pc(559) float local559 = arg0.aFloatArray109[12] * arg1.aFloatArray109[1] + arg0.aFloatArray109[13] * arg1.aFloatArray109[5] + arg0.aFloatArray109[14] * arg1.aFloatArray109[9] + arg0.aFloatArray109[15] * arg1.aFloatArray109[13];
		@Pc(599) float local599 = arg0.aFloatArray109[12] * arg1.aFloatArray109[2] + arg0.aFloatArray109[13] * arg1.aFloatArray109[6] + arg0.aFloatArray109[14] * arg1.aFloatArray109[10] + arg0.aFloatArray109[15] * arg1.aFloatArray109[14];
		@Pc(639) float local639 = arg0.aFloatArray109[12] * arg1.aFloatArray109[3] + arg0.aFloatArray109[13] * arg1.aFloatArray109[7] + arg0.aFloatArray109[14] * arg1.aFloatArray109[11] + arg0.aFloatArray109[15] * arg1.aFloatArray109[15];
		this.aFloatArray109[0] = local39;
		this.aFloatArray109[1] = local79;
		this.aFloatArray109[2] = local119;
		this.aFloatArray109[3] = local159;
		this.aFloatArray109[4] = local199;
		this.aFloatArray109[5] = local239;
		this.aFloatArray109[6] = local279;
		this.aFloatArray109[7] = local319;
		this.aFloatArray109[8] = local359;
		this.aFloatArray109[9] = local399;
		this.aFloatArray109[10] = local439;
		this.aFloatArray109[11] = local479;
		this.aFloatArray109[12] = local519;
		this.aFloatArray109[13] = local559;
		this.aFloatArray109[14] = local599;
		this.aFloatArray109[15] = local639;
	}

	@OriginalMember(owner = "client!oi", name = "am", descriptor = "(Lclient!oi;Lclient!oi;)V", line = 52)
	public void method28962(@OriginalArg(0) Class442 arg0, @OriginalArg(1) Class442 arg1) {
		@Pc(39) float local39 = arg0.aFloatArray109[0] * arg1.aFloatArray109[0] + arg0.aFloatArray109[1] * arg1.aFloatArray109[4] + arg0.aFloatArray109[2] * arg1.aFloatArray109[8] + arg0.aFloatArray109[3] * arg1.aFloatArray109[12];
		@Pc(79) float local79 = arg0.aFloatArray109[0] * arg1.aFloatArray109[1] + arg0.aFloatArray109[1] * arg1.aFloatArray109[5] + arg0.aFloatArray109[2] * arg1.aFloatArray109[9] + arg0.aFloatArray109[3] * arg1.aFloatArray109[13];
		@Pc(119) float local119 = arg0.aFloatArray109[0] * arg1.aFloatArray109[2] + arg0.aFloatArray109[1] * arg1.aFloatArray109[6] + arg0.aFloatArray109[2] * arg1.aFloatArray109[10] + arg0.aFloatArray109[3] * arg1.aFloatArray109[14];
		@Pc(159) float local159 = arg0.aFloatArray109[0] * arg1.aFloatArray109[3] + arg0.aFloatArray109[1] * arg1.aFloatArray109[7] + arg0.aFloatArray109[2] * arg1.aFloatArray109[11] + arg0.aFloatArray109[3] * arg1.aFloatArray109[15];
		@Pc(199) float local199 = arg0.aFloatArray109[4] * arg1.aFloatArray109[0] + arg0.aFloatArray109[5] * arg1.aFloatArray109[4] + arg0.aFloatArray109[6] * arg1.aFloatArray109[8] + arg0.aFloatArray109[7] * arg1.aFloatArray109[12];
		@Pc(239) float local239 = arg0.aFloatArray109[4] * arg1.aFloatArray109[1] + arg0.aFloatArray109[5] * arg1.aFloatArray109[5] + arg0.aFloatArray109[6] * arg1.aFloatArray109[9] + arg0.aFloatArray109[7] * arg1.aFloatArray109[13];
		@Pc(279) float local279 = arg0.aFloatArray109[4] * arg1.aFloatArray109[2] + arg0.aFloatArray109[5] * arg1.aFloatArray109[6] + arg0.aFloatArray109[6] * arg1.aFloatArray109[10] + arg0.aFloatArray109[7] * arg1.aFloatArray109[14];
		@Pc(319) float local319 = arg0.aFloatArray109[4] * arg1.aFloatArray109[3] + arg0.aFloatArray109[5] * arg1.aFloatArray109[7] + arg0.aFloatArray109[6] * arg1.aFloatArray109[11] + arg0.aFloatArray109[7] * arg1.aFloatArray109[15];
		@Pc(359) float local359 = arg0.aFloatArray109[8] * arg1.aFloatArray109[0] + arg0.aFloatArray109[9] * arg1.aFloatArray109[4] + arg0.aFloatArray109[10] * arg1.aFloatArray109[8] + arg0.aFloatArray109[11] * arg1.aFloatArray109[12];
		@Pc(399) float local399 = arg0.aFloatArray109[8] * arg1.aFloatArray109[1] + arg0.aFloatArray109[9] * arg1.aFloatArray109[5] + arg0.aFloatArray109[10] * arg1.aFloatArray109[9] + arg0.aFloatArray109[11] * arg1.aFloatArray109[13];
		@Pc(439) float local439 = arg0.aFloatArray109[8] * arg1.aFloatArray109[2] + arg0.aFloatArray109[9] * arg1.aFloatArray109[6] + arg0.aFloatArray109[10] * arg1.aFloatArray109[10] + arg0.aFloatArray109[11] * arg1.aFloatArray109[14];
		@Pc(479) float local479 = arg0.aFloatArray109[8] * arg1.aFloatArray109[3] + arg0.aFloatArray109[9] * arg1.aFloatArray109[7] + arg0.aFloatArray109[10] * arg1.aFloatArray109[11] + arg0.aFloatArray109[11] * arg1.aFloatArray109[15];
		@Pc(519) float local519 = arg0.aFloatArray109[12] * arg1.aFloatArray109[0] + arg0.aFloatArray109[13] * arg1.aFloatArray109[4] + arg0.aFloatArray109[14] * arg1.aFloatArray109[8] + arg0.aFloatArray109[15] * arg1.aFloatArray109[12];
		@Pc(559) float local559 = arg0.aFloatArray109[12] * arg1.aFloatArray109[1] + arg0.aFloatArray109[13] * arg1.aFloatArray109[5] + arg0.aFloatArray109[14] * arg1.aFloatArray109[9] + arg0.aFloatArray109[15] * arg1.aFloatArray109[13];
		@Pc(599) float local599 = arg0.aFloatArray109[12] * arg1.aFloatArray109[2] + arg0.aFloatArray109[13] * arg1.aFloatArray109[6] + arg0.aFloatArray109[14] * arg1.aFloatArray109[10] + arg0.aFloatArray109[15] * arg1.aFloatArray109[14];
		@Pc(639) float local639 = arg0.aFloatArray109[12] * arg1.aFloatArray109[3] + arg0.aFloatArray109[13] * arg1.aFloatArray109[7] + arg0.aFloatArray109[14] * arg1.aFloatArray109[11] + arg0.aFloatArray109[15] * arg1.aFloatArray109[15];
		this.aFloatArray109[0] = local39;
		this.aFloatArray109[1] = local79;
		this.aFloatArray109[2] = local119;
		this.aFloatArray109[3] = local159;
		this.aFloatArray109[4] = local199;
		this.aFloatArray109[5] = local239;
		this.aFloatArray109[6] = local279;
		this.aFloatArray109[7] = local319;
		this.aFloatArray109[8] = local359;
		this.aFloatArray109[9] = local399;
		this.aFloatArray109[10] = local439;
		this.aFloatArray109[11] = local479;
		this.aFloatArray109[12] = local519;
		this.aFloatArray109[13] = local559;
		this.aFloatArray109[14] = local599;
		this.aFloatArray109[15] = local639;
	}

	@OriginalMember(owner = "client!oi", name = "ay", descriptor = "(Lclient!oi;Lclient!oi;)V", line = 52)
	public void method28963(@OriginalArg(0) Class442 arg0, @OriginalArg(1) Class442 arg1) {
		@Pc(39) float local39 = arg0.aFloatArray109[0] * arg1.aFloatArray109[0] + arg0.aFloatArray109[1] * arg1.aFloatArray109[4] + arg0.aFloatArray109[2] * arg1.aFloatArray109[8] + arg0.aFloatArray109[3] * arg1.aFloatArray109[12];
		@Pc(79) float local79 = arg0.aFloatArray109[0] * arg1.aFloatArray109[1] + arg0.aFloatArray109[1] * arg1.aFloatArray109[5] + arg0.aFloatArray109[2] * arg1.aFloatArray109[9] + arg0.aFloatArray109[3] * arg1.aFloatArray109[13];
		@Pc(119) float local119 = arg0.aFloatArray109[0] * arg1.aFloatArray109[2] + arg0.aFloatArray109[1] * arg1.aFloatArray109[6] + arg0.aFloatArray109[2] * arg1.aFloatArray109[10] + arg0.aFloatArray109[3] * arg1.aFloatArray109[14];
		@Pc(159) float local159 = arg0.aFloatArray109[0] * arg1.aFloatArray109[3] + arg0.aFloatArray109[1] * arg1.aFloatArray109[7] + arg0.aFloatArray109[2] * arg1.aFloatArray109[11] + arg0.aFloatArray109[3] * arg1.aFloatArray109[15];
		@Pc(199) float local199 = arg0.aFloatArray109[4] * arg1.aFloatArray109[0] + arg0.aFloatArray109[5] * arg1.aFloatArray109[4] + arg0.aFloatArray109[6] * arg1.aFloatArray109[8] + arg0.aFloatArray109[7] * arg1.aFloatArray109[12];
		@Pc(239) float local239 = arg0.aFloatArray109[4] * arg1.aFloatArray109[1] + arg0.aFloatArray109[5] * arg1.aFloatArray109[5] + arg0.aFloatArray109[6] * arg1.aFloatArray109[9] + arg0.aFloatArray109[7] * arg1.aFloatArray109[13];
		@Pc(279) float local279 = arg0.aFloatArray109[4] * arg1.aFloatArray109[2] + arg0.aFloatArray109[5] * arg1.aFloatArray109[6] + arg0.aFloatArray109[6] * arg1.aFloatArray109[10] + arg0.aFloatArray109[7] * arg1.aFloatArray109[14];
		@Pc(319) float local319 = arg0.aFloatArray109[4] * arg1.aFloatArray109[3] + arg0.aFloatArray109[5] * arg1.aFloatArray109[7] + arg0.aFloatArray109[6] * arg1.aFloatArray109[11] + arg0.aFloatArray109[7] * arg1.aFloatArray109[15];
		@Pc(359) float local359 = arg0.aFloatArray109[8] * arg1.aFloatArray109[0] + arg0.aFloatArray109[9] * arg1.aFloatArray109[4] + arg0.aFloatArray109[10] * arg1.aFloatArray109[8] + arg0.aFloatArray109[11] * arg1.aFloatArray109[12];
		@Pc(399) float local399 = arg0.aFloatArray109[8] * arg1.aFloatArray109[1] + arg0.aFloatArray109[9] * arg1.aFloatArray109[5] + arg0.aFloatArray109[10] * arg1.aFloatArray109[9] + arg0.aFloatArray109[11] * arg1.aFloatArray109[13];
		@Pc(439) float local439 = arg0.aFloatArray109[8] * arg1.aFloatArray109[2] + arg0.aFloatArray109[9] * arg1.aFloatArray109[6] + arg0.aFloatArray109[10] * arg1.aFloatArray109[10] + arg0.aFloatArray109[11] * arg1.aFloatArray109[14];
		@Pc(479) float local479 = arg0.aFloatArray109[8] * arg1.aFloatArray109[3] + arg0.aFloatArray109[9] * arg1.aFloatArray109[7] + arg0.aFloatArray109[10] * arg1.aFloatArray109[11] + arg0.aFloatArray109[11] * arg1.aFloatArray109[15];
		@Pc(519) float local519 = arg0.aFloatArray109[12] * arg1.aFloatArray109[0] + arg0.aFloatArray109[13] * arg1.aFloatArray109[4] + arg0.aFloatArray109[14] * arg1.aFloatArray109[8] + arg0.aFloatArray109[15] * arg1.aFloatArray109[12];
		@Pc(559) float local559 = arg0.aFloatArray109[12] * arg1.aFloatArray109[1] + arg0.aFloatArray109[13] * arg1.aFloatArray109[5] + arg0.aFloatArray109[14] * arg1.aFloatArray109[9] + arg0.aFloatArray109[15] * arg1.aFloatArray109[13];
		@Pc(599) float local599 = arg0.aFloatArray109[12] * arg1.aFloatArray109[2] + arg0.aFloatArray109[13] * arg1.aFloatArray109[6] + arg0.aFloatArray109[14] * arg1.aFloatArray109[10] + arg0.aFloatArray109[15] * arg1.aFloatArray109[14];
		@Pc(639) float local639 = arg0.aFloatArray109[12] * arg1.aFloatArray109[3] + arg0.aFloatArray109[13] * arg1.aFloatArray109[7] + arg0.aFloatArray109[14] * arg1.aFloatArray109[11] + arg0.aFloatArray109[15] * arg1.aFloatArray109[15];
		this.aFloatArray109[0] = local39;
		this.aFloatArray109[1] = local79;
		this.aFloatArray109[2] = local119;
		this.aFloatArray109[3] = local159;
		this.aFloatArray109[4] = local199;
		this.aFloatArray109[5] = local239;
		this.aFloatArray109[6] = local279;
		this.aFloatArray109[7] = local319;
		this.aFloatArray109[8] = local359;
		this.aFloatArray109[9] = local399;
		this.aFloatArray109[10] = local439;
		this.aFloatArray109[11] = local479;
		this.aFloatArray109[12] = local519;
		this.aFloatArray109[13] = local559;
		this.aFloatArray109[14] = local599;
		this.aFloatArray109[15] = local639;
	}

	@OriginalMember(owner = "client!oi", name = "af", descriptor = "(Lclient!oi;Lclient!oi;)V", line = 52)
	public void method28964(@OriginalArg(0) Class442 arg0, @OriginalArg(1) Class442 arg1) {
		@Pc(39) float local39 = arg0.aFloatArray109[0] * arg1.aFloatArray109[0] + arg0.aFloatArray109[1] * arg1.aFloatArray109[4] + arg0.aFloatArray109[2] * arg1.aFloatArray109[8] + arg0.aFloatArray109[3] * arg1.aFloatArray109[12];
		@Pc(79) float local79 = arg0.aFloatArray109[0] * arg1.aFloatArray109[1] + arg0.aFloatArray109[1] * arg1.aFloatArray109[5] + arg0.aFloatArray109[2] * arg1.aFloatArray109[9] + arg0.aFloatArray109[3] * arg1.aFloatArray109[13];
		@Pc(119) float local119 = arg0.aFloatArray109[0] * arg1.aFloatArray109[2] + arg0.aFloatArray109[1] * arg1.aFloatArray109[6] + arg0.aFloatArray109[2] * arg1.aFloatArray109[10] + arg0.aFloatArray109[3] * arg1.aFloatArray109[14];
		@Pc(159) float local159 = arg0.aFloatArray109[0] * arg1.aFloatArray109[3] + arg0.aFloatArray109[1] * arg1.aFloatArray109[7] + arg0.aFloatArray109[2] * arg1.aFloatArray109[11] + arg0.aFloatArray109[3] * arg1.aFloatArray109[15];
		@Pc(199) float local199 = arg0.aFloatArray109[4] * arg1.aFloatArray109[0] + arg0.aFloatArray109[5] * arg1.aFloatArray109[4] + arg0.aFloatArray109[6] * arg1.aFloatArray109[8] + arg0.aFloatArray109[7] * arg1.aFloatArray109[12];
		@Pc(239) float local239 = arg0.aFloatArray109[4] * arg1.aFloatArray109[1] + arg0.aFloatArray109[5] * arg1.aFloatArray109[5] + arg0.aFloatArray109[6] * arg1.aFloatArray109[9] + arg0.aFloatArray109[7] * arg1.aFloatArray109[13];
		@Pc(279) float local279 = arg0.aFloatArray109[4] * arg1.aFloatArray109[2] + arg0.aFloatArray109[5] * arg1.aFloatArray109[6] + arg0.aFloatArray109[6] * arg1.aFloatArray109[10] + arg0.aFloatArray109[7] * arg1.aFloatArray109[14];
		@Pc(319) float local319 = arg0.aFloatArray109[4] * arg1.aFloatArray109[3] + arg0.aFloatArray109[5] * arg1.aFloatArray109[7] + arg0.aFloatArray109[6] * arg1.aFloatArray109[11] + arg0.aFloatArray109[7] * arg1.aFloatArray109[15];
		@Pc(359) float local359 = arg0.aFloatArray109[8] * arg1.aFloatArray109[0] + arg0.aFloatArray109[9] * arg1.aFloatArray109[4] + arg0.aFloatArray109[10] * arg1.aFloatArray109[8] + arg0.aFloatArray109[11] * arg1.aFloatArray109[12];
		@Pc(399) float local399 = arg0.aFloatArray109[8] * arg1.aFloatArray109[1] + arg0.aFloatArray109[9] * arg1.aFloatArray109[5] + arg0.aFloatArray109[10] * arg1.aFloatArray109[9] + arg0.aFloatArray109[11] * arg1.aFloatArray109[13];
		@Pc(439) float local439 = arg0.aFloatArray109[8] * arg1.aFloatArray109[2] + arg0.aFloatArray109[9] * arg1.aFloatArray109[6] + arg0.aFloatArray109[10] * arg1.aFloatArray109[10] + arg0.aFloatArray109[11] * arg1.aFloatArray109[14];
		@Pc(479) float local479 = arg0.aFloatArray109[8] * arg1.aFloatArray109[3] + arg0.aFloatArray109[9] * arg1.aFloatArray109[7] + arg0.aFloatArray109[10] * arg1.aFloatArray109[11] + arg0.aFloatArray109[11] * arg1.aFloatArray109[15];
		@Pc(519) float local519 = arg0.aFloatArray109[12] * arg1.aFloatArray109[0] + arg0.aFloatArray109[13] * arg1.aFloatArray109[4] + arg0.aFloatArray109[14] * arg1.aFloatArray109[8] + arg0.aFloatArray109[15] * arg1.aFloatArray109[12];
		@Pc(559) float local559 = arg0.aFloatArray109[12] * arg1.aFloatArray109[1] + arg0.aFloatArray109[13] * arg1.aFloatArray109[5] + arg0.aFloatArray109[14] * arg1.aFloatArray109[9] + arg0.aFloatArray109[15] * arg1.aFloatArray109[13];
		@Pc(599) float local599 = arg0.aFloatArray109[12] * arg1.aFloatArray109[2] + arg0.aFloatArray109[13] * arg1.aFloatArray109[6] + arg0.aFloatArray109[14] * arg1.aFloatArray109[10] + arg0.aFloatArray109[15] * arg1.aFloatArray109[14];
		@Pc(639) float local639 = arg0.aFloatArray109[12] * arg1.aFloatArray109[3] + arg0.aFloatArray109[13] * arg1.aFloatArray109[7] + arg0.aFloatArray109[14] * arg1.aFloatArray109[11] + arg0.aFloatArray109[15] * arg1.aFloatArray109[15];
		this.aFloatArray109[0] = local39;
		this.aFloatArray109[1] = local79;
		this.aFloatArray109[2] = local119;
		this.aFloatArray109[3] = local159;
		this.aFloatArray109[4] = local199;
		this.aFloatArray109[5] = local239;
		this.aFloatArray109[6] = local279;
		this.aFloatArray109[7] = local319;
		this.aFloatArray109[8] = local359;
		this.aFloatArray109[9] = local399;
		this.aFloatArray109[10] = local439;
		this.aFloatArray109[11] = local479;
		this.aFloatArray109[12] = local519;
		this.aFloatArray109[13] = local559;
		this.aFloatArray109[14] = local599;
		this.aFloatArray109[15] = local639;
	}

	@OriginalMember(owner = "client!oi", name = "y", descriptor = "(Lclient!oi;)V", line = 87)
	public void method28965(@OriginalArg(0) Class442 arg0) {
		@Pc(39) float local39 = this.aFloatArray109[0] * arg0.aFloatArray109[0] + this.aFloatArray109[1] * arg0.aFloatArray109[4] + this.aFloatArray109[2] * arg0.aFloatArray109[8] + this.aFloatArray109[3] * arg0.aFloatArray109[12];
		@Pc(79) float local79 = this.aFloatArray109[0] * arg0.aFloatArray109[1] + this.aFloatArray109[1] * arg0.aFloatArray109[5] + this.aFloatArray109[2] * arg0.aFloatArray109[9] + this.aFloatArray109[3] * arg0.aFloatArray109[13];
		@Pc(119) float local119 = this.aFloatArray109[0] * arg0.aFloatArray109[2] + this.aFloatArray109[1] * arg0.aFloatArray109[6] + this.aFloatArray109[2] * arg0.aFloatArray109[10] + this.aFloatArray109[3] * arg0.aFloatArray109[14];
		@Pc(159) float local159 = this.aFloatArray109[0] * arg0.aFloatArray109[3] + this.aFloatArray109[1] * arg0.aFloatArray109[7] + this.aFloatArray109[2] * arg0.aFloatArray109[11] + this.aFloatArray109[3] * arg0.aFloatArray109[15];
		@Pc(199) float local199 = this.aFloatArray109[4] * arg0.aFloatArray109[0] + this.aFloatArray109[5] * arg0.aFloatArray109[4] + this.aFloatArray109[6] * arg0.aFloatArray109[8] + this.aFloatArray109[7] * arg0.aFloatArray109[12];
		@Pc(239) float local239 = this.aFloatArray109[4] * arg0.aFloatArray109[1] + this.aFloatArray109[5] * arg0.aFloatArray109[5] + this.aFloatArray109[6] * arg0.aFloatArray109[9] + this.aFloatArray109[7] * arg0.aFloatArray109[13];
		@Pc(279) float local279 = this.aFloatArray109[4] * arg0.aFloatArray109[2] + this.aFloatArray109[5] * arg0.aFloatArray109[6] + this.aFloatArray109[6] * arg0.aFloatArray109[10] + this.aFloatArray109[7] * arg0.aFloatArray109[14];
		@Pc(319) float local319 = this.aFloatArray109[4] * arg0.aFloatArray109[3] + this.aFloatArray109[5] * arg0.aFloatArray109[7] + this.aFloatArray109[6] * arg0.aFloatArray109[11] + this.aFloatArray109[7] * arg0.aFloatArray109[15];
		@Pc(359) float local359 = this.aFloatArray109[8] * arg0.aFloatArray109[0] + this.aFloatArray109[9] * arg0.aFloatArray109[4] + this.aFloatArray109[10] * arg0.aFloatArray109[8] + this.aFloatArray109[11] * arg0.aFloatArray109[12];
		@Pc(399) float local399 = this.aFloatArray109[8] * arg0.aFloatArray109[1] + this.aFloatArray109[9] * arg0.aFloatArray109[5] + this.aFloatArray109[10] * arg0.aFloatArray109[9] + this.aFloatArray109[11] * arg0.aFloatArray109[13];
		@Pc(439) float local439 = this.aFloatArray109[8] * arg0.aFloatArray109[2] + this.aFloatArray109[9] * arg0.aFloatArray109[6] + this.aFloatArray109[10] * arg0.aFloatArray109[10] + this.aFloatArray109[11] * arg0.aFloatArray109[14];
		@Pc(479) float local479 = this.aFloatArray109[8] * arg0.aFloatArray109[3] + this.aFloatArray109[9] * arg0.aFloatArray109[7] + this.aFloatArray109[10] * arg0.aFloatArray109[11] + this.aFloatArray109[11] * arg0.aFloatArray109[15];
		@Pc(519) float local519 = this.aFloatArray109[12] * arg0.aFloatArray109[0] + this.aFloatArray109[13] * arg0.aFloatArray109[4] + this.aFloatArray109[14] * arg0.aFloatArray109[8] + this.aFloatArray109[15] * arg0.aFloatArray109[12];
		@Pc(559) float local559 = this.aFloatArray109[12] * arg0.aFloatArray109[1] + this.aFloatArray109[13] * arg0.aFloatArray109[5] + this.aFloatArray109[14] * arg0.aFloatArray109[9] + this.aFloatArray109[15] * arg0.aFloatArray109[13];
		@Pc(599) float local599 = this.aFloatArray109[12] * arg0.aFloatArray109[2] + this.aFloatArray109[13] * arg0.aFloatArray109[6] + this.aFloatArray109[14] * arg0.aFloatArray109[10] + this.aFloatArray109[15] * arg0.aFloatArray109[14];
		@Pc(639) float local639 = this.aFloatArray109[12] * arg0.aFloatArray109[3] + this.aFloatArray109[13] * arg0.aFloatArray109[7] + this.aFloatArray109[14] * arg0.aFloatArray109[11] + this.aFloatArray109[15] * arg0.aFloatArray109[15];
		this.aFloatArray109[0] = local39;
		this.aFloatArray109[1] = local79;
		this.aFloatArray109[2] = local119;
		this.aFloatArray109[3] = local159;
		this.aFloatArray109[4] = local199;
		this.aFloatArray109[5] = local239;
		this.aFloatArray109[6] = local279;
		this.aFloatArray109[7] = local319;
		this.aFloatArray109[8] = local359;
		this.aFloatArray109[9] = local399;
		this.aFloatArray109[10] = local439;
		this.aFloatArray109[11] = local479;
		this.aFloatArray109[12] = local519;
		this.aFloatArray109[13] = local559;
		this.aFloatArray109[14] = local599;
		this.aFloatArray109[15] = local639;
	}

	@OriginalMember(owner = "client!oi", name = "an", descriptor = "(Lclient!oi;)V", line = 87)
	public void method28966(@OriginalArg(0) Class442 arg0) {
		@Pc(39) float local39 = this.aFloatArray109[0] * arg0.aFloatArray109[0] + this.aFloatArray109[1] * arg0.aFloatArray109[4] + this.aFloatArray109[2] * arg0.aFloatArray109[8] + this.aFloatArray109[3] * arg0.aFloatArray109[12];
		@Pc(79) float local79 = this.aFloatArray109[0] * arg0.aFloatArray109[1] + this.aFloatArray109[1] * arg0.aFloatArray109[5] + this.aFloatArray109[2] * arg0.aFloatArray109[9] + this.aFloatArray109[3] * arg0.aFloatArray109[13];
		@Pc(119) float local119 = this.aFloatArray109[0] * arg0.aFloatArray109[2] + this.aFloatArray109[1] * arg0.aFloatArray109[6] + this.aFloatArray109[2] * arg0.aFloatArray109[10] + this.aFloatArray109[3] * arg0.aFloatArray109[14];
		@Pc(159) float local159 = this.aFloatArray109[0] * arg0.aFloatArray109[3] + this.aFloatArray109[1] * arg0.aFloatArray109[7] + this.aFloatArray109[2] * arg0.aFloatArray109[11] + this.aFloatArray109[3] * arg0.aFloatArray109[15];
		@Pc(199) float local199 = this.aFloatArray109[4] * arg0.aFloatArray109[0] + this.aFloatArray109[5] * arg0.aFloatArray109[4] + this.aFloatArray109[6] * arg0.aFloatArray109[8] + this.aFloatArray109[7] * arg0.aFloatArray109[12];
		@Pc(239) float local239 = this.aFloatArray109[4] * arg0.aFloatArray109[1] + this.aFloatArray109[5] * arg0.aFloatArray109[5] + this.aFloatArray109[6] * arg0.aFloatArray109[9] + this.aFloatArray109[7] * arg0.aFloatArray109[13];
		@Pc(279) float local279 = this.aFloatArray109[4] * arg0.aFloatArray109[2] + this.aFloatArray109[5] * arg0.aFloatArray109[6] + this.aFloatArray109[6] * arg0.aFloatArray109[10] + this.aFloatArray109[7] * arg0.aFloatArray109[14];
		@Pc(319) float local319 = this.aFloatArray109[4] * arg0.aFloatArray109[3] + this.aFloatArray109[5] * arg0.aFloatArray109[7] + this.aFloatArray109[6] * arg0.aFloatArray109[11] + this.aFloatArray109[7] * arg0.aFloatArray109[15];
		@Pc(359) float local359 = this.aFloatArray109[8] * arg0.aFloatArray109[0] + this.aFloatArray109[9] * arg0.aFloatArray109[4] + this.aFloatArray109[10] * arg0.aFloatArray109[8] + this.aFloatArray109[11] * arg0.aFloatArray109[12];
		@Pc(399) float local399 = this.aFloatArray109[8] * arg0.aFloatArray109[1] + this.aFloatArray109[9] * arg0.aFloatArray109[5] + this.aFloatArray109[10] * arg0.aFloatArray109[9] + this.aFloatArray109[11] * arg0.aFloatArray109[13];
		@Pc(439) float local439 = this.aFloatArray109[8] * arg0.aFloatArray109[2] + this.aFloatArray109[9] * arg0.aFloatArray109[6] + this.aFloatArray109[10] * arg0.aFloatArray109[10] + this.aFloatArray109[11] * arg0.aFloatArray109[14];
		@Pc(479) float local479 = this.aFloatArray109[8] * arg0.aFloatArray109[3] + this.aFloatArray109[9] * arg0.aFloatArray109[7] + this.aFloatArray109[10] * arg0.aFloatArray109[11] + this.aFloatArray109[11] * arg0.aFloatArray109[15];
		@Pc(519) float local519 = this.aFloatArray109[12] * arg0.aFloatArray109[0] + this.aFloatArray109[13] * arg0.aFloatArray109[4] + this.aFloatArray109[14] * arg0.aFloatArray109[8] + this.aFloatArray109[15] * arg0.aFloatArray109[12];
		@Pc(559) float local559 = this.aFloatArray109[12] * arg0.aFloatArray109[1] + this.aFloatArray109[13] * arg0.aFloatArray109[5] + this.aFloatArray109[14] * arg0.aFloatArray109[9] + this.aFloatArray109[15] * arg0.aFloatArray109[13];
		@Pc(599) float local599 = this.aFloatArray109[12] * arg0.aFloatArray109[2] + this.aFloatArray109[13] * arg0.aFloatArray109[6] + this.aFloatArray109[14] * arg0.aFloatArray109[10] + this.aFloatArray109[15] * arg0.aFloatArray109[14];
		@Pc(639) float local639 = this.aFloatArray109[12] * arg0.aFloatArray109[3] + this.aFloatArray109[13] * arg0.aFloatArray109[7] + this.aFloatArray109[14] * arg0.aFloatArray109[11] + this.aFloatArray109[15] * arg0.aFloatArray109[15];
		this.aFloatArray109[0] = local39;
		this.aFloatArray109[1] = local79;
		this.aFloatArray109[2] = local119;
		this.aFloatArray109[3] = local159;
		this.aFloatArray109[4] = local199;
		this.aFloatArray109[5] = local239;
		this.aFloatArray109[6] = local279;
		this.aFloatArray109[7] = local319;
		this.aFloatArray109[8] = local359;
		this.aFloatArray109[9] = local399;
		this.aFloatArray109[10] = local439;
		this.aFloatArray109[11] = local479;
		this.aFloatArray109[12] = local519;
		this.aFloatArray109[13] = local559;
		this.aFloatArray109[14] = local599;
		this.aFloatArray109[15] = local639;
	}

	@OriginalMember(owner = "client!oi", name = "ab", descriptor = "(Lclient!oi;)V", line = 87)
	public void method28967(@OriginalArg(0) Class442 arg0) {
		@Pc(39) float local39 = this.aFloatArray109[0] * arg0.aFloatArray109[0] + this.aFloatArray109[1] * arg0.aFloatArray109[4] + this.aFloatArray109[2] * arg0.aFloatArray109[8] + this.aFloatArray109[3] * arg0.aFloatArray109[12];
		@Pc(79) float local79 = this.aFloatArray109[0] * arg0.aFloatArray109[1] + this.aFloatArray109[1] * arg0.aFloatArray109[5] + this.aFloatArray109[2] * arg0.aFloatArray109[9] + this.aFloatArray109[3] * arg0.aFloatArray109[13];
		@Pc(119) float local119 = this.aFloatArray109[0] * arg0.aFloatArray109[2] + this.aFloatArray109[1] * arg0.aFloatArray109[6] + this.aFloatArray109[2] * arg0.aFloatArray109[10] + this.aFloatArray109[3] * arg0.aFloatArray109[14];
		@Pc(159) float local159 = this.aFloatArray109[0] * arg0.aFloatArray109[3] + this.aFloatArray109[1] * arg0.aFloatArray109[7] + this.aFloatArray109[2] * arg0.aFloatArray109[11] + this.aFloatArray109[3] * arg0.aFloatArray109[15];
		@Pc(199) float local199 = this.aFloatArray109[4] * arg0.aFloatArray109[0] + this.aFloatArray109[5] * arg0.aFloatArray109[4] + this.aFloatArray109[6] * arg0.aFloatArray109[8] + this.aFloatArray109[7] * arg0.aFloatArray109[12];
		@Pc(239) float local239 = this.aFloatArray109[4] * arg0.aFloatArray109[1] + this.aFloatArray109[5] * arg0.aFloatArray109[5] + this.aFloatArray109[6] * arg0.aFloatArray109[9] + this.aFloatArray109[7] * arg0.aFloatArray109[13];
		@Pc(279) float local279 = this.aFloatArray109[4] * arg0.aFloatArray109[2] + this.aFloatArray109[5] * arg0.aFloatArray109[6] + this.aFloatArray109[6] * arg0.aFloatArray109[10] + this.aFloatArray109[7] * arg0.aFloatArray109[14];
		@Pc(319) float local319 = this.aFloatArray109[4] * arg0.aFloatArray109[3] + this.aFloatArray109[5] * arg0.aFloatArray109[7] + this.aFloatArray109[6] * arg0.aFloatArray109[11] + this.aFloatArray109[7] * arg0.aFloatArray109[15];
		@Pc(359) float local359 = this.aFloatArray109[8] * arg0.aFloatArray109[0] + this.aFloatArray109[9] * arg0.aFloatArray109[4] + this.aFloatArray109[10] * arg0.aFloatArray109[8] + this.aFloatArray109[11] * arg0.aFloatArray109[12];
		@Pc(399) float local399 = this.aFloatArray109[8] * arg0.aFloatArray109[1] + this.aFloatArray109[9] * arg0.aFloatArray109[5] + this.aFloatArray109[10] * arg0.aFloatArray109[9] + this.aFloatArray109[11] * arg0.aFloatArray109[13];
		@Pc(439) float local439 = this.aFloatArray109[8] * arg0.aFloatArray109[2] + this.aFloatArray109[9] * arg0.aFloatArray109[6] + this.aFloatArray109[10] * arg0.aFloatArray109[10] + this.aFloatArray109[11] * arg0.aFloatArray109[14];
		@Pc(479) float local479 = this.aFloatArray109[8] * arg0.aFloatArray109[3] + this.aFloatArray109[9] * arg0.aFloatArray109[7] + this.aFloatArray109[10] * arg0.aFloatArray109[11] + this.aFloatArray109[11] * arg0.aFloatArray109[15];
		@Pc(519) float local519 = this.aFloatArray109[12] * arg0.aFloatArray109[0] + this.aFloatArray109[13] * arg0.aFloatArray109[4] + this.aFloatArray109[14] * arg0.aFloatArray109[8] + this.aFloatArray109[15] * arg0.aFloatArray109[12];
		@Pc(559) float local559 = this.aFloatArray109[12] * arg0.aFloatArray109[1] + this.aFloatArray109[13] * arg0.aFloatArray109[5] + this.aFloatArray109[14] * arg0.aFloatArray109[9] + this.aFloatArray109[15] * arg0.aFloatArray109[13];
		@Pc(599) float local599 = this.aFloatArray109[12] * arg0.aFloatArray109[2] + this.aFloatArray109[13] * arg0.aFloatArray109[6] + this.aFloatArray109[14] * arg0.aFloatArray109[10] + this.aFloatArray109[15] * arg0.aFloatArray109[14];
		@Pc(639) float local639 = this.aFloatArray109[12] * arg0.aFloatArray109[3] + this.aFloatArray109[13] * arg0.aFloatArray109[7] + this.aFloatArray109[14] * arg0.aFloatArray109[11] + this.aFloatArray109[15] * arg0.aFloatArray109[15];
		this.aFloatArray109[0] = local39;
		this.aFloatArray109[1] = local79;
		this.aFloatArray109[2] = local119;
		this.aFloatArray109[3] = local159;
		this.aFloatArray109[4] = local199;
		this.aFloatArray109[5] = local239;
		this.aFloatArray109[6] = local279;
		this.aFloatArray109[7] = local319;
		this.aFloatArray109[8] = local359;
		this.aFloatArray109[9] = local399;
		this.aFloatArray109[10] = local439;
		this.aFloatArray109[11] = local479;
		this.aFloatArray109[12] = local519;
		this.aFloatArray109[13] = local559;
		this.aFloatArray109[14] = local599;
		this.aFloatArray109[15] = local639;
	}

	@OriginalMember(owner = "client!oi", name = "aa", descriptor = "(Lclient!ow;)V", line = 122)
	public void method28968(@OriginalArg(0) Class455 arg0) {
		this.aFloatArray109[0] = arg0.aFloat288;
		this.aFloatArray109[1] = arg0.aFloat287;
		this.aFloatArray109[2] = arg0.aFloat290;
		this.aFloatArray109[3] = 0.0F;
		this.aFloatArray109[4] = arg0.aFloat291;
		this.aFloatArray109[5] = arg0.aFloat298;
		this.aFloatArray109[6] = arg0.aFloat293;
		this.aFloatArray109[7] = 0.0F;
		this.aFloatArray109[8] = arg0.aFloat294;
		this.aFloatArray109[9] = arg0.aFloat289;
		this.aFloatArray109[10] = arg0.aFloat296;
		this.aFloatArray109[11] = 0.0F;
		this.aFloatArray109[12] = arg0.aFloat297;
		this.aFloatArray109[13] = arg0.aFloat295;
		this.aFloatArray109[14] = arg0.aFloat292;
		this.aFloatArray109[15] = 1.0F;
	}

	@OriginalMember(owner = "client!oi", name = "w", descriptor = "(Lclient!ow;)V", line = 122)
	public void method28969(@OriginalArg(0) Class455 arg0) {
		this.aFloatArray109[0] = arg0.aFloat288;
		this.aFloatArray109[1] = arg0.aFloat287;
		this.aFloatArray109[2] = arg0.aFloat290;
		this.aFloatArray109[3] = 0.0F;
		this.aFloatArray109[4] = arg0.aFloat291;
		this.aFloatArray109[5] = arg0.aFloat298;
		this.aFloatArray109[6] = arg0.aFloat293;
		this.aFloatArray109[7] = 0.0F;
		this.aFloatArray109[8] = arg0.aFloat294;
		this.aFloatArray109[9] = arg0.aFloat289;
		this.aFloatArray109[10] = arg0.aFloat296;
		this.aFloatArray109[11] = 0.0F;
		this.aFloatArray109[12] = arg0.aFloat297;
		this.aFloatArray109[13] = arg0.aFloat295;
		this.aFloatArray109[14] = arg0.aFloat292;
		this.aFloatArray109[15] = 1.0F;
	}

	@OriginalMember(owner = "client!oi", name = "t", descriptor = "()F", line = 141)
	float method28970() {
		return this.aFloatArray109[0] * this.aFloatArray109[5] * this.aFloatArray109[10] * this.aFloatArray109[15] - this.aFloatArray109[0] * this.aFloatArray109[5] * this.aFloatArray109[11] * this.aFloatArray109[14] - this.aFloatArray109[0] * this.aFloatArray109[6] * this.aFloatArray109[9] * this.aFloatArray109[15] + this.aFloatArray109[0] * this.aFloatArray109[6] * this.aFloatArray109[11] * this.aFloatArray109[13] + this.aFloatArray109[0] * this.aFloatArray109[7] * this.aFloatArray109[9] * this.aFloatArray109[14] - this.aFloatArray109[0] * this.aFloatArray109[7] * this.aFloatArray109[10] * this.aFloatArray109[13] - this.aFloatArray109[1] * this.aFloatArray109[4] * this.aFloatArray109[10] * this.aFloatArray109[15] + this.aFloatArray109[1] * this.aFloatArray109[4] * this.aFloatArray109[11] * this.aFloatArray109[14] + this.aFloatArray109[1] * this.aFloatArray109[6] * this.aFloatArray109[8] * this.aFloatArray109[15] - this.aFloatArray109[1] * this.aFloatArray109[6] * this.aFloatArray109[11] * this.aFloatArray109[12] - this.aFloatArray109[1] * this.aFloatArray109[7] * this.aFloatArray109[8] * this.aFloatArray109[14] + this.aFloatArray109[1] * this.aFloatArray109[7] * this.aFloatArray109[10] * this.aFloatArray109[12] + this.aFloatArray109[2] * this.aFloatArray109[4] * this.aFloatArray109[9] * this.aFloatArray109[15] - this.aFloatArray109[2] * this.aFloatArray109[4] * this.aFloatArray109[11] * this.aFloatArray109[13] - this.aFloatArray109[2] * this.aFloatArray109[5] * this.aFloatArray109[8] * this.aFloatArray109[15] + this.aFloatArray109[2] * this.aFloatArray109[5] * this.aFloatArray109[11] * this.aFloatArray109[12] + this.aFloatArray109[2] * this.aFloatArray109[7] * this.aFloatArray109[8] * this.aFloatArray109[13] - this.aFloatArray109[2] * this.aFloatArray109[7] * this.aFloatArray109[9] * this.aFloatArray109[12] - this.aFloatArray109[3] * this.aFloatArray109[4] * this.aFloatArray109[9] * this.aFloatArray109[14] + this.aFloatArray109[3] * this.aFloatArray109[4] * this.aFloatArray109[10] * this.aFloatArray109[13] + this.aFloatArray109[3] * this.aFloatArray109[5] * this.aFloatArray109[8] * this.aFloatArray109[14] - this.aFloatArray109[3] * this.aFloatArray109[5] * this.aFloatArray109[10] * this.aFloatArray109[12] - this.aFloatArray109[3] * this.aFloatArray109[6] * this.aFloatArray109[8] * this.aFloatArray109[13] + this.aFloatArray109[3] * this.aFloatArray109[6] * this.aFloatArray109[9] * this.aFloatArray109[12];
	}

	@OriginalMember(owner = "client!oi", name = "ap", descriptor = "()F", line = 141)
	float method28971() {
		return this.aFloatArray109[0] * this.aFloatArray109[5] * this.aFloatArray109[10] * this.aFloatArray109[15] - this.aFloatArray109[0] * this.aFloatArray109[5] * this.aFloatArray109[11] * this.aFloatArray109[14] - this.aFloatArray109[0] * this.aFloatArray109[6] * this.aFloatArray109[9] * this.aFloatArray109[15] + this.aFloatArray109[0] * this.aFloatArray109[6] * this.aFloatArray109[11] * this.aFloatArray109[13] + this.aFloatArray109[0] * this.aFloatArray109[7] * this.aFloatArray109[9] * this.aFloatArray109[14] - this.aFloatArray109[0] * this.aFloatArray109[7] * this.aFloatArray109[10] * this.aFloatArray109[13] - this.aFloatArray109[1] * this.aFloatArray109[4] * this.aFloatArray109[10] * this.aFloatArray109[15] + this.aFloatArray109[1] * this.aFloatArray109[4] * this.aFloatArray109[11] * this.aFloatArray109[14] + this.aFloatArray109[1] * this.aFloatArray109[6] * this.aFloatArray109[8] * this.aFloatArray109[15] - this.aFloatArray109[1] * this.aFloatArray109[6] * this.aFloatArray109[11] * this.aFloatArray109[12] - this.aFloatArray109[1] * this.aFloatArray109[7] * this.aFloatArray109[8] * this.aFloatArray109[14] + this.aFloatArray109[1] * this.aFloatArray109[7] * this.aFloatArray109[10] * this.aFloatArray109[12] + this.aFloatArray109[2] * this.aFloatArray109[4] * this.aFloatArray109[9] * this.aFloatArray109[15] - this.aFloatArray109[2] * this.aFloatArray109[4] * this.aFloatArray109[11] * this.aFloatArray109[13] - this.aFloatArray109[2] * this.aFloatArray109[5] * this.aFloatArray109[8] * this.aFloatArray109[15] + this.aFloatArray109[2] * this.aFloatArray109[5] * this.aFloatArray109[11] * this.aFloatArray109[12] + this.aFloatArray109[2] * this.aFloatArray109[7] * this.aFloatArray109[8] * this.aFloatArray109[13] - this.aFloatArray109[2] * this.aFloatArray109[7] * this.aFloatArray109[9] * this.aFloatArray109[12] - this.aFloatArray109[3] * this.aFloatArray109[4] * this.aFloatArray109[9] * this.aFloatArray109[14] + this.aFloatArray109[3] * this.aFloatArray109[4] * this.aFloatArray109[10] * this.aFloatArray109[13] + this.aFloatArray109[3] * this.aFloatArray109[5] * this.aFloatArray109[8] * this.aFloatArray109[14] - this.aFloatArray109[3] * this.aFloatArray109[5] * this.aFloatArray109[10] * this.aFloatArray109[12] - this.aFloatArray109[3] * this.aFloatArray109[6] * this.aFloatArray109[8] * this.aFloatArray109[13] + this.aFloatArray109[3] * this.aFloatArray109[6] * this.aFloatArray109[9] * this.aFloatArray109[12];
	}

	@OriginalMember(owner = "client!oi", name = "aw", descriptor = "()F", line = 141)
	float method28972() {
		return this.aFloatArray109[0] * this.aFloatArray109[5] * this.aFloatArray109[10] * this.aFloatArray109[15] - this.aFloatArray109[0] * this.aFloatArray109[5] * this.aFloatArray109[11] * this.aFloatArray109[14] - this.aFloatArray109[0] * this.aFloatArray109[6] * this.aFloatArray109[9] * this.aFloatArray109[15] + this.aFloatArray109[0] * this.aFloatArray109[6] * this.aFloatArray109[11] * this.aFloatArray109[13] + this.aFloatArray109[0] * this.aFloatArray109[7] * this.aFloatArray109[9] * this.aFloatArray109[14] - this.aFloatArray109[0] * this.aFloatArray109[7] * this.aFloatArray109[10] * this.aFloatArray109[13] - this.aFloatArray109[1] * this.aFloatArray109[4] * this.aFloatArray109[10] * this.aFloatArray109[15] + this.aFloatArray109[1] * this.aFloatArray109[4] * this.aFloatArray109[11] * this.aFloatArray109[14] + this.aFloatArray109[1] * this.aFloatArray109[6] * this.aFloatArray109[8] * this.aFloatArray109[15] - this.aFloatArray109[1] * this.aFloatArray109[6] * this.aFloatArray109[11] * this.aFloatArray109[12] - this.aFloatArray109[1] * this.aFloatArray109[7] * this.aFloatArray109[8] * this.aFloatArray109[14] + this.aFloatArray109[1] * this.aFloatArray109[7] * this.aFloatArray109[10] * this.aFloatArray109[12] + this.aFloatArray109[2] * this.aFloatArray109[4] * this.aFloatArray109[9] * this.aFloatArray109[15] - this.aFloatArray109[2] * this.aFloatArray109[4] * this.aFloatArray109[11] * this.aFloatArray109[13] - this.aFloatArray109[2] * this.aFloatArray109[5] * this.aFloatArray109[8] * this.aFloatArray109[15] + this.aFloatArray109[2] * this.aFloatArray109[5] * this.aFloatArray109[11] * this.aFloatArray109[12] + this.aFloatArray109[2] * this.aFloatArray109[7] * this.aFloatArray109[8] * this.aFloatArray109[13] - this.aFloatArray109[2] * this.aFloatArray109[7] * this.aFloatArray109[9] * this.aFloatArray109[12] - this.aFloatArray109[3] * this.aFloatArray109[4] * this.aFloatArray109[9] * this.aFloatArray109[14] + this.aFloatArray109[3] * this.aFloatArray109[4] * this.aFloatArray109[10] * this.aFloatArray109[13] + this.aFloatArray109[3] * this.aFloatArray109[5] * this.aFloatArray109[8] * this.aFloatArray109[14] - this.aFloatArray109[3] * this.aFloatArray109[5] * this.aFloatArray109[10] * this.aFloatArray109[12] - this.aFloatArray109[3] * this.aFloatArray109[6] * this.aFloatArray109[8] * this.aFloatArray109[13] + this.aFloatArray109[3] * this.aFloatArray109[6] * this.aFloatArray109[9] * this.aFloatArray109[12];
	}

	@OriginalMember(owner = "client!oi", name = "q", descriptor = "()V", line = 145)
	public void method28973() {
		@Pc(4) float local4 = 1.0F / this.method28970();
		@Pc(96) float local96 = (this.aFloatArray109[5] * this.aFloatArray109[10] * this.aFloatArray109[15] - this.aFloatArray109[5] * this.aFloatArray109[11] * this.aFloatArray109[14] - this.aFloatArray109[6] * this.aFloatArray109[9] * this.aFloatArray109[15] + this.aFloatArray109[6] * this.aFloatArray109[11] * this.aFloatArray109[13] + this.aFloatArray109[7] * this.aFloatArray109[9] * this.aFloatArray109[14] - this.aFloatArray109[7] * this.aFloatArray109[10] * this.aFloatArray109[13]) * local4;
		@Pc(189) float local189 = (-this.aFloatArray109[1] * this.aFloatArray109[10] * this.aFloatArray109[15] + this.aFloatArray109[1] * this.aFloatArray109[11] * this.aFloatArray109[14] + this.aFloatArray109[2] * this.aFloatArray109[9] * this.aFloatArray109[15] - this.aFloatArray109[2] * this.aFloatArray109[11] * this.aFloatArray109[13] - this.aFloatArray109[3] * this.aFloatArray109[9] * this.aFloatArray109[14] + this.aFloatArray109[3] * this.aFloatArray109[10] * this.aFloatArray109[13]) * local4;
		@Pc(281) float local281 = (this.aFloatArray109[1] * this.aFloatArray109[6] * this.aFloatArray109[15] - this.aFloatArray109[1] * this.aFloatArray109[7] * this.aFloatArray109[14] - this.aFloatArray109[2] * this.aFloatArray109[5] * this.aFloatArray109[15] + this.aFloatArray109[2] * this.aFloatArray109[7] * this.aFloatArray109[13] + this.aFloatArray109[3] * this.aFloatArray109[5] * this.aFloatArray109[14] - this.aFloatArray109[3] * this.aFloatArray109[6] * this.aFloatArray109[13]) * local4;
		@Pc(374) float local374 = (-this.aFloatArray109[1] * this.aFloatArray109[6] * this.aFloatArray109[11] + this.aFloatArray109[1] * this.aFloatArray109[7] * this.aFloatArray109[10] + this.aFloatArray109[2] * this.aFloatArray109[5] * this.aFloatArray109[11] - this.aFloatArray109[2] * this.aFloatArray109[7] * this.aFloatArray109[9] - this.aFloatArray109[3] * this.aFloatArray109[5] * this.aFloatArray109[10] + this.aFloatArray109[3] * this.aFloatArray109[6] * this.aFloatArray109[9]) * local4;
		@Pc(467) float local467 = (-this.aFloatArray109[4] * this.aFloatArray109[10] * this.aFloatArray109[15] + this.aFloatArray109[4] * this.aFloatArray109[11] * this.aFloatArray109[14] + this.aFloatArray109[6] * this.aFloatArray109[8] * this.aFloatArray109[15] - this.aFloatArray109[6] * this.aFloatArray109[11] * this.aFloatArray109[12] - this.aFloatArray109[7] * this.aFloatArray109[8] * this.aFloatArray109[14] + this.aFloatArray109[7] * this.aFloatArray109[10] * this.aFloatArray109[12]) * local4;
		@Pc(559) float local559 = (this.aFloatArray109[0] * this.aFloatArray109[10] * this.aFloatArray109[15] - this.aFloatArray109[0] * this.aFloatArray109[11] * this.aFloatArray109[14] - this.aFloatArray109[2] * this.aFloatArray109[8] * this.aFloatArray109[15] + this.aFloatArray109[2] * this.aFloatArray109[11] * this.aFloatArray109[12] + this.aFloatArray109[3] * this.aFloatArray109[8] * this.aFloatArray109[14] - this.aFloatArray109[3] * this.aFloatArray109[10] * this.aFloatArray109[12]) * local4;
		@Pc(652) float local652 = (-this.aFloatArray109[0] * this.aFloatArray109[6] * this.aFloatArray109[15] + this.aFloatArray109[0] * this.aFloatArray109[7] * this.aFloatArray109[14] + this.aFloatArray109[2] * this.aFloatArray109[4] * this.aFloatArray109[15] - this.aFloatArray109[2] * this.aFloatArray109[7] * this.aFloatArray109[12] - this.aFloatArray109[3] * this.aFloatArray109[4] * this.aFloatArray109[14] + this.aFloatArray109[3] * this.aFloatArray109[6] * this.aFloatArray109[12]) * local4;
		@Pc(744) float local744 = (this.aFloatArray109[0] * this.aFloatArray109[6] * this.aFloatArray109[11] - this.aFloatArray109[0] * this.aFloatArray109[7] * this.aFloatArray109[10] - this.aFloatArray109[2] * this.aFloatArray109[4] * this.aFloatArray109[11] + this.aFloatArray109[2] * this.aFloatArray109[7] * this.aFloatArray109[8] + this.aFloatArray109[3] * this.aFloatArray109[4] * this.aFloatArray109[10] - this.aFloatArray109[3] * this.aFloatArray109[6] * this.aFloatArray109[8]) * local4;
		@Pc(836) float local836 = (this.aFloatArray109[4] * this.aFloatArray109[9] * this.aFloatArray109[15] - this.aFloatArray109[4] * this.aFloatArray109[11] * this.aFloatArray109[13] - this.aFloatArray109[5] * this.aFloatArray109[8] * this.aFloatArray109[15] + this.aFloatArray109[5] * this.aFloatArray109[11] * this.aFloatArray109[12] + this.aFloatArray109[7] * this.aFloatArray109[8] * this.aFloatArray109[13] - this.aFloatArray109[7] * this.aFloatArray109[9] * this.aFloatArray109[12]) * local4;
		@Pc(929) float local929 = (-this.aFloatArray109[0] * this.aFloatArray109[9] * this.aFloatArray109[15] + this.aFloatArray109[0] * this.aFloatArray109[11] * this.aFloatArray109[13] + this.aFloatArray109[1] * this.aFloatArray109[8] * this.aFloatArray109[15] - this.aFloatArray109[1] * this.aFloatArray109[11] * this.aFloatArray109[12] - this.aFloatArray109[3] * this.aFloatArray109[8] * this.aFloatArray109[13] + this.aFloatArray109[3] * this.aFloatArray109[9] * this.aFloatArray109[12]) * local4;
		@Pc(1021) float local1021 = (this.aFloatArray109[0] * this.aFloatArray109[5] * this.aFloatArray109[15] - this.aFloatArray109[0] * this.aFloatArray109[7] * this.aFloatArray109[13] - this.aFloatArray109[1] * this.aFloatArray109[4] * this.aFloatArray109[15] + this.aFloatArray109[1] * this.aFloatArray109[7] * this.aFloatArray109[12] + this.aFloatArray109[3] * this.aFloatArray109[4] * this.aFloatArray109[13] - this.aFloatArray109[3] * this.aFloatArray109[5] * this.aFloatArray109[12]) * local4;
		@Pc(1114) float local1114 = (-this.aFloatArray109[0] * this.aFloatArray109[5] * this.aFloatArray109[11] + this.aFloatArray109[0] * this.aFloatArray109[7] * this.aFloatArray109[9] + this.aFloatArray109[1] * this.aFloatArray109[4] * this.aFloatArray109[11] - this.aFloatArray109[1] * this.aFloatArray109[7] * this.aFloatArray109[8] - this.aFloatArray109[3] * this.aFloatArray109[4] * this.aFloatArray109[9] + this.aFloatArray109[3] * this.aFloatArray109[5] * this.aFloatArray109[8]) * local4;
		@Pc(1207) float local1207 = (-this.aFloatArray109[4] * this.aFloatArray109[9] * this.aFloatArray109[14] + this.aFloatArray109[4] * this.aFloatArray109[10] * this.aFloatArray109[13] + this.aFloatArray109[5] * this.aFloatArray109[8] * this.aFloatArray109[14] - this.aFloatArray109[5] * this.aFloatArray109[10] * this.aFloatArray109[12] - this.aFloatArray109[6] * this.aFloatArray109[8] * this.aFloatArray109[13] + this.aFloatArray109[6] * this.aFloatArray109[9] * this.aFloatArray109[12]) * local4;
		@Pc(1299) float local1299 = (this.aFloatArray109[0] * this.aFloatArray109[9] * this.aFloatArray109[14] - this.aFloatArray109[0] * this.aFloatArray109[10] * this.aFloatArray109[13] - this.aFloatArray109[1] * this.aFloatArray109[8] * this.aFloatArray109[14] + this.aFloatArray109[1] * this.aFloatArray109[10] * this.aFloatArray109[12] + this.aFloatArray109[2] * this.aFloatArray109[8] * this.aFloatArray109[13] - this.aFloatArray109[2] * this.aFloatArray109[9] * this.aFloatArray109[12]) * local4;
		@Pc(1392) float local1392 = (-this.aFloatArray109[0] * this.aFloatArray109[5] * this.aFloatArray109[14] + this.aFloatArray109[0] * this.aFloatArray109[6] * this.aFloatArray109[13] + this.aFloatArray109[1] * this.aFloatArray109[4] * this.aFloatArray109[14] - this.aFloatArray109[1] * this.aFloatArray109[6] * this.aFloatArray109[12] - this.aFloatArray109[2] * this.aFloatArray109[4] * this.aFloatArray109[13] + this.aFloatArray109[2] * this.aFloatArray109[5] * this.aFloatArray109[12]) * local4;
		@Pc(1484) float local1484 = (this.aFloatArray109[0] * this.aFloatArray109[5] * this.aFloatArray109[10] - this.aFloatArray109[0] * this.aFloatArray109[6] * this.aFloatArray109[9] - this.aFloatArray109[1] * this.aFloatArray109[4] * this.aFloatArray109[10] + this.aFloatArray109[1] * this.aFloatArray109[6] * this.aFloatArray109[8] + this.aFloatArray109[2] * this.aFloatArray109[4] * this.aFloatArray109[9] - this.aFloatArray109[2] * this.aFloatArray109[5] * this.aFloatArray109[8]) * local4;
		this.aFloatArray109[0] = local96;
		this.aFloatArray109[1] = local189;
		this.aFloatArray109[2] = local281;
		this.aFloatArray109[3] = local374;
		this.aFloatArray109[4] = local467;
		this.aFloatArray109[5] = local559;
		this.aFloatArray109[6] = local652;
		this.aFloatArray109[7] = local744;
		this.aFloatArray109[8] = local836;
		this.aFloatArray109[9] = local929;
		this.aFloatArray109[10] = local1021;
		this.aFloatArray109[11] = local1114;
		this.aFloatArray109[12] = local1207;
		this.aFloatArray109[13] = local1299;
		this.aFloatArray109[14] = local1392;
		this.aFloatArray109[15] = local1484;
	}

	@OriginalMember(owner = "client!oi", name = "bj", descriptor = "()V", line = 145)
	public void method28974() {
		@Pc(4) float local4 = 1.0F / this.method28970();
		@Pc(96) float local96 = (this.aFloatArray109[5] * this.aFloatArray109[10] * this.aFloatArray109[15] - this.aFloatArray109[5] * this.aFloatArray109[11] * this.aFloatArray109[14] - this.aFloatArray109[6] * this.aFloatArray109[9] * this.aFloatArray109[15] + this.aFloatArray109[6] * this.aFloatArray109[11] * this.aFloatArray109[13] + this.aFloatArray109[7] * this.aFloatArray109[9] * this.aFloatArray109[14] - this.aFloatArray109[7] * this.aFloatArray109[10] * this.aFloatArray109[13]) * local4;
		@Pc(189) float local189 = (-this.aFloatArray109[1] * this.aFloatArray109[10] * this.aFloatArray109[15] + this.aFloatArray109[1] * this.aFloatArray109[11] * this.aFloatArray109[14] + this.aFloatArray109[2] * this.aFloatArray109[9] * this.aFloatArray109[15] - this.aFloatArray109[2] * this.aFloatArray109[11] * this.aFloatArray109[13] - this.aFloatArray109[3] * this.aFloatArray109[9] * this.aFloatArray109[14] + this.aFloatArray109[3] * this.aFloatArray109[10] * this.aFloatArray109[13]) * local4;
		@Pc(281) float local281 = (this.aFloatArray109[1] * this.aFloatArray109[6] * this.aFloatArray109[15] - this.aFloatArray109[1] * this.aFloatArray109[7] * this.aFloatArray109[14] - this.aFloatArray109[2] * this.aFloatArray109[5] * this.aFloatArray109[15] + this.aFloatArray109[2] * this.aFloatArray109[7] * this.aFloatArray109[13] + this.aFloatArray109[3] * this.aFloatArray109[5] * this.aFloatArray109[14] - this.aFloatArray109[3] * this.aFloatArray109[6] * this.aFloatArray109[13]) * local4;
		@Pc(374) float local374 = (-this.aFloatArray109[1] * this.aFloatArray109[6] * this.aFloatArray109[11] + this.aFloatArray109[1] * this.aFloatArray109[7] * this.aFloatArray109[10] + this.aFloatArray109[2] * this.aFloatArray109[5] * this.aFloatArray109[11] - this.aFloatArray109[2] * this.aFloatArray109[7] * this.aFloatArray109[9] - this.aFloatArray109[3] * this.aFloatArray109[5] * this.aFloatArray109[10] + this.aFloatArray109[3] * this.aFloatArray109[6] * this.aFloatArray109[9]) * local4;
		@Pc(467) float local467 = (-this.aFloatArray109[4] * this.aFloatArray109[10] * this.aFloatArray109[15] + this.aFloatArray109[4] * this.aFloatArray109[11] * this.aFloatArray109[14] + this.aFloatArray109[6] * this.aFloatArray109[8] * this.aFloatArray109[15] - this.aFloatArray109[6] * this.aFloatArray109[11] * this.aFloatArray109[12] - this.aFloatArray109[7] * this.aFloatArray109[8] * this.aFloatArray109[14] + this.aFloatArray109[7] * this.aFloatArray109[10] * this.aFloatArray109[12]) * local4;
		@Pc(559) float local559 = (this.aFloatArray109[0] * this.aFloatArray109[10] * this.aFloatArray109[15] - this.aFloatArray109[0] * this.aFloatArray109[11] * this.aFloatArray109[14] - this.aFloatArray109[2] * this.aFloatArray109[8] * this.aFloatArray109[15] + this.aFloatArray109[2] * this.aFloatArray109[11] * this.aFloatArray109[12] + this.aFloatArray109[3] * this.aFloatArray109[8] * this.aFloatArray109[14] - this.aFloatArray109[3] * this.aFloatArray109[10] * this.aFloatArray109[12]) * local4;
		@Pc(652) float local652 = (-this.aFloatArray109[0] * this.aFloatArray109[6] * this.aFloatArray109[15] + this.aFloatArray109[0] * this.aFloatArray109[7] * this.aFloatArray109[14] + this.aFloatArray109[2] * this.aFloatArray109[4] * this.aFloatArray109[15] - this.aFloatArray109[2] * this.aFloatArray109[7] * this.aFloatArray109[12] - this.aFloatArray109[3] * this.aFloatArray109[4] * this.aFloatArray109[14] + this.aFloatArray109[3] * this.aFloatArray109[6] * this.aFloatArray109[12]) * local4;
		@Pc(744) float local744 = (this.aFloatArray109[0] * this.aFloatArray109[6] * this.aFloatArray109[11] - this.aFloatArray109[0] * this.aFloatArray109[7] * this.aFloatArray109[10] - this.aFloatArray109[2] * this.aFloatArray109[4] * this.aFloatArray109[11] + this.aFloatArray109[2] * this.aFloatArray109[7] * this.aFloatArray109[8] + this.aFloatArray109[3] * this.aFloatArray109[4] * this.aFloatArray109[10] - this.aFloatArray109[3] * this.aFloatArray109[6] * this.aFloatArray109[8]) * local4;
		@Pc(836) float local836 = (this.aFloatArray109[4] * this.aFloatArray109[9] * this.aFloatArray109[15] - this.aFloatArray109[4] * this.aFloatArray109[11] * this.aFloatArray109[13] - this.aFloatArray109[5] * this.aFloatArray109[8] * this.aFloatArray109[15] + this.aFloatArray109[5] * this.aFloatArray109[11] * this.aFloatArray109[12] + this.aFloatArray109[7] * this.aFloatArray109[8] * this.aFloatArray109[13] - this.aFloatArray109[7] * this.aFloatArray109[9] * this.aFloatArray109[12]) * local4;
		@Pc(929) float local929 = (-this.aFloatArray109[0] * this.aFloatArray109[9] * this.aFloatArray109[15] + this.aFloatArray109[0] * this.aFloatArray109[11] * this.aFloatArray109[13] + this.aFloatArray109[1] * this.aFloatArray109[8] * this.aFloatArray109[15] - this.aFloatArray109[1] * this.aFloatArray109[11] * this.aFloatArray109[12] - this.aFloatArray109[3] * this.aFloatArray109[8] * this.aFloatArray109[13] + this.aFloatArray109[3] * this.aFloatArray109[9] * this.aFloatArray109[12]) * local4;
		@Pc(1021) float local1021 = (this.aFloatArray109[0] * this.aFloatArray109[5] * this.aFloatArray109[15] - this.aFloatArray109[0] * this.aFloatArray109[7] * this.aFloatArray109[13] - this.aFloatArray109[1] * this.aFloatArray109[4] * this.aFloatArray109[15] + this.aFloatArray109[1] * this.aFloatArray109[7] * this.aFloatArray109[12] + this.aFloatArray109[3] * this.aFloatArray109[4] * this.aFloatArray109[13] - this.aFloatArray109[3] * this.aFloatArray109[5] * this.aFloatArray109[12]) * local4;
		@Pc(1114) float local1114 = (-this.aFloatArray109[0] * this.aFloatArray109[5] * this.aFloatArray109[11] + this.aFloatArray109[0] * this.aFloatArray109[7] * this.aFloatArray109[9] + this.aFloatArray109[1] * this.aFloatArray109[4] * this.aFloatArray109[11] - this.aFloatArray109[1] * this.aFloatArray109[7] * this.aFloatArray109[8] - this.aFloatArray109[3] * this.aFloatArray109[4] * this.aFloatArray109[9] + this.aFloatArray109[3] * this.aFloatArray109[5] * this.aFloatArray109[8]) * local4;
		@Pc(1207) float local1207 = (-this.aFloatArray109[4] * this.aFloatArray109[9] * this.aFloatArray109[14] + this.aFloatArray109[4] * this.aFloatArray109[10] * this.aFloatArray109[13] + this.aFloatArray109[5] * this.aFloatArray109[8] * this.aFloatArray109[14] - this.aFloatArray109[5] * this.aFloatArray109[10] * this.aFloatArray109[12] - this.aFloatArray109[6] * this.aFloatArray109[8] * this.aFloatArray109[13] + this.aFloatArray109[6] * this.aFloatArray109[9] * this.aFloatArray109[12]) * local4;
		@Pc(1299) float local1299 = (this.aFloatArray109[0] * this.aFloatArray109[9] * this.aFloatArray109[14] - this.aFloatArray109[0] * this.aFloatArray109[10] * this.aFloatArray109[13] - this.aFloatArray109[1] * this.aFloatArray109[8] * this.aFloatArray109[14] + this.aFloatArray109[1] * this.aFloatArray109[10] * this.aFloatArray109[12] + this.aFloatArray109[2] * this.aFloatArray109[8] * this.aFloatArray109[13] - this.aFloatArray109[2] * this.aFloatArray109[9] * this.aFloatArray109[12]) * local4;
		@Pc(1392) float local1392 = (-this.aFloatArray109[0] * this.aFloatArray109[5] * this.aFloatArray109[14] + this.aFloatArray109[0] * this.aFloatArray109[6] * this.aFloatArray109[13] + this.aFloatArray109[1] * this.aFloatArray109[4] * this.aFloatArray109[14] - this.aFloatArray109[1] * this.aFloatArray109[6] * this.aFloatArray109[12] - this.aFloatArray109[2] * this.aFloatArray109[4] * this.aFloatArray109[13] + this.aFloatArray109[2] * this.aFloatArray109[5] * this.aFloatArray109[12]) * local4;
		@Pc(1484) float local1484 = (this.aFloatArray109[0] * this.aFloatArray109[5] * this.aFloatArray109[10] - this.aFloatArray109[0] * this.aFloatArray109[6] * this.aFloatArray109[9] - this.aFloatArray109[1] * this.aFloatArray109[4] * this.aFloatArray109[10] + this.aFloatArray109[1] * this.aFloatArray109[6] * this.aFloatArray109[8] + this.aFloatArray109[2] * this.aFloatArray109[4] * this.aFloatArray109[9] - this.aFloatArray109[2] * this.aFloatArray109[5] * this.aFloatArray109[8]) * local4;
		this.aFloatArray109[0] = local96;
		this.aFloatArray109[1] = local189;
		this.aFloatArray109[2] = local281;
		this.aFloatArray109[3] = local374;
		this.aFloatArray109[4] = local467;
		this.aFloatArray109[5] = local559;
		this.aFloatArray109[6] = local652;
		this.aFloatArray109[7] = local744;
		this.aFloatArray109[8] = local836;
		this.aFloatArray109[9] = local929;
		this.aFloatArray109[10] = local1021;
		this.aFloatArray109[11] = local1114;
		this.aFloatArray109[12] = local1207;
		this.aFloatArray109[13] = local1299;
		this.aFloatArray109[14] = local1392;
		this.aFloatArray109[15] = local1484;
	}

	@OriginalMember(owner = "client!oi", name = "az", descriptor = "()V", line = 145)
	public void method28975() {
		@Pc(4) float local4 = 1.0F / this.method28970();
		@Pc(96) float local96 = (this.aFloatArray109[5] * this.aFloatArray109[10] * this.aFloatArray109[15] - this.aFloatArray109[5] * this.aFloatArray109[11] * this.aFloatArray109[14] - this.aFloatArray109[6] * this.aFloatArray109[9] * this.aFloatArray109[15] + this.aFloatArray109[6] * this.aFloatArray109[11] * this.aFloatArray109[13] + this.aFloatArray109[7] * this.aFloatArray109[9] * this.aFloatArray109[14] - this.aFloatArray109[7] * this.aFloatArray109[10] * this.aFloatArray109[13]) * local4;
		@Pc(189) float local189 = (-this.aFloatArray109[1] * this.aFloatArray109[10] * this.aFloatArray109[15] + this.aFloatArray109[1] * this.aFloatArray109[11] * this.aFloatArray109[14] + this.aFloatArray109[2] * this.aFloatArray109[9] * this.aFloatArray109[15] - this.aFloatArray109[2] * this.aFloatArray109[11] * this.aFloatArray109[13] - this.aFloatArray109[3] * this.aFloatArray109[9] * this.aFloatArray109[14] + this.aFloatArray109[3] * this.aFloatArray109[10] * this.aFloatArray109[13]) * local4;
		@Pc(281) float local281 = (this.aFloatArray109[1] * this.aFloatArray109[6] * this.aFloatArray109[15] - this.aFloatArray109[1] * this.aFloatArray109[7] * this.aFloatArray109[14] - this.aFloatArray109[2] * this.aFloatArray109[5] * this.aFloatArray109[15] + this.aFloatArray109[2] * this.aFloatArray109[7] * this.aFloatArray109[13] + this.aFloatArray109[3] * this.aFloatArray109[5] * this.aFloatArray109[14] - this.aFloatArray109[3] * this.aFloatArray109[6] * this.aFloatArray109[13]) * local4;
		@Pc(374) float local374 = (-this.aFloatArray109[1] * this.aFloatArray109[6] * this.aFloatArray109[11] + this.aFloatArray109[1] * this.aFloatArray109[7] * this.aFloatArray109[10] + this.aFloatArray109[2] * this.aFloatArray109[5] * this.aFloatArray109[11] - this.aFloatArray109[2] * this.aFloatArray109[7] * this.aFloatArray109[9] - this.aFloatArray109[3] * this.aFloatArray109[5] * this.aFloatArray109[10] + this.aFloatArray109[3] * this.aFloatArray109[6] * this.aFloatArray109[9]) * local4;
		@Pc(467) float local467 = (-this.aFloatArray109[4] * this.aFloatArray109[10] * this.aFloatArray109[15] + this.aFloatArray109[4] * this.aFloatArray109[11] * this.aFloatArray109[14] + this.aFloatArray109[6] * this.aFloatArray109[8] * this.aFloatArray109[15] - this.aFloatArray109[6] * this.aFloatArray109[11] * this.aFloatArray109[12] - this.aFloatArray109[7] * this.aFloatArray109[8] * this.aFloatArray109[14] + this.aFloatArray109[7] * this.aFloatArray109[10] * this.aFloatArray109[12]) * local4;
		@Pc(559) float local559 = (this.aFloatArray109[0] * this.aFloatArray109[10] * this.aFloatArray109[15] - this.aFloatArray109[0] * this.aFloatArray109[11] * this.aFloatArray109[14] - this.aFloatArray109[2] * this.aFloatArray109[8] * this.aFloatArray109[15] + this.aFloatArray109[2] * this.aFloatArray109[11] * this.aFloatArray109[12] + this.aFloatArray109[3] * this.aFloatArray109[8] * this.aFloatArray109[14] - this.aFloatArray109[3] * this.aFloatArray109[10] * this.aFloatArray109[12]) * local4;
		@Pc(652) float local652 = (-this.aFloatArray109[0] * this.aFloatArray109[6] * this.aFloatArray109[15] + this.aFloatArray109[0] * this.aFloatArray109[7] * this.aFloatArray109[14] + this.aFloatArray109[2] * this.aFloatArray109[4] * this.aFloatArray109[15] - this.aFloatArray109[2] * this.aFloatArray109[7] * this.aFloatArray109[12] - this.aFloatArray109[3] * this.aFloatArray109[4] * this.aFloatArray109[14] + this.aFloatArray109[3] * this.aFloatArray109[6] * this.aFloatArray109[12]) * local4;
		@Pc(744) float local744 = (this.aFloatArray109[0] * this.aFloatArray109[6] * this.aFloatArray109[11] - this.aFloatArray109[0] * this.aFloatArray109[7] * this.aFloatArray109[10] - this.aFloatArray109[2] * this.aFloatArray109[4] * this.aFloatArray109[11] + this.aFloatArray109[2] * this.aFloatArray109[7] * this.aFloatArray109[8] + this.aFloatArray109[3] * this.aFloatArray109[4] * this.aFloatArray109[10] - this.aFloatArray109[3] * this.aFloatArray109[6] * this.aFloatArray109[8]) * local4;
		@Pc(836) float local836 = (this.aFloatArray109[4] * this.aFloatArray109[9] * this.aFloatArray109[15] - this.aFloatArray109[4] * this.aFloatArray109[11] * this.aFloatArray109[13] - this.aFloatArray109[5] * this.aFloatArray109[8] * this.aFloatArray109[15] + this.aFloatArray109[5] * this.aFloatArray109[11] * this.aFloatArray109[12] + this.aFloatArray109[7] * this.aFloatArray109[8] * this.aFloatArray109[13] - this.aFloatArray109[7] * this.aFloatArray109[9] * this.aFloatArray109[12]) * local4;
		@Pc(929) float local929 = (-this.aFloatArray109[0] * this.aFloatArray109[9] * this.aFloatArray109[15] + this.aFloatArray109[0] * this.aFloatArray109[11] * this.aFloatArray109[13] + this.aFloatArray109[1] * this.aFloatArray109[8] * this.aFloatArray109[15] - this.aFloatArray109[1] * this.aFloatArray109[11] * this.aFloatArray109[12] - this.aFloatArray109[3] * this.aFloatArray109[8] * this.aFloatArray109[13] + this.aFloatArray109[3] * this.aFloatArray109[9] * this.aFloatArray109[12]) * local4;
		@Pc(1021) float local1021 = (this.aFloatArray109[0] * this.aFloatArray109[5] * this.aFloatArray109[15] - this.aFloatArray109[0] * this.aFloatArray109[7] * this.aFloatArray109[13] - this.aFloatArray109[1] * this.aFloatArray109[4] * this.aFloatArray109[15] + this.aFloatArray109[1] * this.aFloatArray109[7] * this.aFloatArray109[12] + this.aFloatArray109[3] * this.aFloatArray109[4] * this.aFloatArray109[13] - this.aFloatArray109[3] * this.aFloatArray109[5] * this.aFloatArray109[12]) * local4;
		@Pc(1114) float local1114 = (-this.aFloatArray109[0] * this.aFloatArray109[5] * this.aFloatArray109[11] + this.aFloatArray109[0] * this.aFloatArray109[7] * this.aFloatArray109[9] + this.aFloatArray109[1] * this.aFloatArray109[4] * this.aFloatArray109[11] - this.aFloatArray109[1] * this.aFloatArray109[7] * this.aFloatArray109[8] - this.aFloatArray109[3] * this.aFloatArray109[4] * this.aFloatArray109[9] + this.aFloatArray109[3] * this.aFloatArray109[5] * this.aFloatArray109[8]) * local4;
		@Pc(1207) float local1207 = (-this.aFloatArray109[4] * this.aFloatArray109[9] * this.aFloatArray109[14] + this.aFloatArray109[4] * this.aFloatArray109[10] * this.aFloatArray109[13] + this.aFloatArray109[5] * this.aFloatArray109[8] * this.aFloatArray109[14] - this.aFloatArray109[5] * this.aFloatArray109[10] * this.aFloatArray109[12] - this.aFloatArray109[6] * this.aFloatArray109[8] * this.aFloatArray109[13] + this.aFloatArray109[6] * this.aFloatArray109[9] * this.aFloatArray109[12]) * local4;
		@Pc(1299) float local1299 = (this.aFloatArray109[0] * this.aFloatArray109[9] * this.aFloatArray109[14] - this.aFloatArray109[0] * this.aFloatArray109[10] * this.aFloatArray109[13] - this.aFloatArray109[1] * this.aFloatArray109[8] * this.aFloatArray109[14] + this.aFloatArray109[1] * this.aFloatArray109[10] * this.aFloatArray109[12] + this.aFloatArray109[2] * this.aFloatArray109[8] * this.aFloatArray109[13] - this.aFloatArray109[2] * this.aFloatArray109[9] * this.aFloatArray109[12]) * local4;
		@Pc(1392) float local1392 = (-this.aFloatArray109[0] * this.aFloatArray109[5] * this.aFloatArray109[14] + this.aFloatArray109[0] * this.aFloatArray109[6] * this.aFloatArray109[13] + this.aFloatArray109[1] * this.aFloatArray109[4] * this.aFloatArray109[14] - this.aFloatArray109[1] * this.aFloatArray109[6] * this.aFloatArray109[12] - this.aFloatArray109[2] * this.aFloatArray109[4] * this.aFloatArray109[13] + this.aFloatArray109[2] * this.aFloatArray109[5] * this.aFloatArray109[12]) * local4;
		@Pc(1484) float local1484 = (this.aFloatArray109[0] * this.aFloatArray109[5] * this.aFloatArray109[10] - this.aFloatArray109[0] * this.aFloatArray109[6] * this.aFloatArray109[9] - this.aFloatArray109[1] * this.aFloatArray109[4] * this.aFloatArray109[10] + this.aFloatArray109[1] * this.aFloatArray109[6] * this.aFloatArray109[8] + this.aFloatArray109[2] * this.aFloatArray109[4] * this.aFloatArray109[9] - this.aFloatArray109[2] * this.aFloatArray109[5] * this.aFloatArray109[8]) * local4;
		this.aFloatArray109[0] = local96;
		this.aFloatArray109[1] = local189;
		this.aFloatArray109[2] = local281;
		this.aFloatArray109[3] = local374;
		this.aFloatArray109[4] = local467;
		this.aFloatArray109[5] = local559;
		this.aFloatArray109[6] = local652;
		this.aFloatArray109[7] = local744;
		this.aFloatArray109[8] = local836;
		this.aFloatArray109[9] = local929;
		this.aFloatArray109[10] = local1021;
		this.aFloatArray109[11] = local1114;
		this.aFloatArray109[12] = local1207;
		this.aFloatArray109[13] = local1299;
		this.aFloatArray109[14] = local1392;
		this.aFloatArray109[15] = local1484;
	}

	@OriginalMember(owner = "client!oi", name = "bc", descriptor = "()V", line = 145)
	public void method28976() {
		@Pc(4) float local4 = 1.0F / this.method28970();
		@Pc(96) float local96 = (this.aFloatArray109[5] * this.aFloatArray109[10] * this.aFloatArray109[15] - this.aFloatArray109[5] * this.aFloatArray109[11] * this.aFloatArray109[14] - this.aFloatArray109[6] * this.aFloatArray109[9] * this.aFloatArray109[15] + this.aFloatArray109[6] * this.aFloatArray109[11] * this.aFloatArray109[13] + this.aFloatArray109[7] * this.aFloatArray109[9] * this.aFloatArray109[14] - this.aFloatArray109[7] * this.aFloatArray109[10] * this.aFloatArray109[13]) * local4;
		@Pc(189) float local189 = (-this.aFloatArray109[1] * this.aFloatArray109[10] * this.aFloatArray109[15] + this.aFloatArray109[1] * this.aFloatArray109[11] * this.aFloatArray109[14] + this.aFloatArray109[2] * this.aFloatArray109[9] * this.aFloatArray109[15] - this.aFloatArray109[2] * this.aFloatArray109[11] * this.aFloatArray109[13] - this.aFloatArray109[3] * this.aFloatArray109[9] * this.aFloatArray109[14] + this.aFloatArray109[3] * this.aFloatArray109[10] * this.aFloatArray109[13]) * local4;
		@Pc(281) float local281 = (this.aFloatArray109[1] * this.aFloatArray109[6] * this.aFloatArray109[15] - this.aFloatArray109[1] * this.aFloatArray109[7] * this.aFloatArray109[14] - this.aFloatArray109[2] * this.aFloatArray109[5] * this.aFloatArray109[15] + this.aFloatArray109[2] * this.aFloatArray109[7] * this.aFloatArray109[13] + this.aFloatArray109[3] * this.aFloatArray109[5] * this.aFloatArray109[14] - this.aFloatArray109[3] * this.aFloatArray109[6] * this.aFloatArray109[13]) * local4;
		@Pc(374) float local374 = (-this.aFloatArray109[1] * this.aFloatArray109[6] * this.aFloatArray109[11] + this.aFloatArray109[1] * this.aFloatArray109[7] * this.aFloatArray109[10] + this.aFloatArray109[2] * this.aFloatArray109[5] * this.aFloatArray109[11] - this.aFloatArray109[2] * this.aFloatArray109[7] * this.aFloatArray109[9] - this.aFloatArray109[3] * this.aFloatArray109[5] * this.aFloatArray109[10] + this.aFloatArray109[3] * this.aFloatArray109[6] * this.aFloatArray109[9]) * local4;
		@Pc(467) float local467 = (-this.aFloatArray109[4] * this.aFloatArray109[10] * this.aFloatArray109[15] + this.aFloatArray109[4] * this.aFloatArray109[11] * this.aFloatArray109[14] + this.aFloatArray109[6] * this.aFloatArray109[8] * this.aFloatArray109[15] - this.aFloatArray109[6] * this.aFloatArray109[11] * this.aFloatArray109[12] - this.aFloatArray109[7] * this.aFloatArray109[8] * this.aFloatArray109[14] + this.aFloatArray109[7] * this.aFloatArray109[10] * this.aFloatArray109[12]) * local4;
		@Pc(559) float local559 = (this.aFloatArray109[0] * this.aFloatArray109[10] * this.aFloatArray109[15] - this.aFloatArray109[0] * this.aFloatArray109[11] * this.aFloatArray109[14] - this.aFloatArray109[2] * this.aFloatArray109[8] * this.aFloatArray109[15] + this.aFloatArray109[2] * this.aFloatArray109[11] * this.aFloatArray109[12] + this.aFloatArray109[3] * this.aFloatArray109[8] * this.aFloatArray109[14] - this.aFloatArray109[3] * this.aFloatArray109[10] * this.aFloatArray109[12]) * local4;
		@Pc(652) float local652 = (-this.aFloatArray109[0] * this.aFloatArray109[6] * this.aFloatArray109[15] + this.aFloatArray109[0] * this.aFloatArray109[7] * this.aFloatArray109[14] + this.aFloatArray109[2] * this.aFloatArray109[4] * this.aFloatArray109[15] - this.aFloatArray109[2] * this.aFloatArray109[7] * this.aFloatArray109[12] - this.aFloatArray109[3] * this.aFloatArray109[4] * this.aFloatArray109[14] + this.aFloatArray109[3] * this.aFloatArray109[6] * this.aFloatArray109[12]) * local4;
		@Pc(744) float local744 = (this.aFloatArray109[0] * this.aFloatArray109[6] * this.aFloatArray109[11] - this.aFloatArray109[0] * this.aFloatArray109[7] * this.aFloatArray109[10] - this.aFloatArray109[2] * this.aFloatArray109[4] * this.aFloatArray109[11] + this.aFloatArray109[2] * this.aFloatArray109[7] * this.aFloatArray109[8] + this.aFloatArray109[3] * this.aFloatArray109[4] * this.aFloatArray109[10] - this.aFloatArray109[3] * this.aFloatArray109[6] * this.aFloatArray109[8]) * local4;
		@Pc(836) float local836 = (this.aFloatArray109[4] * this.aFloatArray109[9] * this.aFloatArray109[15] - this.aFloatArray109[4] * this.aFloatArray109[11] * this.aFloatArray109[13] - this.aFloatArray109[5] * this.aFloatArray109[8] * this.aFloatArray109[15] + this.aFloatArray109[5] * this.aFloatArray109[11] * this.aFloatArray109[12] + this.aFloatArray109[7] * this.aFloatArray109[8] * this.aFloatArray109[13] - this.aFloatArray109[7] * this.aFloatArray109[9] * this.aFloatArray109[12]) * local4;
		@Pc(929) float local929 = (-this.aFloatArray109[0] * this.aFloatArray109[9] * this.aFloatArray109[15] + this.aFloatArray109[0] * this.aFloatArray109[11] * this.aFloatArray109[13] + this.aFloatArray109[1] * this.aFloatArray109[8] * this.aFloatArray109[15] - this.aFloatArray109[1] * this.aFloatArray109[11] * this.aFloatArray109[12] - this.aFloatArray109[3] * this.aFloatArray109[8] * this.aFloatArray109[13] + this.aFloatArray109[3] * this.aFloatArray109[9] * this.aFloatArray109[12]) * local4;
		@Pc(1021) float local1021 = (this.aFloatArray109[0] * this.aFloatArray109[5] * this.aFloatArray109[15] - this.aFloatArray109[0] * this.aFloatArray109[7] * this.aFloatArray109[13] - this.aFloatArray109[1] * this.aFloatArray109[4] * this.aFloatArray109[15] + this.aFloatArray109[1] * this.aFloatArray109[7] * this.aFloatArray109[12] + this.aFloatArray109[3] * this.aFloatArray109[4] * this.aFloatArray109[13] - this.aFloatArray109[3] * this.aFloatArray109[5] * this.aFloatArray109[12]) * local4;
		@Pc(1114) float local1114 = (-this.aFloatArray109[0] * this.aFloatArray109[5] * this.aFloatArray109[11] + this.aFloatArray109[0] * this.aFloatArray109[7] * this.aFloatArray109[9] + this.aFloatArray109[1] * this.aFloatArray109[4] * this.aFloatArray109[11] - this.aFloatArray109[1] * this.aFloatArray109[7] * this.aFloatArray109[8] - this.aFloatArray109[3] * this.aFloatArray109[4] * this.aFloatArray109[9] + this.aFloatArray109[3] * this.aFloatArray109[5] * this.aFloatArray109[8]) * local4;
		@Pc(1207) float local1207 = (-this.aFloatArray109[4] * this.aFloatArray109[9] * this.aFloatArray109[14] + this.aFloatArray109[4] * this.aFloatArray109[10] * this.aFloatArray109[13] + this.aFloatArray109[5] * this.aFloatArray109[8] * this.aFloatArray109[14] - this.aFloatArray109[5] * this.aFloatArray109[10] * this.aFloatArray109[12] - this.aFloatArray109[6] * this.aFloatArray109[8] * this.aFloatArray109[13] + this.aFloatArray109[6] * this.aFloatArray109[9] * this.aFloatArray109[12]) * local4;
		@Pc(1299) float local1299 = (this.aFloatArray109[0] * this.aFloatArray109[9] * this.aFloatArray109[14] - this.aFloatArray109[0] * this.aFloatArray109[10] * this.aFloatArray109[13] - this.aFloatArray109[1] * this.aFloatArray109[8] * this.aFloatArray109[14] + this.aFloatArray109[1] * this.aFloatArray109[10] * this.aFloatArray109[12] + this.aFloatArray109[2] * this.aFloatArray109[8] * this.aFloatArray109[13] - this.aFloatArray109[2] * this.aFloatArray109[9] * this.aFloatArray109[12]) * local4;
		@Pc(1392) float local1392 = (-this.aFloatArray109[0] * this.aFloatArray109[5] * this.aFloatArray109[14] + this.aFloatArray109[0] * this.aFloatArray109[6] * this.aFloatArray109[13] + this.aFloatArray109[1] * this.aFloatArray109[4] * this.aFloatArray109[14] - this.aFloatArray109[1] * this.aFloatArray109[6] * this.aFloatArray109[12] - this.aFloatArray109[2] * this.aFloatArray109[4] * this.aFloatArray109[13] + this.aFloatArray109[2] * this.aFloatArray109[5] * this.aFloatArray109[12]) * local4;
		@Pc(1484) float local1484 = (this.aFloatArray109[0] * this.aFloatArray109[5] * this.aFloatArray109[10] - this.aFloatArray109[0] * this.aFloatArray109[6] * this.aFloatArray109[9] - this.aFloatArray109[1] * this.aFloatArray109[4] * this.aFloatArray109[10] + this.aFloatArray109[1] * this.aFloatArray109[6] * this.aFloatArray109[8] + this.aFloatArray109[2] * this.aFloatArray109[4] * this.aFloatArray109[9] - this.aFloatArray109[2] * this.aFloatArray109[5] * this.aFloatArray109[8]) * local4;
		this.aFloatArray109[0] = local96;
		this.aFloatArray109[1] = local189;
		this.aFloatArray109[2] = local281;
		this.aFloatArray109[3] = local374;
		this.aFloatArray109[4] = local467;
		this.aFloatArray109[5] = local559;
		this.aFloatArray109[6] = local652;
		this.aFloatArray109[7] = local744;
		this.aFloatArray109[8] = local836;
		this.aFloatArray109[9] = local929;
		this.aFloatArray109[10] = local1021;
		this.aFloatArray109[11] = local1114;
		this.aFloatArray109[12] = local1207;
		this.aFloatArray109[13] = local1299;
		this.aFloatArray109[14] = local1392;
		this.aFloatArray109[15] = local1484;
	}

	@OriginalMember(owner = "client!oi", name = "ba", descriptor = "(FFFF)V", line = 181)
	public void method28977(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3) {
		this.aFloatArray109[0] = arg0;
		this.aFloatArray109[1] = 0.0F;
		this.aFloatArray109[2] = 0.0F;
		this.aFloatArray109[3] = 0.0F;
		this.aFloatArray109[4] = 0.0F;
		this.aFloatArray109[5] = arg1;
		this.aFloatArray109[6] = 0.0F;
		this.aFloatArray109[7] = 0.0F;
		this.aFloatArray109[8] = 0.0F;
		this.aFloatArray109[9] = 0.0F;
		this.aFloatArray109[10] = arg2;
		this.aFloatArray109[11] = 0.0F;
		this.aFloatArray109[12] = 0.0F;
		this.aFloatArray109[13] = 0.0F;
		this.aFloatArray109[14] = 0.0F;
		this.aFloatArray109[15] = arg3;
	}

	@OriginalMember(owner = "client!oi", name = "bv", descriptor = "(FFFF)V", line = 181)
	public void method28978(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3) {
		this.aFloatArray109[0] = arg0;
		this.aFloatArray109[1] = 0.0F;
		this.aFloatArray109[2] = 0.0F;
		this.aFloatArray109[3] = 0.0F;
		this.aFloatArray109[4] = 0.0F;
		this.aFloatArray109[5] = arg1;
		this.aFloatArray109[6] = 0.0F;
		this.aFloatArray109[7] = 0.0F;
		this.aFloatArray109[8] = 0.0F;
		this.aFloatArray109[9] = 0.0F;
		this.aFloatArray109[10] = arg2;
		this.aFloatArray109[11] = 0.0F;
		this.aFloatArray109[12] = 0.0F;
		this.aFloatArray109[13] = 0.0F;
		this.aFloatArray109[14] = 0.0F;
		this.aFloatArray109[15] = arg3;
	}

	@OriginalMember(owner = "client!oi", name = "x", descriptor = "(FFFF)V", line = 181)
	public void method28979(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3) {
		this.aFloatArray109[0] = arg0;
		this.aFloatArray109[1] = 0.0F;
		this.aFloatArray109[2] = 0.0F;
		this.aFloatArray109[3] = 0.0F;
		this.aFloatArray109[4] = 0.0F;
		this.aFloatArray109[5] = arg1;
		this.aFloatArray109[6] = 0.0F;
		this.aFloatArray109[7] = 0.0F;
		this.aFloatArray109[8] = 0.0F;
		this.aFloatArray109[9] = 0.0F;
		this.aFloatArray109[10] = arg2;
		this.aFloatArray109[11] = 0.0F;
		this.aFloatArray109[12] = 0.0F;
		this.aFloatArray109[13] = 0.0F;
		this.aFloatArray109[14] = 0.0F;
		this.aFloatArray109[15] = arg3;
	}

	@OriginalMember(owner = "client!oi", name = "bl", descriptor = "()Z", line = 200)
	public boolean method28980() {
		return this.aFloatArray109[0] == 1.0F && this.aFloatArray109[1] == 0.0F && this.aFloatArray109[2] == 0.0F && this.aFloatArray109[3] == 0.0F && this.aFloatArray109[4] == 0.0F && this.aFloatArray109[5] == 1.0F && this.aFloatArray109[6] == 0.0F && this.aFloatArray109[7] == 0.0F && this.aFloatArray109[8] == 0.0F && this.aFloatArray109[9] == 0.0F && this.aFloatArray109[10] == 1.0F && this.aFloatArray109[11] == 0.0F && this.aFloatArray109[12] == 0.0F && this.aFloatArray109[13] == 0.0F && this.aFloatArray109[14] == 0.0F && this.aFloatArray109[15] == 1.0F;
	}

	@OriginalMember(owner = "client!oi", name = "bb", descriptor = "()Z", line = 200)
	public boolean method28981() {
		return this.aFloatArray109[0] == 1.0F && this.aFloatArray109[1] == 0.0F && this.aFloatArray109[2] == 0.0F && this.aFloatArray109[3] == 0.0F && this.aFloatArray109[4] == 0.0F && this.aFloatArray109[5] == 1.0F && this.aFloatArray109[6] == 0.0F && this.aFloatArray109[7] == 0.0F && this.aFloatArray109[8] == 0.0F && this.aFloatArray109[9] == 0.0F && this.aFloatArray109[10] == 1.0F && this.aFloatArray109[11] == 0.0F && this.aFloatArray109[12] == 0.0F && this.aFloatArray109[13] == 0.0F && this.aFloatArray109[14] == 0.0F && this.aFloatArray109[15] == 1.0F;
	}

	@OriginalMember(owner = "client!oi", name = "d", descriptor = "()Z", line = 200)
	public boolean method28982() {
		return this.aFloatArray109[0] == 1.0F && this.aFloatArray109[1] == 0.0F && this.aFloatArray109[2] == 0.0F && this.aFloatArray109[3] == 0.0F && this.aFloatArray109[4] == 0.0F && this.aFloatArray109[5] == 1.0F && this.aFloatArray109[6] == 0.0F && this.aFloatArray109[7] == 0.0F && this.aFloatArray109[8] == 0.0F && this.aFloatArray109[9] == 0.0F && this.aFloatArray109[10] == 1.0F && this.aFloatArray109[11] == 0.0F && this.aFloatArray109[12] == 0.0F && this.aFloatArray109[13] == 0.0F && this.aFloatArray109[14] == 0.0F && this.aFloatArray109[15] == 1.0F;
	}

	@OriginalMember(owner = "client!oi", name = "bd", descriptor = "()Z", line = 200)
	public boolean method28983() {
		return this.aFloatArray109[0] == 1.0F && this.aFloatArray109[1] == 0.0F && this.aFloatArray109[2] == 0.0F && this.aFloatArray109[3] == 0.0F && this.aFloatArray109[4] == 0.0F && this.aFloatArray109[5] == 1.0F && this.aFloatArray109[6] == 0.0F && this.aFloatArray109[7] == 0.0F && this.aFloatArray109[8] == 0.0F && this.aFloatArray109[9] == 0.0F && this.aFloatArray109[10] == 1.0F && this.aFloatArray109[11] == 0.0F && this.aFloatArray109[12] == 0.0F && this.aFloatArray109[13] == 0.0F && this.aFloatArray109[14] == 0.0F && this.aFloatArray109[15] == 1.0F;
	}

	@OriginalMember(owner = "client!oi", name = "s", descriptor = "(FFF[F)V", line = 204)
	public void method28984(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float[] arg3) {
		arg3[0] = this.aFloatArray109[0] * arg0 + this.aFloatArray109[4] * arg1 + this.aFloatArray109[8] * arg2 + this.aFloatArray109[12];
		arg3[1] = this.aFloatArray109[1] * arg0 + this.aFloatArray109[5] * arg1 + this.aFloatArray109[9] * arg2 + this.aFloatArray109[13];
		arg3[2] = this.aFloatArray109[2] * arg0 + this.aFloatArray109[6] * arg1 + this.aFloatArray109[10] * arg2 + this.aFloatArray109[14];
		if (arg3.length > 3) {
			arg3[3] = this.aFloatArray109[3] * arg0 + this.aFloatArray109[7] * arg1 + this.aFloatArray109[11] * arg2 + this.aFloatArray109[15];
		}
	}

	@OriginalMember(owner = "client!oi", name = "bw", descriptor = "(FFF[F)V", line = 204)
	public void method28985(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float[] arg3) {
		arg3[0] = this.aFloatArray109[0] * arg0 + this.aFloatArray109[4] * arg1 + this.aFloatArray109[8] * arg2 + this.aFloatArray109[12];
		arg3[1] = this.aFloatArray109[1] * arg0 + this.aFloatArray109[5] * arg1 + this.aFloatArray109[9] * arg2 + this.aFloatArray109[13];
		arg3[2] = this.aFloatArray109[2] * arg0 + this.aFloatArray109[6] * arg1 + this.aFloatArray109[10] * arg2 + this.aFloatArray109[14];
		if (arg3.length > 3) {
			arg3[3] = this.aFloatArray109[3] * arg0 + this.aFloatArray109[7] * arg1 + this.aFloatArray109[11] * arg2 + this.aFloatArray109[15];
		}
	}

	@OriginalMember(owner = "client!oi", name = "bi", descriptor = "(FFF[F)V", line = 204)
	public void method28986(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float[] arg3) {
		arg3[0] = this.aFloatArray109[0] * arg0 + this.aFloatArray109[4] * arg1 + this.aFloatArray109[8] * arg2 + this.aFloatArray109[12];
		arg3[1] = this.aFloatArray109[1] * arg0 + this.aFloatArray109[5] * arg1 + this.aFloatArray109[9] * arg2 + this.aFloatArray109[13];
		arg3[2] = this.aFloatArray109[2] * arg0 + this.aFloatArray109[6] * arg1 + this.aFloatArray109[10] * arg2 + this.aFloatArray109[14];
		if (arg3.length > 3) {
			arg3[3] = this.aFloatArray109[3] * arg0 + this.aFloatArray109[7] * arg1 + this.aFloatArray109[11] * arg2 + this.aFloatArray109[15];
		}
	}

	@OriginalMember(owner = "client!oi", name = "bg", descriptor = "(FFF[F)V", line = 204)
	public void method28987(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float[] arg3) {
		arg3[0] = this.aFloatArray109[0] * arg0 + this.aFloatArray109[4] * arg1 + this.aFloatArray109[8] * arg2 + this.aFloatArray109[12];
		arg3[1] = this.aFloatArray109[1] * arg0 + this.aFloatArray109[5] * arg1 + this.aFloatArray109[9] * arg2 + this.aFloatArray109[13];
		arg3[2] = this.aFloatArray109[2] * arg0 + this.aFloatArray109[6] * arg1 + this.aFloatArray109[10] * arg2 + this.aFloatArray109[14];
		if (arg3.length > 3) {
			arg3[3] = this.aFloatArray109[3] * arg0 + this.aFloatArray109[7] * arg1 + this.aFloatArray109[11] * arg2 + this.aFloatArray109[15];
		}
	}

	@OriginalMember(owner = "client!oi", name = "bx", descriptor = "(FFF[F)V", line = 204)
	public void method28988(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float[] arg3) {
		arg3[0] = this.aFloatArray109[0] * arg0 + this.aFloatArray109[4] * arg1 + this.aFloatArray109[8] * arg2 + this.aFloatArray109[12];
		arg3[1] = this.aFloatArray109[1] * arg0 + this.aFloatArray109[5] * arg1 + this.aFloatArray109[9] * arg2 + this.aFloatArray109[13];
		arg3[2] = this.aFloatArray109[2] * arg0 + this.aFloatArray109[6] * arg1 + this.aFloatArray109[10] * arg2 + this.aFloatArray109[14];
		if (arg3.length > 3) {
			arg3[3] = this.aFloatArray109[3] * arg0 + this.aFloatArray109[7] * arg1 + this.aFloatArray109[11] * arg2 + this.aFloatArray109[15];
		}
	}

	@OriginalMember(owner = "client!oi", name = "by", descriptor = "(FFF[F)V", line = 204)
	public void method28989(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float[] arg3) {
		arg3[0] = this.aFloatArray109[0] * arg0 + this.aFloatArray109[4] * arg1 + this.aFloatArray109[8] * arg2 + this.aFloatArray109[12];
		arg3[1] = this.aFloatArray109[1] * arg0 + this.aFloatArray109[5] * arg1 + this.aFloatArray109[9] * arg2 + this.aFloatArray109[13];
		arg3[2] = this.aFloatArray109[2] * arg0 + this.aFloatArray109[6] * arg1 + this.aFloatArray109[10] * arg2 + this.aFloatArray109[14];
		if (arg3.length > 3) {
			arg3[3] = this.aFloatArray109[3] * arg0 + this.aFloatArray109[7] * arg1 + this.aFloatArray109[11] * arg2 + this.aFloatArray109[15];
		}
	}

	@OriginalMember(owner = "client!oi", name = "r", descriptor = "([F)V", line = 211)
	public void method28990(@OriginalArg(0) float[] arg0) {
		@Pc(3) float local3 = arg0[0];
		@Pc(7) float local7 = arg0[1];
		@Pc(11) float local11 = arg0[2];
		arg0[0] = this.aFloatArray109[0] * local3 + this.aFloatArray109[4] * local7 + this.aFloatArray109[8] * local11 + this.aFloatArray109[12];
		arg0[1] = this.aFloatArray109[1] * local3 + this.aFloatArray109[5] * local7 + this.aFloatArray109[9] * local11 + this.aFloatArray109[13];
		arg0[2] = this.aFloatArray109[2] * local3 + this.aFloatArray109[6] * local7 + this.aFloatArray109[10] * local11 + this.aFloatArray109[14];
	}

	@OriginalMember(owner = "client!oi", name = "bt", descriptor = "([F)V", line = 211)
	public void method28991(@OriginalArg(0) float[] arg0) {
		@Pc(3) float local3 = arg0[0];
		@Pc(7) float local7 = arg0[1];
		@Pc(11) float local11 = arg0[2];
		arg0[0] = this.aFloatArray109[0] * local3 + this.aFloatArray109[4] * local7 + this.aFloatArray109[8] * local11 + this.aFloatArray109[12];
		arg0[1] = this.aFloatArray109[1] * local3 + this.aFloatArray109[5] * local7 + this.aFloatArray109[9] * local11 + this.aFloatArray109[13];
		arg0[2] = this.aFloatArray109[2] * local3 + this.aFloatArray109[6] * local7 + this.aFloatArray109[10] * local11 + this.aFloatArray109[14];
	}

	@OriginalMember(owner = "client!oi", name = "bs", descriptor = "([F)V", line = 211)
	public void method28992(@OriginalArg(0) float[] arg0) {
		@Pc(3) float local3 = arg0[0];
		@Pc(7) float local7 = arg0[1];
		@Pc(11) float local11 = arg0[2];
		arg0[0] = this.aFloatArray109[0] * local3 + this.aFloatArray109[4] * local7 + this.aFloatArray109[8] * local11 + this.aFloatArray109[12];
		arg0[1] = this.aFloatArray109[1] * local3 + this.aFloatArray109[5] * local7 + this.aFloatArray109[9] * local11 + this.aFloatArray109[13];
		arg0[2] = this.aFloatArray109[2] * local3 + this.aFloatArray109[6] * local7 + this.aFloatArray109[10] * local11 + this.aFloatArray109[14];
	}

	@OriginalMember(owner = "client!oi", name = "g", descriptor = "(FFF[F)V", line = 220)
	public void method28993(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float[] arg3) {
		arg3[0] = this.aFloatArray109[0] * arg0 + this.aFloatArray109[4] * arg1 + this.aFloatArray109[8] * arg2;
		arg3[1] = this.aFloatArray109[1] * arg0 + this.aFloatArray109[5] * arg1 + this.aFloatArray109[9] * arg2;
		arg3[2] = this.aFloatArray109[2] * arg0 + this.aFloatArray109[6] * arg1 + this.aFloatArray109[10] * arg2;
		if (arg3.length > 3) {
			arg3[3] = this.aFloatArray109[3] * arg0 + this.aFloatArray109[7] * arg1 + this.aFloatArray109[11] * arg2;
		}
	}

	@OriginalMember(owner = "client!oi", name = "bz", descriptor = "(FFF[F)V", line = 220)
	public void method28994(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float[] arg3) {
		arg3[0] = this.aFloatArray109[0] * arg0 + this.aFloatArray109[4] * arg1 + this.aFloatArray109[8] * arg2;
		arg3[1] = this.aFloatArray109[1] * arg0 + this.aFloatArray109[5] * arg1 + this.aFloatArray109[9] * arg2;
		arg3[2] = this.aFloatArray109[2] * arg0 + this.aFloatArray109[6] * arg1 + this.aFloatArray109[10] * arg2;
		if (arg3.length > 3) {
			arg3[3] = this.aFloatArray109[3] * arg0 + this.aFloatArray109[7] * arg1 + this.aFloatArray109[11] * arg2;
		}
	}

	@OriginalMember(owner = "client!oi", name = "z", descriptor = "(FFFFFF)V", line = 227)
	public void method28995(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		this.aFloatArray109[0] = 2.0F / (arg1 - arg0);
		this.aFloatArray109[1] = 0.0F;
		this.aFloatArray109[2] = 0.0F;
		this.aFloatArray109[3] = 0.0F;
		this.aFloatArray109[4] = 0.0F;
		this.aFloatArray109[5] = 2.0F / (arg3 - arg2);
		this.aFloatArray109[6] = 0.0F;
		this.aFloatArray109[7] = 0.0F;
		this.aFloatArray109[8] = 0.0F;
		this.aFloatArray109[9] = 0.0F;
		this.aFloatArray109[10] = 2.0F / (arg5 - arg4);
		this.aFloatArray109[11] = 0.0F;
		this.aFloatArray109[12] = -(arg1 + arg0) / (arg1 - arg0);
		this.aFloatArray109[13] = -(arg3 + arg2) / (arg3 - arg2);
		this.aFloatArray109[14] = -(arg5 + arg4) / (arg5 - arg4);
		this.aFloatArray109[15] = 1.0F;
	}

	@OriginalMember(owner = "client!oi", name = "j", descriptor = "(FFFF)V", line = 246)
	public void method28996(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3) {
		@Pc(9) float local9 = (float) (Math.tan((double) (arg2 / 2.0F)) * (double) arg0);
		@Pc(19) float local19 = (float) (Math.tan((double) (arg3 / 2.0F)) * (double) arg0);
		this.method29005(-local9, local9, -local19, local19, arg0, arg1);
	}

	@OriginalMember(owner = "client!oi", name = "bn", descriptor = "(FFFF)V", line = 246)
	public void method28997(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3) {
		@Pc(9) float local9 = (float) (Math.tan((double) (arg2 / 2.0F)) * (double) arg0);
		@Pc(19) float local19 = (float) (Math.tan((double) (arg3 / 2.0F)) * (double) arg0);
		this.method29005(-local9, local9, -local19, local19, arg0, arg1);
	}

	@OriginalMember(owner = "client!oi", name = "bf", descriptor = "(FFFF)V", line = 246)
	public void method28998(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3) {
		@Pc(9) float local9 = (float) (Math.tan((double) (arg2 / 2.0F)) * (double) arg0);
		@Pc(19) float local19 = (float) (Math.tan((double) (arg3 / 2.0F)) * (double) arg0);
		this.method29005(-local9, local9, -local19, local19, arg0, arg1);
	}

	@OriginalMember(owner = "client!oi", name = "bu", descriptor = "(FFFF)V", line = 246)
	public void method28999(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3) {
		@Pc(9) float local9 = (float) (Math.tan((double) (arg2 / 2.0F)) * (double) arg0);
		@Pc(19) float local19 = (float) (Math.tan((double) (arg3 / 2.0F)) * (double) arg0);
		this.method29005(-local9, local9, -local19, local19, arg0, arg1);
	}

	@OriginalMember(owner = "client!oi", name = "i", descriptor = "(FFF)V", line = 252)
	public void method29000(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		this.method28995(-10000.0F / arg2, 10000.0F / arg2, -10000.0F / arg2, 10000.0F / arg2, arg0, arg1);
	}

	@OriginalMember(owner = "client!oi", name = "bk", descriptor = "(FFF)V", line = 252)
	public void method29001(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		this.method28995(-10000.0F / arg2, 10000.0F / arg2, -10000.0F / arg2, 10000.0F / arg2, arg0, arg1);
	}

	@OriginalMember(owner = "client!oi", name = "bp", descriptor = "(FFF)V", line = 252)
	public void method29002(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		this.method28995(-10000.0F / arg2, 10000.0F / arg2, -10000.0F / arg2, 10000.0F / arg2, arg0, arg1);
	}

	@OriginalMember(owner = "client!oi", name = "bm", descriptor = "(FFF)V", line = 252)
	public void method29003(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		this.method28995(-10000.0F / arg2, 10000.0F / arg2, -10000.0F / arg2, 10000.0F / arg2, arg0, arg1);
	}

	@OriginalMember(owner = "client!oi", name = "bo", descriptor = "(FFF)V", line = 252)
	public void method29004(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		this.method28995(-10000.0F / arg2, 10000.0F / arg2, -10000.0F / arg2, 10000.0F / arg2, arg0, arg1);
	}

	@OriginalMember(owner = "client!oi", name = "k", descriptor = "(FFFFFF)V", line = 256)
	void method29005(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		this.aFloatArray109[0] = arg4 * 2.0F / (arg1 - arg0);
		this.aFloatArray109[1] = 0.0F;
		this.aFloatArray109[2] = 0.0F;
		this.aFloatArray109[3] = 0.0F;
		this.aFloatArray109[4] = 0.0F;
		this.aFloatArray109[5] = arg4 * 2.0F / (arg3 - arg2);
		this.aFloatArray109[6] = 0.0F;
		this.aFloatArray109[7] = 0.0F;
		this.aFloatArray109[8] = (arg1 + arg0) / (arg1 - arg0);
		this.aFloatArray109[9] = (arg3 + arg2) / (arg3 - arg2);
		this.aFloatArray109[10] = (arg5 + arg4) / (arg5 - arg4);
		this.aFloatArray109[11] = 1.0F;
		this.aFloatArray109[12] = 0.0F;
		this.aFloatArray109[13] = 0.0F;
		this.aFloatArray109[14] = -(arg5 * 2.0F * arg4) / (arg5 - arg4);
		this.aFloatArray109[15] = 0.0F;
	}

	@OriginalMember(owner = "client!oi", name = "u", descriptor = "(FFFFFFFF)V", line = 275)
	public void method29006(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) float arg6, @OriginalArg(7) float arg7) {
		this.aFloatArray109[0] = arg2 * 2.0F / arg6;
		this.aFloatArray109[1] = 0.0F;
		this.aFloatArray109[2] = 0.0F;
		this.aFloatArray109[3] = 0.0F;
		this.aFloatArray109[4] = 0.0F;
		this.aFloatArray109[5] = arg3 * 2.0F / arg7;
		this.aFloatArray109[6] = 0.0F;
		this.aFloatArray109[7] = 0.0F;
		this.aFloatArray109[8] = arg0 * 2.0F / arg6 - 1.0F;
		this.aFloatArray109[9] = arg1 * 2.0F / arg7 - 1.0F;
		this.aFloatArray109[10] = (arg5 + arg4) / (arg5 - arg4);
		this.aFloatArray109[11] = 1.0F;
		this.aFloatArray109[12] = 0.0F;
		this.aFloatArray109[13] = 0.0F;
		this.aFloatArray109[14] = arg5 * 2.0F * arg4 / (arg4 - arg5);
		this.aFloatArray109[15] = 0.0F;
	}

	@OriginalMember(owner = "client!oi", name = "br", descriptor = "(FFFFFFFF)V", line = 275)
	public void method29007(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) float arg6, @OriginalArg(7) float arg7) {
		this.aFloatArray109[0] = arg2 * 2.0F / arg6;
		this.aFloatArray109[1] = 0.0F;
		this.aFloatArray109[2] = 0.0F;
		this.aFloatArray109[3] = 0.0F;
		this.aFloatArray109[4] = 0.0F;
		this.aFloatArray109[5] = arg3 * 2.0F / arg7;
		this.aFloatArray109[6] = 0.0F;
		this.aFloatArray109[7] = 0.0F;
		this.aFloatArray109[8] = arg0 * 2.0F / arg6 - 1.0F;
		this.aFloatArray109[9] = arg1 * 2.0F / arg7 - 1.0F;
		this.aFloatArray109[10] = (arg5 + arg4) / (arg5 - arg4);
		this.aFloatArray109[11] = 1.0F;
		this.aFloatArray109[12] = 0.0F;
		this.aFloatArray109[13] = 0.0F;
		this.aFloatArray109[14] = arg5 * 2.0F * arg4 / (arg4 - arg5);
		this.aFloatArray109[15] = 0.0F;
	}

	@OriginalMember(owner = "client!oi", name = "bq", descriptor = "(FFFFFFFF)V", line = 275)
	public void method29008(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) float arg6, @OriginalArg(7) float arg7) {
		this.aFloatArray109[0] = arg2 * 2.0F / arg6;
		this.aFloatArray109[1] = 0.0F;
		this.aFloatArray109[2] = 0.0F;
		this.aFloatArray109[3] = 0.0F;
		this.aFloatArray109[4] = 0.0F;
		this.aFloatArray109[5] = arg3 * 2.0F / arg7;
		this.aFloatArray109[6] = 0.0F;
		this.aFloatArray109[7] = 0.0F;
		this.aFloatArray109[8] = arg0 * 2.0F / arg6 - 1.0F;
		this.aFloatArray109[9] = arg1 * 2.0F / arg7 - 1.0F;
		this.aFloatArray109[10] = (arg5 + arg4) / (arg5 - arg4);
		this.aFloatArray109[11] = 1.0F;
		this.aFloatArray109[12] = 0.0F;
		this.aFloatArray109[13] = 0.0F;
		this.aFloatArray109[14] = arg5 * 2.0F * arg4 / (arg4 - arg5);
		this.aFloatArray109[15] = 0.0F;
	}

	@OriginalMember(owner = "client!oi", name = "bh", descriptor = "(FFFFFFFF)V", line = 275)
	public void method29009(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) float arg6, @OriginalArg(7) float arg7) {
		this.aFloatArray109[0] = arg2 * 2.0F / arg6;
		this.aFloatArray109[1] = 0.0F;
		this.aFloatArray109[2] = 0.0F;
		this.aFloatArray109[3] = 0.0F;
		this.aFloatArray109[4] = 0.0F;
		this.aFloatArray109[5] = arg3 * 2.0F / arg7;
		this.aFloatArray109[6] = 0.0F;
		this.aFloatArray109[7] = 0.0F;
		this.aFloatArray109[8] = arg0 * 2.0F / arg6 - 1.0F;
		this.aFloatArray109[9] = arg1 * 2.0F / arg7 - 1.0F;
		this.aFloatArray109[10] = (arg5 + arg4) / (arg5 - arg4);
		this.aFloatArray109[11] = 1.0F;
		this.aFloatArray109[12] = 0.0F;
		this.aFloatArray109[13] = 0.0F;
		this.aFloatArray109[14] = arg5 * 2.0F * arg4 / (arg4 - arg5);
		this.aFloatArray109[15] = 0.0F;
	}

	@OriginalMember(owner = "client!oi", name = "be", descriptor = "(FFFFFFFFF)V", line = 294)
	public void method29010(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) float arg6, @OriginalArg(7) float arg7, @OriginalArg(8) float arg8) {
		this.method28995(-(arg0 * arg8) / arg2, arg8 * (arg6 - arg0) / arg2, -(arg1 * arg8) / arg3, arg8 * (arg7 - arg1) / arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!oi", name = "e", descriptor = "(FFFFFFFFF)V", line = 294)
	public void method29011(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) float arg6, @OriginalArg(7) float arg7, @OriginalArg(8) float arg8) {
		this.method28995(-(arg0 * arg8) / arg2, arg8 * (arg6 - arg0) / arg2, -(arg1 * arg8) / arg3, arg8 * (arg7 - arg1) / arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!oi", name = "f", descriptor = "()F", line = 298)
	public float method29012() {
		return -(this.aFloatArray109[15] + this.aFloatArray109[14]) / (this.aFloatArray109[11] + this.aFloatArray109[10]);
	}

	@OriginalMember(owner = "client!oi", name = "cc", descriptor = "()F", line = 298)
	public float method29013() {
		return -(this.aFloatArray109[15] + this.aFloatArray109[14]) / (this.aFloatArray109[11] + this.aFloatArray109[10]);
	}

	@OriginalMember(owner = "client!oi", name = "cb", descriptor = "()F", line = 298)
	public float method29014() {
		return -(this.aFloatArray109[15] + this.aFloatArray109[14]) / (this.aFloatArray109[11] + this.aFloatArray109[10]);
	}

	@OriginalMember(owner = "client!oi", name = "cg", descriptor = "()F", line = 298)
	public float method29015() {
		return -(this.aFloatArray109[15] + this.aFloatArray109[14]) / (this.aFloatArray109[11] + this.aFloatArray109[10]);
	}

	@OriginalMember(owner = "client!oi", name = "o", descriptor = "()F", line = 302)
	public float method29016() {
		return (this.aFloatArray109[14] - this.aFloatArray109[15]) / (this.aFloatArray109[11] - this.aFloatArray109[10]);
	}

	@OriginalMember(owner = "client!oi", name = "cf", descriptor = "()F", line = 302)
	public float method29017() {
		return (this.aFloatArray109[14] - this.aFloatArray109[15]) / (this.aFloatArray109[11] - this.aFloatArray109[10]);
	}

	@OriginalMember(owner = "client!oi", name = "b", descriptor = "([F)[F", line = 306)
	public float[] method29018(@OriginalArg(0) float[] arg0) {
		@Pc(9) float local9 = this.aFloatArray109[3] + this.aFloatArray109[0];
		@Pc(19) float local19 = this.aFloatArray109[7] + this.aFloatArray109[4];
		@Pc(29) float local29 = this.aFloatArray109[11] + this.aFloatArray109[8];
		@Pc(43) double local43 = Math.sqrt((double) (local9 * local9 + local19 * local19 + local29 * local29));
		arg0[0] = (float) ((double) local9 / local43);
		arg0[1] = (float) ((double) local19 / local43);
		arg0[2] = (float) ((double) local29 / local43);
		arg0[3] = (float) ((double) (this.aFloatArray109[15] + this.aFloatArray109[12]) / local43);
		return arg0;
	}

	@OriginalMember(owner = "client!oi", name = "cl", descriptor = "([F)[F", line = 306)
	public float[] method29019(@OriginalArg(0) float[] arg0) {
		@Pc(9) float local9 = this.aFloatArray109[3] + this.aFloatArray109[0];
		@Pc(19) float local19 = this.aFloatArray109[7] + this.aFloatArray109[4];
		@Pc(29) float local29 = this.aFloatArray109[11] + this.aFloatArray109[8];
		@Pc(43) double local43 = Math.sqrt((double) (local9 * local9 + local19 * local19 + local29 * local29));
		arg0[0] = (float) ((double) local9 / local43);
		arg0[1] = (float) ((double) local19 / local43);
		arg0[2] = (float) ((double) local29 / local43);
		arg0[3] = (float) ((double) (this.aFloatArray109[15] + this.aFloatArray109[12]) / local43);
		return arg0;
	}

	@OriginalMember(owner = "client!oi", name = "cp", descriptor = "([F)[F", line = 318)
	public float[] method29020(@OriginalArg(0) float[] arg0) {
		@Pc(9) float local9 = this.aFloatArray109[3] - this.aFloatArray109[0];
		@Pc(19) float local19 = this.aFloatArray109[7] - this.aFloatArray109[4];
		@Pc(29) float local29 = this.aFloatArray109[11] - this.aFloatArray109[8];
		@Pc(43) double local43 = Math.sqrt((double) (local9 * local9 + local19 * local19 + local29 * local29));
		arg0[0] = (float) ((double) local9 / local43);
		arg0[1] = (float) ((double) local19 / local43);
		arg0[2] = (float) ((double) local29 / local43);
		arg0[3] = (float) ((double) (this.aFloatArray109[15] - this.aFloatArray109[12]) / local43);
		return arg0;
	}

	@OriginalMember(owner = "client!oi", name = "cw", descriptor = "([F)[F", line = 318)
	public float[] method29021(@OriginalArg(0) float[] arg0) {
		@Pc(9) float local9 = this.aFloatArray109[3] - this.aFloatArray109[0];
		@Pc(19) float local19 = this.aFloatArray109[7] - this.aFloatArray109[4];
		@Pc(29) float local29 = this.aFloatArray109[11] - this.aFloatArray109[8];
		@Pc(43) double local43 = Math.sqrt((double) (local9 * local9 + local19 * local19 + local29 * local29));
		arg0[0] = (float) ((double) local9 / local43);
		arg0[1] = (float) ((double) local19 / local43);
		arg0[2] = (float) ((double) local29 / local43);
		arg0[3] = (float) ((double) (this.aFloatArray109[15] - this.aFloatArray109[12]) / local43);
		return arg0;
	}

	@OriginalMember(owner = "client!oi", name = "n", descriptor = "([F)[F", line = 318)
	public float[] method29022(@OriginalArg(0) float[] arg0) {
		@Pc(9) float local9 = this.aFloatArray109[3] - this.aFloatArray109[0];
		@Pc(19) float local19 = this.aFloatArray109[7] - this.aFloatArray109[4];
		@Pc(29) float local29 = this.aFloatArray109[11] - this.aFloatArray109[8];
		@Pc(43) double local43 = Math.sqrt((double) (local9 * local9 + local19 * local19 + local29 * local29));
		arg0[0] = (float) ((double) local9 / local43);
		arg0[1] = (float) ((double) local19 / local43);
		arg0[2] = (float) ((double) local29 / local43);
		arg0[3] = (float) ((double) (this.aFloatArray109[15] - this.aFloatArray109[12]) / local43);
		return arg0;
	}

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "([F)[F", line = 330)
	public float[] method29023(@OriginalArg(0) float[] arg0) {
		@Pc(9) float local9 = this.aFloatArray109[3] + this.aFloatArray109[1];
		@Pc(19) float local19 = this.aFloatArray109[7] + this.aFloatArray109[5];
		@Pc(29) float local29 = this.aFloatArray109[11] + this.aFloatArray109[9];
		@Pc(43) double local43 = Math.sqrt((double) (local9 * local9 + local19 * local19 + local29 * local29));
		arg0[0] = (float) ((double) local9 / local43);
		arg0[1] = (float) ((double) local19 / local43);
		arg0[2] = (float) ((double) local29 / local43);
		arg0[3] = (float) ((double) (this.aFloatArray109[15] + this.aFloatArray109[13]) / local43);
		return arg0;
	}

	@OriginalMember(owner = "client!oi", name = "ck", descriptor = "([F)[F", line = 330)
	public float[] method29024(@OriginalArg(0) float[] arg0) {
		@Pc(9) float local9 = this.aFloatArray109[3] + this.aFloatArray109[1];
		@Pc(19) float local19 = this.aFloatArray109[7] + this.aFloatArray109[5];
		@Pc(29) float local29 = this.aFloatArray109[11] + this.aFloatArray109[9];
		@Pc(43) double local43 = Math.sqrt((double) (local9 * local9 + local19 * local19 + local29 * local29));
		arg0[0] = (float) ((double) local9 / local43);
		arg0[1] = (float) ((double) local19 / local43);
		arg0[2] = (float) ((double) local29 / local43);
		arg0[3] = (float) ((double) (this.aFloatArray109[15] + this.aFloatArray109[13]) / local43);
		return arg0;
	}

	@OriginalMember(owner = "client!oi", name = "ch", descriptor = "([F)[F", line = 342)
	public float[] method29025(@OriginalArg(0) float[] arg0) {
		@Pc(9) float local9 = this.aFloatArray109[3] - this.aFloatArray109[1];
		@Pc(19) float local19 = this.aFloatArray109[7] - this.aFloatArray109[5];
		@Pc(29) float local29 = this.aFloatArray109[11] - this.aFloatArray109[9];
		@Pc(43) double local43 = Math.sqrt((double) (local9 * local9 + local19 * local19 + local29 * local29));
		arg0[0] = (float) ((double) local9 / local43);
		arg0[1] = (float) ((double) local19 / local43);
		arg0[2] = (float) ((double) local29 / local43);
		arg0[3] = (float) ((double) (this.aFloatArray109[15] - this.aFloatArray109[13]) / local43);
		return arg0;
	}

	@OriginalMember(owner = "client!oi", name = "m", descriptor = "([F)[F", line = 342)
	public float[] method29026(@OriginalArg(0) float[] arg0) {
		@Pc(9) float local9 = this.aFloatArray109[3] - this.aFloatArray109[1];
		@Pc(19) float local19 = this.aFloatArray109[7] - this.aFloatArray109[5];
		@Pc(29) float local29 = this.aFloatArray109[11] - this.aFloatArray109[9];
		@Pc(43) double local43 = Math.sqrt((double) (local9 * local9 + local19 * local19 + local29 * local29));
		arg0[0] = (float) ((double) local9 / local43);
		arg0[1] = (float) ((double) local19 / local43);
		arg0[2] = (float) ((double) local29 / local43);
		arg0[3] = (float) ((double) (this.aFloatArray109[15] - this.aFloatArray109[13]) / local43);
		return arg0;
	}

	@OriginalMember(owner = "client!oi", name = "ca", descriptor = "([F)[F", line = 354)
	public float[] method29027(@OriginalArg(0) float[] arg0) {
		@Pc(9) float local9 = this.aFloatArray109[3] + this.aFloatArray109[2];
		@Pc(19) float local19 = this.aFloatArray109[7] + this.aFloatArray109[6];
		@Pc(29) float local29 = this.aFloatArray109[11] + this.aFloatArray109[10];
		@Pc(43) double local43 = Math.sqrt((double) (local9 * local9 + local19 * local19 + local29 * local29));
		arg0[0] = (float) ((double) local9 / local43);
		arg0[1] = (float) ((double) local19 / local43);
		arg0[2] = (float) ((double) local29 / local43);
		arg0[3] = (float) ((double) (this.aFloatArray109[15] + this.aFloatArray109[14]) / local43);
		return arg0;
	}

	@OriginalMember(owner = "client!oi", name = "h", descriptor = "([F)[F", line = 354)
	public float[] method29028(@OriginalArg(0) float[] arg0) {
		@Pc(9) float local9 = this.aFloatArray109[3] + this.aFloatArray109[2];
		@Pc(19) float local19 = this.aFloatArray109[7] + this.aFloatArray109[6];
		@Pc(29) float local29 = this.aFloatArray109[11] + this.aFloatArray109[10];
		@Pc(43) double local43 = Math.sqrt((double) (local9 * local9 + local19 * local19 + local29 * local29));
		arg0[0] = (float) ((double) local9 / local43);
		arg0[1] = (float) ((double) local19 / local43);
		arg0[2] = (float) ((double) local29 / local43);
		arg0[3] = (float) ((double) (this.aFloatArray109[15] + this.aFloatArray109[14]) / local43);
		return arg0;
	}

	@OriginalMember(owner = "client!oi", name = "cz", descriptor = "([F)[F", line = 354)
	public float[] method29029(@OriginalArg(0) float[] arg0) {
		@Pc(9) float local9 = this.aFloatArray109[3] + this.aFloatArray109[2];
		@Pc(19) float local19 = this.aFloatArray109[7] + this.aFloatArray109[6];
		@Pc(29) float local29 = this.aFloatArray109[11] + this.aFloatArray109[10];
		@Pc(43) double local43 = Math.sqrt((double) (local9 * local9 + local19 * local19 + local29 * local29));
		arg0[0] = (float) ((double) local9 / local43);
		arg0[1] = (float) ((double) local19 / local43);
		arg0[2] = (float) ((double) local29 / local43);
		arg0[3] = (float) ((double) (this.aFloatArray109[15] + this.aFloatArray109[14]) / local43);
		return arg0;
	}

	@OriginalMember(owner = "client!oi", name = "cr", descriptor = "([F)[F", line = 354)
	public float[] method29030(@OriginalArg(0) float[] arg0) {
		@Pc(9) float local9 = this.aFloatArray109[3] + this.aFloatArray109[2];
		@Pc(19) float local19 = this.aFloatArray109[7] + this.aFloatArray109[6];
		@Pc(29) float local29 = this.aFloatArray109[11] + this.aFloatArray109[10];
		@Pc(43) double local43 = Math.sqrt((double) (local9 * local9 + local19 * local19 + local29 * local29));
		arg0[0] = (float) ((double) local9 / local43);
		arg0[1] = (float) ((double) local19 / local43);
		arg0[2] = (float) ((double) local29 / local43);
		arg0[3] = (float) ((double) (this.aFloatArray109[15] + this.aFloatArray109[14]) / local43);
		return arg0;
	}

	@OriginalMember(owner = "client!oi", name = "cx", descriptor = "([F)[F", line = 354)
	public float[] method29031(@OriginalArg(0) float[] arg0) {
		@Pc(9) float local9 = this.aFloatArray109[3] + this.aFloatArray109[2];
		@Pc(19) float local19 = this.aFloatArray109[7] + this.aFloatArray109[6];
		@Pc(29) float local29 = this.aFloatArray109[11] + this.aFloatArray109[10];
		@Pc(43) double local43 = Math.sqrt((double) (local9 * local9 + local19 * local19 + local29 * local29));
		arg0[0] = (float) ((double) local9 / local43);
		arg0[1] = (float) ((double) local19 / local43);
		arg0[2] = (float) ((double) local29 / local43);
		arg0[3] = (float) ((double) (this.aFloatArray109[15] + this.aFloatArray109[14]) / local43);
		return arg0;
	}

	@OriginalMember(owner = "client!oi", name = "ct", descriptor = "([F)[F", line = 366)
	public float[] method29032(@OriginalArg(0) float[] arg0) {
		@Pc(9) float local9 = this.aFloatArray109[3] - this.aFloatArray109[2];
		@Pc(19) float local19 = this.aFloatArray109[7] - this.aFloatArray109[6];
		@Pc(29) float local29 = this.aFloatArray109[11] - this.aFloatArray109[10];
		@Pc(43) double local43 = Math.sqrt((double) (local9 * local9 + local19 * local19 + local29 * local29));
		arg0[0] = (float) ((double) local9 / local43);
		arg0[1] = (float) ((double) local19 / local43);
		arg0[2] = (float) ((double) local29 / local43);
		arg0[3] = (float) ((double) (this.aFloatArray109[15] - this.aFloatArray109[14]) / local43);
		return arg0;
	}

	@OriginalMember(owner = "client!oi", name = "aj", descriptor = "([F)[F", line = 366)
	public float[] method29033(@OriginalArg(0) float[] arg0) {
		@Pc(9) float local9 = this.aFloatArray109[3] - this.aFloatArray109[2];
		@Pc(19) float local19 = this.aFloatArray109[7] - this.aFloatArray109[6];
		@Pc(29) float local29 = this.aFloatArray109[11] - this.aFloatArray109[10];
		@Pc(43) double local43 = Math.sqrt((double) (local9 * local9 + local19 * local19 + local29 * local29));
		arg0[0] = (float) ((double) local9 / local43);
		arg0[1] = (float) ((double) local19 / local43);
		arg0[2] = (float) ((double) local29 / local43);
		arg0[3] = (float) ((double) (this.aFloatArray109[15] - this.aFloatArray109[14]) / local43);
		return arg0;
	}

	@OriginalMember(owner = "client!oi", name = "ai", descriptor = "()V", line = 378)
	public void method29034() {
		@Pc(4) float local4 = this.aFloatArray109[0];
		@Pc(9) float local9 = this.aFloatArray109[4];
		@Pc(14) float local14 = this.aFloatArray109[8];
		@Pc(19) float local19 = this.aFloatArray109[12];
		@Pc(24) float local24 = this.aFloatArray109[1];
		@Pc(29) float local29 = this.aFloatArray109[5];
		@Pc(34) float local34 = this.aFloatArray109[9];
		@Pc(39) float local39 = this.aFloatArray109[13];
		@Pc(44) float local44 = this.aFloatArray109[2];
		@Pc(49) float local49 = this.aFloatArray109[6];
		@Pc(54) float local54 = this.aFloatArray109[10];
		@Pc(59) float local59 = this.aFloatArray109[14];
		@Pc(64) float local64 = this.aFloatArray109[3];
		@Pc(69) float local69 = this.aFloatArray109[7];
		@Pc(74) float local74 = this.aFloatArray109[11];
		@Pc(79) float local79 = this.aFloatArray109[15];
		this.aFloatArray109[0] = local4;
		this.aFloatArray109[1] = local9;
		this.aFloatArray109[2] = local14;
		this.aFloatArray109[3] = local19;
		this.aFloatArray109[4] = local24;
		this.aFloatArray109[5] = local29;
		this.aFloatArray109[6] = local34;
		this.aFloatArray109[7] = local39;
		this.aFloatArray109[8] = local44;
		this.aFloatArray109[9] = local49;
		this.aFloatArray109[10] = local54;
		this.aFloatArray109[11] = local59;
		this.aFloatArray109[12] = local64;
		this.aFloatArray109[13] = local69;
		this.aFloatArray109[14] = local74;
		this.aFloatArray109[15] = local79;
	}

	@OriginalMember(owner = "client!oi", name = "cv", descriptor = "()V", line = 378)
	public void method29035() {
		@Pc(4) float local4 = this.aFloatArray109[0];
		@Pc(9) float local9 = this.aFloatArray109[4];
		@Pc(14) float local14 = this.aFloatArray109[8];
		@Pc(19) float local19 = this.aFloatArray109[12];
		@Pc(24) float local24 = this.aFloatArray109[1];
		@Pc(29) float local29 = this.aFloatArray109[5];
		@Pc(34) float local34 = this.aFloatArray109[9];
		@Pc(39) float local39 = this.aFloatArray109[13];
		@Pc(44) float local44 = this.aFloatArray109[2];
		@Pc(49) float local49 = this.aFloatArray109[6];
		@Pc(54) float local54 = this.aFloatArray109[10];
		@Pc(59) float local59 = this.aFloatArray109[14];
		@Pc(64) float local64 = this.aFloatArray109[3];
		@Pc(69) float local69 = this.aFloatArray109[7];
		@Pc(74) float local74 = this.aFloatArray109[11];
		@Pc(79) float local79 = this.aFloatArray109[15];
		this.aFloatArray109[0] = local4;
		this.aFloatArray109[1] = local9;
		this.aFloatArray109[2] = local14;
		this.aFloatArray109[3] = local19;
		this.aFloatArray109[4] = local24;
		this.aFloatArray109[5] = local29;
		this.aFloatArray109[6] = local34;
		this.aFloatArray109[7] = local39;
		this.aFloatArray109[8] = local44;
		this.aFloatArray109[9] = local49;
		this.aFloatArray109[10] = local54;
		this.aFloatArray109[11] = local59;
		this.aFloatArray109[12] = local64;
		this.aFloatArray109[13] = local69;
		this.aFloatArray109[14] = local74;
		this.aFloatArray109[15] = local79;
	}

	@OriginalMember(owner = "client!oi", name = "cu", descriptor = "()V", line = 378)
	public void method29036() {
		@Pc(4) float local4 = this.aFloatArray109[0];
		@Pc(9) float local9 = this.aFloatArray109[4];
		@Pc(14) float local14 = this.aFloatArray109[8];
		@Pc(19) float local19 = this.aFloatArray109[12];
		@Pc(24) float local24 = this.aFloatArray109[1];
		@Pc(29) float local29 = this.aFloatArray109[5];
		@Pc(34) float local34 = this.aFloatArray109[9];
		@Pc(39) float local39 = this.aFloatArray109[13];
		@Pc(44) float local44 = this.aFloatArray109[2];
		@Pc(49) float local49 = this.aFloatArray109[6];
		@Pc(54) float local54 = this.aFloatArray109[10];
		@Pc(59) float local59 = this.aFloatArray109[14];
		@Pc(64) float local64 = this.aFloatArray109[3];
		@Pc(69) float local69 = this.aFloatArray109[7];
		@Pc(74) float local74 = this.aFloatArray109[11];
		@Pc(79) float local79 = this.aFloatArray109[15];
		this.aFloatArray109[0] = local4;
		this.aFloatArray109[1] = local9;
		this.aFloatArray109[2] = local14;
		this.aFloatArray109[3] = local19;
		this.aFloatArray109[4] = local24;
		this.aFloatArray109[5] = local29;
		this.aFloatArray109[6] = local34;
		this.aFloatArray109[7] = local39;
		this.aFloatArray109[8] = local44;
		this.aFloatArray109[9] = local49;
		this.aFloatArray109[10] = local54;
		this.aFloatArray109[11] = local59;
		this.aFloatArray109[12] = local64;
		this.aFloatArray109[13] = local69;
		this.aFloatArray109[14] = local74;
		this.aFloatArray109[15] = local79;
	}

	@OriginalMember(owner = "client!oi", name = "cm", descriptor = "()V", line = 378)
	public void method29037() {
		@Pc(4) float local4 = this.aFloatArray109[0];
		@Pc(9) float local9 = this.aFloatArray109[4];
		@Pc(14) float local14 = this.aFloatArray109[8];
		@Pc(19) float local19 = this.aFloatArray109[12];
		@Pc(24) float local24 = this.aFloatArray109[1];
		@Pc(29) float local29 = this.aFloatArray109[5];
		@Pc(34) float local34 = this.aFloatArray109[9];
		@Pc(39) float local39 = this.aFloatArray109[13];
		@Pc(44) float local44 = this.aFloatArray109[2];
		@Pc(49) float local49 = this.aFloatArray109[6];
		@Pc(54) float local54 = this.aFloatArray109[10];
		@Pc(59) float local59 = this.aFloatArray109[14];
		@Pc(64) float local64 = this.aFloatArray109[3];
		@Pc(69) float local69 = this.aFloatArray109[7];
		@Pc(74) float local74 = this.aFloatArray109[11];
		@Pc(79) float local79 = this.aFloatArray109[15];
		this.aFloatArray109[0] = local4;
		this.aFloatArray109[1] = local9;
		this.aFloatArray109[2] = local14;
		this.aFloatArray109[3] = local19;
		this.aFloatArray109[4] = local24;
		this.aFloatArray109[5] = local29;
		this.aFloatArray109[6] = local34;
		this.aFloatArray109[7] = local39;
		this.aFloatArray109[8] = local44;
		this.aFloatArray109[9] = local49;
		this.aFloatArray109[10] = local54;
		this.aFloatArray109[11] = local59;
		this.aFloatArray109[12] = local64;
		this.aFloatArray109[13] = local69;
		this.aFloatArray109[14] = local74;
		this.aFloatArray109[15] = local79;
	}

	@OriginalMember(owner = "client!oi", name = "ag", descriptor = "([F)[F", line = 413)
	public float[] method29038(@OriginalArg(0) float[] arg0) {
		System.arraycopy(this.aFloatArray109, 0, arg0, 0, 16);
		return arg0;
	}

	@OriginalMember(owner = "client!oi", name = "co", descriptor = "([F)[F", line = 413)
	public float[] method29039(@OriginalArg(0) float[] arg0) {
		System.arraycopy(this.aFloatArray109, 0, arg0, 0, 16);
		return arg0;
	}

	@OriginalMember(owner = "client!oi", name = "ci", descriptor = "([F)[F", line = 413)
	public float[] method29040(@OriginalArg(0) float[] arg0) {
		System.arraycopy(this.aFloatArray109, 0, arg0, 0, 16);
		return arg0;
	}

	@OriginalMember(owner = "client!oi", name = "al", descriptor = "([F)[F", line = 418)
	public float[] method29041(@OriginalArg(0) float[] arg0) {
		System.arraycopy(this.aFloatArray109, 0, arg0, 0, 16);
		arg0[3] = 0.0F;
		arg0[7] = 0.0F;
		arg0[11] = 0.0F;
		arg0[12] = 0.0F;
		arg0[13] = 0.0F;
		arg0[14] = 0.0F;
		arg0[15] = 1.0F;
		return arg0;
	}

	@OriginalMember(owner = "client!oi", name = "cn", descriptor = "([F)[F", line = 418)
	public float[] method29042(@OriginalArg(0) float[] arg0) {
		System.arraycopy(this.aFloatArray109, 0, arg0, 0, 16);
		arg0[3] = 0.0F;
		arg0[7] = 0.0F;
		arg0[11] = 0.0F;
		arg0[12] = 0.0F;
		arg0[13] = 0.0F;
		arg0[14] = 0.0F;
		arg0[15] = 1.0F;
		return arg0;
	}

	@OriginalMember(owner = "client!oi", name = "ao", descriptor = "([F)[F", line = 430)
	public float[] method29043(@OriginalArg(0) float[] arg0) {
		arg0[0] = this.aFloatArray109[0];
		arg0[1] = this.aFloatArray109[1];
		arg0[2] = this.aFloatArray109[2];
		arg0[3] = this.aFloatArray109[4];
		arg0[4] = this.aFloatArray109[5];
		arg0[5] = this.aFloatArray109[6];
		arg0[6] = this.aFloatArray109[8];
		arg0[7] = this.aFloatArray109[9];
		arg0[8] = this.aFloatArray109[10];
		return arg0;
	}

	@OriginalMember(owner = "client!oi", name = "cq", descriptor = "([F)[F", line = 430)
	public float[] method29044(@OriginalArg(0) float[] arg0) {
		arg0[0] = this.aFloatArray109[0];
		arg0[1] = this.aFloatArray109[1];
		arg0[2] = this.aFloatArray109[2];
		arg0[3] = this.aFloatArray109[4];
		arg0[4] = this.aFloatArray109[5];
		arg0[5] = this.aFloatArray109[6];
		arg0[6] = this.aFloatArray109[8];
		arg0[7] = this.aFloatArray109[9];
		arg0[8] = this.aFloatArray109[10];
		return arg0;
	}

	@OriginalMember(owner = "client!oi", name = "cy", descriptor = "([F)[F", line = 430)
	public float[] method29045(@OriginalArg(0) float[] arg0) {
		arg0[0] = this.aFloatArray109[0];
		arg0[1] = this.aFloatArray109[1];
		arg0[2] = this.aFloatArray109[2];
		arg0[3] = this.aFloatArray109[4];
		arg0[4] = this.aFloatArray109[5];
		arg0[5] = this.aFloatArray109[6];
		arg0[6] = this.aFloatArray109[8];
		arg0[7] = this.aFloatArray109[9];
		arg0[8] = this.aFloatArray109[10];
		return arg0;
	}

	@OriginalMember(owner = "client!oi", name = "ak", descriptor = "([F)[F", line = 443)
	public float[] method29046(@OriginalArg(0) float[] arg0) {
		arg0[0] = this.aFloatArray109[0];
		arg0[1] = this.aFloatArray109[4];
		arg0[2] = this.aFloatArray109[8];
		arg0[3] = this.aFloatArray109[12];
		arg0[4] = this.aFloatArray109[1];
		arg0[5] = this.aFloatArray109[5];
		arg0[6] = this.aFloatArray109[9];
		arg0[7] = this.aFloatArray109[13];
		arg0[8] = this.aFloatArray109[2];
		arg0[9] = this.aFloatArray109[6];
		arg0[10] = this.aFloatArray109[10];
		arg0[11] = this.aFloatArray109[14];
		arg0[12] = this.aFloatArray109[3];
		arg0[13] = this.aFloatArray109[7];
		arg0[14] = this.aFloatArray109[11];
		arg0[15] = this.aFloatArray109[15];
		return arg0;
	}

	@OriginalMember(owner = "client!oi", name = "cd", descriptor = "([F)[F", line = 443)
	public float[] method29047(@OriginalArg(0) float[] arg0) {
		arg0[0] = this.aFloatArray109[0];
		arg0[1] = this.aFloatArray109[4];
		arg0[2] = this.aFloatArray109[8];
		arg0[3] = this.aFloatArray109[12];
		arg0[4] = this.aFloatArray109[1];
		arg0[5] = this.aFloatArray109[5];
		arg0[6] = this.aFloatArray109[9];
		arg0[7] = this.aFloatArray109[13];
		arg0[8] = this.aFloatArray109[2];
		arg0[9] = this.aFloatArray109[6];
		arg0[10] = this.aFloatArray109[10];
		arg0[11] = this.aFloatArray109[14];
		arg0[12] = this.aFloatArray109[3];
		arg0[13] = this.aFloatArray109[7];
		arg0[14] = this.aFloatArray109[11];
		arg0[15] = this.aFloatArray109[15];
		return arg0;
	}

	@OriginalMember(owner = "client!oi", name = "cs", descriptor = "([F)[F", line = 443)
	public float[] method29048(@OriginalArg(0) float[] arg0) {
		arg0[0] = this.aFloatArray109[0];
		arg0[1] = this.aFloatArray109[4];
		arg0[2] = this.aFloatArray109[8];
		arg0[3] = this.aFloatArray109[12];
		arg0[4] = this.aFloatArray109[1];
		arg0[5] = this.aFloatArray109[5];
		arg0[6] = this.aFloatArray109[9];
		arg0[7] = this.aFloatArray109[13];
		arg0[8] = this.aFloatArray109[2];
		arg0[9] = this.aFloatArray109[6];
		arg0[10] = this.aFloatArray109[10];
		arg0[11] = this.aFloatArray109[14];
		arg0[12] = this.aFloatArray109[3];
		arg0[13] = this.aFloatArray109[7];
		arg0[14] = this.aFloatArray109[11];
		arg0[15] = this.aFloatArray109[15];
		return arg0;
	}

	@OriginalMember(owner = "client!oi", name = "au", descriptor = "([F)[F", line = 463)
	public float[] method29049(@OriginalArg(0) float[] arg0) {
		arg0[0] = this.aFloatArray109[0];
		arg0[1] = this.aFloatArray109[1];
		arg0[2] = this.aFloatArray109[4];
		arg0[3] = this.aFloatArray109[5];
		arg0[4] = this.aFloatArray109[8];
		arg0[5] = this.aFloatArray109[9];
		arg0[6] = this.aFloatArray109[12];
		arg0[7] = this.aFloatArray109[13];
		return arg0;
	}

	@OriginalMember(owner = "client!oi", name = "cj", descriptor = "([F)[F", line = 463)
	public float[] method29050(@OriginalArg(0) float[] arg0) {
		arg0[0] = this.aFloatArray109[0];
		arg0[1] = this.aFloatArray109[1];
		arg0[2] = this.aFloatArray109[4];
		arg0[3] = this.aFloatArray109[5];
		arg0[4] = this.aFloatArray109[8];
		arg0[5] = this.aFloatArray109[9];
		arg0[6] = this.aFloatArray109[12];
		arg0[7] = this.aFloatArray109[13];
		return arg0;
	}

	@OriginalMember(owner = "client!oi", name = "dt", descriptor = "([F)[F", line = 475)
	public float[] method29051(@OriginalArg(0) float[] arg0) {
		arg0[0] = this.aFloatArray109[0];
		arg0[1] = this.aFloatArray109[4];
		arg0[2] = this.aFloatArray109[8];
		arg0[3] = this.aFloatArray109[12];
		arg0[4] = this.aFloatArray109[1];
		arg0[5] = this.aFloatArray109[5];
		arg0[6] = this.aFloatArray109[9];
		arg0[7] = this.aFloatArray109[13];
		return arg0;
	}

	@OriginalMember(owner = "client!oi", name = "ax", descriptor = "([F)[F", line = 475)
	public float[] method29052(@OriginalArg(0) float[] arg0) {
		arg0[0] = this.aFloatArray109[0];
		arg0[1] = this.aFloatArray109[4];
		arg0[2] = this.aFloatArray109[8];
		arg0[3] = this.aFloatArray109[12];
		arg0[4] = this.aFloatArray109[1];
		arg0[5] = this.aFloatArray109[5];
		arg0[6] = this.aFloatArray109[9];
		arg0[7] = this.aFloatArray109[13];
		return arg0;
	}

	@OriginalMember(owner = "client!oi", name = "do", descriptor = "([F)[F", line = 475)
	public float[] method29053(@OriginalArg(0) float[] arg0) {
		arg0[0] = this.aFloatArray109[0];
		arg0[1] = this.aFloatArray109[4];
		arg0[2] = this.aFloatArray109[8];
		arg0[3] = this.aFloatArray109[12];
		arg0[4] = this.aFloatArray109[1];
		arg0[5] = this.aFloatArray109[5];
		arg0[6] = this.aFloatArray109[9];
		arg0[7] = this.aFloatArray109[13];
		return arg0;
	}

	@OriginalMember(owner = "client!oi", name = "ce", descriptor = "([F)[F", line = 475)
	public float[] method29054(@OriginalArg(0) float[] arg0) {
		arg0[0] = this.aFloatArray109[0];
		arg0[1] = this.aFloatArray109[4];
		arg0[2] = this.aFloatArray109[8];
		arg0[3] = this.aFloatArray109[12];
		arg0[4] = this.aFloatArray109[1];
		arg0[5] = this.aFloatArray109[5];
		arg0[6] = this.aFloatArray109[9];
		arg0[7] = this.aFloatArray109[13];
		return arg0;
	}

	@OriginalMember(owner = "client!oi", name = "dh", descriptor = "([F)[F", line = 487)
	public float[] method29055(@OriginalArg(0) float[] arg0) {
		arg0[0] = this.aFloatArray109[0];
		arg0[1] = this.aFloatArray109[1];
		arg0[2] = 0.0F;
		arg0[3] = 0.0F;
		arg0[4] = this.aFloatArray109[4];
		arg0[5] = this.aFloatArray109[5];
		arg0[6] = 0.0F;
		arg0[7] = 0.0F;
		arg0[8] = this.aFloatArray109[12];
		arg0[9] = this.aFloatArray109[13];
		arg0[10] = this.aFloatArray109[14];
		arg0[11] = 0.0F;
		arg0[12] = 0.0F;
		arg0[13] = 0.0F;
		arg0[14] = 0.0F;
		arg0[15] = 1.0F;
		return arg0;
	}

	@OriginalMember(owner = "client!oi", name = "ar", descriptor = "([F)[F", line = 487)
	public float[] method29056(@OriginalArg(0) float[] arg0) {
		arg0[0] = this.aFloatArray109[0];
		arg0[1] = this.aFloatArray109[1];
		arg0[2] = 0.0F;
		arg0[3] = 0.0F;
		arg0[4] = this.aFloatArray109[4];
		arg0[5] = this.aFloatArray109[5];
		arg0[6] = 0.0F;
		arg0[7] = 0.0F;
		arg0[8] = this.aFloatArray109[12];
		arg0[9] = this.aFloatArray109[13];
		arg0[10] = this.aFloatArray109[14];
		arg0[11] = 0.0F;
		arg0[12] = 0.0F;
		arg0[13] = 0.0F;
		arg0[14] = 0.0F;
		arg0[15] = 1.0F;
		return arg0;
	}

	@OriginalMember(owner = "client!oi", name = "dq", descriptor = "([F)[F", line = 487)
	public float[] method29057(@OriginalArg(0) float[] arg0) {
		arg0[0] = this.aFloatArray109[0];
		arg0[1] = this.aFloatArray109[1];
		arg0[2] = 0.0F;
		arg0[3] = 0.0F;
		arg0[4] = this.aFloatArray109[4];
		arg0[5] = this.aFloatArray109[5];
		arg0[6] = 0.0F;
		arg0[7] = 0.0F;
		arg0[8] = this.aFloatArray109[12];
		arg0[9] = this.aFloatArray109[13];
		arg0[10] = this.aFloatArray109[14];
		arg0[11] = 0.0F;
		arg0[12] = 0.0F;
		arg0[13] = 0.0F;
		arg0[14] = 0.0F;
		arg0[15] = 1.0F;
		return arg0;
	}

	@OriginalMember(owner = "client!oi", name = "ad", descriptor = "(IIIFFF)V", line = 507)
	public void method29058(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		@Pc(54) float[] local54;
		@Pc(57) float[] local57;
		@Pc(60) float[] local60;
		@Pc(98) float[] local98;
		@Pc(101) float[] local101;
		if (arg0 == 0) {
			this.aFloatArray109[0] = arg1;
			this.aFloatArray109[5] = arg2;
			this.aFloatArray109[10] = 1.0F;
			local98 = this.aFloatArray109;
			local101 = this.aFloatArray109;
			local54 = this.aFloatArray109;
			local57 = this.aFloatArray109;
			local60 = this.aFloatArray109;
			this.aFloatArray109[9] = 0.0F;
			local60[8] = 0.0F;
			local57[6] = 0.0F;
			local54[4] = 0.0F;
			local101[2] = 0.0F;
			local98[1] = 0.0F;
		} else {
			@Pc(7) float local7 = Class437.aFloatArray104[arg0 & 0x3FFF];
			@Pc(13) float local13 = Class437.aFloatArray103[arg0 & 0x3FFF];
			this.aFloatArray109[0] = local7 * (float) arg1;
			this.aFloatArray109[5] = local7 * (float) arg2;
			this.aFloatArray109[1] = local13 * (float) arg1;
			this.aFloatArray109[4] = -local13 * (float) arg2;
			this.aFloatArray109[10] = 1.0F;
			local54 = this.aFloatArray109;
			local57 = this.aFloatArray109;
			local60 = this.aFloatArray109;
			this.aFloatArray109[9] = 0.0F;
			local60[8] = 0.0F;
			local57[6] = 0.0F;
			local54[2] = 0.0F;
		}
		local98 = this.aFloatArray109;
		local101 = this.aFloatArray109;
		this.aFloatArray109[11] = 0.0F;
		local101[7] = 0.0F;
		local98[3] = 0.0F;
		this.aFloatArray109[15] = 1.0F;
		this.aFloatArray109[12] = arg3;
		this.aFloatArray109[13] = arg4;
		this.aFloatArray109[14] = arg5;
	}

	@OriginalMember(owner = "client!oi", name = "dn", descriptor = "(IIIFFF)V", line = 507)
	public void method29059(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		@Pc(54) float[] local54;
		@Pc(57) float[] local57;
		@Pc(60) float[] local60;
		@Pc(98) float[] local98;
		@Pc(101) float[] local101;
		if (arg0 == 0) {
			this.aFloatArray109[0] = arg1;
			this.aFloatArray109[5] = arg2;
			this.aFloatArray109[10] = 1.0F;
			local98 = this.aFloatArray109;
			local101 = this.aFloatArray109;
			local54 = this.aFloatArray109;
			local57 = this.aFloatArray109;
			local60 = this.aFloatArray109;
			this.aFloatArray109[9] = 0.0F;
			local60[8] = 0.0F;
			local57[6] = 0.0F;
			local54[4] = 0.0F;
			local101[2] = 0.0F;
			local98[1] = 0.0F;
		} else {
			@Pc(7) float local7 = Class437.aFloatArray104[arg0 & 0x3FFF];
			@Pc(13) float local13 = Class437.aFloatArray103[arg0 & 0x3FFF];
			this.aFloatArray109[0] = local7 * (float) arg1;
			this.aFloatArray109[5] = local7 * (float) arg2;
			this.aFloatArray109[1] = local13 * (float) arg1;
			this.aFloatArray109[4] = -local13 * (float) arg2;
			this.aFloatArray109[10] = 1.0F;
			local54 = this.aFloatArray109;
			local57 = this.aFloatArray109;
			local60 = this.aFloatArray109;
			this.aFloatArray109[9] = 0.0F;
			local60[8] = 0.0F;
			local57[6] = 0.0F;
			local54[2] = 0.0F;
		}
		local98 = this.aFloatArray109;
		local101 = this.aFloatArray109;
		this.aFloatArray109[11] = 0.0F;
		local101[7] = 0.0F;
		local98[3] = 0.0F;
		this.aFloatArray109[15] = 1.0F;
		this.aFloatArray109[12] = arg3;
		this.aFloatArray109[13] = arg4;
		this.aFloatArray109[14] = arg5;
	}

	@OriginalMember(owner = "client!oi", name = "dv", descriptor = "(IIIFFF)V", line = 507)
	public void method29060(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		@Pc(54) float[] local54;
		@Pc(57) float[] local57;
		@Pc(60) float[] local60;
		@Pc(98) float[] local98;
		@Pc(101) float[] local101;
		if (arg0 == 0) {
			this.aFloatArray109[0] = arg1;
			this.aFloatArray109[5] = arg2;
			this.aFloatArray109[10] = 1.0F;
			local98 = this.aFloatArray109;
			local101 = this.aFloatArray109;
			local54 = this.aFloatArray109;
			local57 = this.aFloatArray109;
			local60 = this.aFloatArray109;
			this.aFloatArray109[9] = 0.0F;
			local60[8] = 0.0F;
			local57[6] = 0.0F;
			local54[4] = 0.0F;
			local101[2] = 0.0F;
			local98[1] = 0.0F;
		} else {
			@Pc(7) float local7 = Class437.aFloatArray104[arg0 & 0x3FFF];
			@Pc(13) float local13 = Class437.aFloatArray103[arg0 & 0x3FFF];
			this.aFloatArray109[0] = local7 * (float) arg1;
			this.aFloatArray109[5] = local7 * (float) arg2;
			this.aFloatArray109[1] = local13 * (float) arg1;
			this.aFloatArray109[4] = -local13 * (float) arg2;
			this.aFloatArray109[10] = 1.0F;
			local54 = this.aFloatArray109;
			local57 = this.aFloatArray109;
			local60 = this.aFloatArray109;
			this.aFloatArray109[9] = 0.0F;
			local60[8] = 0.0F;
			local57[6] = 0.0F;
			local54[2] = 0.0F;
		}
		local98 = this.aFloatArray109;
		local101 = this.aFloatArray109;
		this.aFloatArray109[11] = 0.0F;
		local101[7] = 0.0F;
		local98[3] = 0.0F;
		this.aFloatArray109[15] = 1.0F;
		this.aFloatArray109[12] = arg3;
		this.aFloatArray109[13] = arg4;
		this.aFloatArray109[14] = arg5;
	}

	@OriginalMember(owner = "client!oi", name = "rs", descriptor = "()Ljava/lang/String;", line = 552)
	public String method29061() {
		@Pc(3) StringBuilder local3 = new StringBuilder();
		for (@Pc(5) int local5 = 0; local5 < 4; local5++) {
			for (@Pc(10) int local10 = 0; local10 < 4; local10++) {
				if (local10 > 0) {
					local3.append("\t");
				}
				local3.append(this.aFloatArray109[local5 * 4 + local10]);
			}
			local3.append("\n");
		}
		return local3.toString();
	}

	@OriginalMember(owner = "client!oi", name = "ro", descriptor = "()Ljava/lang/String;", line = 552)
	public String method29062() {
		@Pc(3) StringBuilder local3 = new StringBuilder();
		for (@Pc(5) int local5 = 0; local5 < 4; local5++) {
			for (@Pc(10) int local10 = 0; local10 < 4; local10++) {
				if (local10 > 0) {
					local3.append("\t");
				}
				local3.append(this.aFloatArray109[local5 * 4 + local10]);
			}
			local3.append("\n");
		}
		return local3.toString();
	}

	@OriginalMember(owner = "client!oi", name = "toString", descriptor = "()Ljava/lang/String;", line = 552)
	@Override
	public String toString() {
		@Pc(3) StringBuilder local3 = new StringBuilder();
		for (@Pc(5) int local5 = 0; local5 < 4; local5++) {
			for (@Pc(10) int local10 = 0; local10 < 4; local10++) {
				if (local10 > 0) {
					local3.append("\t");
				}
				local3.append(this.aFloatArray109[local5 * 4 + local10]);
			}
			local3.append("\n");
		}
		return local3.toString();
	}

	@OriginalMember(owner = "client!oi", name = "rr", descriptor = "()I", line = 565)
	public int method29063() {
		@Pc(1) byte local1 = 1;
		return local1 * 31 + Arrays.hashCode(this.aFloatArray109);
	}

	@OriginalMember(owner = "client!oi", name = "hashCode", descriptor = "()I", line = 565)
	@Override
	public int hashCode() {
		@Pc(1) byte local1 = 1;
		return local1 * 31 + Arrays.hashCode(this.aFloatArray109);
	}

	@OriginalMember(owner = "client!oi", name = "hf", descriptor = "(Ljava/lang/Object;)Z", line = 571)
	public boolean method29064(@OriginalArg(0) Object arg0) {
		if (!(arg0 instanceof Class442)) {
			return false;
		}
		@Pc(7) Class442 local7 = (Class442) arg0;
		for (@Pc(9) int local9 = 0; local9 < 16; local9++) {
			if (this.aFloatArray109[local9] != local7.aFloatArray109[local9]) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!oi", name = "equals", descriptor = "(Ljava/lang/Object;)Z", line = 571)
	@Override
	public boolean equals(@OriginalArg(0) Object arg0) {
		if (!(arg0 instanceof Class442)) {
			return false;
		}
		@Pc(7) Class442 local7 = (Class442) arg0;
		for (@Pc(9) int local9 = 0; local9 < 16; local9++) {
			if (this.aFloatArray109[local9] != local7.aFloatArray109[local9]) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!oi", name = "hi", descriptor = "(Ljava/lang/Object;)Z", line = 571)
	public boolean method29065(@OriginalArg(0) Object arg0) {
		if (!(arg0 instanceof Class442)) {
			return false;
		}
		@Pc(7) Class442 local7 = (Class442) arg0;
		for (@Pc(9) int local9 = 0; local9 < 16; local9++) {
			if (this.aFloatArray109[local9] != local7.aFloatArray109[local9]) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!oi", name = "ha", descriptor = "(Ljava/lang/Object;)Z", line = 571)
	public boolean method29066(@OriginalArg(0) Object arg0) {
		if (!(arg0 instanceof Class442)) {
			return false;
		}
		@Pc(7) Class442 local7 = (Class442) arg0;
		for (@Pc(9) int local9 = 0; local9 < 16; local9++) {
			if (this.aFloatArray109[local9] != local7.aFloatArray109[local9]) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!oi", name = "hn", descriptor = "(Ljava/lang/Object;)Z", line = 571)
	public boolean method29067(@OriginalArg(0) Object arg0) {
		if (!(arg0 instanceof Class442)) {
			return false;
		}
		@Pc(7) Class442 local7 = (Class442) arg0;
		for (@Pc(9) int local9 = 0; local9 < 16; local9++) {
			if (this.aFloatArray109[local9] != local7.aFloatArray109[local9]) {
				return false;
			}
		}
		return true;
	}
}
