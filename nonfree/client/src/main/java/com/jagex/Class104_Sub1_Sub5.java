package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!arz")
public abstract class Class104_Sub1_Sub5 extends Class104_Sub1 {

	@OriginalMember(owner = "client!arz", name = "<init>", descriptor = "(Lclient!tk;IIIII)V", line = 8)
	Class104_Sub1_Sub5(@OriginalArg(0) Class556 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(arg0);
		this.aByte100 = (byte) arg4;
		this.aByte99 = (byte) arg5;
		this.method24102(new Class447((float) arg1, (float) arg2, (float) arg3));
	}

	@OriginalMember(owner = "client!arz", name = "gc", descriptor = "([Lclient!ajv;I)I", line = 15)
	@Override
	int method24145(@OriginalArg(0) Class77_Sub22[] arg0) {
		@Pc(3) Class447 local3 = this.method24085().aClass447_61;
		return this.method24126((int) local3.aFloat277 >> this.aClass556_23.anInt5243 * 941710601, (int) local3.aFloat278 >> this.aClass556_23.anInt5243 * 941710601, arg0);
	}

	@OriginalMember(owner = "client!arz", name = "gx", descriptor = "([Lclient!ajv;)I", line = 15)
	@Override
	int method24169(@OriginalArg(0) Class77_Sub22[] arg0) {
		@Pc(3) Class447 local3 = this.method24085().aClass447_61;
		return this.method24126((int) local3.aFloat277 >> this.aClass556_23.anInt5243 * 941710601, (int) local3.aFloat278 >> this.aClass556_23.anInt5243 * 941710601, arg0);
	}

	@OriginalMember(owner = "client!arz", name = "gy", descriptor = "(Lclient!dx;I)Z", line = 20)
	@Override
	boolean method24146(@OriginalArg(0) Class86 arg0) {
		@Pc(3) Class447 local3 = this.method24085().aClass447_61;
		@Pc(28) Class559 local28 = this.aClass556_23.method31194(this.aByte99, (int) local3.aFloat277 >> this.aClass556_23.anInt5243 * 941710601, (int) local3.aFloat278 >> this.aClass556_23.anInt5243 * 941710601);
		return local28 != null && local28.aClass104_Sub1_Sub1_1.aBoolean545 ? this.aClass556_23.aClass553_1.method31057(this.aByte99, (int) local3.aFloat277 >> this.aClass556_23.anInt5243 * 941710601, (int) local3.aFloat278 >> this.aClass556_23.anInt5243 * 941710601, local28.aClass104_Sub1_Sub1_1.method24160() + this.method24160()) : this.aClass556_23.aClass553_1.method31050(this.aByte99, (int) local3.aFloat277 >> this.aClass556_23.anInt5243 * 941710601, (int) local3.aFloat278 >> this.aClass556_23.anInt5243 * 941710601);
	}

	@OriginalMember(owner = "client!arz", name = "gv", descriptor = "(Lclient!dx;)Z", line = 20)
	@Override
	boolean method24170(@OriginalArg(0) Class86 arg0) {
		@Pc(3) Class447 local3 = this.method24085().aClass447_61;
		@Pc(28) Class559 local28 = this.aClass556_23.method31194(this.aByte99, (int) local3.aFloat277 >> this.aClass556_23.anInt5243 * 941710601, (int) local3.aFloat278 >> this.aClass556_23.anInt5243 * 941710601);
		return local28 != null && local28.aClass104_Sub1_Sub1_1.aBoolean545 ? this.aClass556_23.aClass553_1.method31057(this.aByte99, (int) local3.aFloat277 >> this.aClass556_23.anInt5243 * 941710601, (int) local3.aFloat278 >> this.aClass556_23.anInt5243 * 941710601, local28.aClass104_Sub1_Sub1_1.method24160() + this.method24160()) : this.aClass556_23.aClass553_1.method31050(this.aByte99, (int) local3.aFloat277 >> this.aClass556_23.anInt5243 * 941710601, (int) local3.aFloat278 >> this.aClass556_23.anInt5243 * 941710601);
	}

	@OriginalMember(owner = "client!arz", name = "gd", descriptor = "(Lclient!dx;)Z", line = 20)
	@Override
	boolean method24171(@OriginalArg(0) Class86 arg0) {
		@Pc(3) Class447 local3 = this.method24085().aClass447_61;
		@Pc(28) Class559 local28 = this.aClass556_23.method31194(this.aByte99, (int) local3.aFloat277 >> this.aClass556_23.anInt5243 * 941710601, (int) local3.aFloat278 >> this.aClass556_23.anInt5243 * 941710601);
		return local28 != null && local28.aClass104_Sub1_Sub1_1.aBoolean545 ? this.aClass556_23.aClass553_1.method31057(this.aByte99, (int) local3.aFloat277 >> this.aClass556_23.anInt5243 * 941710601, (int) local3.aFloat278 >> this.aClass556_23.anInt5243 * 941710601, local28.aClass104_Sub1_Sub1_1.method24160() + this.method24160()) : this.aClass556_23.aClass553_1.method31050(this.aByte99, (int) local3.aFloat277 >> this.aClass556_23.anInt5243 * 941710601, (int) local3.aFloat278 >> this.aClass556_23.anInt5243 * 941710601);
	}

