package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!amk")
public class Class166_Sub11 extends Class166 {

	@OriginalMember(owner = "client!amk", name = "w", descriptor = "I")
	static final int anInt2136 = 5;

	@OriginalMember(owner = "client!amk", name = "l", descriptor = "I")
	static final int anInt2137 = 300;

	@OriginalMember(owner = "client!amk", name = "u", descriptor = "I")
	static final int anInt2138 = 30;

	@OriginalMember(owner = "client!amk", name = "<init>", descriptor = "(Lclient!ali;)V", line = 12)
	public Class166_Sub11(@OriginalArg(0) Class93_Sub36 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!amk", name = "<init>", descriptor = "(ILclient!ali;)V", line = 16)
	public Class166_Sub11(@OriginalArg(0) int arg0, @OriginalArg(1) Class93_Sub36 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!amk", name = "y", descriptor = "()V", line = 20)
	public void method15587() {
		this.anInt2379 = Math.min(Math.max(this.anInt2379 * 960141055, 5), 300) * -88839937;
	}

	@OriginalMember(owner = "client!amk", name = "o", descriptor = "(I)V", line = 20)
	public void method15588() {
		this.anInt2379 = Math.min(Math.max(this.anInt2379 * 960141055, 5), 300) * -88839937;
	}

	@OriginalMember(owner = "client!amk", name = "q", descriptor = "()V", line = 20)
	public void method15589() {
		this.anInt2379 = Math.min(Math.max(this.anInt2379 * 960141055, 5), 300) * -88839937;
	}

	@OriginalMember(owner = "client!amk", name = "e", descriptor = "(B)I", line = 24)
	@Override
	int method16542() {
		return 30;
	}

	@OriginalMember(owner = "client!amk", name = "f", descriptor = "()I", line = 24)
	@Override
	int method16541() {
		return 30;
	}

	@OriginalMember(owner = "client!amk", name = "w", descriptor = "()I", line = 24)
	@Override
	int method16550() {
		return 30;
	}

	@OriginalMember(owner = "client!amk", name = "l", descriptor = "()I", line = 24)
	@Override
	int method16547() {
		return 30;
	}

	@OriginalMember(owner = "client!amk", name = "u", descriptor = "()I", line = 24)
	@Override
	int method16548() {
		return 30;
	}

	@OriginalMember(owner = "client!amk", name = "n", descriptor = "(II)I", line = 28)
	@Override
	int method16543(@OriginalArg(0) int arg0) {
		return 3;
	}

	@OriginalMember(owner = "client!amk", name = "p", descriptor = "(I)I", line = 28)
	@Override
	int method16540(@OriginalArg(0) int arg0) {
		return 3;
	}

	@OriginalMember(owner = "client!amk", name = "z", descriptor = "(I)I", line = 28)
	@Override
	int method16549(@OriginalArg(0) int arg0) {
		return 3;
	}

	@OriginalMember(owner = "client!amk", name = "k", descriptor = "(II)V", line = 32)
	@Override
	void method16545(@OriginalArg(0) int arg0) {
		this.anInt2379 = arg0 * -88839937;
	}

	@OriginalMember(owner = "client!amk", name = "d", descriptor = "(I)V", line = 32)
	@Override
	void method16546(@OriginalArg(0) int arg0) {
		this.anInt2379 = arg0 * -88839937;
	}

	@OriginalMember(owner = "client!amk", name = "c", descriptor = "(I)V", line = 32)
	@Override
	void method16551(@OriginalArg(0) int arg0) {
		this.anInt2379 = arg0 * -88839937;
	}

	@OriginalMember(owner = "client!amk", name = "s", descriptor = "(I)I", line = 36)
	public int method15590() {
		return this.anInt2379 * 960141055;
	}

	@OriginalMember(owner = "client!amk", name = "x", descriptor = "()I", line = 36)
	public int method15591() {
		return this.anInt2379 * 960141055;
	}

	@OriginalMember(owner = "client!amk", name = "b", descriptor = "()I", line = 36)
	public int method15592() {
		return this.anInt2379 * 960141055;
	}

	@OriginalMember(owner = "client!amk", name = "h", descriptor = "()I", line = 36)
	public int method15593() {
		return this.anInt2379 * 960141055;
	}

	@OriginalMember(owner = "client!amk", name = "il", descriptor = "(IIIIIZZI)V", line = 6283)
	static final void method15594(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) boolean arg6) {
		if (!arg5 && (arg1 < 512 || arg2 < 512 || arg1 > (client.aClass532_1.method30444() - 2) * 512 || arg2 > (client.aClass532_1.method30474() - 2) * 512)) {
			@Pc(27) float[] local27 = client.aFloatArray93;
			client.aFloatArray93[1] = -1.0F;
			local27[0] = -1.0F;
			return;
		}
		@Pc(44) int local44 = Class305.method26801(arg1, arg2, arg0) - arg4;
		client.aClass470_51.method29364(Class694.aClass104_14.method20517());
		client.aClass470_51.method29387((float) arg3, 0.0F, 0.0F);
		Class694.aClass104_14.method20516(client.aClass470_51);
		if (arg5) {
			Class694.aClass104_14.method20824((float) arg1, (float) local44, (float) arg2, client.aFloatArray93);
		} else {
			Class694.aClass104_14.method20806((float) arg1, (float) local44, (float) arg2, client.aFloatArray93);
		}
		client.aClass470_51.method29387((float) -arg3, 0.0F, 0.0F);
		Class694.aClass104_14.method20516(client.aClass470_51);
		if (!arg6) {
			client.aFloatArray93[0] -= client.anInt3432 * 706492895;
			client.aFloatArray93[1] -= client.anInt3568 * 1300190535;
		}
	}
}
