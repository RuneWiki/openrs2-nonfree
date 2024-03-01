package com.jagex;

import java.util.Arrays;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mq")
public final class Class328 {

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "Lclient!mq;")
	public static final Class328 aClass328_99 = new Class328();

	@OriginalMember(owner = "client!mq", name = "p", descriptor = "[F")
	public float[] aFloatArray106 = new float[16];

	@OriginalMember(owner = "client!mq", name = "<init>", descriptor = "()V", line = 9)
	public Class328() {
		this.method26042();
	}

	@OriginalMember(owner = "client!mq", name = "<init>", descriptor = "(Lclient!mq;)V", line = 13)
	public Class328(@OriginalArg(0) Class328 arg0) {
		this.method26104(arg0);
	}

	@OriginalMember(owner = "client!mq", name = "p", descriptor = "()V", line = 18)
	public void method26042() {
		this.aFloatArray106[0] = 1.0F;
		this.aFloatArray106[1] = 0.0F;
		this.aFloatArray106[2] = 0.0F;
		this.aFloatArray106[3] = 0.0F;
		this.aFloatArray106[4] = 0.0F;
		this.aFloatArray106[5] = 1.0F;
		this.aFloatArray106[6] = 0.0F;
		this.aFloatArray106[7] = 0.0F;
		this.aFloatArray106[8] = 0.0F;
		this.aFloatArray106[9] = 0.0F;
		this.aFloatArray106[10] = 1.0F;
		this.aFloatArray106[11] = 0.0F;
		this.aFloatArray106[12] = 0.0F;
		this.aFloatArray106[13] = 0.0F;
		this.aFloatArray106[14] = 0.0F;
		this.aFloatArray106[15] = 1.0F;
	}

	@OriginalMember(owner = "client!mq", name = "av", descriptor = "()V", line = 18)
	public void method26082() {
		this.aFloatArray106[0] = 1.0F;
		this.aFloatArray106[1] = 0.0F;
		this.aFloatArray106[2] = 0.0F;
		this.aFloatArray106[3] = 0.0F;
		this.aFloatArray106[4] = 0.0F;
		this.aFloatArray106[5] = 1.0F;
		this.aFloatArray106[6] = 0.0F;
		this.aFloatArray106[7] = 0.0F;
		this.aFloatArray106[8] = 0.0F;
		this.aFloatArray106[9] = 0.0F;
		this.aFloatArray106[10] = 1.0F;
		this.aFloatArray106[11] = 0.0F;
		this.aFloatArray106[12] = 0.0F;
		this.aFloatArray106[13] = 0.0F;
		this.aFloatArray106[14] = 0.0F;
		this.aFloatArray106[15] = 1.0F;
	}

	@OriginalMember(owner = "client!mq", name = "ax", descriptor = "()V", line = 18)
	public void method26083() {
		this.aFloatArray106[0] = 1.0F;
		this.aFloatArray106[1] = 0.0F;
		this.aFloatArray106[2] = 0.0F;
		this.aFloatArray106[3] = 0.0F;
		this.aFloatArray106[4] = 0.0F;
		this.aFloatArray106[5] = 1.0F;
		this.aFloatArray106[6] = 0.0F;
		this.aFloatArray106[7] = 0.0F;
		this.aFloatArray106[8] = 0.0F;
		this.aFloatArray106[9] = 0.0F;
		this.aFloatArray106[10] = 1.0F;
		this.aFloatArray106[11] = 0.0F;
		this.aFloatArray106[12] = 0.0F;
		this.aFloatArray106[13] = 0.0F;
		this.aFloatArray106[14] = 0.0F;
		this.aFloatArray106[15] = 1.0F;
	}

	@OriginalMember(owner = "client!mq", name = "az", descriptor = "(Lclient!mq;)V", line = 37)
	public void method26091(@OriginalArg(0) Class328 arg0) {
		System.arraycopy(arg0.aFloatArray106, 0, this.aFloatArray106, 0, 16);
	}

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(Lclient!mq;)V", line = 37)
	public void method26104(@OriginalArg(0) Class328 arg0) {
		System.arraycopy(arg0.aFloatArray106, 0, this.aFloatArray106, 0, 16);
	}

	@OriginalMember(owner = "client!mq", name = "g", descriptor = "(Lclient!mq;)V", line = 41)
	public void method26044(@OriginalArg(0) Class328 arg0) {
		System.arraycopy(arg0.aFloatArray106, 0, this.aFloatArray106, 0, 11);
		this.aFloatArray106[3] = 0.0F;
		this.aFloatArray106[7] = 0.0F;
		this.aFloatArray106[11] = 0.0F;
		this.aFloatArray106[12] = 0.0F;
		this.aFloatArray106[13] = 0.0F;
		this.aFloatArray106[14] = 0.0F;
		this.aFloatArray106[15] = 1.0F;
	}

	@OriginalMember(owner = "client!mq", name = "al", descriptor = "(Lclient!mq;)V", line = 41)
	public void method26085(@OriginalArg(0) Class328 arg0) {
		System.arraycopy(arg0.aFloatArray106, 0, this.aFloatArray106, 0, 11);
		this.aFloatArray106[3] = 0.0F;
		this.aFloatArray106[7] = 0.0F;
		this.aFloatArray106[11] = 0.0F;
		this.aFloatArray106[12] = 0.0F;
		this.aFloatArray106[13] = 0.0F;
		this.aFloatArray106[14] = 0.0F;
		this.aFloatArray106[15] = 1.0F;
	}

	@OriginalMember(owner = "client!mq", name = "ao", descriptor = "(Lclient!mq;)V", line = 41)
	public void method26129(@OriginalArg(0) Class328 arg0) {
		System.arraycopy(arg0.aFloatArray106, 0, this.aFloatArray106, 0, 11);
		this.aFloatArray106[3] = 0.0F;
		this.aFloatArray106[7] = 0.0F;
		this.aFloatArray106[11] = 0.0F;
		this.aFloatArray106[12] = 0.0F;
		this.aFloatArray106[13] = 0.0F;
		this.aFloatArray106[14] = 0.0F;
		this.aFloatArray106[15] = 1.0F;
	}

	@OriginalMember(owner = "client!mq", name = "l", descriptor = "(Lclient!mq;Lclient!mq;)V", line = 52)
	public void method26045(@OriginalArg(0) Class328 arg0, @OriginalArg(1) Class328 arg1) {
		@Pc(39) float local39 = arg0.aFloatArray106[0] * arg1.aFloatArray106[0] + arg0.aFloatArray106[1] * arg1.aFloatArray106[4] + arg0.aFloatArray106[2] * arg1.aFloatArray106[8] + arg0.aFloatArray106[3] * arg1.aFloatArray106[12];
		@Pc(79) float local79 = arg0.aFloatArray106[0] * arg1.aFloatArray106[1] + arg0.aFloatArray106[1] * arg1.aFloatArray106[5] + arg0.aFloatArray106[2] * arg1.aFloatArray106[9] + arg0.aFloatArray106[3] * arg1.aFloatArray106[13];
		@Pc(119) float local119 = arg0.aFloatArray106[0] * arg1.aFloatArray106[2] + arg0.aFloatArray106[1] * arg1.aFloatArray106[6] + arg0.aFloatArray106[2] * arg1.aFloatArray106[10] + arg0.aFloatArray106[3] * arg1.aFloatArray106[14];
		@Pc(159) float local159 = arg0.aFloatArray106[0] * arg1.aFloatArray106[3] + arg0.aFloatArray106[1] * arg1.aFloatArray106[7] + arg0.aFloatArray106[2] * arg1.aFloatArray106[11] + arg0.aFloatArray106[3] * arg1.aFloatArray106[15];
		@Pc(199) float local199 = arg0.aFloatArray106[4] * arg1.aFloatArray106[0] + arg0.aFloatArray106[5] * arg1.aFloatArray106[4] + arg0.aFloatArray106[6] * arg1.aFloatArray106[8] + arg0.aFloatArray106[7] * arg1.aFloatArray106[12];
		@Pc(239) float local239 = arg0.aFloatArray106[4] * arg1.aFloatArray106[1] + arg0.aFloatArray106[5] * arg1.aFloatArray106[5] + arg0.aFloatArray106[6] * arg1.aFloatArray106[9] + arg0.aFloatArray106[7] * arg1.aFloatArray106[13];
		@Pc(279) float local279 = arg0.aFloatArray106[4] * arg1.aFloatArray106[2] + arg0.aFloatArray106[5] * arg1.aFloatArray106[6] + arg0.aFloatArray106[6] * arg1.aFloatArray106[10] + arg0.aFloatArray106[7] * arg1.aFloatArray106[14];
		@Pc(319) float local319 = arg0.aFloatArray106[4] * arg1.aFloatArray106[3] + arg0.aFloatArray106[5] * arg1.aFloatArray106[7] + arg0.aFloatArray106[6] * arg1.aFloatArray106[11] + arg0.aFloatArray106[7] * arg1.aFloatArray106[15];
		@Pc(359) float local359 = arg0.aFloatArray106[8] * arg1.aFloatArray106[0] + arg0.aFloatArray106[9] * arg1.aFloatArray106[4] + arg0.aFloatArray106[10] * arg1.aFloatArray106[8] + arg0.aFloatArray106[11] * arg1.aFloatArray106[12];
		@Pc(399) float local399 = arg0.aFloatArray106[8] * arg1.aFloatArray106[1] + arg0.aFloatArray106[9] * arg1.aFloatArray106[5] + arg0.aFloatArray106[10] * arg1.aFloatArray106[9] + arg0.aFloatArray106[11] * arg1.aFloatArray106[13];
		@Pc(439) float local439 = arg0.aFloatArray106[8] * arg1.aFloatArray106[2] + arg0.aFloatArray106[9] * arg1.aFloatArray106[6] + arg0.aFloatArray106[10] * arg1.aFloatArray106[10] + arg0.aFloatArray106[11] * arg1.aFloatArray106[14];
		@Pc(479) float local479 = arg0.aFloatArray106[8] * arg1.aFloatArray106[3] + arg0.aFloatArray106[9] * arg1.aFloatArray106[7] + arg0.aFloatArray106[10] * arg1.aFloatArray106[11] + arg0.aFloatArray106[11] * arg1.aFloatArray106[15];
		@Pc(519) float local519 = arg0.aFloatArray106[12] * arg1.aFloatArray106[0] + arg0.aFloatArray106[13] * arg1.aFloatArray106[4] + arg0.aFloatArray106[14] * arg1.aFloatArray106[8] + arg0.aFloatArray106[15] * arg1.aFloatArray106[12];
		@Pc(559) float local559 = arg0.aFloatArray106[12] * arg1.aFloatArray106[1] + arg0.aFloatArray106[13] * arg1.aFloatArray106[5] + arg0.aFloatArray106[14] * arg1.aFloatArray106[9] + arg0.aFloatArray106[15] * arg1.aFloatArray106[13];
		@Pc(599) float local599 = arg0.aFloatArray106[12] * arg1.aFloatArray106[2] + arg0.aFloatArray106[13] * arg1.aFloatArray106[6] + arg0.aFloatArray106[14] * arg1.aFloatArray106[10] + arg0.aFloatArray106[15] * arg1.aFloatArray106[14];
		@Pc(639) float local639 = arg0.aFloatArray106[12] * arg1.aFloatArray106[3] + arg0.aFloatArray106[13] * arg1.aFloatArray106[7] + arg0.aFloatArray106[14] * arg1.aFloatArray106[11] + arg0.aFloatArray106[15] * arg1.aFloatArray106[15];
		this.aFloatArray106[0] = local39;
		this.aFloatArray106[1] = local79;
		this.aFloatArray106[2] = local119;
		this.aFloatArray106[3] = local159;
		this.aFloatArray106[4] = local199;
		this.aFloatArray106[5] = local239;
		this.aFloatArray106[6] = local279;
		this.aFloatArray106[7] = local319;
		this.aFloatArray106[8] = local359;
		this.aFloatArray106[9] = local399;
		this.aFloatArray106[10] = local439;
		this.aFloatArray106[11] = local479;
		this.aFloatArray106[12] = local519;
		this.aFloatArray106[13] = local559;
		this.aFloatArray106[14] = local599;
		this.aFloatArray106[15] = local639;
	}

	@OriginalMember(owner = "client!mq", name = "ap", descriptor = "(Lclient!mq;Lclient!mq;)V", line = 52)
	public void method26087(@OriginalArg(0) Class328 arg0, @OriginalArg(1) Class328 arg1) {
		@Pc(39) float local39 = arg0.aFloatArray106[0] * arg1.aFloatArray106[0] + arg0.aFloatArray106[1] * arg1.aFloatArray106[4] + arg0.aFloatArray106[2] * arg1.aFloatArray106[8] + arg0.aFloatArray106[3] * arg1.aFloatArray106[12];
		@Pc(79) float local79 = arg0.aFloatArray106[0] * arg1.aFloatArray106[1] + arg0.aFloatArray106[1] * arg1.aFloatArray106[5] + arg0.aFloatArray106[2] * arg1.aFloatArray106[9] + arg0.aFloatArray106[3] * arg1.aFloatArray106[13];
		@Pc(119) float local119 = arg0.aFloatArray106[0] * arg1.aFloatArray106[2] + arg0.aFloatArray106[1] * arg1.aFloatArray106[6] + arg0.aFloatArray106[2] * arg1.aFloatArray106[10] + arg0.aFloatArray106[3] * arg1.aFloatArray106[14];
		@Pc(159) float local159 = arg0.aFloatArray106[0] * arg1.aFloatArray106[3] + arg0.aFloatArray106[1] * arg1.aFloatArray106[7] + arg0.aFloatArray106[2] * arg1.aFloatArray106[11] + arg0.aFloatArray106[3] * arg1.aFloatArray106[15];
		@Pc(199) float local199 = arg0.aFloatArray106[4] * arg1.aFloatArray106[0] + arg0.aFloatArray106[5] * arg1.aFloatArray106[4] + arg0.aFloatArray106[6] * arg1.aFloatArray106[8] + arg0.aFloatArray106[7] * arg1.aFloatArray106[12];
		@Pc(239) float local239 = arg0.aFloatArray106[4] * arg1.aFloatArray106[1] + arg0.aFloatArray106[5] * arg1.aFloatArray106[5] + arg0.aFloatArray106[6] * arg1.aFloatArray106[9] + arg0.aFloatArray106[7] * arg1.aFloatArray106[13];
		@Pc(279) float local279 = arg0.aFloatArray106[4] * arg1.aFloatArray106[2] + arg0.aFloatArray106[5] * arg1.aFloatArray106[6] + arg0.aFloatArray106[6] * arg1.aFloatArray106[10] + arg0.aFloatArray106[7] * arg1.aFloatArray106[14];
		@Pc(319) float local319 = arg0.aFloatArray106[4] * arg1.aFloatArray106[3] + arg0.aFloatArray106[5] * arg1.aFloatArray106[7] + arg0.aFloatArray106[6] * arg1.aFloatArray106[11] + arg0.aFloatArray106[7] * arg1.aFloatArray106[15];
		@Pc(359) float local359 = arg0.aFloatArray106[8] * arg1.aFloatArray106[0] + arg0.aFloatArray106[9] * arg1.aFloatArray106[4] + arg0.aFloatArray106[10] * arg1.aFloatArray106[8] + arg0.aFloatArray106[11] * arg1.aFloatArray106[12];
		@Pc(399) float local399 = arg0.aFloatArray106[8] * arg1.aFloatArray106[1] + arg0.aFloatArray106[9] * arg1.aFloatArray106[5] + arg0.aFloatArray106[10] * arg1.aFloatArray106[9] + arg0.aFloatArray106[11] * arg1.aFloatArray106[13];
		@Pc(439) float local439 = arg0.aFloatArray106[8] * arg1.aFloatArray106[2] + arg0.aFloatArray106[9] * arg1.aFloatArray106[6] + arg0.aFloatArray106[10] * arg1.aFloatArray106[10] + arg0.aFloatArray106[11] * arg1.aFloatArray106[14];
		@Pc(479) float local479 = arg0.aFloatArray106[8] * arg1.aFloatArray106[3] + arg0.aFloatArray106[9] * arg1.aFloatArray106[7] + arg0.aFloatArray106[10] * arg1.aFloatArray106[11] + arg0.aFloatArray106[11] * arg1.aFloatArray106[15];
		@Pc(519) float local519 = arg0.aFloatArray106[12] * arg1.aFloatArray106[0] + arg0.aFloatArray106[13] * arg1.aFloatArray106[4] + arg0.aFloatArray106[14] * arg1.aFloatArray106[8] + arg0.aFloatArray106[15] * arg1.aFloatArray106[12];
		@Pc(559) float local559 = arg0.aFloatArray106[12] * arg1.aFloatArray106[1] + arg0.aFloatArray106[13] * arg1.aFloatArray106[5] + arg0.aFloatArray106[14] * arg1.aFloatArray106[9] + arg0.aFloatArray106[15] * arg1.aFloatArray106[13];
		@Pc(599) float local599 = arg0.aFloatArray106[12] * arg1.aFloatArray106[2] + arg0.aFloatArray106[13] * arg1.aFloatArray106[6] + arg0.aFloatArray106[14] * arg1.aFloatArray106[10] + arg0.aFloatArray106[15] * arg1.aFloatArray106[14];
		@Pc(639) float local639 = arg0.aFloatArray106[12] * arg1.aFloatArray106[3] + arg0.aFloatArray106[13] * arg1.aFloatArray106[7] + arg0.aFloatArray106[14] * arg1.aFloatArray106[11] + arg0.aFloatArray106[15] * arg1.aFloatArray106[15];
		this.aFloatArray106[0] = local39;
		this.aFloatArray106[1] = local79;
		this.aFloatArray106[2] = local119;
		this.aFloatArray106[3] = local159;
		this.aFloatArray106[4] = local199;
		this.aFloatArray106[5] = local239;
		this.aFloatArray106[6] = local279;
		this.aFloatArray106[7] = local319;
		this.aFloatArray106[8] = local359;
		this.aFloatArray106[9] = local399;
		this.aFloatArray106[10] = local439;
		this.aFloatArray106[11] = local479;
		this.aFloatArray106[12] = local519;
		this.aFloatArray106[13] = local559;
		this.aFloatArray106[14] = local599;
		this.aFloatArray106[15] = local639;
	}

	@OriginalMember(owner = "client!mq", name = "ab", descriptor = "(Lclient!mq;Lclient!mq;)V", line = 52)
	public void method26088(@OriginalArg(0) Class328 arg0, @OriginalArg(1) Class328 arg1) {
		@Pc(39) float local39 = arg0.aFloatArray106[0] * arg1.aFloatArray106[0] + arg0.aFloatArray106[1] * arg1.aFloatArray106[4] + arg0.aFloatArray106[2] * arg1.aFloatArray106[8] + arg0.aFloatArray106[3] * arg1.aFloatArray106[12];
		@Pc(79) float local79 = arg0.aFloatArray106[0] * arg1.aFloatArray106[1] + arg0.aFloatArray106[1] * arg1.aFloatArray106[5] + arg0.aFloatArray106[2] * arg1.aFloatArray106[9] + arg0.aFloatArray106[3] * arg1.aFloatArray106[13];
		@Pc(119) float local119 = arg0.aFloatArray106[0] * arg1.aFloatArray106[2] + arg0.aFloatArray106[1] * arg1.aFloatArray106[6] + arg0.aFloatArray106[2] * arg1.aFloatArray106[10] + arg0.aFloatArray106[3] * arg1.aFloatArray106[14];
		@Pc(159) float local159 = arg0.aFloatArray106[0] * arg1.aFloatArray106[3] + arg0.aFloatArray106[1] * arg1.aFloatArray106[7] + arg0.aFloatArray106[2] * arg1.aFloatArray106[11] + arg0.aFloatArray106[3] * arg1.aFloatArray106[15];
		@Pc(199) float local199 = arg0.aFloatArray106[4] * arg1.aFloatArray106[0] + arg0.aFloatArray106[5] * arg1.aFloatArray106[4] + arg0.aFloatArray106[6] * arg1.aFloatArray106[8] + arg0.aFloatArray106[7] * arg1.aFloatArray106[12];
		@Pc(239) float local239 = arg0.aFloatArray106[4] * arg1.aFloatArray106[1] + arg0.aFloatArray106[5] * arg1.aFloatArray106[5] + arg0.aFloatArray106[6] * arg1.aFloatArray106[9] + arg0.aFloatArray106[7] * arg1.aFloatArray106[13];
		@Pc(279) float local279 = arg0.aFloatArray106[4] * arg1.aFloatArray106[2] + arg0.aFloatArray106[5] * arg1.aFloatArray106[6] + arg0.aFloatArray106[6] * arg1.aFloatArray106[10] + arg0.aFloatArray106[7] * arg1.aFloatArray106[14];
		@Pc(319) float local319 = arg0.aFloatArray106[4] * arg1.aFloatArray106[3] + arg0.aFloatArray106[5] * arg1.aFloatArray106[7] + arg0.aFloatArray106[6] * arg1.aFloatArray106[11] + arg0.aFloatArray106[7] * arg1.aFloatArray106[15];
		@Pc(359) float local359 = arg0.aFloatArray106[8] * arg1.aFloatArray106[0] + arg0.aFloatArray106[9] * arg1.aFloatArray106[4] + arg0.aFloatArray106[10] * arg1.aFloatArray106[8] + arg0.aFloatArray106[11] * arg1.aFloatArray106[12];
		@Pc(399) float local399 = arg0.aFloatArray106[8] * arg1.aFloatArray106[1] + arg0.aFloatArray106[9] * arg1.aFloatArray106[5] + arg0.aFloatArray106[10] * arg1.aFloatArray106[9] + arg0.aFloatArray106[11] * arg1.aFloatArray106[13];
		@Pc(439) float local439 = arg0.aFloatArray106[8] * arg1.aFloatArray106[2] + arg0.aFloatArray106[9] * arg1.aFloatArray106[6] + arg0.aFloatArray106[10] * arg1.aFloatArray106[10] + arg0.aFloatArray106[11] * arg1.aFloatArray106[14];
		@Pc(479) float local479 = arg0.aFloatArray106[8] * arg1.aFloatArray106[3] + arg0.aFloatArray106[9] * arg1.aFloatArray106[7] + arg0.aFloatArray106[10] * arg1.aFloatArray106[11] + arg0.aFloatArray106[11] * arg1.aFloatArray106[15];
		@Pc(519) float local519 = arg0.aFloatArray106[12] * arg1.aFloatArray106[0] + arg0.aFloatArray106[13] * arg1.aFloatArray106[4] + arg0.aFloatArray106[14] * arg1.aFloatArray106[8] + arg0.aFloatArray106[15] * arg1.aFloatArray106[12];
		@Pc(559) float local559 = arg0.aFloatArray106[12] * arg1.aFloatArray106[1] + arg0.aFloatArray106[13] * arg1.aFloatArray106[5] + arg0.aFloatArray106[14] * arg1.aFloatArray106[9] + arg0.aFloatArray106[15] * arg1.aFloatArray106[13];
		@Pc(599) float local599 = arg0.aFloatArray106[12] * arg1.aFloatArray106[2] + arg0.aFloatArray106[13] * arg1.aFloatArray106[6] + arg0.aFloatArray106[14] * arg1.aFloatArray106[10] + arg0.aFloatArray106[15] * arg1.aFloatArray106[14];
		@Pc(639) float local639 = arg0.aFloatArray106[12] * arg1.aFloatArray106[3] + arg0.aFloatArray106[13] * arg1.aFloatArray106[7] + arg0.aFloatArray106[14] * arg1.aFloatArray106[11] + arg0.aFloatArray106[15] * arg1.aFloatArray106[15];
		this.aFloatArray106[0] = local39;
		this.aFloatArray106[1] = local79;
		this.aFloatArray106[2] = local119;
		this.aFloatArray106[3] = local159;
		this.aFloatArray106[4] = local199;
		this.aFloatArray106[5] = local239;
		this.aFloatArray106[6] = local279;
		this.aFloatArray106[7] = local319;
		this.aFloatArray106[8] = local359;
		this.aFloatArray106[9] = local399;
		this.aFloatArray106[10] = local439;
		this.aFloatArray106[11] = local479;
		this.aFloatArray106[12] = local519;
		this.aFloatArray106[13] = local559;
		this.aFloatArray106[14] = local599;
		this.aFloatArray106[15] = local639;
	}

	@OriginalMember(owner = "client!mq", name = "au", descriptor = "(Lclient!mq;Lclient!mq;)V", line = 52)
	public void method26089(@OriginalArg(0) Class328 arg0, @OriginalArg(1) Class328 arg1) {
		@Pc(39) float local39 = arg0.aFloatArray106[0] * arg1.aFloatArray106[0] + arg0.aFloatArray106[1] * arg1.aFloatArray106[4] + arg0.aFloatArray106[2] * arg1.aFloatArray106[8] + arg0.aFloatArray106[3] * arg1.aFloatArray106[12];
		@Pc(79) float local79 = arg0.aFloatArray106[0] * arg1.aFloatArray106[1] + arg0.aFloatArray106[1] * arg1.aFloatArray106[5] + arg0.aFloatArray106[2] * arg1.aFloatArray106[9] + arg0.aFloatArray106[3] * arg1.aFloatArray106[13];
		@Pc(119) float local119 = arg0.aFloatArray106[0] * arg1.aFloatArray106[2] + arg0.aFloatArray106[1] * arg1.aFloatArray106[6] + arg0.aFloatArray106[2] * arg1.aFloatArray106[10] + arg0.aFloatArray106[3] * arg1.aFloatArray106[14];
		@Pc(159) float local159 = arg0.aFloatArray106[0] * arg1.aFloatArray106[3] + arg0.aFloatArray106[1] * arg1.aFloatArray106[7] + arg0.aFloatArray106[2] * arg1.aFloatArray106[11] + arg0.aFloatArray106[3] * arg1.aFloatArray106[15];
		@Pc(199) float local199 = arg0.aFloatArray106[4] * arg1.aFloatArray106[0] + arg0.aFloatArray106[5] * arg1.aFloatArray106[4] + arg0.aFloatArray106[6] * arg1.aFloatArray106[8] + arg0.aFloatArray106[7] * arg1.aFloatArray106[12];
		@Pc(239) float local239 = arg0.aFloatArray106[4] * arg1.aFloatArray106[1] + arg0.aFloatArray106[5] * arg1.aFloatArray106[5] + arg0.aFloatArray106[6] * arg1.aFloatArray106[9] + arg0.aFloatArray106[7] * arg1.aFloatArray106[13];
		@Pc(279) float local279 = arg0.aFloatArray106[4] * arg1.aFloatArray106[2] + arg0.aFloatArray106[5] * arg1.aFloatArray106[6] + arg0.aFloatArray106[6] * arg1.aFloatArray106[10] + arg0.aFloatArray106[7] * arg1.aFloatArray106[14];
		@Pc(319) float local319 = arg0.aFloatArray106[4] * arg1.aFloatArray106[3] + arg0.aFloatArray106[5] * arg1.aFloatArray106[7] + arg0.aFloatArray106[6] * arg1.aFloatArray106[11] + arg0.aFloatArray106[7] * arg1.aFloatArray106[15];
		@Pc(359) float local359 = arg0.aFloatArray106[8] * arg1.aFloatArray106[0] + arg0.aFloatArray106[9] * arg1.aFloatArray106[4] + arg0.aFloatArray106[10] * arg1.aFloatArray106[8] + arg0.aFloatArray106[11] * arg1.aFloatArray106[12];
		@Pc(399) float local399 = arg0.aFloatArray106[8] * arg1.aFloatArray106[1] + arg0.aFloatArray106[9] * arg1.aFloatArray106[5] + arg0.aFloatArray106[10] * arg1.aFloatArray106[9] + arg0.aFloatArray106[11] * arg1.aFloatArray106[13];
		@Pc(439) float local439 = arg0.aFloatArray106[8] * arg1.aFloatArray106[2] + arg0.aFloatArray106[9] * arg1.aFloatArray106[6] + arg0.aFloatArray106[10] * arg1.aFloatArray106[10] + arg0.aFloatArray106[11] * arg1.aFloatArray106[14];
		@Pc(479) float local479 = arg0.aFloatArray106[8] * arg1.aFloatArray106[3] + arg0.aFloatArray106[9] * arg1.aFloatArray106[7] + arg0.aFloatArray106[10] * arg1.aFloatArray106[11] + arg0.aFloatArray106[11] * arg1.aFloatArray106[15];
		@Pc(519) float local519 = arg0.aFloatArray106[12] * arg1.aFloatArray106[0] + arg0.aFloatArray106[13] * arg1.aFloatArray106[4] + arg0.aFloatArray106[14] * arg1.aFloatArray106[8] + arg0.aFloatArray106[15] * arg1.aFloatArray106[12];
		@Pc(559) float local559 = arg0.aFloatArray106[12] * arg1.aFloatArray106[1] + arg0.aFloatArray106[13] * arg1.aFloatArray106[5] + arg0.aFloatArray106[14] * arg1.aFloatArray106[9] + arg0.aFloatArray106[15] * arg1.aFloatArray106[13];
		@Pc(599) float local599 = arg0.aFloatArray106[12] * arg1.aFloatArray106[2] + arg0.aFloatArray106[13] * arg1.aFloatArray106[6] + arg0.aFloatArray106[14] * arg1.aFloatArray106[10] + arg0.aFloatArray106[15] * arg1.aFloatArray106[14];
		@Pc(639) float local639 = arg0.aFloatArray106[12] * arg1.aFloatArray106[3] + arg0.aFloatArray106[13] * arg1.aFloatArray106[7] + arg0.aFloatArray106[14] * arg1.aFloatArray106[11] + arg0.aFloatArray106[15] * arg1.aFloatArray106[15];
		this.aFloatArray106[0] = local39;
		this.aFloatArray106[1] = local79;
		this.aFloatArray106[2] = local119;
		this.aFloatArray106[3] = local159;
		this.aFloatArray106[4] = local199;
		this.aFloatArray106[5] = local239;
		this.aFloatArray106[6] = local279;
		this.aFloatArray106[7] = local319;
		this.aFloatArray106[8] = local359;
		this.aFloatArray106[9] = local399;
		this.aFloatArray106[10] = local439;
		this.aFloatArray106[11] = local479;
		this.aFloatArray106[12] = local519;
		this.aFloatArray106[13] = local559;
		this.aFloatArray106[14] = local599;
		this.aFloatArray106[15] = local639;
	}

	@OriginalMember(owner = "client!mq", name = "h", descriptor = "(Lclient!mq;)V", line = 87)
	public void method26046(@OriginalArg(0) Class328 arg0) {
		@Pc(39) float local39 = this.aFloatArray106[0] * arg0.aFloatArray106[0] + this.aFloatArray106[1] * arg0.aFloatArray106[4] + this.aFloatArray106[2] * arg0.aFloatArray106[8] + this.aFloatArray106[3] * arg0.aFloatArray106[12];
		@Pc(79) float local79 = this.aFloatArray106[0] * arg0.aFloatArray106[1] + this.aFloatArray106[1] * arg0.aFloatArray106[5] + this.aFloatArray106[2] * arg0.aFloatArray106[9] + this.aFloatArray106[3] * arg0.aFloatArray106[13];
		@Pc(119) float local119 = this.aFloatArray106[0] * arg0.aFloatArray106[2] + this.aFloatArray106[1] * arg0.aFloatArray106[6] + this.aFloatArray106[2] * arg0.aFloatArray106[10] + this.aFloatArray106[3] * arg0.aFloatArray106[14];
		@Pc(159) float local159 = this.aFloatArray106[0] * arg0.aFloatArray106[3] + this.aFloatArray106[1] * arg0.aFloatArray106[7] + this.aFloatArray106[2] * arg0.aFloatArray106[11] + this.aFloatArray106[3] * arg0.aFloatArray106[15];
		@Pc(199) float local199 = this.aFloatArray106[4] * arg0.aFloatArray106[0] + this.aFloatArray106[5] * arg0.aFloatArray106[4] + this.aFloatArray106[6] * arg0.aFloatArray106[8] + this.aFloatArray106[7] * arg0.aFloatArray106[12];
		@Pc(239) float local239 = this.aFloatArray106[4] * arg0.aFloatArray106[1] + this.aFloatArray106[5] * arg0.aFloatArray106[5] + this.aFloatArray106[6] * arg0.aFloatArray106[9] + this.aFloatArray106[7] * arg0.aFloatArray106[13];
		@Pc(279) float local279 = this.aFloatArray106[4] * arg0.aFloatArray106[2] + this.aFloatArray106[5] * arg0.aFloatArray106[6] + this.aFloatArray106[6] * arg0.aFloatArray106[10] + this.aFloatArray106[7] * arg0.aFloatArray106[14];
		@Pc(319) float local319 = this.aFloatArray106[4] * arg0.aFloatArray106[3] + this.aFloatArray106[5] * arg0.aFloatArray106[7] + this.aFloatArray106[6] * arg0.aFloatArray106[11] + this.aFloatArray106[7] * arg0.aFloatArray106[15];
		@Pc(359) float local359 = this.aFloatArray106[8] * arg0.aFloatArray106[0] + this.aFloatArray106[9] * arg0.aFloatArray106[4] + this.aFloatArray106[10] * arg0.aFloatArray106[8] + this.aFloatArray106[11] * arg0.aFloatArray106[12];
		@Pc(399) float local399 = this.aFloatArray106[8] * arg0.aFloatArray106[1] + this.aFloatArray106[9] * arg0.aFloatArray106[5] + this.aFloatArray106[10] * arg0.aFloatArray106[9] + this.aFloatArray106[11] * arg0.aFloatArray106[13];
		@Pc(439) float local439 = this.aFloatArray106[8] * arg0.aFloatArray106[2] + this.aFloatArray106[9] * arg0.aFloatArray106[6] + this.aFloatArray106[10] * arg0.aFloatArray106[10] + this.aFloatArray106[11] * arg0.aFloatArray106[14];
		@Pc(479) float local479 = this.aFloatArray106[8] * arg0.aFloatArray106[3] + this.aFloatArray106[9] * arg0.aFloatArray106[7] + this.aFloatArray106[10] * arg0.aFloatArray106[11] + this.aFloatArray106[11] * arg0.aFloatArray106[15];
		@Pc(519) float local519 = this.aFloatArray106[12] * arg0.aFloatArray106[0] + this.aFloatArray106[13] * arg0.aFloatArray106[4] + this.aFloatArray106[14] * arg0.aFloatArray106[8] + this.aFloatArray106[15] * arg0.aFloatArray106[12];
		@Pc(559) float local559 = this.aFloatArray106[12] * arg0.aFloatArray106[1] + this.aFloatArray106[13] * arg0.aFloatArray106[5] + this.aFloatArray106[14] * arg0.aFloatArray106[9] + this.aFloatArray106[15] * arg0.aFloatArray106[13];
		@Pc(599) float local599 = this.aFloatArray106[12] * arg0.aFloatArray106[2] + this.aFloatArray106[13] * arg0.aFloatArray106[6] + this.aFloatArray106[14] * arg0.aFloatArray106[10] + this.aFloatArray106[15] * arg0.aFloatArray106[14];
		@Pc(639) float local639 = this.aFloatArray106[12] * arg0.aFloatArray106[3] + this.aFloatArray106[13] * arg0.aFloatArray106[7] + this.aFloatArray106[14] * arg0.aFloatArray106[11] + this.aFloatArray106[15] * arg0.aFloatArray106[15];
		this.aFloatArray106[0] = local39;
		this.aFloatArray106[1] = local79;
		this.aFloatArray106[2] = local119;
		this.aFloatArray106[3] = local159;
		this.aFloatArray106[4] = local199;
		this.aFloatArray106[5] = local239;
		this.aFloatArray106[6] = local279;
		this.aFloatArray106[7] = local319;
		this.aFloatArray106[8] = local359;
		this.aFloatArray106[9] = local399;
		this.aFloatArray106[10] = local439;
		this.aFloatArray106[11] = local479;
		this.aFloatArray106[12] = local519;
		this.aFloatArray106[13] = local559;
		this.aFloatArray106[14] = local599;
		this.aFloatArray106[15] = local639;
	}

	@OriginalMember(owner = "client!mq", name = "ay", descriptor = "(Lclient!mq;)V", line = 87)
	public void method26090(@OriginalArg(0) Class328 arg0) {
		@Pc(39) float local39 = this.aFloatArray106[0] * arg0.aFloatArray106[0] + this.aFloatArray106[1] * arg0.aFloatArray106[4] + this.aFloatArray106[2] * arg0.aFloatArray106[8] + this.aFloatArray106[3] * arg0.aFloatArray106[12];
		@Pc(79) float local79 = this.aFloatArray106[0] * arg0.aFloatArray106[1] + this.aFloatArray106[1] * arg0.aFloatArray106[5] + this.aFloatArray106[2] * arg0.aFloatArray106[9] + this.aFloatArray106[3] * arg0.aFloatArray106[13];
		@Pc(119) float local119 = this.aFloatArray106[0] * arg0.aFloatArray106[2] + this.aFloatArray106[1] * arg0.aFloatArray106[6] + this.aFloatArray106[2] * arg0.aFloatArray106[10] + this.aFloatArray106[3] * arg0.aFloatArray106[14];
		@Pc(159) float local159 = this.aFloatArray106[0] * arg0.aFloatArray106[3] + this.aFloatArray106[1] * arg0.aFloatArray106[7] + this.aFloatArray106[2] * arg0.aFloatArray106[11] + this.aFloatArray106[3] * arg0.aFloatArray106[15];
		@Pc(199) float local199 = this.aFloatArray106[4] * arg0.aFloatArray106[0] + this.aFloatArray106[5] * arg0.aFloatArray106[4] + this.aFloatArray106[6] * arg0.aFloatArray106[8] + this.aFloatArray106[7] * arg0.aFloatArray106[12];
		@Pc(239) float local239 = this.aFloatArray106[4] * arg0.aFloatArray106[1] + this.aFloatArray106[5] * arg0.aFloatArray106[5] + this.aFloatArray106[6] * arg0.aFloatArray106[9] + this.aFloatArray106[7] * arg0.aFloatArray106[13];
		@Pc(279) float local279 = this.aFloatArray106[4] * arg0.aFloatArray106[2] + this.aFloatArray106[5] * arg0.aFloatArray106[6] + this.aFloatArray106[6] * arg0.aFloatArray106[10] + this.aFloatArray106[7] * arg0.aFloatArray106[14];
		@Pc(319) float local319 = this.aFloatArray106[4] * arg0.aFloatArray106[3] + this.aFloatArray106[5] * arg0.aFloatArray106[7] + this.aFloatArray106[6] * arg0.aFloatArray106[11] + this.aFloatArray106[7] * arg0.aFloatArray106[15];
		@Pc(359) float local359 = this.aFloatArray106[8] * arg0.aFloatArray106[0] + this.aFloatArray106[9] * arg0.aFloatArray106[4] + this.aFloatArray106[10] * arg0.aFloatArray106[8] + this.aFloatArray106[11] * arg0.aFloatArray106[12];
		@Pc(399) float local399 = this.aFloatArray106[8] * arg0.aFloatArray106[1] + this.aFloatArray106[9] * arg0.aFloatArray106[5] + this.aFloatArray106[10] * arg0.aFloatArray106[9] + this.aFloatArray106[11] * arg0.aFloatArray106[13];
		@Pc(439) float local439 = this.aFloatArray106[8] * arg0.aFloatArray106[2] + this.aFloatArray106[9] * arg0.aFloatArray106[6] + this.aFloatArray106[10] * arg0.aFloatArray106[10] + this.aFloatArray106[11] * arg0.aFloatArray106[14];
		@Pc(479) float local479 = this.aFloatArray106[8] * arg0.aFloatArray106[3] + this.aFloatArray106[9] * arg0.aFloatArray106[7] + this.aFloatArray106[10] * arg0.aFloatArray106[11] + this.aFloatArray106[11] * arg0.aFloatArray106[15];
		@Pc(519) float local519 = this.aFloatArray106[12] * arg0.aFloatArray106[0] + this.aFloatArray106[13] * arg0.aFloatArray106[4] + this.aFloatArray106[14] * arg0.aFloatArray106[8] + this.aFloatArray106[15] * arg0.aFloatArray106[12];
		@Pc(559) float local559 = this.aFloatArray106[12] * arg0.aFloatArray106[1] + this.aFloatArray106[13] * arg0.aFloatArray106[5] + this.aFloatArray106[14] * arg0.aFloatArray106[9] + this.aFloatArray106[15] * arg0.aFloatArray106[13];
		@Pc(599) float local599 = this.aFloatArray106[12] * arg0.aFloatArray106[2] + this.aFloatArray106[13] * arg0.aFloatArray106[6] + this.aFloatArray106[14] * arg0.aFloatArray106[10] + this.aFloatArray106[15] * arg0.aFloatArray106[14];
		@Pc(639) float local639 = this.aFloatArray106[12] * arg0.aFloatArray106[3] + this.aFloatArray106[13] * arg0.aFloatArray106[7] + this.aFloatArray106[14] * arg0.aFloatArray106[11] + this.aFloatArray106[15] * arg0.aFloatArray106[15];
		this.aFloatArray106[0] = local39;
		this.aFloatArray106[1] = local79;
		this.aFloatArray106[2] = local119;
		this.aFloatArray106[3] = local159;
		this.aFloatArray106[4] = local199;
		this.aFloatArray106[5] = local239;
		this.aFloatArray106[6] = local279;
		this.aFloatArray106[7] = local319;
		this.aFloatArray106[8] = local359;
		this.aFloatArray106[9] = local399;
		this.aFloatArray106[10] = local439;
		this.aFloatArray106[11] = local479;
		this.aFloatArray106[12] = local519;
		this.aFloatArray106[13] = local559;
		this.aFloatArray106[14] = local599;
		this.aFloatArray106[15] = local639;
	}

	@OriginalMember(owner = "client!mq", name = "am", descriptor = "(Lclient!mq;)V", line = 87)
	public void method26092(@OriginalArg(0) Class328 arg0) {
		@Pc(39) float local39 = this.aFloatArray106[0] * arg0.aFloatArray106[0] + this.aFloatArray106[1] * arg0.aFloatArray106[4] + this.aFloatArray106[2] * arg0.aFloatArray106[8] + this.aFloatArray106[3] * arg0.aFloatArray106[12];
		@Pc(79) float local79 = this.aFloatArray106[0] * arg0.aFloatArray106[1] + this.aFloatArray106[1] * arg0.aFloatArray106[5] + this.aFloatArray106[2] * arg0.aFloatArray106[9] + this.aFloatArray106[3] * arg0.aFloatArray106[13];
		@Pc(119) float local119 = this.aFloatArray106[0] * arg0.aFloatArray106[2] + this.aFloatArray106[1] * arg0.aFloatArray106[6] + this.aFloatArray106[2] * arg0.aFloatArray106[10] + this.aFloatArray106[3] * arg0.aFloatArray106[14];
		@Pc(159) float local159 = this.aFloatArray106[0] * arg0.aFloatArray106[3] + this.aFloatArray106[1] * arg0.aFloatArray106[7] + this.aFloatArray106[2] * arg0.aFloatArray106[11] + this.aFloatArray106[3] * arg0.aFloatArray106[15];
		@Pc(199) float local199 = this.aFloatArray106[4] * arg0.aFloatArray106[0] + this.aFloatArray106[5] * arg0.aFloatArray106[4] + this.aFloatArray106[6] * arg0.aFloatArray106[8] + this.aFloatArray106[7] * arg0.aFloatArray106[12];
		@Pc(239) float local239 = this.aFloatArray106[4] * arg0.aFloatArray106[1] + this.aFloatArray106[5] * arg0.aFloatArray106[5] + this.aFloatArray106[6] * arg0.aFloatArray106[9] + this.aFloatArray106[7] * arg0.aFloatArray106[13];
		@Pc(279) float local279 = this.aFloatArray106[4] * arg0.aFloatArray106[2] + this.aFloatArray106[5] * arg0.aFloatArray106[6] + this.aFloatArray106[6] * arg0.aFloatArray106[10] + this.aFloatArray106[7] * arg0.aFloatArray106[14];
		@Pc(319) float local319 = this.aFloatArray106[4] * arg0.aFloatArray106[3] + this.aFloatArray106[5] * arg0.aFloatArray106[7] + this.aFloatArray106[6] * arg0.aFloatArray106[11] + this.aFloatArray106[7] * arg0.aFloatArray106[15];
		@Pc(359) float local359 = this.aFloatArray106[8] * arg0.aFloatArray106[0] + this.aFloatArray106[9] * arg0.aFloatArray106[4] + this.aFloatArray106[10] * arg0.aFloatArray106[8] + this.aFloatArray106[11] * arg0.aFloatArray106[12];
		@Pc(399) float local399 = this.aFloatArray106[8] * arg0.aFloatArray106[1] + this.aFloatArray106[9] * arg0.aFloatArray106[5] + this.aFloatArray106[10] * arg0.aFloatArray106[9] + this.aFloatArray106[11] * arg0.aFloatArray106[13];
		@Pc(439) float local439 = this.aFloatArray106[8] * arg0.aFloatArray106[2] + this.aFloatArray106[9] * arg0.aFloatArray106[6] + this.aFloatArray106[10] * arg0.aFloatArray106[10] + this.aFloatArray106[11] * arg0.aFloatArray106[14];
		@Pc(479) float local479 = this.aFloatArray106[8] * arg0.aFloatArray106[3] + this.aFloatArray106[9] * arg0.aFloatArray106[7] + this.aFloatArray106[10] * arg0.aFloatArray106[11] + this.aFloatArray106[11] * arg0.aFloatArray106[15];
		@Pc(519) float local519 = this.aFloatArray106[12] * arg0.aFloatArray106[0] + this.aFloatArray106[13] * arg0.aFloatArray106[4] + this.aFloatArray106[14] * arg0.aFloatArray106[8] + this.aFloatArray106[15] * arg0.aFloatArray106[12];
		@Pc(559) float local559 = this.aFloatArray106[12] * arg0.aFloatArray106[1] + this.aFloatArray106[13] * arg0.aFloatArray106[5] + this.aFloatArray106[14] * arg0.aFloatArray106[9] + this.aFloatArray106[15] * arg0.aFloatArray106[13];
		@Pc(599) float local599 = this.aFloatArray106[12] * arg0.aFloatArray106[2] + this.aFloatArray106[13] * arg0.aFloatArray106[6] + this.aFloatArray106[14] * arg0.aFloatArray106[10] + this.aFloatArray106[15] * arg0.aFloatArray106[14];
		@Pc(639) float local639 = this.aFloatArray106[12] * arg0.aFloatArray106[3] + this.aFloatArray106[13] * arg0.aFloatArray106[7] + this.aFloatArray106[14] * arg0.aFloatArray106[11] + this.aFloatArray106[15] * arg0.aFloatArray106[15];
		this.aFloatArray106[0] = local39;
		this.aFloatArray106[1] = local79;
		this.aFloatArray106[2] = local119;
		this.aFloatArray106[3] = local159;
		this.aFloatArray106[4] = local199;
		this.aFloatArray106[5] = local239;
		this.aFloatArray106[6] = local279;
		this.aFloatArray106[7] = local319;
		this.aFloatArray106[8] = local359;
		this.aFloatArray106[9] = local399;
		this.aFloatArray106[10] = local439;
		this.aFloatArray106[11] = local479;
		this.aFloatArray106[12] = local519;
		this.aFloatArray106[13] = local559;
		this.aFloatArray106[14] = local599;
		this.aFloatArray106[15] = local639;
	}

	@OriginalMember(owner = "client!mq", name = "ar", descriptor = "(Lclient!mq;)V", line = 87)
	public void method26093(@OriginalArg(0) Class328 arg0) {
		@Pc(39) float local39 = this.aFloatArray106[0] * arg0.aFloatArray106[0] + this.aFloatArray106[1] * arg0.aFloatArray106[4] + this.aFloatArray106[2] * arg0.aFloatArray106[8] + this.aFloatArray106[3] * arg0.aFloatArray106[12];
		@Pc(79) float local79 = this.aFloatArray106[0] * arg0.aFloatArray106[1] + this.aFloatArray106[1] * arg0.aFloatArray106[5] + this.aFloatArray106[2] * arg0.aFloatArray106[9] + this.aFloatArray106[3] * arg0.aFloatArray106[13];
		@Pc(119) float local119 = this.aFloatArray106[0] * arg0.aFloatArray106[2] + this.aFloatArray106[1] * arg0.aFloatArray106[6] + this.aFloatArray106[2] * arg0.aFloatArray106[10] + this.aFloatArray106[3] * arg0.aFloatArray106[14];
		@Pc(159) float local159 = this.aFloatArray106[0] * arg0.aFloatArray106[3] + this.aFloatArray106[1] * arg0.aFloatArray106[7] + this.aFloatArray106[2] * arg0.aFloatArray106[11] + this.aFloatArray106[3] * arg0.aFloatArray106[15];
		@Pc(199) float local199 = this.aFloatArray106[4] * arg0.aFloatArray106[0] + this.aFloatArray106[5] * arg0.aFloatArray106[4] + this.aFloatArray106[6] * arg0.aFloatArray106[8] + this.aFloatArray106[7] * arg0.aFloatArray106[12];
		@Pc(239) float local239 = this.aFloatArray106[4] * arg0.aFloatArray106[1] + this.aFloatArray106[5] * arg0.aFloatArray106[5] + this.aFloatArray106[6] * arg0.aFloatArray106[9] + this.aFloatArray106[7] * arg0.aFloatArray106[13];
		@Pc(279) float local279 = this.aFloatArray106[4] * arg0.aFloatArray106[2] + this.aFloatArray106[5] * arg0.aFloatArray106[6] + this.aFloatArray106[6] * arg0.aFloatArray106[10] + this.aFloatArray106[7] * arg0.aFloatArray106[14];
		@Pc(319) float local319 = this.aFloatArray106[4] * arg0.aFloatArray106[3] + this.aFloatArray106[5] * arg0.aFloatArray106[7] + this.aFloatArray106[6] * arg0.aFloatArray106[11] + this.aFloatArray106[7] * arg0.aFloatArray106[15];
		@Pc(359) float local359 = this.aFloatArray106[8] * arg0.aFloatArray106[0] + this.aFloatArray106[9] * arg0.aFloatArray106[4] + this.aFloatArray106[10] * arg0.aFloatArray106[8] + this.aFloatArray106[11] * arg0.aFloatArray106[12];
		@Pc(399) float local399 = this.aFloatArray106[8] * arg0.aFloatArray106[1] + this.aFloatArray106[9] * arg0.aFloatArray106[5] + this.aFloatArray106[10] * arg0.aFloatArray106[9] + this.aFloatArray106[11] * arg0.aFloatArray106[13];
		@Pc(439) float local439 = this.aFloatArray106[8] * arg0.aFloatArray106[2] + this.aFloatArray106[9] * arg0.aFloatArray106[6] + this.aFloatArray106[10] * arg0.aFloatArray106[10] + this.aFloatArray106[11] * arg0.aFloatArray106[14];
		@Pc(479) float local479 = this.aFloatArray106[8] * arg0.aFloatArray106[3] + this.aFloatArray106[9] * arg0.aFloatArray106[7] + this.aFloatArray106[10] * arg0.aFloatArray106[11] + this.aFloatArray106[11] * arg0.aFloatArray106[15];
		@Pc(519) float local519 = this.aFloatArray106[12] * arg0.aFloatArray106[0] + this.aFloatArray106[13] * arg0.aFloatArray106[4] + this.aFloatArray106[14] * arg0.aFloatArray106[8] + this.aFloatArray106[15] * arg0.aFloatArray106[12];
		@Pc(559) float local559 = this.aFloatArray106[12] * arg0.aFloatArray106[1] + this.aFloatArray106[13] * arg0.aFloatArray106[5] + this.aFloatArray106[14] * arg0.aFloatArray106[9] + this.aFloatArray106[15] * arg0.aFloatArray106[13];
		@Pc(599) float local599 = this.aFloatArray106[12] * arg0.aFloatArray106[2] + this.aFloatArray106[13] * arg0.aFloatArray106[6] + this.aFloatArray106[14] * arg0.aFloatArray106[10] + this.aFloatArray106[15] * arg0.aFloatArray106[14];
		@Pc(639) float local639 = this.aFloatArray106[12] * arg0.aFloatArray106[3] + this.aFloatArray106[13] * arg0.aFloatArray106[7] + this.aFloatArray106[14] * arg0.aFloatArray106[11] + this.aFloatArray106[15] * arg0.aFloatArray106[15];
		this.aFloatArray106[0] = local39;
		this.aFloatArray106[1] = local79;
		this.aFloatArray106[2] = local119;
		this.aFloatArray106[3] = local159;
		this.aFloatArray106[4] = local199;
		this.aFloatArray106[5] = local239;
		this.aFloatArray106[6] = local279;
		this.aFloatArray106[7] = local319;
		this.aFloatArray106[8] = local359;
		this.aFloatArray106[9] = local399;
		this.aFloatArray106[10] = local439;
		this.aFloatArray106[11] = local479;
		this.aFloatArray106[12] = local519;
		this.aFloatArray106[13] = local559;
		this.aFloatArray106[14] = local599;
		this.aFloatArray106[15] = local639;
	}

	@OriginalMember(owner = "client!mq", name = "ag", descriptor = "(Lclient!mq;)V", line = 87)
	public void method26141(@OriginalArg(0) Class328 arg0) {
		@Pc(39) float local39 = this.aFloatArray106[0] * arg0.aFloatArray106[0] + this.aFloatArray106[1] * arg0.aFloatArray106[4] + this.aFloatArray106[2] * arg0.aFloatArray106[8] + this.aFloatArray106[3] * arg0.aFloatArray106[12];
		@Pc(79) float local79 = this.aFloatArray106[0] * arg0.aFloatArray106[1] + this.aFloatArray106[1] * arg0.aFloatArray106[5] + this.aFloatArray106[2] * arg0.aFloatArray106[9] + this.aFloatArray106[3] * arg0.aFloatArray106[13];
		@Pc(119) float local119 = this.aFloatArray106[0] * arg0.aFloatArray106[2] + this.aFloatArray106[1] * arg0.aFloatArray106[6] + this.aFloatArray106[2] * arg0.aFloatArray106[10] + this.aFloatArray106[3] * arg0.aFloatArray106[14];
		@Pc(159) float local159 = this.aFloatArray106[0] * arg0.aFloatArray106[3] + this.aFloatArray106[1] * arg0.aFloatArray106[7] + this.aFloatArray106[2] * arg0.aFloatArray106[11] + this.aFloatArray106[3] * arg0.aFloatArray106[15];
		@Pc(199) float local199 = this.aFloatArray106[4] * arg0.aFloatArray106[0] + this.aFloatArray106[5] * arg0.aFloatArray106[4] + this.aFloatArray106[6] * arg0.aFloatArray106[8] + this.aFloatArray106[7] * arg0.aFloatArray106[12];
		@Pc(239) float local239 = this.aFloatArray106[4] * arg0.aFloatArray106[1] + this.aFloatArray106[5] * arg0.aFloatArray106[5] + this.aFloatArray106[6] * arg0.aFloatArray106[9] + this.aFloatArray106[7] * arg0.aFloatArray106[13];
		@Pc(279) float local279 = this.aFloatArray106[4] * arg0.aFloatArray106[2] + this.aFloatArray106[5] * arg0.aFloatArray106[6] + this.aFloatArray106[6] * arg0.aFloatArray106[10] + this.aFloatArray106[7] * arg0.aFloatArray106[14];
		@Pc(319) float local319 = this.aFloatArray106[4] * arg0.aFloatArray106[3] + this.aFloatArray106[5] * arg0.aFloatArray106[7] + this.aFloatArray106[6] * arg0.aFloatArray106[11] + this.aFloatArray106[7] * arg0.aFloatArray106[15];
		@Pc(359) float local359 = this.aFloatArray106[8] * arg0.aFloatArray106[0] + this.aFloatArray106[9] * arg0.aFloatArray106[4] + this.aFloatArray106[10] * arg0.aFloatArray106[8] + this.aFloatArray106[11] * arg0.aFloatArray106[12];
		@Pc(399) float local399 = this.aFloatArray106[8] * arg0.aFloatArray106[1] + this.aFloatArray106[9] * arg0.aFloatArray106[5] + this.aFloatArray106[10] * arg0.aFloatArray106[9] + this.aFloatArray106[11] * arg0.aFloatArray106[13];
		@Pc(439) float local439 = this.aFloatArray106[8] * arg0.aFloatArray106[2] + this.aFloatArray106[9] * arg0.aFloatArray106[6] + this.aFloatArray106[10] * arg0.aFloatArray106[10] + this.aFloatArray106[11] * arg0.aFloatArray106[14];
		@Pc(479) float local479 = this.aFloatArray106[8] * arg0.aFloatArray106[3] + this.aFloatArray106[9] * arg0.aFloatArray106[7] + this.aFloatArray106[10] * arg0.aFloatArray106[11] + this.aFloatArray106[11] * arg0.aFloatArray106[15];
		@Pc(519) float local519 = this.aFloatArray106[12] * arg0.aFloatArray106[0] + this.aFloatArray106[13] * arg0.aFloatArray106[4] + this.aFloatArray106[14] * arg0.aFloatArray106[8] + this.aFloatArray106[15] * arg0.aFloatArray106[12];
		@Pc(559) float local559 = this.aFloatArray106[12] * arg0.aFloatArray106[1] + this.aFloatArray106[13] * arg0.aFloatArray106[5] + this.aFloatArray106[14] * arg0.aFloatArray106[9] + this.aFloatArray106[15] * arg0.aFloatArray106[13];
		@Pc(599) float local599 = this.aFloatArray106[12] * arg0.aFloatArray106[2] + this.aFloatArray106[13] * arg0.aFloatArray106[6] + this.aFloatArray106[14] * arg0.aFloatArray106[10] + this.aFloatArray106[15] * arg0.aFloatArray106[14];
		@Pc(639) float local639 = this.aFloatArray106[12] * arg0.aFloatArray106[3] + this.aFloatArray106[13] * arg0.aFloatArray106[7] + this.aFloatArray106[14] * arg0.aFloatArray106[11] + this.aFloatArray106[15] * arg0.aFloatArray106[15];
		this.aFloatArray106[0] = local39;
		this.aFloatArray106[1] = local79;
		this.aFloatArray106[2] = local119;
		this.aFloatArray106[3] = local159;
		this.aFloatArray106[4] = local199;
		this.aFloatArray106[5] = local239;
		this.aFloatArray106[6] = local279;
		this.aFloatArray106[7] = local319;
		this.aFloatArray106[8] = local359;
		this.aFloatArray106[9] = local399;
		this.aFloatArray106[10] = local439;
		this.aFloatArray106[11] = local479;
		this.aFloatArray106[12] = local519;
		this.aFloatArray106[13] = local559;
		this.aFloatArray106[14] = local599;
		this.aFloatArray106[15] = local639;
	}

	@OriginalMember(owner = "client!mq", name = "x", descriptor = "(Lclient!mu;)V", line = 122)
	public void method26056(@OriginalArg(0) Class332 arg0) {
		this.aFloatArray106[0] = arg0.aFloat270;
		this.aFloatArray106[1] = arg0.aFloat271;
		this.aFloatArray106[2] = arg0.aFloat278;
		this.aFloatArray106[3] = 0.0F;
		this.aFloatArray106[4] = arg0.aFloat273;
		this.aFloatArray106[5] = arg0.aFloat274;
		this.aFloatArray106[6] = arg0.aFloat279;
		this.aFloatArray106[7] = 0.0F;
		this.aFloatArray106[8] = arg0.aFloat280;
		this.aFloatArray106[9] = arg0.aFloat276;
		this.aFloatArray106[10] = arg0.aFloat277;
		this.aFloatArray106[11] = 0.0F;
		this.aFloatArray106[12] = arg0.aFloat272;
		this.aFloatArray106[13] = arg0.aFloat275;
		this.aFloatArray106[14] = arg0.aFloat269;
		this.aFloatArray106[15] = 1.0F;
	}

	@OriginalMember(owner = "client!mq", name = "ae", descriptor = "(Lclient!mu;)V", line = 122)
	public void method26094(@OriginalArg(0) Class332 arg0) {
		this.aFloatArray106[0] = arg0.aFloat270;
		this.aFloatArray106[1] = arg0.aFloat271;
		this.aFloatArray106[2] = arg0.aFloat278;
		this.aFloatArray106[3] = 0.0F;
		this.aFloatArray106[4] = arg0.aFloat273;
		this.aFloatArray106[5] = arg0.aFloat274;
		this.aFloatArray106[6] = arg0.aFloat279;
		this.aFloatArray106[7] = 0.0F;
		this.aFloatArray106[8] = arg0.aFloat280;
		this.aFloatArray106[9] = arg0.aFloat276;
		this.aFloatArray106[10] = arg0.aFloat277;
		this.aFloatArray106[11] = 0.0F;
		this.aFloatArray106[12] = arg0.aFloat272;
		this.aFloatArray106[13] = arg0.aFloat275;
		this.aFloatArray106[14] = arg0.aFloat269;
		this.aFloatArray106[15] = 1.0F;
	}

	@OriginalMember(owner = "client!mq", name = "s", descriptor = "()F", line = 141)
	float method26048() {
		return this.aFloatArray106[0] * this.aFloatArray106[5] * this.aFloatArray106[10] * this.aFloatArray106[15] - this.aFloatArray106[0] * this.aFloatArray106[5] * this.aFloatArray106[11] * this.aFloatArray106[14] - this.aFloatArray106[0] * this.aFloatArray106[6] * this.aFloatArray106[9] * this.aFloatArray106[15] + this.aFloatArray106[0] * this.aFloatArray106[6] * this.aFloatArray106[11] * this.aFloatArray106[13] + this.aFloatArray106[0] * this.aFloatArray106[7] * this.aFloatArray106[9] * this.aFloatArray106[14] - this.aFloatArray106[0] * this.aFloatArray106[7] * this.aFloatArray106[10] * this.aFloatArray106[13] - this.aFloatArray106[1] * this.aFloatArray106[4] * this.aFloatArray106[10] * this.aFloatArray106[15] + this.aFloatArray106[1] * this.aFloatArray106[4] * this.aFloatArray106[11] * this.aFloatArray106[14] + this.aFloatArray106[1] * this.aFloatArray106[6] * this.aFloatArray106[8] * this.aFloatArray106[15] - this.aFloatArray106[1] * this.aFloatArray106[6] * this.aFloatArray106[11] * this.aFloatArray106[12] - this.aFloatArray106[1] * this.aFloatArray106[7] * this.aFloatArray106[8] * this.aFloatArray106[14] + this.aFloatArray106[1] * this.aFloatArray106[7] * this.aFloatArray106[10] * this.aFloatArray106[12] + this.aFloatArray106[2] * this.aFloatArray106[4] * this.aFloatArray106[9] * this.aFloatArray106[15] - this.aFloatArray106[2] * this.aFloatArray106[4] * this.aFloatArray106[11] * this.aFloatArray106[13] - this.aFloatArray106[2] * this.aFloatArray106[5] * this.aFloatArray106[8] * this.aFloatArray106[15] + this.aFloatArray106[2] * this.aFloatArray106[5] * this.aFloatArray106[11] * this.aFloatArray106[12] + this.aFloatArray106[2] * this.aFloatArray106[7] * this.aFloatArray106[8] * this.aFloatArray106[13] - this.aFloatArray106[2] * this.aFloatArray106[7] * this.aFloatArray106[9] * this.aFloatArray106[12] - this.aFloatArray106[3] * this.aFloatArray106[4] * this.aFloatArray106[9] * this.aFloatArray106[14] + this.aFloatArray106[3] * this.aFloatArray106[4] * this.aFloatArray106[10] * this.aFloatArray106[13] + this.aFloatArray106[3] * this.aFloatArray106[5] * this.aFloatArray106[8] * this.aFloatArray106[14] - this.aFloatArray106[3] * this.aFloatArray106[5] * this.aFloatArray106[10] * this.aFloatArray106[12] - this.aFloatArray106[3] * this.aFloatArray106[6] * this.aFloatArray106[8] * this.aFloatArray106[13] + this.aFloatArray106[3] * this.aFloatArray106[6] * this.aFloatArray106[9] * this.aFloatArray106[12];
	}

	@OriginalMember(owner = "client!mq", name = "aw", descriptor = "()F", line = 141)
	float method26096() {
		return this.aFloatArray106[0] * this.aFloatArray106[5] * this.aFloatArray106[10] * this.aFloatArray106[15] - this.aFloatArray106[0] * this.aFloatArray106[5] * this.aFloatArray106[11] * this.aFloatArray106[14] - this.aFloatArray106[0] * this.aFloatArray106[6] * this.aFloatArray106[9] * this.aFloatArray106[15] + this.aFloatArray106[0] * this.aFloatArray106[6] * this.aFloatArray106[11] * this.aFloatArray106[13] + this.aFloatArray106[0] * this.aFloatArray106[7] * this.aFloatArray106[9] * this.aFloatArray106[14] - this.aFloatArray106[0] * this.aFloatArray106[7] * this.aFloatArray106[10] * this.aFloatArray106[13] - this.aFloatArray106[1] * this.aFloatArray106[4] * this.aFloatArray106[10] * this.aFloatArray106[15] + this.aFloatArray106[1] * this.aFloatArray106[4] * this.aFloatArray106[11] * this.aFloatArray106[14] + this.aFloatArray106[1] * this.aFloatArray106[6] * this.aFloatArray106[8] * this.aFloatArray106[15] - this.aFloatArray106[1] * this.aFloatArray106[6] * this.aFloatArray106[11] * this.aFloatArray106[12] - this.aFloatArray106[1] * this.aFloatArray106[7] * this.aFloatArray106[8] * this.aFloatArray106[14] + this.aFloatArray106[1] * this.aFloatArray106[7] * this.aFloatArray106[10] * this.aFloatArray106[12] + this.aFloatArray106[2] * this.aFloatArray106[4] * this.aFloatArray106[9] * this.aFloatArray106[15] - this.aFloatArray106[2] * this.aFloatArray106[4] * this.aFloatArray106[11] * this.aFloatArray106[13] - this.aFloatArray106[2] * this.aFloatArray106[5] * this.aFloatArray106[8] * this.aFloatArray106[15] + this.aFloatArray106[2] * this.aFloatArray106[5] * this.aFloatArray106[11] * this.aFloatArray106[12] + this.aFloatArray106[2] * this.aFloatArray106[7] * this.aFloatArray106[8] * this.aFloatArray106[13] - this.aFloatArray106[2] * this.aFloatArray106[7] * this.aFloatArray106[9] * this.aFloatArray106[12] - this.aFloatArray106[3] * this.aFloatArray106[4] * this.aFloatArray106[9] * this.aFloatArray106[14] + this.aFloatArray106[3] * this.aFloatArray106[4] * this.aFloatArray106[10] * this.aFloatArray106[13] + this.aFloatArray106[3] * this.aFloatArray106[5] * this.aFloatArray106[8] * this.aFloatArray106[14] - this.aFloatArray106[3] * this.aFloatArray106[5] * this.aFloatArray106[10] * this.aFloatArray106[12] - this.aFloatArray106[3] * this.aFloatArray106[6] * this.aFloatArray106[8] * this.aFloatArray106[13] + this.aFloatArray106[3] * this.aFloatArray106[6] * this.aFloatArray106[9] * this.aFloatArray106[12];
	}

	@OriginalMember(owner = "client!mq", name = "ac", descriptor = "()F", line = 141)
	float method26097() {
		return this.aFloatArray106[0] * this.aFloatArray106[5] * this.aFloatArray106[10] * this.aFloatArray106[15] - this.aFloatArray106[0] * this.aFloatArray106[5] * this.aFloatArray106[11] * this.aFloatArray106[14] - this.aFloatArray106[0] * this.aFloatArray106[6] * this.aFloatArray106[9] * this.aFloatArray106[15] + this.aFloatArray106[0] * this.aFloatArray106[6] * this.aFloatArray106[11] * this.aFloatArray106[13] + this.aFloatArray106[0] * this.aFloatArray106[7] * this.aFloatArray106[9] * this.aFloatArray106[14] - this.aFloatArray106[0] * this.aFloatArray106[7] * this.aFloatArray106[10] * this.aFloatArray106[13] - this.aFloatArray106[1] * this.aFloatArray106[4] * this.aFloatArray106[10] * this.aFloatArray106[15] + this.aFloatArray106[1] * this.aFloatArray106[4] * this.aFloatArray106[11] * this.aFloatArray106[14] + this.aFloatArray106[1] * this.aFloatArray106[6] * this.aFloatArray106[8] * this.aFloatArray106[15] - this.aFloatArray106[1] * this.aFloatArray106[6] * this.aFloatArray106[11] * this.aFloatArray106[12] - this.aFloatArray106[1] * this.aFloatArray106[7] * this.aFloatArray106[8] * this.aFloatArray106[14] + this.aFloatArray106[1] * this.aFloatArray106[7] * this.aFloatArray106[10] * this.aFloatArray106[12] + this.aFloatArray106[2] * this.aFloatArray106[4] * this.aFloatArray106[9] * this.aFloatArray106[15] - this.aFloatArray106[2] * this.aFloatArray106[4] * this.aFloatArray106[11] * this.aFloatArray106[13] - this.aFloatArray106[2] * this.aFloatArray106[5] * this.aFloatArray106[8] * this.aFloatArray106[15] + this.aFloatArray106[2] * this.aFloatArray106[5] * this.aFloatArray106[11] * this.aFloatArray106[12] + this.aFloatArray106[2] * this.aFloatArray106[7] * this.aFloatArray106[8] * this.aFloatArray106[13] - this.aFloatArray106[2] * this.aFloatArray106[7] * this.aFloatArray106[9] * this.aFloatArray106[12] - this.aFloatArray106[3] * this.aFloatArray106[4] * this.aFloatArray106[9] * this.aFloatArray106[14] + this.aFloatArray106[3] * this.aFloatArray106[4] * this.aFloatArray106[10] * this.aFloatArray106[13] + this.aFloatArray106[3] * this.aFloatArray106[5] * this.aFloatArray106[8] * this.aFloatArray106[14] - this.aFloatArray106[3] * this.aFloatArray106[5] * this.aFloatArray106[10] * this.aFloatArray106[12] - this.aFloatArray106[3] * this.aFloatArray106[6] * this.aFloatArray106[8] * this.aFloatArray106[13] + this.aFloatArray106[3] * this.aFloatArray106[6] * this.aFloatArray106[9] * this.aFloatArray106[12];
	}

	@OriginalMember(owner = "client!mq", name = "ad", descriptor = "()F", line = 141)
	float method26154() {
		return this.aFloatArray106[0] * this.aFloatArray106[5] * this.aFloatArray106[10] * this.aFloatArray106[15] - this.aFloatArray106[0] * this.aFloatArray106[5] * this.aFloatArray106[11] * this.aFloatArray106[14] - this.aFloatArray106[0] * this.aFloatArray106[6] * this.aFloatArray106[9] * this.aFloatArray106[15] + this.aFloatArray106[0] * this.aFloatArray106[6] * this.aFloatArray106[11] * this.aFloatArray106[13] + this.aFloatArray106[0] * this.aFloatArray106[7] * this.aFloatArray106[9] * this.aFloatArray106[14] - this.aFloatArray106[0] * this.aFloatArray106[7] * this.aFloatArray106[10] * this.aFloatArray106[13] - this.aFloatArray106[1] * this.aFloatArray106[4] * this.aFloatArray106[10] * this.aFloatArray106[15] + this.aFloatArray106[1] * this.aFloatArray106[4] * this.aFloatArray106[11] * this.aFloatArray106[14] + this.aFloatArray106[1] * this.aFloatArray106[6] * this.aFloatArray106[8] * this.aFloatArray106[15] - this.aFloatArray106[1] * this.aFloatArray106[6] * this.aFloatArray106[11] * this.aFloatArray106[12] - this.aFloatArray106[1] * this.aFloatArray106[7] * this.aFloatArray106[8] * this.aFloatArray106[14] + this.aFloatArray106[1] * this.aFloatArray106[7] * this.aFloatArray106[10] * this.aFloatArray106[12] + this.aFloatArray106[2] * this.aFloatArray106[4] * this.aFloatArray106[9] * this.aFloatArray106[15] - this.aFloatArray106[2] * this.aFloatArray106[4] * this.aFloatArray106[11] * this.aFloatArray106[13] - this.aFloatArray106[2] * this.aFloatArray106[5] * this.aFloatArray106[8] * this.aFloatArray106[15] + this.aFloatArray106[2] * this.aFloatArray106[5] * this.aFloatArray106[11] * this.aFloatArray106[12] + this.aFloatArray106[2] * this.aFloatArray106[7] * this.aFloatArray106[8] * this.aFloatArray106[13] - this.aFloatArray106[2] * this.aFloatArray106[7] * this.aFloatArray106[9] * this.aFloatArray106[12] - this.aFloatArray106[3] * this.aFloatArray106[4] * this.aFloatArray106[9] * this.aFloatArray106[14] + this.aFloatArray106[3] * this.aFloatArray106[4] * this.aFloatArray106[10] * this.aFloatArray106[13] + this.aFloatArray106[3] * this.aFloatArray106[5] * this.aFloatArray106[8] * this.aFloatArray106[14] - this.aFloatArray106[3] * this.aFloatArray106[5] * this.aFloatArray106[10] * this.aFloatArray106[12] - this.aFloatArray106[3] * this.aFloatArray106[6] * this.aFloatArray106[8] * this.aFloatArray106[13] + this.aFloatArray106[3] * this.aFloatArray106[6] * this.aFloatArray106[9] * this.aFloatArray106[12];
	}

	@OriginalMember(owner = "client!mq", name = "u", descriptor = "()V", line = 145)
	public void method26049() {
		@Pc(4) float local4 = 1.0F / this.method26048();
		@Pc(96) float local96 = (this.aFloatArray106[5] * this.aFloatArray106[10] * this.aFloatArray106[15] - this.aFloatArray106[5] * this.aFloatArray106[11] * this.aFloatArray106[14] - this.aFloatArray106[6] * this.aFloatArray106[9] * this.aFloatArray106[15] + this.aFloatArray106[6] * this.aFloatArray106[11] * this.aFloatArray106[13] + this.aFloatArray106[7] * this.aFloatArray106[9] * this.aFloatArray106[14] - this.aFloatArray106[7] * this.aFloatArray106[10] * this.aFloatArray106[13]) * local4;
		@Pc(189) float local189 = (-this.aFloatArray106[1] * this.aFloatArray106[10] * this.aFloatArray106[15] + this.aFloatArray106[1] * this.aFloatArray106[11] * this.aFloatArray106[14] + this.aFloatArray106[2] * this.aFloatArray106[9] * this.aFloatArray106[15] - this.aFloatArray106[2] * this.aFloatArray106[11] * this.aFloatArray106[13] - this.aFloatArray106[3] * this.aFloatArray106[9] * this.aFloatArray106[14] + this.aFloatArray106[3] * this.aFloatArray106[10] * this.aFloatArray106[13]) * local4;
		@Pc(281) float local281 = (this.aFloatArray106[1] * this.aFloatArray106[6] * this.aFloatArray106[15] - this.aFloatArray106[1] * this.aFloatArray106[7] * this.aFloatArray106[14] - this.aFloatArray106[2] * this.aFloatArray106[5] * this.aFloatArray106[15] + this.aFloatArray106[2] * this.aFloatArray106[7] * this.aFloatArray106[13] + this.aFloatArray106[3] * this.aFloatArray106[5] * this.aFloatArray106[14] - this.aFloatArray106[3] * this.aFloatArray106[6] * this.aFloatArray106[13]) * local4;
		@Pc(374) float local374 = (-this.aFloatArray106[1] * this.aFloatArray106[6] * this.aFloatArray106[11] + this.aFloatArray106[1] * this.aFloatArray106[7] * this.aFloatArray106[10] + this.aFloatArray106[2] * this.aFloatArray106[5] * this.aFloatArray106[11] - this.aFloatArray106[2] * this.aFloatArray106[7] * this.aFloatArray106[9] - this.aFloatArray106[3] * this.aFloatArray106[5] * this.aFloatArray106[10] + this.aFloatArray106[3] * this.aFloatArray106[6] * this.aFloatArray106[9]) * local4;
		@Pc(467) float local467 = (-this.aFloatArray106[4] * this.aFloatArray106[10] * this.aFloatArray106[15] + this.aFloatArray106[4] * this.aFloatArray106[11] * this.aFloatArray106[14] + this.aFloatArray106[6] * this.aFloatArray106[8] * this.aFloatArray106[15] - this.aFloatArray106[6] * this.aFloatArray106[11] * this.aFloatArray106[12] - this.aFloatArray106[7] * this.aFloatArray106[8] * this.aFloatArray106[14] + this.aFloatArray106[7] * this.aFloatArray106[10] * this.aFloatArray106[12]) * local4;
		@Pc(559) float local559 = (this.aFloatArray106[0] * this.aFloatArray106[10] * this.aFloatArray106[15] - this.aFloatArray106[0] * this.aFloatArray106[11] * this.aFloatArray106[14] - this.aFloatArray106[2] * this.aFloatArray106[8] * this.aFloatArray106[15] + this.aFloatArray106[2] * this.aFloatArray106[11] * this.aFloatArray106[12] + this.aFloatArray106[3] * this.aFloatArray106[8] * this.aFloatArray106[14] - this.aFloatArray106[3] * this.aFloatArray106[10] * this.aFloatArray106[12]) * local4;
		@Pc(652) float local652 = (-this.aFloatArray106[0] * this.aFloatArray106[6] * this.aFloatArray106[15] + this.aFloatArray106[0] * this.aFloatArray106[7] * this.aFloatArray106[14] + this.aFloatArray106[2] * this.aFloatArray106[4] * this.aFloatArray106[15] - this.aFloatArray106[2] * this.aFloatArray106[7] * this.aFloatArray106[12] - this.aFloatArray106[3] * this.aFloatArray106[4] * this.aFloatArray106[14] + this.aFloatArray106[3] * this.aFloatArray106[6] * this.aFloatArray106[12]) * local4;
		@Pc(744) float local744 = (this.aFloatArray106[0] * this.aFloatArray106[6] * this.aFloatArray106[11] - this.aFloatArray106[0] * this.aFloatArray106[7] * this.aFloatArray106[10] - this.aFloatArray106[2] * this.aFloatArray106[4] * this.aFloatArray106[11] + this.aFloatArray106[2] * this.aFloatArray106[7] * this.aFloatArray106[8] + this.aFloatArray106[3] * this.aFloatArray106[4] * this.aFloatArray106[10] - this.aFloatArray106[3] * this.aFloatArray106[6] * this.aFloatArray106[8]) * local4;
		@Pc(836) float local836 = (this.aFloatArray106[4] * this.aFloatArray106[9] * this.aFloatArray106[15] - this.aFloatArray106[4] * this.aFloatArray106[11] * this.aFloatArray106[13] - this.aFloatArray106[5] * this.aFloatArray106[8] * this.aFloatArray106[15] + this.aFloatArray106[5] * this.aFloatArray106[11] * this.aFloatArray106[12] + this.aFloatArray106[7] * this.aFloatArray106[8] * this.aFloatArray106[13] - this.aFloatArray106[7] * this.aFloatArray106[9] * this.aFloatArray106[12]) * local4;
		@Pc(929) float local929 = (-this.aFloatArray106[0] * this.aFloatArray106[9] * this.aFloatArray106[15] + this.aFloatArray106[0] * this.aFloatArray106[11] * this.aFloatArray106[13] + this.aFloatArray106[1] * this.aFloatArray106[8] * this.aFloatArray106[15] - this.aFloatArray106[1] * this.aFloatArray106[11] * this.aFloatArray106[12] - this.aFloatArray106[3] * this.aFloatArray106[8] * this.aFloatArray106[13] + this.aFloatArray106[3] * this.aFloatArray106[9] * this.aFloatArray106[12]) * local4;
		@Pc(1021) float local1021 = (this.aFloatArray106[0] * this.aFloatArray106[5] * this.aFloatArray106[15] - this.aFloatArray106[0] * this.aFloatArray106[7] * this.aFloatArray106[13] - this.aFloatArray106[1] * this.aFloatArray106[4] * this.aFloatArray106[15] + this.aFloatArray106[1] * this.aFloatArray106[7] * this.aFloatArray106[12] + this.aFloatArray106[3] * this.aFloatArray106[4] * this.aFloatArray106[13] - this.aFloatArray106[3] * this.aFloatArray106[5] * this.aFloatArray106[12]) * local4;
		@Pc(1114) float local1114 = (-this.aFloatArray106[0] * this.aFloatArray106[5] * this.aFloatArray106[11] + this.aFloatArray106[0] * this.aFloatArray106[7] * this.aFloatArray106[9] + this.aFloatArray106[1] * this.aFloatArray106[4] * this.aFloatArray106[11] - this.aFloatArray106[1] * this.aFloatArray106[7] * this.aFloatArray106[8] - this.aFloatArray106[3] * this.aFloatArray106[4] * this.aFloatArray106[9] + this.aFloatArray106[3] * this.aFloatArray106[5] * this.aFloatArray106[8]) * local4;
		@Pc(1207) float local1207 = (-this.aFloatArray106[4] * this.aFloatArray106[9] * this.aFloatArray106[14] + this.aFloatArray106[4] * this.aFloatArray106[10] * this.aFloatArray106[13] + this.aFloatArray106[5] * this.aFloatArray106[8] * this.aFloatArray106[14] - this.aFloatArray106[5] * this.aFloatArray106[10] * this.aFloatArray106[12] - this.aFloatArray106[6] * this.aFloatArray106[8] * this.aFloatArray106[13] + this.aFloatArray106[6] * this.aFloatArray106[9] * this.aFloatArray106[12]) * local4;
		@Pc(1299) float local1299 = (this.aFloatArray106[0] * this.aFloatArray106[9] * this.aFloatArray106[14] - this.aFloatArray106[0] * this.aFloatArray106[10] * this.aFloatArray106[13] - this.aFloatArray106[1] * this.aFloatArray106[8] * this.aFloatArray106[14] + this.aFloatArray106[1] * this.aFloatArray106[10] * this.aFloatArray106[12] + this.aFloatArray106[2] * this.aFloatArray106[8] * this.aFloatArray106[13] - this.aFloatArray106[2] * this.aFloatArray106[9] * this.aFloatArray106[12]) * local4;
		@Pc(1392) float local1392 = (-this.aFloatArray106[0] * this.aFloatArray106[5] * this.aFloatArray106[14] + this.aFloatArray106[0] * this.aFloatArray106[6] * this.aFloatArray106[13] + this.aFloatArray106[1] * this.aFloatArray106[4] * this.aFloatArray106[14] - this.aFloatArray106[1] * this.aFloatArray106[6] * this.aFloatArray106[12] - this.aFloatArray106[2] * this.aFloatArray106[4] * this.aFloatArray106[13] + this.aFloatArray106[2] * this.aFloatArray106[5] * this.aFloatArray106[12]) * local4;
		@Pc(1484) float local1484 = (this.aFloatArray106[0] * this.aFloatArray106[5] * this.aFloatArray106[10] - this.aFloatArray106[0] * this.aFloatArray106[6] * this.aFloatArray106[9] - this.aFloatArray106[1] * this.aFloatArray106[4] * this.aFloatArray106[10] + this.aFloatArray106[1] * this.aFloatArray106[6] * this.aFloatArray106[8] + this.aFloatArray106[2] * this.aFloatArray106[4] * this.aFloatArray106[9] - this.aFloatArray106[2] * this.aFloatArray106[5] * this.aFloatArray106[8]) * local4;
		this.aFloatArray106[0] = local96;
		this.aFloatArray106[1] = local189;
		this.aFloatArray106[2] = local281;
		this.aFloatArray106[3] = local374;
		this.aFloatArray106[4] = local467;
		this.aFloatArray106[5] = local559;
		this.aFloatArray106[6] = local652;
		this.aFloatArray106[7] = local744;
		this.aFloatArray106[8] = local836;
		this.aFloatArray106[9] = local929;
		this.aFloatArray106[10] = local1021;
		this.aFloatArray106[11] = local1114;
		this.aFloatArray106[12] = local1207;
		this.aFloatArray106[13] = local1299;
		this.aFloatArray106[14] = local1392;
		this.aFloatArray106[15] = local1484;
	}

	@OriginalMember(owner = "client!mq", name = "bw", descriptor = "()V", line = 145)
	public void method26098() {
		@Pc(4) float local4 = 1.0F / this.method26048();
		@Pc(96) float local96 = (this.aFloatArray106[5] * this.aFloatArray106[10] * this.aFloatArray106[15] - this.aFloatArray106[5] * this.aFloatArray106[11] * this.aFloatArray106[14] - this.aFloatArray106[6] * this.aFloatArray106[9] * this.aFloatArray106[15] + this.aFloatArray106[6] * this.aFloatArray106[11] * this.aFloatArray106[13] + this.aFloatArray106[7] * this.aFloatArray106[9] * this.aFloatArray106[14] - this.aFloatArray106[7] * this.aFloatArray106[10] * this.aFloatArray106[13]) * local4;
		@Pc(189) float local189 = (-this.aFloatArray106[1] * this.aFloatArray106[10] * this.aFloatArray106[15] + this.aFloatArray106[1] * this.aFloatArray106[11] * this.aFloatArray106[14] + this.aFloatArray106[2] * this.aFloatArray106[9] * this.aFloatArray106[15] - this.aFloatArray106[2] * this.aFloatArray106[11] * this.aFloatArray106[13] - this.aFloatArray106[3] * this.aFloatArray106[9] * this.aFloatArray106[14] + this.aFloatArray106[3] * this.aFloatArray106[10] * this.aFloatArray106[13]) * local4;
		@Pc(281) float local281 = (this.aFloatArray106[1] * this.aFloatArray106[6] * this.aFloatArray106[15] - this.aFloatArray106[1] * this.aFloatArray106[7] * this.aFloatArray106[14] - this.aFloatArray106[2] * this.aFloatArray106[5] * this.aFloatArray106[15] + this.aFloatArray106[2] * this.aFloatArray106[7] * this.aFloatArray106[13] + this.aFloatArray106[3] * this.aFloatArray106[5] * this.aFloatArray106[14] - this.aFloatArray106[3] * this.aFloatArray106[6] * this.aFloatArray106[13]) * local4;
		@Pc(374) float local374 = (-this.aFloatArray106[1] * this.aFloatArray106[6] * this.aFloatArray106[11] + this.aFloatArray106[1] * this.aFloatArray106[7] * this.aFloatArray106[10] + this.aFloatArray106[2] * this.aFloatArray106[5] * this.aFloatArray106[11] - this.aFloatArray106[2] * this.aFloatArray106[7] * this.aFloatArray106[9] - this.aFloatArray106[3] * this.aFloatArray106[5] * this.aFloatArray106[10] + this.aFloatArray106[3] * this.aFloatArray106[6] * this.aFloatArray106[9]) * local4;
		@Pc(467) float local467 = (-this.aFloatArray106[4] * this.aFloatArray106[10] * this.aFloatArray106[15] + this.aFloatArray106[4] * this.aFloatArray106[11] * this.aFloatArray106[14] + this.aFloatArray106[6] * this.aFloatArray106[8] * this.aFloatArray106[15] - this.aFloatArray106[6] * this.aFloatArray106[11] * this.aFloatArray106[12] - this.aFloatArray106[7] * this.aFloatArray106[8] * this.aFloatArray106[14] + this.aFloatArray106[7] * this.aFloatArray106[10] * this.aFloatArray106[12]) * local4;
		@Pc(559) float local559 = (this.aFloatArray106[0] * this.aFloatArray106[10] * this.aFloatArray106[15] - this.aFloatArray106[0] * this.aFloatArray106[11] * this.aFloatArray106[14] - this.aFloatArray106[2] * this.aFloatArray106[8] * this.aFloatArray106[15] + this.aFloatArray106[2] * this.aFloatArray106[11] * this.aFloatArray106[12] + this.aFloatArray106[3] * this.aFloatArray106[8] * this.aFloatArray106[14] - this.aFloatArray106[3] * this.aFloatArray106[10] * this.aFloatArray106[12]) * local4;
		@Pc(652) float local652 = (-this.aFloatArray106[0] * this.aFloatArray106[6] * this.aFloatArray106[15] + this.aFloatArray106[0] * this.aFloatArray106[7] * this.aFloatArray106[14] + this.aFloatArray106[2] * this.aFloatArray106[4] * this.aFloatArray106[15] - this.aFloatArray106[2] * this.aFloatArray106[7] * this.aFloatArray106[12] - this.aFloatArray106[3] * this.aFloatArray106[4] * this.aFloatArray106[14] + this.aFloatArray106[3] * this.aFloatArray106[6] * this.aFloatArray106[12]) * local4;
		@Pc(744) float local744 = (this.aFloatArray106[0] * this.aFloatArray106[6] * this.aFloatArray106[11] - this.aFloatArray106[0] * this.aFloatArray106[7] * this.aFloatArray106[10] - this.aFloatArray106[2] * this.aFloatArray106[4] * this.aFloatArray106[11] + this.aFloatArray106[2] * this.aFloatArray106[7] * this.aFloatArray106[8] + this.aFloatArray106[3] * this.aFloatArray106[4] * this.aFloatArray106[10] - this.aFloatArray106[3] * this.aFloatArray106[6] * this.aFloatArray106[8]) * local4;
		@Pc(836) float local836 = (this.aFloatArray106[4] * this.aFloatArray106[9] * this.aFloatArray106[15] - this.aFloatArray106[4] * this.aFloatArray106[11] * this.aFloatArray106[13] - this.aFloatArray106[5] * this.aFloatArray106[8] * this.aFloatArray106[15] + this.aFloatArray106[5] * this.aFloatArray106[11] * this.aFloatArray106[12] + this.aFloatArray106[7] * this.aFloatArray106[8] * this.aFloatArray106[13] - this.aFloatArray106[7] * this.aFloatArray106[9] * this.aFloatArray106[12]) * local4;
		@Pc(929) float local929 = (-this.aFloatArray106[0] * this.aFloatArray106[9] * this.aFloatArray106[15] + this.aFloatArray106[0] * this.aFloatArray106[11] * this.aFloatArray106[13] + this.aFloatArray106[1] * this.aFloatArray106[8] * this.aFloatArray106[15] - this.aFloatArray106[1] * this.aFloatArray106[11] * this.aFloatArray106[12] - this.aFloatArray106[3] * this.aFloatArray106[8] * this.aFloatArray106[13] + this.aFloatArray106[3] * this.aFloatArray106[9] * this.aFloatArray106[12]) * local4;
		@Pc(1021) float local1021 = (this.aFloatArray106[0] * this.aFloatArray106[5] * this.aFloatArray106[15] - this.aFloatArray106[0] * this.aFloatArray106[7] * this.aFloatArray106[13] - this.aFloatArray106[1] * this.aFloatArray106[4] * this.aFloatArray106[15] + this.aFloatArray106[1] * this.aFloatArray106[7] * this.aFloatArray106[12] + this.aFloatArray106[3] * this.aFloatArray106[4] * this.aFloatArray106[13] - this.aFloatArray106[3] * this.aFloatArray106[5] * this.aFloatArray106[12]) * local4;
		@Pc(1114) float local1114 = (-this.aFloatArray106[0] * this.aFloatArray106[5] * this.aFloatArray106[11] + this.aFloatArray106[0] * this.aFloatArray106[7] * this.aFloatArray106[9] + this.aFloatArray106[1] * this.aFloatArray106[4] * this.aFloatArray106[11] - this.aFloatArray106[1] * this.aFloatArray106[7] * this.aFloatArray106[8] - this.aFloatArray106[3] * this.aFloatArray106[4] * this.aFloatArray106[9] + this.aFloatArray106[3] * this.aFloatArray106[5] * this.aFloatArray106[8]) * local4;
		@Pc(1207) float local1207 = (-this.aFloatArray106[4] * this.aFloatArray106[9] * this.aFloatArray106[14] + this.aFloatArray106[4] * this.aFloatArray106[10] * this.aFloatArray106[13] + this.aFloatArray106[5] * this.aFloatArray106[8] * this.aFloatArray106[14] - this.aFloatArray106[5] * this.aFloatArray106[10] * this.aFloatArray106[12] - this.aFloatArray106[6] * this.aFloatArray106[8] * this.aFloatArray106[13] + this.aFloatArray106[6] * this.aFloatArray106[9] * this.aFloatArray106[12]) * local4;
		@Pc(1299) float local1299 = (this.aFloatArray106[0] * this.aFloatArray106[9] * this.aFloatArray106[14] - this.aFloatArray106[0] * this.aFloatArray106[10] * this.aFloatArray106[13] - this.aFloatArray106[1] * this.aFloatArray106[8] * this.aFloatArray106[14] + this.aFloatArray106[1] * this.aFloatArray106[10] * this.aFloatArray106[12] + this.aFloatArray106[2] * this.aFloatArray106[8] * this.aFloatArray106[13] - this.aFloatArray106[2] * this.aFloatArray106[9] * this.aFloatArray106[12]) * local4;
		@Pc(1392) float local1392 = (-this.aFloatArray106[0] * this.aFloatArray106[5] * this.aFloatArray106[14] + this.aFloatArray106[0] * this.aFloatArray106[6] * this.aFloatArray106[13] + this.aFloatArray106[1] * this.aFloatArray106[4] * this.aFloatArray106[14] - this.aFloatArray106[1] * this.aFloatArray106[6] * this.aFloatArray106[12] - this.aFloatArray106[2] * this.aFloatArray106[4] * this.aFloatArray106[13] + this.aFloatArray106[2] * this.aFloatArray106[5] * this.aFloatArray106[12]) * local4;
		@Pc(1484) float local1484 = (this.aFloatArray106[0] * this.aFloatArray106[5] * this.aFloatArray106[10] - this.aFloatArray106[0] * this.aFloatArray106[6] * this.aFloatArray106[9] - this.aFloatArray106[1] * this.aFloatArray106[4] * this.aFloatArray106[10] + this.aFloatArray106[1] * this.aFloatArray106[6] * this.aFloatArray106[8] + this.aFloatArray106[2] * this.aFloatArray106[4] * this.aFloatArray106[9] - this.aFloatArray106[2] * this.aFloatArray106[5] * this.aFloatArray106[8]) * local4;
		this.aFloatArray106[0] = local96;
		this.aFloatArray106[1] = local189;
		this.aFloatArray106[2] = local281;
		this.aFloatArray106[3] = local374;
		this.aFloatArray106[4] = local467;
		this.aFloatArray106[5] = local559;
		this.aFloatArray106[6] = local652;
		this.aFloatArray106[7] = local744;
		this.aFloatArray106[8] = local836;
		this.aFloatArray106[9] = local929;
		this.aFloatArray106[10] = local1021;
		this.aFloatArray106[11] = local1114;
		this.aFloatArray106[12] = local1207;
		this.aFloatArray106[13] = local1299;
		this.aFloatArray106[14] = local1392;
		this.aFloatArray106[15] = local1484;
	}

	@OriginalMember(owner = "client!mq", name = "bp", descriptor = "()V", line = 145)
	public void method26099() {
		@Pc(4) float local4 = 1.0F / this.method26048();
		@Pc(96) float local96 = (this.aFloatArray106[5] * this.aFloatArray106[10] * this.aFloatArray106[15] - this.aFloatArray106[5] * this.aFloatArray106[11] * this.aFloatArray106[14] - this.aFloatArray106[6] * this.aFloatArray106[9] * this.aFloatArray106[15] + this.aFloatArray106[6] * this.aFloatArray106[11] * this.aFloatArray106[13] + this.aFloatArray106[7] * this.aFloatArray106[9] * this.aFloatArray106[14] - this.aFloatArray106[7] * this.aFloatArray106[10] * this.aFloatArray106[13]) * local4;
		@Pc(189) float local189 = (-this.aFloatArray106[1] * this.aFloatArray106[10] * this.aFloatArray106[15] + this.aFloatArray106[1] * this.aFloatArray106[11] * this.aFloatArray106[14] + this.aFloatArray106[2] * this.aFloatArray106[9] * this.aFloatArray106[15] - this.aFloatArray106[2] * this.aFloatArray106[11] * this.aFloatArray106[13] - this.aFloatArray106[3] * this.aFloatArray106[9] * this.aFloatArray106[14] + this.aFloatArray106[3] * this.aFloatArray106[10] * this.aFloatArray106[13]) * local4;
		@Pc(281) float local281 = (this.aFloatArray106[1] * this.aFloatArray106[6] * this.aFloatArray106[15] - this.aFloatArray106[1] * this.aFloatArray106[7] * this.aFloatArray106[14] - this.aFloatArray106[2] * this.aFloatArray106[5] * this.aFloatArray106[15] + this.aFloatArray106[2] * this.aFloatArray106[7] * this.aFloatArray106[13] + this.aFloatArray106[3] * this.aFloatArray106[5] * this.aFloatArray106[14] - this.aFloatArray106[3] * this.aFloatArray106[6] * this.aFloatArray106[13]) * local4;
		@Pc(374) float local374 = (-this.aFloatArray106[1] * this.aFloatArray106[6] * this.aFloatArray106[11] + this.aFloatArray106[1] * this.aFloatArray106[7] * this.aFloatArray106[10] + this.aFloatArray106[2] * this.aFloatArray106[5] * this.aFloatArray106[11] - this.aFloatArray106[2] * this.aFloatArray106[7] * this.aFloatArray106[9] - this.aFloatArray106[3] * this.aFloatArray106[5] * this.aFloatArray106[10] + this.aFloatArray106[3] * this.aFloatArray106[6] * this.aFloatArray106[9]) * local4;
		@Pc(467) float local467 = (-this.aFloatArray106[4] * this.aFloatArray106[10] * this.aFloatArray106[15] + this.aFloatArray106[4] * this.aFloatArray106[11] * this.aFloatArray106[14] + this.aFloatArray106[6] * this.aFloatArray106[8] * this.aFloatArray106[15] - this.aFloatArray106[6] * this.aFloatArray106[11] * this.aFloatArray106[12] - this.aFloatArray106[7] * this.aFloatArray106[8] * this.aFloatArray106[14] + this.aFloatArray106[7] * this.aFloatArray106[10] * this.aFloatArray106[12]) * local4;
		@Pc(559) float local559 = (this.aFloatArray106[0] * this.aFloatArray106[10] * this.aFloatArray106[15] - this.aFloatArray106[0] * this.aFloatArray106[11] * this.aFloatArray106[14] - this.aFloatArray106[2] * this.aFloatArray106[8] * this.aFloatArray106[15] + this.aFloatArray106[2] * this.aFloatArray106[11] * this.aFloatArray106[12] + this.aFloatArray106[3] * this.aFloatArray106[8] * this.aFloatArray106[14] - this.aFloatArray106[3] * this.aFloatArray106[10] * this.aFloatArray106[12]) * local4;
		@Pc(652) float local652 = (-this.aFloatArray106[0] * this.aFloatArray106[6] * this.aFloatArray106[15] + this.aFloatArray106[0] * this.aFloatArray106[7] * this.aFloatArray106[14] + this.aFloatArray106[2] * this.aFloatArray106[4] * this.aFloatArray106[15] - this.aFloatArray106[2] * this.aFloatArray106[7] * this.aFloatArray106[12] - this.aFloatArray106[3] * this.aFloatArray106[4] * this.aFloatArray106[14] + this.aFloatArray106[3] * this.aFloatArray106[6] * this.aFloatArray106[12]) * local4;
		@Pc(744) float local744 = (this.aFloatArray106[0] * this.aFloatArray106[6] * this.aFloatArray106[11] - this.aFloatArray106[0] * this.aFloatArray106[7] * this.aFloatArray106[10] - this.aFloatArray106[2] * this.aFloatArray106[4] * this.aFloatArray106[11] + this.aFloatArray106[2] * this.aFloatArray106[7] * this.aFloatArray106[8] + this.aFloatArray106[3] * this.aFloatArray106[4] * this.aFloatArray106[10] - this.aFloatArray106[3] * this.aFloatArray106[6] * this.aFloatArray106[8]) * local4;
		@Pc(836) float local836 = (this.aFloatArray106[4] * this.aFloatArray106[9] * this.aFloatArray106[15] - this.aFloatArray106[4] * this.aFloatArray106[11] * this.aFloatArray106[13] - this.aFloatArray106[5] * this.aFloatArray106[8] * this.aFloatArray106[15] + this.aFloatArray106[5] * this.aFloatArray106[11] * this.aFloatArray106[12] + this.aFloatArray106[7] * this.aFloatArray106[8] * this.aFloatArray106[13] - this.aFloatArray106[7] * this.aFloatArray106[9] * this.aFloatArray106[12]) * local4;
		@Pc(929) float local929 = (-this.aFloatArray106[0] * this.aFloatArray106[9] * this.aFloatArray106[15] + this.aFloatArray106[0] * this.aFloatArray106[11] * this.aFloatArray106[13] + this.aFloatArray106[1] * this.aFloatArray106[8] * this.aFloatArray106[15] - this.aFloatArray106[1] * this.aFloatArray106[11] * this.aFloatArray106[12] - this.aFloatArray106[3] * this.aFloatArray106[8] * this.aFloatArray106[13] + this.aFloatArray106[3] * this.aFloatArray106[9] * this.aFloatArray106[12]) * local4;
		@Pc(1021) float local1021 = (this.aFloatArray106[0] * this.aFloatArray106[5] * this.aFloatArray106[15] - this.aFloatArray106[0] * this.aFloatArray106[7] * this.aFloatArray106[13] - this.aFloatArray106[1] * this.aFloatArray106[4] * this.aFloatArray106[15] + this.aFloatArray106[1] * this.aFloatArray106[7] * this.aFloatArray106[12] + this.aFloatArray106[3] * this.aFloatArray106[4] * this.aFloatArray106[13] - this.aFloatArray106[3] * this.aFloatArray106[5] * this.aFloatArray106[12]) * local4;
		@Pc(1114) float local1114 = (-this.aFloatArray106[0] * this.aFloatArray106[5] * this.aFloatArray106[11] + this.aFloatArray106[0] * this.aFloatArray106[7] * this.aFloatArray106[9] + this.aFloatArray106[1] * this.aFloatArray106[4] * this.aFloatArray106[11] - this.aFloatArray106[1] * this.aFloatArray106[7] * this.aFloatArray106[8] - this.aFloatArray106[3] * this.aFloatArray106[4] * this.aFloatArray106[9] + this.aFloatArray106[3] * this.aFloatArray106[5] * this.aFloatArray106[8]) * local4;
		@Pc(1207) float local1207 = (-this.aFloatArray106[4] * this.aFloatArray106[9] * this.aFloatArray106[14] + this.aFloatArray106[4] * this.aFloatArray106[10] * this.aFloatArray106[13] + this.aFloatArray106[5] * this.aFloatArray106[8] * this.aFloatArray106[14] - this.aFloatArray106[5] * this.aFloatArray106[10] * this.aFloatArray106[12] - this.aFloatArray106[6] * this.aFloatArray106[8] * this.aFloatArray106[13] + this.aFloatArray106[6] * this.aFloatArray106[9] * this.aFloatArray106[12]) * local4;
		@Pc(1299) float local1299 = (this.aFloatArray106[0] * this.aFloatArray106[9] * this.aFloatArray106[14] - this.aFloatArray106[0] * this.aFloatArray106[10] * this.aFloatArray106[13] - this.aFloatArray106[1] * this.aFloatArray106[8] * this.aFloatArray106[14] + this.aFloatArray106[1] * this.aFloatArray106[10] * this.aFloatArray106[12] + this.aFloatArray106[2] * this.aFloatArray106[8] * this.aFloatArray106[13] - this.aFloatArray106[2] * this.aFloatArray106[9] * this.aFloatArray106[12]) * local4;
		@Pc(1392) float local1392 = (-this.aFloatArray106[0] * this.aFloatArray106[5] * this.aFloatArray106[14] + this.aFloatArray106[0] * this.aFloatArray106[6] * this.aFloatArray106[13] + this.aFloatArray106[1] * this.aFloatArray106[4] * this.aFloatArray106[14] - this.aFloatArray106[1] * this.aFloatArray106[6] * this.aFloatArray106[12] - this.aFloatArray106[2] * this.aFloatArray106[4] * this.aFloatArray106[13] + this.aFloatArray106[2] * this.aFloatArray106[5] * this.aFloatArray106[12]) * local4;
		@Pc(1484) float local1484 = (this.aFloatArray106[0] * this.aFloatArray106[5] * this.aFloatArray106[10] - this.aFloatArray106[0] * this.aFloatArray106[6] * this.aFloatArray106[9] - this.aFloatArray106[1] * this.aFloatArray106[4] * this.aFloatArray106[10] + this.aFloatArray106[1] * this.aFloatArray106[6] * this.aFloatArray106[8] + this.aFloatArray106[2] * this.aFloatArray106[4] * this.aFloatArray106[9] - this.aFloatArray106[2] * this.aFloatArray106[5] * this.aFloatArray106[8]) * local4;
		this.aFloatArray106[0] = local96;
		this.aFloatArray106[1] = local189;
		this.aFloatArray106[2] = local281;
		this.aFloatArray106[3] = local374;
		this.aFloatArray106[4] = local467;
		this.aFloatArray106[5] = local559;
		this.aFloatArray106[6] = local652;
		this.aFloatArray106[7] = local744;
		this.aFloatArray106[8] = local836;
		this.aFloatArray106[9] = local929;
		this.aFloatArray106[10] = local1021;
		this.aFloatArray106[11] = local1114;
		this.aFloatArray106[12] = local1207;
		this.aFloatArray106[13] = local1299;
		this.aFloatArray106[14] = local1392;
		this.aFloatArray106[15] = local1484;
	}

	@OriginalMember(owner = "client!mq", name = "y", descriptor = "(FFFF)V", line = 181)
	public void method26050(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3) {
		this.aFloatArray106[0] = arg0;
		this.aFloatArray106[1] = 0.0F;
		this.aFloatArray106[2] = 0.0F;
		this.aFloatArray106[3] = 0.0F;
		this.aFloatArray106[4] = 0.0F;
		this.aFloatArray106[5] = arg1;
		this.aFloatArray106[6] = 0.0F;
		this.aFloatArray106[7] = 0.0F;
		this.aFloatArray106[8] = 0.0F;
		this.aFloatArray106[9] = 0.0F;
		this.aFloatArray106[10] = arg2;
		this.aFloatArray106[11] = 0.0F;
		this.aFloatArray106[12] = 0.0F;
		this.aFloatArray106[13] = 0.0F;
		this.aFloatArray106[14] = 0.0F;
		this.aFloatArray106[15] = arg3;
	}

	@OriginalMember(owner = "client!mq", name = "bd", descriptor = "(FFFF)V", line = 181)
	public void method26100(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3) {
		this.aFloatArray106[0] = arg0;
		this.aFloatArray106[1] = 0.0F;
		this.aFloatArray106[2] = 0.0F;
		this.aFloatArray106[3] = 0.0F;
		this.aFloatArray106[4] = 0.0F;
		this.aFloatArray106[5] = arg1;
		this.aFloatArray106[6] = 0.0F;
		this.aFloatArray106[7] = 0.0F;
		this.aFloatArray106[8] = 0.0F;
		this.aFloatArray106[9] = 0.0F;
		this.aFloatArray106[10] = arg2;
		this.aFloatArray106[11] = 0.0F;
		this.aFloatArray106[12] = 0.0F;
		this.aFloatArray106[13] = 0.0F;
		this.aFloatArray106[14] = 0.0F;
		this.aFloatArray106[15] = arg3;
	}

	@OriginalMember(owner = "client!mq", name = "bs", descriptor = "(FFFF)V", line = 181)
	public void method26101(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3) {
		this.aFloatArray106[0] = arg0;
		this.aFloatArray106[1] = 0.0F;
		this.aFloatArray106[2] = 0.0F;
		this.aFloatArray106[3] = 0.0F;
		this.aFloatArray106[4] = 0.0F;
		this.aFloatArray106[5] = arg1;
		this.aFloatArray106[6] = 0.0F;
		this.aFloatArray106[7] = 0.0F;
		this.aFloatArray106[8] = 0.0F;
		this.aFloatArray106[9] = 0.0F;
		this.aFloatArray106[10] = arg2;
		this.aFloatArray106[11] = 0.0F;
		this.aFloatArray106[12] = 0.0F;
		this.aFloatArray106[13] = 0.0F;
		this.aFloatArray106[14] = 0.0F;
		this.aFloatArray106[15] = arg3;
	}

	@OriginalMember(owner = "client!mq", name = "bk", descriptor = "()Z", line = 200)
	public boolean method26077() {
		return this.aFloatArray106[0] == 1.0F && this.aFloatArray106[1] == 0.0F && this.aFloatArray106[2] == 0.0F && this.aFloatArray106[3] == 0.0F && this.aFloatArray106[4] == 0.0F && this.aFloatArray106[5] == 1.0F && this.aFloatArray106[6] == 0.0F && this.aFloatArray106[7] == 0.0F && this.aFloatArray106[8] == 0.0F && this.aFloatArray106[9] == 0.0F && this.aFloatArray106[10] == 1.0F && this.aFloatArray106[11] == 0.0F && this.aFloatArray106[12] == 0.0F && this.aFloatArray106[13] == 0.0F && this.aFloatArray106[14] == 0.0F && this.aFloatArray106[15] == 1.0F;
	}

	@OriginalMember(owner = "client!mq", name = "bm", descriptor = "()Z", line = 200)
	public boolean method26102() {
		return this.aFloatArray106[0] == 1.0F && this.aFloatArray106[1] == 0.0F && this.aFloatArray106[2] == 0.0F && this.aFloatArray106[3] == 0.0F && this.aFloatArray106[4] == 0.0F && this.aFloatArray106[5] == 1.0F && this.aFloatArray106[6] == 0.0F && this.aFloatArray106[7] == 0.0F && this.aFloatArray106[8] == 0.0F && this.aFloatArray106[9] == 0.0F && this.aFloatArray106[10] == 1.0F && this.aFloatArray106[11] == 0.0F && this.aFloatArray106[12] == 0.0F && this.aFloatArray106[13] == 0.0F && this.aFloatArray106[14] == 0.0F && this.aFloatArray106[15] == 1.0F;
	}

	@OriginalMember(owner = "client!mq", name = "bf", descriptor = "()Z", line = 200)
	public boolean method26103() {
		return this.aFloatArray106[0] == 1.0F && this.aFloatArray106[1] == 0.0F && this.aFloatArray106[2] == 0.0F && this.aFloatArray106[3] == 0.0F && this.aFloatArray106[4] == 0.0F && this.aFloatArray106[5] == 1.0F && this.aFloatArray106[6] == 0.0F && this.aFloatArray106[7] == 0.0F && this.aFloatArray106[8] == 0.0F && this.aFloatArray106[9] == 0.0F && this.aFloatArray106[10] == 1.0F && this.aFloatArray106[11] == 0.0F && this.aFloatArray106[12] == 0.0F && this.aFloatArray106[13] == 0.0F && this.aFloatArray106[14] == 0.0F && this.aFloatArray106[15] == 1.0F;
	}

	@OriginalMember(owner = "client!mq", name = "bt", descriptor = "()Z", line = 200)
	public boolean method26116() {
		return this.aFloatArray106[0] == 1.0F && this.aFloatArray106[1] == 0.0F && this.aFloatArray106[2] == 0.0F && this.aFloatArray106[3] == 0.0F && this.aFloatArray106[4] == 0.0F && this.aFloatArray106[5] == 1.0F && this.aFloatArray106[6] == 0.0F && this.aFloatArray106[7] == 0.0F && this.aFloatArray106[8] == 0.0F && this.aFloatArray106[9] == 0.0F && this.aFloatArray106[10] == 1.0F && this.aFloatArray106[11] == 0.0F && this.aFloatArray106[12] == 0.0F && this.aFloatArray106[13] == 0.0F && this.aFloatArray106[14] == 0.0F && this.aFloatArray106[15] == 1.0F;
	}

	@OriginalMember(owner = "client!mq", name = "b", descriptor = "()Z", line = 200)
	public boolean method26125() {
		return this.aFloatArray106[0] == 1.0F && this.aFloatArray106[1] == 0.0F && this.aFloatArray106[2] == 0.0F && this.aFloatArray106[3] == 0.0F && this.aFloatArray106[4] == 0.0F && this.aFloatArray106[5] == 1.0F && this.aFloatArray106[6] == 0.0F && this.aFloatArray106[7] == 0.0F && this.aFloatArray106[8] == 0.0F && this.aFloatArray106[9] == 0.0F && this.aFloatArray106[10] == 1.0F && this.aFloatArray106[11] == 0.0F && this.aFloatArray106[12] == 0.0F && this.aFloatArray106[13] == 0.0F && this.aFloatArray106[14] == 0.0F && this.aFloatArray106[15] == 1.0F;
	}

	@OriginalMember(owner = "client!mq", name = "c", descriptor = "(FFF[F)V", line = 204)
	public void method26052(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float[] arg3) {
		arg3[0] = this.aFloatArray106[0] * arg0 + this.aFloatArray106[4] * arg1 + this.aFloatArray106[8] * arg2 + this.aFloatArray106[12];
		arg3[1] = this.aFloatArray106[1] * arg0 + this.aFloatArray106[5] * arg1 + this.aFloatArray106[9] * arg2 + this.aFloatArray106[13];
		arg3[2] = this.aFloatArray106[2] * arg0 + this.aFloatArray106[6] * arg1 + this.aFloatArray106[10] * arg2 + this.aFloatArray106[14];
		if (arg3.length > 3) {
			arg3[3] = this.aFloatArray106[3] * arg0 + this.aFloatArray106[7] * arg1 + this.aFloatArray106[11] * arg2 + this.aFloatArray106[15];
		}
	}

	@OriginalMember(owner = "client!mq", name = "bg", descriptor = "(FFF[F)V", line = 204)
	public void method26106(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float[] arg3) {
		arg3[0] = this.aFloatArray106[0] * arg0 + this.aFloatArray106[4] * arg1 + this.aFloatArray106[8] * arg2 + this.aFloatArray106[12];
		arg3[1] = this.aFloatArray106[1] * arg0 + this.aFloatArray106[5] * arg1 + this.aFloatArray106[9] * arg2 + this.aFloatArray106[13];
		arg3[2] = this.aFloatArray106[2] * arg0 + this.aFloatArray106[6] * arg1 + this.aFloatArray106[10] * arg2 + this.aFloatArray106[14];
		if (arg3.length > 3) {
			arg3[3] = this.aFloatArray106[3] * arg0 + this.aFloatArray106[7] * arg1 + this.aFloatArray106[11] * arg2 + this.aFloatArray106[15];
		}
	}

	@OriginalMember(owner = "client!mq", name = "z", descriptor = "([F)V", line = 211)
	public void method26053(@OriginalArg(0) float[] arg0) {
		@Pc(3) float local3 = arg0[0];
		@Pc(7) float local7 = arg0[1];
		@Pc(11) float local11 = arg0[2];
		arg0[0] = this.aFloatArray106[0] * local3 + this.aFloatArray106[4] * local7 + this.aFloatArray106[8] * local11 + this.aFloatArray106[12];
		arg0[1] = this.aFloatArray106[1] * local3 + this.aFloatArray106[5] * local7 + this.aFloatArray106[9] * local11 + this.aFloatArray106[13];
		arg0[2] = this.aFloatArray106[2] * local3 + this.aFloatArray106[6] * local7 + this.aFloatArray106[10] * local11 + this.aFloatArray106[14];
	}

	@OriginalMember(owner = "client!mq", name = "br", descriptor = "([F)V", line = 211)
	public void method26105(@OriginalArg(0) float[] arg0) {
		@Pc(3) float local3 = arg0[0];
		@Pc(7) float local7 = arg0[1];
		@Pc(11) float local11 = arg0[2];
		arg0[0] = this.aFloatArray106[0] * local3 + this.aFloatArray106[4] * local7 + this.aFloatArray106[8] * local11 + this.aFloatArray106[12];
		arg0[1] = this.aFloatArray106[1] * local3 + this.aFloatArray106[5] * local7 + this.aFloatArray106[9] * local11 + this.aFloatArray106[13];
		arg0[2] = this.aFloatArray106[2] * local3 + this.aFloatArray106[6] * local7 + this.aFloatArray106[10] * local11 + this.aFloatArray106[14];
	}

	@OriginalMember(owner = "client!mq", name = "j", descriptor = "(FFF[F)V", line = 220)
	public void method26054(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float[] arg3) {
		arg3[0] = this.aFloatArray106[0] * arg0 + this.aFloatArray106[4] * arg1 + this.aFloatArray106[8] * arg2;
		arg3[1] = this.aFloatArray106[1] * arg0 + this.aFloatArray106[5] * arg1 + this.aFloatArray106[9] * arg2;
		arg3[2] = this.aFloatArray106[2] * arg0 + this.aFloatArray106[6] * arg1 + this.aFloatArray106[10] * arg2;
		if (arg3.length > 3) {
			arg3[3] = this.aFloatArray106[3] * arg0 + this.aFloatArray106[7] * arg1 + this.aFloatArray106[11] * arg2;
		}
	}

	@OriginalMember(owner = "client!mq", name = "bb", descriptor = "(FFF[F)V", line = 220)
	public void method26108(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float[] arg3) {
		arg3[0] = this.aFloatArray106[0] * arg0 + this.aFloatArray106[4] * arg1 + this.aFloatArray106[8] * arg2;
		arg3[1] = this.aFloatArray106[1] * arg0 + this.aFloatArray106[5] * arg1 + this.aFloatArray106[9] * arg2;
		arg3[2] = this.aFloatArray106[2] * arg0 + this.aFloatArray106[6] * arg1 + this.aFloatArray106[10] * arg2;
		if (arg3.length > 3) {
			arg3[3] = this.aFloatArray106[3] * arg0 + this.aFloatArray106[7] * arg1 + this.aFloatArray106[11] * arg2;
		}
	}

	@OriginalMember(owner = "client!mq", name = "bl", descriptor = "(FFF[F)V", line = 220)
	public void method26110(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float[] arg3) {
		arg3[0] = this.aFloatArray106[0] * arg0 + this.aFloatArray106[4] * arg1 + this.aFloatArray106[8] * arg2;
		arg3[1] = this.aFloatArray106[1] * arg0 + this.aFloatArray106[5] * arg1 + this.aFloatArray106[9] * arg2;
		arg3[2] = this.aFloatArray106[2] * arg0 + this.aFloatArray106[6] * arg1 + this.aFloatArray106[10] * arg2;
		if (arg3.length > 3) {
			arg3[3] = this.aFloatArray106[3] * arg0 + this.aFloatArray106[7] * arg1 + this.aFloatArray106[11] * arg2;
		}
	}

	@OriginalMember(owner = "client!mq", name = "bi", descriptor = "(FFF[F)V", line = 220)
	public void method26111(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float[] arg3) {
		arg3[0] = this.aFloatArray106[0] * arg0 + this.aFloatArray106[4] * arg1 + this.aFloatArray106[8] * arg2;
		arg3[1] = this.aFloatArray106[1] * arg0 + this.aFloatArray106[5] * arg1 + this.aFloatArray106[9] * arg2;
		arg3[2] = this.aFloatArray106[2] * arg0 + this.aFloatArray106[6] * arg1 + this.aFloatArray106[10] * arg2;
		if (arg3.length > 3) {
			arg3[3] = this.aFloatArray106[3] * arg0 + this.aFloatArray106[7] * arg1 + this.aFloatArray106[11] * arg2;
		}
	}

	@OriginalMember(owner = "client!mq", name = "by", descriptor = "(FFF[F)V", line = 220)
	public void method26138(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float[] arg3) {
		arg3[0] = this.aFloatArray106[0] * arg0 + this.aFloatArray106[4] * arg1 + this.aFloatArray106[8] * arg2;
		arg3[1] = this.aFloatArray106[1] * arg0 + this.aFloatArray106[5] * arg1 + this.aFloatArray106[9] * arg2;
		arg3[2] = this.aFloatArray106[2] * arg0 + this.aFloatArray106[6] * arg1 + this.aFloatArray106[10] * arg2;
		if (arg3.length > 3) {
			arg3[3] = this.aFloatArray106[3] * arg0 + this.aFloatArray106[7] * arg1 + this.aFloatArray106[11] * arg2;
		}
	}

	@OriginalMember(owner = "client!mq", name = "n", descriptor = "(FFFFFF)V", line = 227)
	public void method26055(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		this.aFloatArray106[0] = 2.0F / (arg1 - arg0);
		this.aFloatArray106[1] = 0.0F;
		this.aFloatArray106[2] = 0.0F;
		this.aFloatArray106[3] = 0.0F;
		this.aFloatArray106[4] = 0.0F;
		this.aFloatArray106[5] = 2.0F / (arg3 - arg2);
		this.aFloatArray106[6] = 0.0F;
		this.aFloatArray106[7] = 0.0F;
		this.aFloatArray106[8] = 0.0F;
		this.aFloatArray106[9] = 0.0F;
		this.aFloatArray106[10] = 2.0F / (arg5 - arg4);
		this.aFloatArray106[11] = 0.0F;
		this.aFloatArray106[12] = -(arg1 + arg0) / (arg1 - arg0);
		this.aFloatArray106[13] = -(arg3 + arg2) / (arg3 - arg2);
		this.aFloatArray106[14] = -(arg5 + arg4) / (arg5 - arg4);
		this.aFloatArray106[15] = 1.0F;
	}

	@OriginalMember(owner = "client!mq", name = "bu", descriptor = "(FFFFFF)V", line = 227)
	public void method26112(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		this.aFloatArray106[0] = 2.0F / (arg1 - arg0);
		this.aFloatArray106[1] = 0.0F;
		this.aFloatArray106[2] = 0.0F;
		this.aFloatArray106[3] = 0.0F;
		this.aFloatArray106[4] = 0.0F;
		this.aFloatArray106[5] = 2.0F / (arg3 - arg2);
		this.aFloatArray106[6] = 0.0F;
		this.aFloatArray106[7] = 0.0F;
		this.aFloatArray106[8] = 0.0F;
		this.aFloatArray106[9] = 0.0F;
		this.aFloatArray106[10] = 2.0F / (arg5 - arg4);
		this.aFloatArray106[11] = 0.0F;
		this.aFloatArray106[12] = -(arg1 + arg0) / (arg1 - arg0);
		this.aFloatArray106[13] = -(arg3 + arg2) / (arg3 - arg2);
		this.aFloatArray106[14] = -(arg5 + arg4) / (arg5 - arg4);
		this.aFloatArray106[15] = 1.0F;
	}

	@OriginalMember(owner = "client!mq", name = "ba", descriptor = "(FFFFFF)V", line = 227)
	public void method26113(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		this.aFloatArray106[0] = 2.0F / (arg1 - arg0);
		this.aFloatArray106[1] = 0.0F;
		this.aFloatArray106[2] = 0.0F;
		this.aFloatArray106[3] = 0.0F;
		this.aFloatArray106[4] = 0.0F;
		this.aFloatArray106[5] = 2.0F / (arg3 - arg2);
		this.aFloatArray106[6] = 0.0F;
		this.aFloatArray106[7] = 0.0F;
		this.aFloatArray106[8] = 0.0F;
		this.aFloatArray106[9] = 0.0F;
		this.aFloatArray106[10] = 2.0F / (arg5 - arg4);
		this.aFloatArray106[11] = 0.0F;
		this.aFloatArray106[12] = -(arg1 + arg0) / (arg1 - arg0);
		this.aFloatArray106[13] = -(arg3 + arg2) / (arg3 - arg2);
		this.aFloatArray106[14] = -(arg5 + arg4) / (arg5 - arg4);
		this.aFloatArray106[15] = 1.0F;
	}

	@OriginalMember(owner = "client!mq", name = "bc", descriptor = "(FFFF)V", line = 246)
	public void method26067(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3) {
		@Pc(9) float local9 = (float) (Math.tan((double) (arg2 / 2.0F)) * (double) arg0);
		@Pc(19) float local19 = (float) (Math.tan((double) (arg3 / 2.0F)) * (double) arg0);
		this.method26134(-local9, local9, -local19, local19, arg0, arg1);
	}

	@OriginalMember(owner = "client!mq", name = "bn", descriptor = "(FFFF)V", line = 246)
	public void method26074(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3) {
		@Pc(9) float local9 = (float) (Math.tan((double) (arg2 / 2.0F)) * (double) arg0);
		@Pc(19) float local19 = (float) (Math.tan((double) (arg3 / 2.0F)) * (double) arg0);
		this.method26134(-local9, local9, -local19, local19, arg0, arg1);
	}

	@OriginalMember(owner = "client!mq", name = "bo", descriptor = "(FFFF)V", line = 246)
	public void method26114(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3) {
		@Pc(9) float local9 = (float) (Math.tan((double) (arg2 / 2.0F)) * (double) arg0);
		@Pc(19) float local19 = (float) (Math.tan((double) (arg3 / 2.0F)) * (double) arg0);
		this.method26134(-local9, local9, -local19, local19, arg0, arg1);
	}

	@OriginalMember(owner = "client!mq", name = "e", descriptor = "(FFFF)V", line = 246)
	public void method26115(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3) {
		@Pc(9) float local9 = (float) (Math.tan((double) (arg2 / 2.0F)) * (double) arg0);
		@Pc(19) float local19 = (float) (Math.tan((double) (arg3 / 2.0F)) * (double) arg0);
		this.method26134(-local9, local9, -local19, local19, arg0, arg1);
	}

	@OriginalMember(owner = "client!mq", name = "r", descriptor = "(FFF)V", line = 252)
	public void method26057(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		this.method26055(-10000.0F / arg2, 10000.0F / arg2, -10000.0F / arg2, 10000.0F / arg2, arg0, arg1);
	}

	@OriginalMember(owner = "client!mq", name = "be", descriptor = "(FFF)V", line = 252)
	public void method26117(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		this.method26055(-10000.0F / arg2, 10000.0F / arg2, -10000.0F / arg2, 10000.0F / arg2, arg0, arg1);
	}

	@OriginalMember(owner = "client!mq", name = "bx", descriptor = "(FFF)V", line = 252)
	public void method26118(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		this.method26055(-10000.0F / arg2, 10000.0F / arg2, -10000.0F / arg2, 10000.0F / arg2, arg0, arg1);
	}

	@OriginalMember(owner = "client!mq", name = "bh", descriptor = "(FFFFFF)V", line = 256)
	void method26095(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		this.aFloatArray106[0] = arg4 * 2.0F / (arg1 - arg0);
		this.aFloatArray106[1] = 0.0F;
		this.aFloatArray106[2] = 0.0F;
		this.aFloatArray106[3] = 0.0F;
		this.aFloatArray106[4] = 0.0F;
		this.aFloatArray106[5] = arg4 * 2.0F / (arg3 - arg2);
		this.aFloatArray106[6] = 0.0F;
		this.aFloatArray106[7] = 0.0F;
		this.aFloatArray106[8] = (arg1 + arg0) / (arg1 - arg0);
		this.aFloatArray106[9] = (arg3 + arg2) / (arg3 - arg2);
		this.aFloatArray106[10] = (arg5 + arg4) / (arg5 - arg4);
		this.aFloatArray106[11] = 1.0F;
		this.aFloatArray106[12] = 0.0F;
		this.aFloatArray106[13] = 0.0F;
		this.aFloatArray106[14] = -(arg5 * 2.0F * arg4) / (arg5 - arg4);
		this.aFloatArray106[15] = 0.0F;
	}

	@OriginalMember(owner = "client!mq", name = "d", descriptor = "(FFFFFF)V", line = 256)
	void method26134(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		this.aFloatArray106[0] = arg4 * 2.0F / (arg1 - arg0);
		this.aFloatArray106[1] = 0.0F;
		this.aFloatArray106[2] = 0.0F;
		this.aFloatArray106[3] = 0.0F;
		this.aFloatArray106[4] = 0.0F;
		this.aFloatArray106[5] = arg4 * 2.0F / (arg3 - arg2);
		this.aFloatArray106[6] = 0.0F;
		this.aFloatArray106[7] = 0.0F;
		this.aFloatArray106[8] = (arg1 + arg0) / (arg1 - arg0);
		this.aFloatArray106[9] = (arg3 + arg2) / (arg3 - arg2);
		this.aFloatArray106[10] = (arg5 + arg4) / (arg5 - arg4);
		this.aFloatArray106[11] = 1.0F;
		this.aFloatArray106[12] = 0.0F;
		this.aFloatArray106[13] = 0.0F;
		this.aFloatArray106[14] = -(arg5 * 2.0F * arg4) / (arg5 - arg4);
		this.aFloatArray106[15] = 0.0F;
	}

	@OriginalMember(owner = "client!mq", name = "q", descriptor = "(FFFFFFFF)V", line = 275)
	public void method26059(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) float arg6, @OriginalArg(7) float arg7) {
		this.aFloatArray106[0] = arg2 * 2.0F / arg6;
		this.aFloatArray106[1] = 0.0F;
		this.aFloatArray106[2] = 0.0F;
		this.aFloatArray106[3] = 0.0F;
		this.aFloatArray106[4] = 0.0F;
		this.aFloatArray106[5] = arg3 * 2.0F / arg7;
		this.aFloatArray106[6] = 0.0F;
		this.aFloatArray106[7] = 0.0F;
		this.aFloatArray106[8] = arg0 * 2.0F / arg6 - 1.0F;
		this.aFloatArray106[9] = arg1 * 2.0F / arg7 - 1.0F;
		this.aFloatArray106[10] = (arg5 + arg4) / (arg5 - arg4);
		this.aFloatArray106[11] = 1.0F;
		this.aFloatArray106[12] = 0.0F;
		this.aFloatArray106[13] = 0.0F;
		this.aFloatArray106[14] = arg5 * 2.0F * arg4 / (arg4 - arg5);
		this.aFloatArray106[15] = 0.0F;
	}

	@OriginalMember(owner = "client!mq", name = "bq", descriptor = "(FFFFFFFF)V", line = 275)
	public void method26121(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) float arg6, @OriginalArg(7) float arg7) {
		this.aFloatArray106[0] = arg2 * 2.0F / arg6;
		this.aFloatArray106[1] = 0.0F;
		this.aFloatArray106[2] = 0.0F;
		this.aFloatArray106[3] = 0.0F;
		this.aFloatArray106[4] = 0.0F;
		this.aFloatArray106[5] = arg3 * 2.0F / arg7;
		this.aFloatArray106[6] = 0.0F;
		this.aFloatArray106[7] = 0.0F;
		this.aFloatArray106[8] = arg0 * 2.0F / arg6 - 1.0F;
		this.aFloatArray106[9] = arg1 * 2.0F / arg7 - 1.0F;
		this.aFloatArray106[10] = (arg5 + arg4) / (arg5 - arg4);
		this.aFloatArray106[11] = 1.0F;
		this.aFloatArray106[12] = 0.0F;
		this.aFloatArray106[13] = 0.0F;
		this.aFloatArray106[14] = arg5 * 2.0F * arg4 / (arg4 - arg5);
		this.aFloatArray106[15] = 0.0F;
	}

	@OriginalMember(owner = "client!mq", name = "bv", descriptor = "(FFFFFFFF)V", line = 275)
	public void method26137(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) float arg6, @OriginalArg(7) float arg7) {
		this.aFloatArray106[0] = arg2 * 2.0F / arg6;
		this.aFloatArray106[1] = 0.0F;
		this.aFloatArray106[2] = 0.0F;
		this.aFloatArray106[3] = 0.0F;
		this.aFloatArray106[4] = 0.0F;
		this.aFloatArray106[5] = arg3 * 2.0F / arg7;
		this.aFloatArray106[6] = 0.0F;
		this.aFloatArray106[7] = 0.0F;
		this.aFloatArray106[8] = arg0 * 2.0F / arg6 - 1.0F;
		this.aFloatArray106[9] = arg1 * 2.0F / arg7 - 1.0F;
		this.aFloatArray106[10] = (arg5 + arg4) / (arg5 - arg4);
		this.aFloatArray106[11] = 1.0F;
		this.aFloatArray106[12] = 0.0F;
		this.aFloatArray106[13] = 0.0F;
		this.aFloatArray106[14] = arg5 * 2.0F * arg4 / (arg4 - arg5);
		this.aFloatArray106[15] = 0.0F;
	}

	@OriginalMember(owner = "client!mq", name = "bj", descriptor = "(FFFFFFFF)V", line = 275)
	public void method26139(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) float arg6, @OriginalArg(7) float arg7) {
		this.aFloatArray106[0] = arg2 * 2.0F / arg6;
		this.aFloatArray106[1] = 0.0F;
		this.aFloatArray106[2] = 0.0F;
		this.aFloatArray106[3] = 0.0F;
		this.aFloatArray106[4] = 0.0F;
		this.aFloatArray106[5] = arg3 * 2.0F / arg7;
		this.aFloatArray106[6] = 0.0F;
		this.aFloatArray106[7] = 0.0F;
		this.aFloatArray106[8] = arg0 * 2.0F / arg6 - 1.0F;
		this.aFloatArray106[9] = arg1 * 2.0F / arg7 - 1.0F;
		this.aFloatArray106[10] = (arg5 + arg4) / (arg5 - arg4);
		this.aFloatArray106[11] = 1.0F;
		this.aFloatArray106[12] = 0.0F;
		this.aFloatArray106[13] = 0.0F;
		this.aFloatArray106[14] = arg5 * 2.0F * arg4 / (arg4 - arg5);
		this.aFloatArray106[15] = 0.0F;
	}

	@OriginalMember(owner = "client!mq", name = "m", descriptor = "(FFFFFFFFF)V", line = 294)
	public void method26060(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) float arg6, @OriginalArg(7) float arg7, @OriginalArg(8) float arg8) {
		this.method26055(-(arg0 * arg8) / arg2, arg8 * (arg6 - arg0) / arg2, -(arg1 * arg8) / arg3, arg8 * (arg7 - arg1) / arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!mq", name = "bz", descriptor = "(FFFFFFFFF)V", line = 294)
	public void method26120(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) float arg6, @OriginalArg(7) float arg7, @OriginalArg(8) float arg8) {
		this.method26055(-(arg0 * arg8) / arg2, arg8 * (arg6 - arg0) / arg2, -(arg1 * arg8) / arg3, arg8 * (arg7 - arg1) / arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!mq", name = "v", descriptor = "()F", line = 298)
	public float method26123() {
		return -(this.aFloatArray106[15] + this.aFloatArray106[14]) / (this.aFloatArray106[11] + this.aFloatArray106[10]);
	}

	@OriginalMember(owner = "client!mq", name = "ck", descriptor = "()F", line = 298)
	public float method26127() {
		return -(this.aFloatArray106[15] + this.aFloatArray106[14]) / (this.aFloatArray106[11] + this.aFloatArray106[10]);
	}

	@OriginalMember(owner = "client!mq", name = "cm", descriptor = "()F", line = 298)
	public float method26136() {
		return -(this.aFloatArray106[15] + this.aFloatArray106[14]) / (this.aFloatArray106[11] + this.aFloatArray106[10]);
	}

	@OriginalMember(owner = "client!mq", name = "cu", descriptor = "()F", line = 302)
	public float method26041() {
		return (this.aFloatArray106[14] - this.aFloatArray106[15]) / (this.aFloatArray106[11] - this.aFloatArray106[10]);
	}

	@OriginalMember(owner = "client!mq", name = "t", descriptor = "()F", line = 302)
	public float method26062() {
		return (this.aFloatArray106[14] - this.aFloatArray106[15]) / (this.aFloatArray106[11] - this.aFloatArray106[10]);
	}

	@OriginalMember(owner = "client!mq", name = "cl", descriptor = "()F", line = 302)
	public float method26068() {
		return (this.aFloatArray106[14] - this.aFloatArray106[15]) / (this.aFloatArray106[11] - this.aFloatArray106[10]);
	}

	@OriginalMember(owner = "client!mq", name = "cj", descriptor = "()F", line = 302)
	public float method26126() {
		return (this.aFloatArray106[14] - this.aFloatArray106[15]) / (this.aFloatArray106[11] - this.aFloatArray106[10]);
	}

	@OriginalMember(owner = "client!mq", name = "cv", descriptor = "()F", line = 302)
	public float method26128() {
		return (this.aFloatArray106[14] - this.aFloatArray106[15]) / (this.aFloatArray106[11] - this.aFloatArray106[10]);
	}

	@OriginalMember(owner = "client!mq", name = "w", descriptor = "([F)[F", line = 306)
	public float[] method26063(@OriginalArg(0) float[] arg0) {
		@Pc(9) float local9 = this.aFloatArray106[3] + this.aFloatArray106[0];
		@Pc(19) float local19 = this.aFloatArray106[7] + this.aFloatArray106[4];
		@Pc(29) float local29 = this.aFloatArray106[11] + this.aFloatArray106[8];
		@Pc(43) double local43 = Math.sqrt((double) (local9 * local9 + local19 * local19 + local29 * local29));
		arg0[0] = (float) ((double) local9 / local43);
		arg0[1] = (float) ((double) local19 / local43);
		arg0[2] = (float) ((double) local29 / local43);
		arg0[3] = (float) ((double) (this.aFloatArray106[15] + this.aFloatArray106[12]) / local43);
		return arg0;
	}

	@OriginalMember(owner = "client!mq", name = "cq", descriptor = "([F)[F", line = 306)
	public float[] method26109(@OriginalArg(0) float[] arg0) {
		@Pc(9) float local9 = this.aFloatArray106[3] + this.aFloatArray106[0];
		@Pc(19) float local19 = this.aFloatArray106[7] + this.aFloatArray106[4];
		@Pc(29) float local29 = this.aFloatArray106[11] + this.aFloatArray106[8];
		@Pc(43) double local43 = Math.sqrt((double) (local9 * local9 + local19 * local19 + local29 * local29));
		arg0[0] = (float) ((double) local9 / local43);
		arg0[1] = (float) ((double) local19 / local43);
		arg0[2] = (float) ((double) local29 / local43);
		arg0[3] = (float) ((double) (this.aFloatArray106[15] + this.aFloatArray106[12]) / local43);
		return arg0;
	}

	@OriginalMember(owner = "client!mq", name = "o", descriptor = "([F)[F", line = 318)
	public float[] method26064(@OriginalArg(0) float[] arg0) {
		@Pc(9) float local9 = this.aFloatArray106[3] - this.aFloatArray106[0];
		@Pc(19) float local19 = this.aFloatArray106[7] - this.aFloatArray106[4];
		@Pc(29) float local29 = this.aFloatArray106[11] - this.aFloatArray106[8];
		@Pc(43) double local43 = Math.sqrt((double) (local9 * local9 + local19 * local19 + local29 * local29));
		arg0[0] = (float) ((double) local9 / local43);
		arg0[1] = (float) ((double) local19 / local43);
		arg0[2] = (float) ((double) local29 / local43);
		arg0[3] = (float) ((double) (this.aFloatArray106[15] - this.aFloatArray106[12]) / local43);
		return arg0;
	}

	@OriginalMember(owner = "client!mq", name = "cg", descriptor = "([F)[F", line = 318)
	public float[] method26152(@OriginalArg(0) float[] arg0) {
		@Pc(9) float local9 = this.aFloatArray106[3] - this.aFloatArray106[0];
		@Pc(19) float local19 = this.aFloatArray106[7] - this.aFloatArray106[4];
		@Pc(29) float local29 = this.aFloatArray106[11] - this.aFloatArray106[8];
		@Pc(43) double local43 = Math.sqrt((double) (local9 * local9 + local19 * local19 + local29 * local29));
		arg0[0] = (float) ((double) local9 / local43);
		arg0[1] = (float) ((double) local19 / local43);
		arg0[2] = (float) ((double) local29 / local43);
		arg0[3] = (float) ((double) (this.aFloatArray106[15] - this.aFloatArray106[12]) / local43);
		return arg0;
	}

	@OriginalMember(owner = "client!mq", name = "i", descriptor = "([F)[F", line = 330)
	public float[] method26084(@OriginalArg(0) float[] arg0) {
		@Pc(9) float local9 = this.aFloatArray106[3] + this.aFloatArray106[1];
		@Pc(19) float local19 = this.aFloatArray106[7] + this.aFloatArray106[5];
		@Pc(29) float local29 = this.aFloatArray106[11] + this.aFloatArray106[9];
		@Pc(43) double local43 = Math.sqrt((double) (local9 * local9 + local19 * local19 + local29 * local29));
		arg0[0] = (float) ((double) local9 / local43);
		arg0[1] = (float) ((double) local19 / local43);
		arg0[2] = (float) ((double) local29 / local43);
		arg0[3] = (float) ((double) (this.aFloatArray106[15] + this.aFloatArray106[13]) / local43);
		return arg0;
	}

	@OriginalMember(owner = "client!mq", name = "cp", descriptor = "([F)[F", line = 330)
	public float[] method26132(@OriginalArg(0) float[] arg0) {
		@Pc(9) float local9 = this.aFloatArray106[3] + this.aFloatArray106[1];
		@Pc(19) float local19 = this.aFloatArray106[7] + this.aFloatArray106[5];
		@Pc(29) float local29 = this.aFloatArray106[11] + this.aFloatArray106[9];
		@Pc(43) double local43 = Math.sqrt((double) (local9 * local9 + local19 * local19 + local29 * local29));
		arg0[0] = (float) ((double) local9 / local43);
		arg0[1] = (float) ((double) local19 / local43);
		arg0[2] = (float) ((double) local29 / local43);
		arg0[3] = (float) ((double) (this.aFloatArray106[15] + this.aFloatArray106[13]) / local43);
		return arg0;
	}

	@OriginalMember(owner = "client!mq", name = "f", descriptor = "([F)[F", line = 342)
	public float[] method26065(@OriginalArg(0) float[] arg0) {
		@Pc(9) float local9 = this.aFloatArray106[3] - this.aFloatArray106[1];
		@Pc(19) float local19 = this.aFloatArray106[7] - this.aFloatArray106[5];
		@Pc(29) float local29 = this.aFloatArray106[11] - this.aFloatArray106[9];
		@Pc(43) double local43 = Math.sqrt((double) (local9 * local9 + local19 * local19 + local29 * local29));
		arg0[0] = (float) ((double) local9 / local43);
		arg0[1] = (float) ((double) local19 / local43);
		arg0[2] = (float) ((double) local29 / local43);
		arg0[3] = (float) ((double) (this.aFloatArray106[15] - this.aFloatArray106[13]) / local43);
		return arg0;
	}

	@OriginalMember(owner = "client!mq", name = "cc", descriptor = "([F)[F", line = 342)
	public float[] method26133(@OriginalArg(0) float[] arg0) {
		@Pc(9) float local9 = this.aFloatArray106[3] - this.aFloatArray106[1];
		@Pc(19) float local19 = this.aFloatArray106[7] - this.aFloatArray106[5];
		@Pc(29) float local29 = this.aFloatArray106[11] - this.aFloatArray106[9];
		@Pc(43) double local43 = Math.sqrt((double) (local9 * local9 + local19 * local19 + local29 * local29));
		arg0[0] = (float) ((double) local9 / local43);
		arg0[1] = (float) ((double) local19 / local43);
		arg0[2] = (float) ((double) local29 / local43);
		arg0[3] = (float) ((double) (this.aFloatArray106[15] - this.aFloatArray106[13]) / local43);
		return arg0;
	}

	@OriginalMember(owner = "client!mq", name = "cs", descriptor = "([F)[F", line = 342)
	public float[] method26155(@OriginalArg(0) float[] arg0) {
		@Pc(9) float local9 = this.aFloatArray106[3] - this.aFloatArray106[1];
		@Pc(19) float local19 = this.aFloatArray106[7] - this.aFloatArray106[5];
		@Pc(29) float local29 = this.aFloatArray106[11] - this.aFloatArray106[9];
		@Pc(43) double local43 = Math.sqrt((double) (local9 * local9 + local19 * local19 + local29 * local29));
		arg0[0] = (float) ((double) local9 / local43);
		arg0[1] = (float) ((double) local19 / local43);
		arg0[2] = (float) ((double) local29 / local43);
		arg0[3] = (float) ((double) (this.aFloatArray106[15] - this.aFloatArray106[13]) / local43);
		return arg0;
	}

	@OriginalMember(owner = "client!mq", name = "k", descriptor = "([F)[F", line = 354)
	public float[] method26066(@OriginalArg(0) float[] arg0) {
		@Pc(9) float local9 = this.aFloatArray106[3] + this.aFloatArray106[2];
		@Pc(19) float local19 = this.aFloatArray106[7] + this.aFloatArray106[6];
		@Pc(29) float local29 = this.aFloatArray106[11] + this.aFloatArray106[10];
		@Pc(43) double local43 = Math.sqrt((double) (local9 * local9 + local19 * local19 + local29 * local29));
		arg0[0] = (float) ((double) local9 / local43);
		arg0[1] = (float) ((double) local19 / local43);
		arg0[2] = (float) ((double) local29 / local43);
		arg0[3] = (float) ((double) (this.aFloatArray106[15] + this.aFloatArray106[14]) / local43);
		return arg0;
	}

	@OriginalMember(owner = "client!mq", name = "ct", descriptor = "([F)[F", line = 354)
	public float[] method26124(@OriginalArg(0) float[] arg0) {
		@Pc(9) float local9 = this.aFloatArray106[3] + this.aFloatArray106[2];
		@Pc(19) float local19 = this.aFloatArray106[7] + this.aFloatArray106[6];
		@Pc(29) float local29 = this.aFloatArray106[11] + this.aFloatArray106[10];
		@Pc(43) double local43 = Math.sqrt((double) (local9 * local9 + local19 * local19 + local29 * local29));
		arg0[0] = (float) ((double) local9 / local43);
		arg0[1] = (float) ((double) local19 / local43);
		arg0[2] = (float) ((double) local29 / local43);
		arg0[3] = (float) ((double) (this.aFloatArray106[15] + this.aFloatArray106[14]) / local43);
		return arg0;
	}

	@OriginalMember(owner = "client!mq", name = "cx", descriptor = "([F)[F", line = 354)
	public float[] method26135(@OriginalArg(0) float[] arg0) {
		@Pc(9) float local9 = this.aFloatArray106[3] + this.aFloatArray106[2];
		@Pc(19) float local19 = this.aFloatArray106[7] + this.aFloatArray106[6];
		@Pc(29) float local29 = this.aFloatArray106[11] + this.aFloatArray106[10];
		@Pc(43) double local43 = Math.sqrt((double) (local9 * local9 + local19 * local19 + local29 * local29));
		arg0[0] = (float) ((double) local9 / local43);
		arg0[1] = (float) ((double) local19 / local43);
		arg0[2] = (float) ((double) local29 / local43);
		arg0[3] = (float) ((double) (this.aFloatArray106[15] + this.aFloatArray106[14]) / local43);
		return arg0;
	}

	@OriginalMember(owner = "client!mq", name = "cy", descriptor = "([F)[F", line = 354)
	public float[] method26147(@OriginalArg(0) float[] arg0) {
		@Pc(9) float local9 = this.aFloatArray106[3] + this.aFloatArray106[2];
		@Pc(19) float local19 = this.aFloatArray106[7] + this.aFloatArray106[6];
		@Pc(29) float local29 = this.aFloatArray106[11] + this.aFloatArray106[10];
		@Pc(43) double local43 = Math.sqrt((double) (local9 * local9 + local19 * local19 + local29 * local29));
		arg0[0] = (float) ((double) local9 / local43);
		arg0[1] = (float) ((double) local19 / local43);
		arg0[2] = (float) ((double) local29 / local43);
		arg0[3] = (float) ((double) (this.aFloatArray106[15] + this.aFloatArray106[14]) / local43);
		return arg0;
	}

	@OriginalMember(owner = "client!mq", name = "cn", descriptor = "([F)[F", line = 366)
	public float[] method26058(@OriginalArg(0) float[] arg0) {
		@Pc(9) float local9 = this.aFloatArray106[3] - this.aFloatArray106[2];
		@Pc(19) float local19 = this.aFloatArray106[7] - this.aFloatArray106[6];
		@Pc(29) float local29 = this.aFloatArray106[11] - this.aFloatArray106[10];
		@Pc(43) double local43 = Math.sqrt((double) (local9 * local9 + local19 * local19 + local29 * local29));
		arg0[0] = (float) ((double) local9 / local43);
		arg0[1] = (float) ((double) local19 / local43);
		arg0[2] = (float) ((double) local29 / local43);
		arg0[3] = (float) ((double) (this.aFloatArray106[15] - this.aFloatArray106[14]) / local43);
		return arg0;
	}

	@OriginalMember(owner = "client!mq", name = "at", descriptor = "([F)[F", line = 366)
	public float[] method26107(@OriginalArg(0) float[] arg0) {
		@Pc(9) float local9 = this.aFloatArray106[3] - this.aFloatArray106[2];
		@Pc(19) float local19 = this.aFloatArray106[7] - this.aFloatArray106[6];
		@Pc(29) float local29 = this.aFloatArray106[11] - this.aFloatArray106[10];
		@Pc(43) double local43 = Math.sqrt((double) (local9 * local9 + local19 * local19 + local29 * local29));
		arg0[0] = (float) ((double) local9 / local43);
		arg0[1] = (float) ((double) local19 / local43);
		arg0[2] = (float) ((double) local29 / local43);
		arg0[3] = (float) ((double) (this.aFloatArray106[15] - this.aFloatArray106[14]) / local43);
		return arg0;
	}

	@OriginalMember(owner = "client!mq", name = "cz", descriptor = "([F)[F", line = 366)
	public float[] method26122(@OriginalArg(0) float[] arg0) {
		@Pc(9) float local9 = this.aFloatArray106[3] - this.aFloatArray106[2];
		@Pc(19) float local19 = this.aFloatArray106[7] - this.aFloatArray106[6];
		@Pc(29) float local29 = this.aFloatArray106[11] - this.aFloatArray106[10];
		@Pc(43) double local43 = Math.sqrt((double) (local9 * local9 + local19 * local19 + local29 * local29));
		arg0[0] = (float) ((double) local9 / local43);
		arg0[1] = (float) ((double) local19 / local43);
		arg0[2] = (float) ((double) local29 / local43);
		arg0[3] = (float) ((double) (this.aFloatArray106[15] - this.aFloatArray106[14]) / local43);
		return arg0;
	}

	@OriginalMember(owner = "client!mq", name = "cb", descriptor = "([F)[F", line = 366)
	public float[] method26131(@OriginalArg(0) float[] arg0) {
		@Pc(9) float local9 = this.aFloatArray106[3] - this.aFloatArray106[2];
		@Pc(19) float local19 = this.aFloatArray106[7] - this.aFloatArray106[6];
		@Pc(29) float local29 = this.aFloatArray106[11] - this.aFloatArray106[10];
		@Pc(43) double local43 = Math.sqrt((double) (local9 * local9 + local19 * local19 + local29 * local29));
		arg0[0] = (float) ((double) local9 / local43);
		arg0[1] = (float) ((double) local19 / local43);
		arg0[2] = (float) ((double) local29 / local43);
		arg0[3] = (float) ((double) (this.aFloatArray106[15] - this.aFloatArray106[14]) / local43);
		return arg0;
	}

	@OriginalMember(owner = "client!mq", name = "af", descriptor = "()V", line = 378)
	public void method26086() {
		@Pc(4) float local4 = this.aFloatArray106[0];
		@Pc(9) float local9 = this.aFloatArray106[4];
		@Pc(14) float local14 = this.aFloatArray106[8];
		@Pc(19) float local19 = this.aFloatArray106[12];
		@Pc(24) float local24 = this.aFloatArray106[1];
		@Pc(29) float local29 = this.aFloatArray106[5];
		@Pc(34) float local34 = this.aFloatArray106[9];
		@Pc(39) float local39 = this.aFloatArray106[13];
		@Pc(44) float local44 = this.aFloatArray106[2];
		@Pc(49) float local49 = this.aFloatArray106[6];
		@Pc(54) float local54 = this.aFloatArray106[10];
		@Pc(59) float local59 = this.aFloatArray106[14];
		@Pc(64) float local64 = this.aFloatArray106[3];
		@Pc(69) float local69 = this.aFloatArray106[7];
		@Pc(74) float local74 = this.aFloatArray106[11];
		@Pc(79) float local79 = this.aFloatArray106[15];
		this.aFloatArray106[0] = local4;
		this.aFloatArray106[1] = local9;
		this.aFloatArray106[2] = local14;
		this.aFloatArray106[3] = local19;
		this.aFloatArray106[4] = local24;
		this.aFloatArray106[5] = local29;
		this.aFloatArray106[6] = local34;
		this.aFloatArray106[7] = local39;
		this.aFloatArray106[8] = local44;
		this.aFloatArray106[9] = local49;
		this.aFloatArray106[10] = local54;
		this.aFloatArray106[11] = local59;
		this.aFloatArray106[12] = local64;
		this.aFloatArray106[13] = local69;
		this.aFloatArray106[14] = local74;
		this.aFloatArray106[15] = local79;
	}

	@OriginalMember(owner = "client!mq", name = "cd", descriptor = "()V", line = 378)
	public void method26119() {
		@Pc(4) float local4 = this.aFloatArray106[0];
		@Pc(9) float local9 = this.aFloatArray106[4];
		@Pc(14) float local14 = this.aFloatArray106[8];
		@Pc(19) float local19 = this.aFloatArray106[12];
		@Pc(24) float local24 = this.aFloatArray106[1];
		@Pc(29) float local29 = this.aFloatArray106[5];
		@Pc(34) float local34 = this.aFloatArray106[9];
		@Pc(39) float local39 = this.aFloatArray106[13];
		@Pc(44) float local44 = this.aFloatArray106[2];
		@Pc(49) float local49 = this.aFloatArray106[6];
		@Pc(54) float local54 = this.aFloatArray106[10];
		@Pc(59) float local59 = this.aFloatArray106[14];
		@Pc(64) float local64 = this.aFloatArray106[3];
		@Pc(69) float local69 = this.aFloatArray106[7];
		@Pc(74) float local74 = this.aFloatArray106[11];
		@Pc(79) float local79 = this.aFloatArray106[15];
		this.aFloatArray106[0] = local4;
		this.aFloatArray106[1] = local9;
		this.aFloatArray106[2] = local14;
		this.aFloatArray106[3] = local19;
		this.aFloatArray106[4] = local24;
		this.aFloatArray106[5] = local29;
		this.aFloatArray106[6] = local34;
		this.aFloatArray106[7] = local39;
		this.aFloatArray106[8] = local44;
		this.aFloatArray106[9] = local49;
		this.aFloatArray106[10] = local54;
		this.aFloatArray106[11] = local59;
		this.aFloatArray106[12] = local64;
		this.aFloatArray106[13] = local69;
		this.aFloatArray106[14] = local74;
		this.aFloatArray106[15] = local79;
	}

	@OriginalMember(owner = "client!mq", name = "co", descriptor = "()V", line = 378)
	public void method26140() {
		@Pc(4) float local4 = this.aFloatArray106[0];
		@Pc(9) float local9 = this.aFloatArray106[4];
		@Pc(14) float local14 = this.aFloatArray106[8];
		@Pc(19) float local19 = this.aFloatArray106[12];
		@Pc(24) float local24 = this.aFloatArray106[1];
		@Pc(29) float local29 = this.aFloatArray106[5];
		@Pc(34) float local34 = this.aFloatArray106[9];
		@Pc(39) float local39 = this.aFloatArray106[13];
		@Pc(44) float local44 = this.aFloatArray106[2];
		@Pc(49) float local49 = this.aFloatArray106[6];
		@Pc(54) float local54 = this.aFloatArray106[10];
		@Pc(59) float local59 = this.aFloatArray106[14];
		@Pc(64) float local64 = this.aFloatArray106[3];
		@Pc(69) float local69 = this.aFloatArray106[7];
		@Pc(74) float local74 = this.aFloatArray106[11];
		@Pc(79) float local79 = this.aFloatArray106[15];
		this.aFloatArray106[0] = local4;
		this.aFloatArray106[1] = local9;
		this.aFloatArray106[2] = local14;
		this.aFloatArray106[3] = local19;
		this.aFloatArray106[4] = local24;
		this.aFloatArray106[5] = local29;
		this.aFloatArray106[6] = local34;
		this.aFloatArray106[7] = local39;
		this.aFloatArray106[8] = local44;
		this.aFloatArray106[9] = local49;
		this.aFloatArray106[10] = local54;
		this.aFloatArray106[11] = local59;
		this.aFloatArray106[12] = local64;
		this.aFloatArray106[13] = local69;
		this.aFloatArray106[14] = local74;
		this.aFloatArray106[15] = local79;
	}

	@OriginalMember(owner = "client!mq", name = "ch", descriptor = "()V", line = 378)
	public void method26142() {
		@Pc(4) float local4 = this.aFloatArray106[0];
		@Pc(9) float local9 = this.aFloatArray106[4];
		@Pc(14) float local14 = this.aFloatArray106[8];
		@Pc(19) float local19 = this.aFloatArray106[12];
		@Pc(24) float local24 = this.aFloatArray106[1];
		@Pc(29) float local29 = this.aFloatArray106[5];
		@Pc(34) float local34 = this.aFloatArray106[9];
		@Pc(39) float local39 = this.aFloatArray106[13];
		@Pc(44) float local44 = this.aFloatArray106[2];
		@Pc(49) float local49 = this.aFloatArray106[6];
		@Pc(54) float local54 = this.aFloatArray106[10];
		@Pc(59) float local59 = this.aFloatArray106[14];
		@Pc(64) float local64 = this.aFloatArray106[3];
		@Pc(69) float local69 = this.aFloatArray106[7];
		@Pc(74) float local74 = this.aFloatArray106[11];
		@Pc(79) float local79 = this.aFloatArray106[15];
		this.aFloatArray106[0] = local4;
		this.aFloatArray106[1] = local9;
		this.aFloatArray106[2] = local14;
		this.aFloatArray106[3] = local19;
		this.aFloatArray106[4] = local24;
		this.aFloatArray106[5] = local29;
		this.aFloatArray106[6] = local34;
		this.aFloatArray106[7] = local39;
		this.aFloatArray106[8] = local44;
		this.aFloatArray106[9] = local49;
		this.aFloatArray106[10] = local54;
		this.aFloatArray106[11] = local59;
		this.aFloatArray106[12] = local64;
		this.aFloatArray106[13] = local69;
		this.aFloatArray106[14] = local74;
		this.aFloatArray106[15] = local79;
	}

	@OriginalMember(owner = "client!mq", name = "ci", descriptor = "([F)[F", line = 413)
	public float[] method26143(@OriginalArg(0) float[] arg0) {
		System.arraycopy(this.aFloatArray106, 0, arg0, 0, 16);
		return arg0;
	}

	@OriginalMember(owner = "client!mq", name = "ca", descriptor = "([F)[F", line = 413)
	public float[] method26144(@OriginalArg(0) float[] arg0) {
		System.arraycopy(this.aFloatArray106, 0, arg0, 0, 16);
		return arg0;
	}

	@OriginalMember(owner = "client!mq", name = "cr", descriptor = "([F)[F", line = 413)
	public float[] method26145(@OriginalArg(0) float[] arg0) {
		System.arraycopy(this.aFloatArray106, 0, arg0, 0, 16);
		return arg0;
	}

	@OriginalMember(owner = "client!mq", name = "ak", descriptor = "([F)[F", line = 413)
	public float[] method26151(@OriginalArg(0) float[] arg0) {
		System.arraycopy(this.aFloatArray106, 0, arg0, 0, 16);
		return arg0;
	}

	@OriginalMember(owner = "client!mq", name = "aa", descriptor = "([F)[F", line = 418)
	public float[] method26070(@OriginalArg(0) float[] arg0) {
		System.arraycopy(this.aFloatArray106, 0, arg0, 0, 16);
		arg0[3] = 0.0F;
		arg0[7] = 0.0F;
		arg0[11] = 0.0F;
		arg0[12] = 0.0F;
		arg0[13] = 0.0F;
		arg0[14] = 0.0F;
		arg0[15] = 1.0F;
		return arg0;
	}

	@OriginalMember(owner = "client!mq", name = "ce", descriptor = "([F)[F", line = 418)
	public float[] method26146(@OriginalArg(0) float[] arg0) {
		System.arraycopy(this.aFloatArray106, 0, arg0, 0, 16);
		arg0[3] = 0.0F;
		arg0[7] = 0.0F;
		arg0[11] = 0.0F;
		arg0[12] = 0.0F;
		arg0[13] = 0.0F;
		arg0[14] = 0.0F;
		arg0[15] = 1.0F;
		return arg0;
	}

	@OriginalMember(owner = "client!mq", name = "cw", descriptor = "([F)[F", line = 430)
	public float[] method26051(@OriginalArg(0) float[] arg0) {
		arg0[0] = this.aFloatArray106[0];
		arg0[1] = this.aFloatArray106[1];
		arg0[2] = this.aFloatArray106[2];
		arg0[3] = this.aFloatArray106[4];
		arg0[4] = this.aFloatArray106[5];
		arg0[5] = this.aFloatArray106[6];
		arg0[6] = this.aFloatArray106[8];
		arg0[7] = this.aFloatArray106[9];
		arg0[8] = this.aFloatArray106[10];
		return arg0;
	}

	@OriginalMember(owner = "client!mq", name = "ah", descriptor = "([F)[F", line = 430)
	public float[] method26130(@OriginalArg(0) float[] arg0) {
		arg0[0] = this.aFloatArray106[0];
		arg0[1] = this.aFloatArray106[1];
		arg0[2] = this.aFloatArray106[2];
		arg0[3] = this.aFloatArray106[4];
		arg0[4] = this.aFloatArray106[5];
		arg0[5] = this.aFloatArray106[6];
		arg0[6] = this.aFloatArray106[8];
		arg0[7] = this.aFloatArray106[9];
		arg0[8] = this.aFloatArray106[10];
		return arg0;
	}

	@OriginalMember(owner = "client!mq", name = "cf", descriptor = "([F)[F", line = 430)
	public float[] method26148(@OriginalArg(0) float[] arg0) {
		arg0[0] = this.aFloatArray106[0];
		arg0[1] = this.aFloatArray106[1];
		arg0[2] = this.aFloatArray106[2];
		arg0[3] = this.aFloatArray106[4];
		arg0[4] = this.aFloatArray106[5];
		arg0[5] = this.aFloatArray106[6];
		arg0[6] = this.aFloatArray106[8];
		arg0[7] = this.aFloatArray106[9];
		arg0[8] = this.aFloatArray106[10];
		return arg0;
	}

	@OriginalMember(owner = "client!mq", name = "dh", descriptor = "([F)[F", line = 443)
	public float[] method26043(@OriginalArg(0) float[] arg0) {
		arg0[0] = this.aFloatArray106[0];
		arg0[1] = this.aFloatArray106[4];
		arg0[2] = this.aFloatArray106[8];
		arg0[3] = this.aFloatArray106[12];
		arg0[4] = this.aFloatArray106[1];
		arg0[5] = this.aFloatArray106[5];
		arg0[6] = this.aFloatArray106[9];
		arg0[7] = this.aFloatArray106[13];
		arg0[8] = this.aFloatArray106[2];
		arg0[9] = this.aFloatArray106[6];
		arg0[10] = this.aFloatArray106[10];
		arg0[11] = this.aFloatArray106[14];
		arg0[12] = this.aFloatArray106[3];
		arg0[13] = this.aFloatArray106[7];
		arg0[14] = this.aFloatArray106[11];
		arg0[15] = this.aFloatArray106[15];
		return arg0;
	}

	@OriginalMember(owner = "client!mq", name = "an", descriptor = "([F)[F", line = 443)
	public float[] method26072(@OriginalArg(0) float[] arg0) {
		arg0[0] = this.aFloatArray106[0];
		arg0[1] = this.aFloatArray106[4];
		arg0[2] = this.aFloatArray106[8];
		arg0[3] = this.aFloatArray106[12];
		arg0[4] = this.aFloatArray106[1];
		arg0[5] = this.aFloatArray106[5];
		arg0[6] = this.aFloatArray106[9];
		arg0[7] = this.aFloatArray106[13];
		arg0[8] = this.aFloatArray106[2];
		arg0[9] = this.aFloatArray106[6];
		arg0[10] = this.aFloatArray106[10];
		arg0[11] = this.aFloatArray106[14];
		arg0[12] = this.aFloatArray106[3];
		arg0[13] = this.aFloatArray106[7];
		arg0[14] = this.aFloatArray106[11];
		arg0[15] = this.aFloatArray106[15];
		return arg0;
	}

	@OriginalMember(owner = "client!mq", name = "df", descriptor = "([F)[F", line = 443)
	public float[] method26079(@OriginalArg(0) float[] arg0) {
		arg0[0] = this.aFloatArray106[0];
		arg0[1] = this.aFloatArray106[4];
		arg0[2] = this.aFloatArray106[8];
		arg0[3] = this.aFloatArray106[12];
		arg0[4] = this.aFloatArray106[1];
		arg0[5] = this.aFloatArray106[5];
		arg0[6] = this.aFloatArray106[9];
		arg0[7] = this.aFloatArray106[13];
		arg0[8] = this.aFloatArray106[2];
		arg0[9] = this.aFloatArray106[6];
		arg0[10] = this.aFloatArray106[10];
		arg0[11] = this.aFloatArray106[14];
		arg0[12] = this.aFloatArray106[3];
		arg0[13] = this.aFloatArray106[7];
		arg0[14] = this.aFloatArray106[11];
		arg0[15] = this.aFloatArray106[15];
		return arg0;
	}

	@OriginalMember(owner = "client!mq", name = "dv", descriptor = "([F)[F", line = 443)
	public float[] method26149(@OriginalArg(0) float[] arg0) {
		arg0[0] = this.aFloatArray106[0];
		arg0[1] = this.aFloatArray106[4];
		arg0[2] = this.aFloatArray106[8];
		arg0[3] = this.aFloatArray106[12];
		arg0[4] = this.aFloatArray106[1];
		arg0[5] = this.aFloatArray106[5];
		arg0[6] = this.aFloatArray106[9];
		arg0[7] = this.aFloatArray106[13];
		arg0[8] = this.aFloatArray106[2];
		arg0[9] = this.aFloatArray106[6];
		arg0[10] = this.aFloatArray106[10];
		arg0[11] = this.aFloatArray106[14];
		arg0[12] = this.aFloatArray106[3];
		arg0[13] = this.aFloatArray106[7];
		arg0[14] = this.aFloatArray106[11];
		arg0[15] = this.aFloatArray106[15];
		return arg0;
	}

	@OriginalMember(owner = "client!mq", name = "db", descriptor = "([F)[F", line = 463)
	public float[] method26061(@OriginalArg(0) float[] arg0) {
		arg0[0] = this.aFloatArray106[0];
		arg0[1] = this.aFloatArray106[1];
		arg0[2] = this.aFloatArray106[4];
		arg0[3] = this.aFloatArray106[5];
		arg0[4] = this.aFloatArray106[8];
		arg0[5] = this.aFloatArray106[9];
		arg0[6] = this.aFloatArray106[12];
		arg0[7] = this.aFloatArray106[13];
		return arg0;
	}

	@OriginalMember(owner = "client!mq", name = "aj", descriptor = "([F)[F", line = 463)
	public float[] method26073(@OriginalArg(0) float[] arg0) {
		arg0[0] = this.aFloatArray106[0];
		arg0[1] = this.aFloatArray106[1];
		arg0[2] = this.aFloatArray106[4];
		arg0[3] = this.aFloatArray106[5];
		arg0[4] = this.aFloatArray106[8];
		arg0[5] = this.aFloatArray106[9];
		arg0[6] = this.aFloatArray106[12];
		arg0[7] = this.aFloatArray106[13];
		return arg0;
	}

	@OriginalMember(owner = "client!mq", name = "dp", descriptor = "([F)[F", line = 463)
	public float[] method26153(@OriginalArg(0) float[] arg0) {
		arg0[0] = this.aFloatArray106[0];
		arg0[1] = this.aFloatArray106[1];
		arg0[2] = this.aFloatArray106[4];
		arg0[3] = this.aFloatArray106[5];
		arg0[4] = this.aFloatArray106[8];
		arg0[5] = this.aFloatArray106[9];
		arg0[6] = this.aFloatArray106[12];
		arg0[7] = this.aFloatArray106[13];
		return arg0;
	}

	@OriginalMember(owner = "client!mq", name = "dk", descriptor = "([F)[F", line = 475)
	public float[] method26047(@OriginalArg(0) float[] arg0) {
		arg0[0] = this.aFloatArray106[0];
		arg0[1] = this.aFloatArray106[4];
		arg0[2] = this.aFloatArray106[8];
		arg0[3] = this.aFloatArray106[12];
		arg0[4] = this.aFloatArray106[1];
		arg0[5] = this.aFloatArray106[5];
		arg0[6] = this.aFloatArray106[9];
		arg0[7] = this.aFloatArray106[13];
		return arg0;
	}

	@OriginalMember(owner = "client!mq", name = "as", descriptor = "([F)[F", line = 475)
	public float[] method26071(@OriginalArg(0) float[] arg0) {
		arg0[0] = this.aFloatArray106[0];
		arg0[1] = this.aFloatArray106[4];
		arg0[2] = this.aFloatArray106[8];
		arg0[3] = this.aFloatArray106[12];
		arg0[4] = this.aFloatArray106[1];
		arg0[5] = this.aFloatArray106[5];
		arg0[6] = this.aFloatArray106[9];
		arg0[7] = this.aFloatArray106[13];
		return arg0;
	}

	@OriginalMember(owner = "client!mq", name = "ai", descriptor = "([F)[F", line = 487)
	public float[] method26156(@OriginalArg(0) float[] arg0) {
		arg0[0] = this.aFloatArray106[0];
		arg0[1] = this.aFloatArray106[1];
		arg0[2] = 0.0F;
		arg0[3] = 0.0F;
		arg0[4] = this.aFloatArray106[4];
		arg0[5] = this.aFloatArray106[5];
		arg0[6] = 0.0F;
		arg0[7] = 0.0F;
		arg0[8] = this.aFloatArray106[12];
		arg0[9] = this.aFloatArray106[13];
		arg0[10] = this.aFloatArray106[14];
		arg0[11] = 0.0F;
		arg0[12] = 0.0F;
		arg0[13] = 0.0F;
		arg0[14] = 0.0F;
		arg0[15] = 1.0F;
		return arg0;
	}

	@OriginalMember(owner = "client!mq", name = "aq", descriptor = "(IIIFFF)V", line = 507)
	public void method26075(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		@Pc(54) float[] local54;
		@Pc(57) float[] local57;
		@Pc(60) float[] local60;
		@Pc(98) float[] local98;
		@Pc(101) float[] local101;
		if (arg0 == 0) {
			this.aFloatArray106[0] = arg1;
			this.aFloatArray106[5] = arg2;
			this.aFloatArray106[10] = 1.0F;
			local98 = this.aFloatArray106;
			local101 = this.aFloatArray106;
			local54 = this.aFloatArray106;
			local57 = this.aFloatArray106;
			local60 = this.aFloatArray106;
			this.aFloatArray106[9] = 0.0F;
			local60[8] = 0.0F;
			local57[6] = 0.0F;
			local54[4] = 0.0F;
			local101[2] = 0.0F;
			local98[1] = 0.0F;
		} else {
			@Pc(7) float local7 = Class337.aFloatArray108[arg0 & 0x3FFF];
			@Pc(13) float local13 = Class337.aFloatArray107[arg0 & 0x3FFF];
			this.aFloatArray106[0] = local7 * (float) arg1;
			this.aFloatArray106[5] = local7 * (float) arg2;
			this.aFloatArray106[1] = local13 * (float) arg1;
			this.aFloatArray106[4] = -local13 * (float) arg2;
			this.aFloatArray106[10] = 1.0F;
			local54 = this.aFloatArray106;
			local57 = this.aFloatArray106;
			local60 = this.aFloatArray106;
			this.aFloatArray106[9] = 0.0F;
			local60[8] = 0.0F;
			local57[6] = 0.0F;
			local54[2] = 0.0F;
		}
		local98 = this.aFloatArray106;
		local101 = this.aFloatArray106;
		this.aFloatArray106[11] = 0.0F;
		local101[7] = 0.0F;
		local98[3] = 0.0F;
		this.aFloatArray106[15] = 1.0F;
		this.aFloatArray106[12] = arg3;
		this.aFloatArray106[13] = arg4;
		this.aFloatArray106[14] = arg5;
	}

	@OriginalMember(owner = "client!mq", name = "dy", descriptor = "(IIIFFF)V", line = 507)
	public void method26150(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		@Pc(54) float[] local54;
		@Pc(57) float[] local57;
		@Pc(60) float[] local60;
		@Pc(98) float[] local98;
		@Pc(101) float[] local101;
		if (arg0 == 0) {
			this.aFloatArray106[0] = arg1;
			this.aFloatArray106[5] = arg2;
			this.aFloatArray106[10] = 1.0F;
			local98 = this.aFloatArray106;
			local101 = this.aFloatArray106;
			local54 = this.aFloatArray106;
			local57 = this.aFloatArray106;
			local60 = this.aFloatArray106;
			this.aFloatArray106[9] = 0.0F;
			local60[8] = 0.0F;
			local57[6] = 0.0F;
			local54[4] = 0.0F;
			local101[2] = 0.0F;
			local98[1] = 0.0F;
		} else {
			@Pc(7) float local7 = Class337.aFloatArray108[arg0 & 0x3FFF];
			@Pc(13) float local13 = Class337.aFloatArray107[arg0 & 0x3FFF];
			this.aFloatArray106[0] = local7 * (float) arg1;
			this.aFloatArray106[5] = local7 * (float) arg2;
			this.aFloatArray106[1] = local13 * (float) arg1;
			this.aFloatArray106[4] = -local13 * (float) arg2;
			this.aFloatArray106[10] = 1.0F;
			local54 = this.aFloatArray106;
			local57 = this.aFloatArray106;
			local60 = this.aFloatArray106;
			this.aFloatArray106[9] = 0.0F;
			local60[8] = 0.0F;
			local57[6] = 0.0F;
			local54[2] = 0.0F;
		}
		local98 = this.aFloatArray106;
		local101 = this.aFloatArray106;
		this.aFloatArray106[11] = 0.0F;
		local101[7] = 0.0F;
		local98[3] = 0.0F;
		this.aFloatArray106[15] = 1.0F;
		this.aFloatArray106[12] = arg3;
		this.aFloatArray106[13] = arg4;
		this.aFloatArray106[14] = arg5;
	}

	@OriginalMember(owner = "client!mq", name = "toString", descriptor = "()Ljava/lang/String;", line = 552)
	@Override
	public String toString() {
		@Pc(3) StringBuilder local3 = new StringBuilder();
		for (@Pc(5) int local5 = 0; local5 < 4; local5++) {
			for (@Pc(10) int local10 = 0; local10 < 4; local10++) {
				if (local10 > 0) {
					local3.append("\t");
				}
				local3.append(this.aFloatArray106[local5 * 4 + local10]);
			}
			local3.append("\n");
		}
		return local3.toString();
	}

	@OriginalMember(owner = "client!mq", name = "ox", descriptor = "()Ljava/lang/String;", line = 552)
	public String method26080() {
		@Pc(3) StringBuilder local3 = new StringBuilder();
		for (@Pc(5) int local5 = 0; local5 < 4; local5++) {
			for (@Pc(10) int local10 = 0; local10 < 4; local10++) {
				if (local10 > 0) {
					local3.append("\t");
				}
				local3.append(this.aFloatArray106[local5 * 4 + local10]);
			}
			local3.append("\n");
		}
		return local3.toString();
	}

	@OriginalMember(owner = "client!mq", name = "ou", descriptor = "()Ljava/lang/String;", line = 552)
	public String method26081() {
		@Pc(3) StringBuilder local3 = new StringBuilder();
		for (@Pc(5) int local5 = 0; local5 < 4; local5++) {
			for (@Pc(10) int local10 = 0; local10 < 4; local10++) {
				if (local10 > 0) {
					local3.append("\t");
				}
				local3.append(this.aFloatArray106[local5 * 4 + local10]);
			}
			local3.append("\n");
		}
		return local3.toString();
	}

	@OriginalMember(owner = "client!mq", name = "oy", descriptor = "()I", line = 565)
	public int method26069() {
		@Pc(1) byte local1 = 1;
		return local1 * 31 + Arrays.hashCode(this.aFloatArray106);
	}

	@OriginalMember(owner = "client!mq", name = "hashCode", descriptor = "()I", line = 565)
	@Override
	public int hashCode() {
		@Pc(1) byte local1 = 1;
		return local1 * 31 + Arrays.hashCode(this.aFloatArray106);
	}

	@OriginalMember(owner = "client!mq", name = "ol", descriptor = "()I", line = 565)
	public int method26157() {
		@Pc(1) byte local1 = 1;
		return local1 * 31 + Arrays.hashCode(this.aFloatArray106);
	}

	@OriginalMember(owner = "client!mq", name = "ib", descriptor = "(Ljava/lang/Object;)Z", line = 571)
	public boolean method26076(@OriginalArg(0) Object arg0) {
		if (!(arg0 instanceof Class328)) {
			return false;
		}
		@Pc(7) Class328 local7 = (Class328) arg0;
		for (@Pc(9) int local9 = 0; local9 < 16; local9++) {
			if (this.aFloatArray106[local9] != local7.aFloatArray106[local9]) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!mq", name = "equals", descriptor = "(Ljava/lang/Object;)Z", line = 571)
	@Override
	public boolean equals(@OriginalArg(0) Object arg0) {
		if (!(arg0 instanceof Class328)) {
			return false;
		}
		@Pc(7) Class328 local7 = (Class328) arg0;
		for (@Pc(9) int local9 = 0; local9 < 16; local9++) {
			if (this.aFloatArray106[local9] != local7.aFloatArray106[local9]) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!mq", name = "hm", descriptor = "(Ljava/lang/Object;)Z", line = 571)
	public boolean method26078(@OriginalArg(0) Object arg0) {
		if (!(arg0 instanceof Class328)) {
			return false;
		}
		@Pc(7) Class328 local7 = (Class328) arg0;
		for (@Pc(9) int local9 = 0; local9 < 16; local9++) {
			if (this.aFloatArray106[local9] != local7.aFloatArray106[local9]) {
				return false;
			}
		}
		return true;
	}
}