	@OriginalMember(owner = "client!arz", name = "gn", descriptor = "(Lclient!dx;)Z", line = 20)
	@Override
	boolean method24172(@OriginalArg(0) Class86 arg0) {
		@Pc(3) Class447 local3 = this.method24085().aClass447_61;
		@Pc(28) Class559 local28 = this.aClass556_23.method31194(this.aByte99, (int) local3.aFloat277 >> this.aClass556_23.anInt5243 * 941710601, (int) local3.aFloat278 >> this.aClass556_23.anInt5243 * 941710601);
		return local28 != null && local28.aClass104_Sub1_Sub1_1.aBoolean545 ? this.aClass556_23.aClass553_1.method31057(this.aByte99, (int) local3.aFloat277 >> this.aClass556_23.anInt5243 * 941710601, (int) local3.aFloat278 >> this.aClass556_23.anInt5243 * 941710601, local28.aClass104_Sub1_Sub1_1.method24160() + this.method24160()) : this.aClass556_23.aClass553_1.method31050(this.aByte99, (int) local3.aFloat277 >> this.aClass556_23.anInt5243 * 941710601, (int) local3.aFloat278 >> this.aClass556_23.anInt5243 * 941710601);
	}

	@OriginalMember(owner = "client!arz", name = "gz", descriptor = "(B)Z", line = 27)
	@Override
	boolean method24147() {
		@Pc(3) Class447 local3 = this.method24085().aClass447_61;
		return this.aClass556_23.aBooleanArrayArray14[((int) local3.aFloat277 >> this.aClass556_23.anInt5243 * 941710601) - this.aClass556_23.anInt5254 * -380604831 + this.aClass556_23.anInt5259 * -1213435377][this.aClass556_23.anInt5259 * -1213435377 + (((int) local3.aFloat278 >> this.aClass556_23.anInt5243 * 941710601) - this.aClass556_23.anInt5258 * -1709472547)];
	}

	@OriginalMember(owner = "client!arz", name = "gs", descriptor = "()Z", line = 27)
	@Override
	boolean method24173() {
		@Pc(3) Class447 local3 = this.method24085().aClass447_61;
		return this.aClass556_23.aBooleanArrayArray14[((int) local3.aFloat277 >> this.aClass556_23.anInt5243 * 941710601) - this.aClass556_23.anInt5254 * -380604831 + this.aClass556_23.anInt5259 * -1213435377][this.aClass556_23.anInt5259 * -1213435377 + (((int) local3.aFloat278 >> this.aClass556_23.anInt5243 * 941710601) - this.aClass556_23.anInt5258 * -1709472547)];
	}

	@OriginalMember(owner = "client!arz", name = "gg", descriptor = "()Z", line = 27)
	@Override
	boolean method24168() {
		@Pc(3) Class447 local3 = this.method24085().aClass447_61;
		return this.aClass556_23.aBooleanArrayArray14[((int) local3.aFloat277 >> this.aClass556_23.anInt5243 * 941710601) - this.aClass556_23.anInt5254 * -380604831 + this.aClass556_23.anInt5259 * -1213435377][this.aClass556_23.anInt5259 * -1213435377 + (((int) local3.aFloat278 >> this.aClass556_23.anInt5243 * 941710601) - this.aClass556_23.anInt5258 * -1709472547)];
	}

	@OriginalMember(owner = "client!arz", name = "fu", descriptor = "(B)Z", line = 32)
	@Override
	final boolean method24138() {
		return false;
	}

	@OriginalMember(owner = "client!arz", name = "fx", descriptor = "()Z", line = 32)
	@Override
	final boolean method24148() {
		return false;
	}

	@OriginalMember(owner = "client!arz", name = "fo", descriptor = "(Lclient!dx;Lclient!alc;IIIZI)V", line = 36)
	@Override
	final void method24141(@OriginalArg(0) Class86 arg0, @OriginalArg(1) Class104_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!arz", name = "fr", descriptor = "(Lclient!dx;Lclient!alc;IIIZ)V", line = 36)
	@Override
	final void method24161(@OriginalArg(0) Class86 arg0, @OriginalArg(1) Class104_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!arz", name = "fc", descriptor = "(Lclient!dx;Lclient!alc;IIIZ)V", line = 36)
	@Override
	final void method24166(@OriginalArg(0) Class86 arg0, @OriginalArg(1) Class104_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!arz", name = "gr", descriptor = "()V", line = 40)
	@Override
	final void method24136() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!arz", name = "fd", descriptor = "(I)V", line = 40)
	@Override
	final void method24142() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!arz", name = "gj", descriptor = "()V", line = 40)
	@Override
	final void method24150() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!arz", name = "gi", descriptor = "()V", line = 40)
	@Override
	final void method24164() {
		throw new IllegalStateException();
	}
}
