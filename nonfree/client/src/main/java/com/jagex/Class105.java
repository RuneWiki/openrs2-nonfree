package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hr")
public abstract class Class105 implements Interface35 {

	@OriginalMember(owner = "client!hr", name = "v", descriptor = "Ljava/lang/String;")
	protected String aString39;

	@OriginalMember(owner = "client!hr", name = "c", descriptor = "Ljava/lang/String;")
	protected String aString40;

	@OriginalMember(owner = "client!hr", name = "p", descriptor = "Ljava/lang/String;")
	protected String aString41 = null;

	@OriginalMember(owner = "client!hr", name = "<init>", descriptor = "()V", line = 12)
	Class105() {
	}

	@OriginalMember(owner = "client!hr", name = "p", descriptor = "(B)Ljava/lang/String;", line = 17)
	String method9577() {
		return this.aString41;
	}

	@OriginalMember(owner = "client!hr", name = "b", descriptor = "()Ljava/lang/String;", line = 17)
	String method9578() {
		return this.aString41;
	}

	@OriginalMember(owner = "client!hr", name = "p", descriptor = "(ZI)V", line = 56)
	public static void method9579(@OriginalArg(0) boolean arg0) {
		@Pc(4) Class77_Sub16 local4;
		for (local4 = (Class77_Sub16) Class77_Sub16.aClass695_20.method36395(); local4 != null; local4 = (Class77_Sub16) Class77_Sub16.aClass695_20.method36406()) {
			if (local4.aClass496_3 != null) {
				local4.aClass496_3.method30100(150);
				Class94_Sub4.aClass261_1.method26325(local4.aClass496_3);
				local4.aClass496_3 = null;
			}
			if (local4.aClass496_4 != null) {
				local4.aClass496_4.method30100(150);
				Class94_Sub4.aClass261_1.method26325(local4.aClass496_4);
				local4.aClass496_4 = null;
			}
			local4.method24063();
		}
		if (!arg0) {
			return;
		}
		for (local4 = (Class77_Sub16) Class77_Sub16.aClass695_21.method36395(); local4 != null; local4 = (Class77_Sub16) Class77_Sub16.aClass695_21.method36406()) {
			if (local4.aClass496_3 != null) {
				local4.aClass496_3.method30100(150);
				Class94_Sub4.aClass261_1.method26325(local4.aClass496_3);
				local4.aClass496_3 = null;
			}
			local4.method24063();
		}
		for (local4 = (Class77_Sub16) Class77_Sub16.aClass12_12.method190(); local4 != null; local4 = (Class77_Sub16) Class77_Sub16.aClass12_12.method192()) {
			if (local4.aClass496_3 != null) {
				local4.aClass496_3.method30100(150);
				Class94_Sub4.aClass261_1.method26325(local4.aClass496_3);
				local4.aClass496_3 = null;
			}
			local4.method24063();
		}
	}

