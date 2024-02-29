package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!atd")
public class Class104_Sub1_Sub1_Sub4 extends Class104_Sub1_Sub1 {

	@OriginalMember(owner = "client!atd", name = "h", descriptor = "Lclient!sj;")
	Class536 aClass536_1;

	@OriginalMember(owner = "client!atd", name = "<init>", descriptor = "(Lclient!tk;Lclient!sj;IIIII)V", line = 18)
	Class104_Sub1_Sub1_Sub4(@OriginalArg(0) Class556 arg0, @OriginalArg(1) Class536 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg0, arg2, arg3, arg4, arg5, arg6, arg4 >> 9, arg4 >> 9, arg6 >> 9, arg6 >> 9, false, (byte) 0);
		this.aClass536_1 = arg1;
	}

	@OriginalMember(owner = "client!atd", name = "fp", descriptor = "(Lclient!dx;II)Z", line = 23)
	@Override
	boolean method24159(@OriginalArg(0) Class86 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		return false;
	}

	@OriginalMember(owner = "client!atd", name = "fb", descriptor = "(Lclient!dx;IIB)Z", line = 23)
	@Override
	boolean method24137(@OriginalArg(0) Class86 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		return false;
	}

	@OriginalMember(owner = "client!atd", name = "fg", descriptor = "(Lclient!dx;II)Z", line = 23)
	@Override
	boolean method24163(@OriginalArg(0) Class86 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		return false;
	}

	@OriginalMember(owner = "client!atd", name = "fa", descriptor = "(Lclient!dx;II)Z", line = 23)
	@Override
	boolean method24158(@OriginalArg(0) Class86 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		return false;
	}

	@OriginalMember(owner = "client!atd", name = "fy", descriptor = "(Lclient!dx;II)Z", line = 23)
	@Override
	boolean method24165(@OriginalArg(0) Class86 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		return false;
	}

	@OriginalMember(owner = "client!atd", name = "fu", descriptor = "(B)Z", line = 27)
	@Override
	boolean method24138() {
		return false;
	}

	@OriginalMember(owner = "client!atd", name = "fx", descriptor = "()Z", line = 27)
	@Override
	boolean method24148() {
		return false;
	}

	@OriginalMember(owner = "client!atd", name = "co", descriptor = "()Z", line = 31)
	@Override
	boolean method24149() {
		return true;
	}

	@OriginalMember(owner = "client!atd", name = "ci", descriptor = "()Z", line = 31)
	@Override
	boolean method24174() {
		return true;
	}

	@OriginalMember(owner = "client!atd", name = "bz", descriptor = "(I)Z", line = 31)
	@Override
	boolean method24139() {
		return true;
	}

	@OriginalMember(owner = "client!atd", name = "bu", descriptor = "(I)Z", line = 35)
	@Override
	boolean method24140() {
		return false;
	}

	@OriginalMember(owner = "client!atd", name = "cn", descriptor = "()Z", line = 35)
	@Override
	boolean method24162() {
		return false;
	}

	@OriginalMember(owner = "client!atd", name = "cq", descriptor = "()Z", line = 35)
	@Override
	boolean method24154() {
		return false;
	}

	@OriginalMember(owner = "client!atd", name = "fo", descriptor = "(Lclient!dx;Lclient!alc;IIIZI)V", line = 38)
	@Override
	void method24141(@OriginalArg(0) Class86 arg0, @OriginalArg(1) Class104_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
	}

	@OriginalMember(owner = "client!atd", name = "fr", descriptor = "(Lclient!dx;Lclient!alc;IIIZ)V", line = 38)
	@Override
	void method24161(@OriginalArg(0) Class86 arg0, @OriginalArg(1) Class104_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
	}

	@OriginalMember(owner = "client!atd", name = "fc", descriptor = "(Lclient!dx;Lclient!alc;IIIZ)V", line = 38)
	@Override
	void method24166(@OriginalArg(0) Class86 arg0, @OriginalArg(1) Class104_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
	}

	@OriginalMember(owner = "client!atd", name = "gr", descriptor = "()V", line = 39)
	@Override
	void method24136() {
	}

	@OriginalMember(owner = "client!atd", name = "fd", descriptor = "(I)V", line = 39)
	@Override
	void method24142() {
	}

	@OriginalMember(owner = "client!atd", name = "gj", descriptor = "()V", line = 39)
	@Override
	void method24150() {
	}

	@OriginalMember(owner = "client!atd", name = "gi", descriptor = "()V", line = 39)
	@Override
	void method24164() {
	}

	@OriginalMember(owner = "client!atd", name = "ff", descriptor = "(Lclient!dx;I)Lclient!te;", line = 42)
	@Override
	Class551 method24143(@OriginalArg(0) Class86 arg0) {
		if (this.aClass536_1.aClass84_8 == null) {
			return null;
		}
		@Pc(8) Class455 local8 = arg0.method20370();
		@Pc(11) Class455 local11 = this.method24094();
		@Pc(14) Class453 local14 = this.method24085();
		local8.method29387(local11);
		@Pc(38) Class567 local38 = this.aClass556_23.aClass567ArrayArrayArray1[this.aByte100][(int) local14.aClass447_61.aFloat277 >> 9][(int) local14.aClass447_61.aFloat278 >> 9];
		if (local38 != null && local38.aClass104_Sub1_Sub4_1 != null) {
			local8.method29436(0.0F, (float) -local38.aClass104_Sub1_Sub4_1.aShort99, 0.0F);
		}
		this.aClass536_1.aClass84_8.method6813(local8, null, 0);
		return null;
	}

	@OriginalMember(owner = "client!atd", name = "gt", descriptor = "(Lclient!dx;)Lclient!te;", line = 42)
	@Override
	Class551 method24167(@OriginalArg(0) Class86 arg0) {
		if (this.aClass536_1.aClass84_8 == null) {
			return null;
		}
		@Pc(8) Class455 local8 = arg0.method20370();
		@Pc(11) Class455 local11 = this.method24094();
		@Pc(14) Class453 local14 = this.method24085();
		local8.method29387(local11);
		@Pc(38) Class567 local38 = this.aClass556_23.aClass567ArrayArrayArray1[this.aByte100][(int) local14.aClass447_61.aFloat277 >> 9][(int) local14.aClass447_61.aFloat278 >> 9];
		if (local38 != null && local38.aClass104_Sub1_Sub4_1 != null) {
			local8.method29436(0.0F, (float) -local38.aClass104_Sub1_Sub4_1.aShort99, 0.0F);
		}
		this.aClass536_1.aClass84_8.method6813(local8, null, 0);
		return null;
	}

	@OriginalMember(owner = "client!atd", name = "fs", descriptor = "(Lclient!dx;I)V", line = 53)
	@Override
	void method24153(@OriginalArg(0) Class86 arg0) {
	}

	@OriginalMember(owner = "client!atd", name = "fn", descriptor = "(Lclient!dx;)V", line = 53)
	@Override
	void method24156(@OriginalArg(0) Class86 arg0) {
	}

	@OriginalMember(owner = "client!atd", name = "fz", descriptor = "(Lclient!dx;S)Lclient!tu;", line = 56)
	@Override
	public Class563 method24144(@OriginalArg(0) Class86 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!atd", name = "fj", descriptor = "(Lclient!dx;)Lclient!tu;", line = 56)
	@Override
	public Class563 method24157(@OriginalArg(0) Class86 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!atd", name = "fh", descriptor = "(Lclient!dx;)Lclient!tu;", line = 56)
	@Override
	public Class563 method24155(@OriginalArg(0) Class86 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!atd", name = "bt", descriptor = "(I)I", line = 60)
	@Override
	public int method24160() {
		return this.aClass536_1.aClass84_8 == null ? 0 : this.aClass536_1.aClass84_8.method6824();
	}

	@OriginalMember(owner = "client!atd", name = "cy", descriptor = "()I", line = 60)
	@Override
	public int method24152() {
		return this.aClass536_1.aClass84_8 == null ? 0 : this.aClass536_1.aClass84_8.method6824();
	}

	@OriginalMember(owner = "client!atd", name = "cs", descriptor = "()I", line = 60)
	@Override
	public int method24151() {
		return this.aClass536_1.aClass84_8 == null ? 0 : this.aClass536_1.aClass84_8.method6824();
	}
}