	@OriginalMember(owner = "client!hr", name = "si", descriptor = "(Lclient!yf;B)V", line = 7808)
	static final void method9580(@OriginalArg(0) Class665 arg0) {
		@Pc(12) int local12 = arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307];
		@Pc(16) Class277 local16 = Class155.method23628(local12);
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = local16.anInt3874 * -881188269;
	}

	@OriginalMember(owner = "client!hr", name = "au", descriptor = "(IFFFF)V")
	abstract void method9581(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4);

	@OriginalMember(owner = "client!hr", name = "by", descriptor = "(IFFF)V")
	abstract void method9582(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3);

	@OriginalMember(owner = "client!hr", name = "l", descriptor = "(Lclient!aqz;F)V")
	abstract void method9583(@OriginalArg(0) Class77_Sub12_Sub1 arg0, @OriginalArg(1) float arg1);

	@OriginalMember(owner = "client!hr", name = "h", descriptor = "(Lclient!aqz;F)V")
	abstract void method9584(@OriginalArg(0) Class77_Sub12_Sub1 arg0, @OriginalArg(1) float arg1);

	@OriginalMember(owner = "client!hr", name = "w", descriptor = "(Lclient!aqz;FFF)V")
	abstract void method9585(@OriginalArg(0) Class77_Sub12_Sub1 arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3);

	@OriginalMember(owner = "client!hr", name = "t", descriptor = "(Lclient!aqz;FFFF)V")
	abstract void method9586(@OriginalArg(0) Class77_Sub12_Sub1 arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4);

	@OriginalMember(owner = "client!hr", name = "an", descriptor = "(IILclient!ls;)V")
	abstract void method9587(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Interface42 arg2);

	@OriginalMember(owner = "client!hr", name = "x", descriptor = "(Lclient!aqz;Lclient!oi;)V")
	abstract void method9588(@OriginalArg(0) Class77_Sub12_Sub1 arg0, @OriginalArg(1) Class442 arg1);

	@OriginalMember(owner = "client!hr", name = "d", descriptor = "(Lclient!aqz;Lclient!oi;)V")
	abstract void method9589(@OriginalArg(0) Class77_Sub12_Sub1 arg0, @OriginalArg(1) Class442 arg1);

	@OriginalMember(owner = "client!hr", name = "z", descriptor = "(Lclient!aqz;ILclient!ls;)V")
	abstract void method9590(@OriginalArg(0) Class77_Sub12_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Interface42 arg2);

	@OriginalMember(owner = "client!hr", name = "j", descriptor = "(IFFF)V")
	abstract void method9591(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3);

	@OriginalMember(owner = "client!hr", name = "i", descriptor = "(IFFFF)V")
	abstract void method9592(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4);

	@OriginalMember(owner = "client!hr", name = "u", descriptor = "(ILclient!oi;)V")
	abstract void method9593(@OriginalArg(0) int arg0, @OriginalArg(1) Class442 arg1);

	@OriginalMember(owner = "client!hr", name = "e", descriptor = "(ILclient!oi;)V")
	abstract void method9594(@OriginalArg(0) int arg0, @OriginalArg(1) Class442 arg1);

	@OriginalMember(owner = "client!hr", name = "c", descriptor = "()Z")
	public abstract boolean method9595();

	@OriginalMember(owner = "client!hr", name = "o", descriptor = "(IILclient!ls;)V")
	abstract void method9596(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Interface42 arg2);

	@OriginalMember(owner = "client!hr", name = "f", descriptor = "(ILclient!oi;)V")
	abstract void method9597(@OriginalArg(0) int arg0, @OriginalArg(1) Class442 arg1);

	@OriginalMember(owner = "client!hr", name = "n", descriptor = "()Z")
	public abstract boolean method9598();

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "()Z")
	public abstract boolean method9599();

	@OriginalMember(owner = "client!hr", name = "ah", descriptor = "(ILclient!oi;)V")
	abstract void method9600(@OriginalArg(0) int arg0, @OriginalArg(1) Class442 arg1);

	@OriginalMember(owner = "client!hr", name = "ba", descriptor = "(Lclient!aqz;ILclient!ls;)V")
	abstract void method9601(@OriginalArg(0) Class77_Sub12_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Interface42 arg2);

	@OriginalMember(owner = "client!hr", name = "aj", descriptor = "(Lclient!aqz;F)V")
	abstract void method9602(@OriginalArg(0) Class77_Sub12_Sub1 arg0, @OriginalArg(1) float arg1);

	@OriginalMember(owner = "client!hr", name = "ai", descriptor = "(Lclient!aqz;FF)V")
	abstract void method9603(@OriginalArg(0) Class77_Sub12_Sub1 arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2);

	@OriginalMember(owner = "client!hr", name = "ag", descriptor = "(Lclient!aqz;FF)V")
	abstract void method9604(@OriginalArg(0) Class77_Sub12_Sub1 arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2);

	@OriginalMember(owner = "client!hr", name = "al", descriptor = "(Lclient!aqz;FFFF)V")
	abstract void method9605(@OriginalArg(0) Class77_Sub12_Sub1 arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4);

	@OriginalMember(owner = "client!hr", name = "ao", descriptor = "(Lclient!aqz;Lclient!oi;)V")
	abstract void method9606(@OriginalArg(0) Class77_Sub12_Sub1 arg0, @OriginalArg(1) Class442 arg1);

	@OriginalMember(owner = "client!hr", name = "k", descriptor = "(I[FI)V")
	abstract void method9607(@OriginalArg(0) int arg0, @OriginalArg(1) float[] arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!hr", name = "bv", descriptor = "(Lclient!aqz;[FI)V")
	abstract void method9608(@OriginalArg(0) Class77_Sub12_Sub1 arg0, @OriginalArg(1) float[] arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!hr", name = "ax", descriptor = "(IFFFF)V")
	abstract void method9609(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4);

	@OriginalMember(owner = "client!hr", name = "ar", descriptor = "(IFFFF)V")
	abstract void method9610(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4);

	@OriginalMember(owner = "client!hr", name = "ad", descriptor = "(IFFFF)V")
	abstract void method9611(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4);

	@OriginalMember(owner = "client!hr", name = "ac", descriptor = "(I[FI)V")
	abstract void method9612(@OriginalArg(0) int arg0, @OriginalArg(1) float[] arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!hr", name = "av", descriptor = "(I[FI)V")
	abstract void method9613(@OriginalArg(0) int arg0, @OriginalArg(1) float[] arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!hr", name = "q", descriptor = "(Lclient!aqz;[FI)V")
	abstract void method9614(@OriginalArg(0) Class77_Sub12_Sub1 arg0, @OriginalArg(1) float[] arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!hr", name = "ae", descriptor = "(ILclient!oi;)V")
	abstract void method9615(@OriginalArg(0) int arg0, @OriginalArg(1) Class442 arg1);

	@OriginalMember(owner = "client!hr", name = "am", descriptor = "(ILclient!oi;)V")
	abstract void method9616(@OriginalArg(0) int arg0, @OriginalArg(1) Class442 arg1);

	@OriginalMember(owner = "client!hr", name = "as", descriptor = "(ILclient!oi;)V")
	abstract void method9617(@OriginalArg(0) int arg0, @OriginalArg(1) Class442 arg1);

	@OriginalMember(owner = "client!hr", name = "aq", descriptor = "(ILclient!oi;)V")
	abstract void method9618(@OriginalArg(0) int arg0, @OriginalArg(1) Class442 arg1);

	@OriginalMember(owner = "client!hr", name = "az", descriptor = "(Lclient!aqz;Lclient!oi;)V")
	abstract void method9619(@OriginalArg(0) Class77_Sub12_Sub1 arg0, @OriginalArg(1) Class442 arg1);

	@OriginalMember(owner = "client!hr", name = "ay", descriptor = "(ILclient!oi;)V")
	abstract void method9620(@OriginalArg(0) int arg0, @OriginalArg(1) Class442 arg1);

	@OriginalMember(owner = "client!hr", name = "af", descriptor = "(IILclient!ls;)V")
	abstract void method9621(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Interface42 arg2);

	@OriginalMember(owner = "client!hr", name = "bd", descriptor = "(IFFF)V")
	abstract void method9622(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3);

	@OriginalMember(owner = "client!hr", name = "ab", descriptor = "(Lclient!aqz;FFF)V")
	abstract void method9623(@OriginalArg(0) Class77_Sub12_Sub1 arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3);

	@OriginalMember(owner = "client!hr", name = "aa", descriptor = "(Lclient!aqz;FFF)V")
	abstract void method9624(@OriginalArg(0) Class77_Sub12_Sub1 arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3);

	@OriginalMember(owner = "client!hr", name = "y", descriptor = "(Lclient!aqz;FF)V")
	abstract void method9625(@OriginalArg(0) Class77_Sub12_Sub1 arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2);

	@OriginalMember(owner = "client!hr", name = "aw", descriptor = "(Lclient!aqz;Lclient!oi;)V")
	abstract void method9626(@OriginalArg(0) Class77_Sub12_Sub1 arg0, @OriginalArg(1) Class442 arg1);

	@OriginalMember(owner = "client!hr", name = "ap", descriptor = "(Lclient!aqz;Lclient!oi;)V")
	abstract void method9627(@OriginalArg(0) Class77_Sub12_Sub1 arg0, @OriginalArg(1) Class442 arg1);

	@OriginalMember(owner = "client!hr", name = "bc", descriptor = "(Lclient!aqz;[FI)V")
	abstract void method9628(@OriginalArg(0) Class77_Sub12_Sub1 arg0, @OriginalArg(1) float[] arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!hr", name = "at", descriptor = "(I[FI)V")
	abstract void method9629(@OriginalArg(0) int arg0, @OriginalArg(1) float[] arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!hr", name = "bj", descriptor = "(Lclient!aqz;[FI)V")
	abstract void method9630(@OriginalArg(0) Class77_Sub12_Sub1 arg0, @OriginalArg(1) float[] arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!hr", name = "bl", descriptor = "(Lclient!aqz;ILclient!ls;)V")
	abstract void method9631(@OriginalArg(0) Class77_Sub12_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Interface42 arg2);

	@OriginalMember(owner = "client!hr", name = "bb", descriptor = "(Lclient!aqz;ILclient!ls;)V")
	abstract void method9632(@OriginalArg(0) Class77_Sub12_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Interface42 arg2);

	@OriginalMember(owner = "client!hr", name = "ak", descriptor = "(Lclient!aqz;Lclient!oi;)V")
	abstract void method9633(@OriginalArg(0) Class77_Sub12_Sub1 arg0, @OriginalArg(1) Class442 arg1);

	@OriginalMember(owner = "client!hr", name = "m", descriptor = "(Lclient!aqz;F)V")
	abstract void method9634(@OriginalArg(0) Class77_Sub12_Sub1 arg0, @OriginalArg(1) float arg1);

	@OriginalMember(owner = "client!hr", name = "bx", descriptor = "(IFFF)V")
	abstract void method9635(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3);

	@OriginalMember(owner = "client!hr", name = "bw", descriptor = "(IFFF)V")
	abstract void method9636(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3);
}
