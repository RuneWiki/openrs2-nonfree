package com.jagex;

import java.io.EOFException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ane")
public class Class166_Sub29 extends Class166 {

	@OriginalMember(owner = "client!ane", name = "l", descriptor = "I")
	public static final int anInt2259 = 0;

	@OriginalMember(owner = "client!ane", name = "w", descriptor = "I")
	public static final int anInt2260 = 1;

	@OriginalMember(owner = "client!ane", name = "<init>", descriptor = "(Lclient!ali;)V", line = 12)
	public Class166_Sub29(@OriginalArg(0) Class93_Sub36 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!ane", name = "<init>", descriptor = "(ILclient!ali;)V", line = 16)
	public Class166_Sub29(@OriginalArg(0) int arg0, @OriginalArg(1) Class93_Sub36 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!ane", name = "o", descriptor = "(I)V", line = 20)
	public void method16059() {
		if (this.anInt2379 * 960141055 < 0 || this.anInt2379 * 960141055 > 1) {
			this.anInt2379 = this.method16542() * -88839937;
		}
	}

	@OriginalMember(owner = "client!ane", name = "x", descriptor = "()V", line = 20)
	public void method16060() {
		if (this.anInt2379 * 960141055 < 0 || this.anInt2379 * 960141055 > 1) {
			this.anInt2379 = this.method16542() * -88839937;
		}
	}

	@OriginalMember(owner = "client!ane", name = "q", descriptor = "()V", line = 20)
	public void method16061() {
		if (this.anInt2379 * 960141055 < 0 || this.anInt2379 * 960141055 > 1) {
			this.anInt2379 = this.method16542() * -88839937;
		}
	}

	@OriginalMember(owner = "client!ane", name = "b", descriptor = "()V", line = 20)
	public void method16062() {
		if (this.anInt2379 * 960141055 < 0 || this.anInt2379 * 960141055 > 1) {
			this.anInt2379 = this.method16542() * -88839937;
		}
	}

	@OriginalMember(owner = "client!ane", name = "u", descriptor = "()I", line = 24)
	@Override
	int method16548() {
		return 1;
	}

	@OriginalMember(owner = "client!ane", name = "e", descriptor = "(B)I", line = 24)
	@Override
	int method16542() {
		return 1;
	}

	@OriginalMember(owner = "client!ane", name = "f", descriptor = "()I", line = 24)
	@Override
	int method16541() {
		return 1;
	}

	@OriginalMember(owner = "client!ane", name = "l", descriptor = "()I", line = 24)
	@Override
	int method16547() {
		return 1;
	}

	@OriginalMember(owner = "client!ane", name = "w", descriptor = "()I", line = 24)
	@Override
	int method16550() {
		return 1;
	}

	@OriginalMember(owner = "client!ane", name = "s", descriptor = "(I)Z", line = 28)
	public boolean method16057() {
		return Class136.method10214(this.aClass93_Sub36_49.aClass166_Sub4_2.method15424());
	}

	@OriginalMember(owner = "client!ane", name = "h", descriptor = "()Z", line = 28)
	public boolean method16063() {
		return Class136.method10214(this.aClass93_Sub36_49.aClass166_Sub4_2.method15424());
	}

	@OriginalMember(owner = "client!ane", name = "a", descriptor = "()Z", line = 28)
	public boolean method16064() {
		return Class136.method10214(this.aClass93_Sub36_49.aClass166_Sub4_2.method15424());
	}

	@OriginalMember(owner = "client!ane", name = "n", descriptor = "(II)I", line = 33)
	@Override
	public int method16543(@OriginalArg(0) int arg0) {
		return Class136.method10214(this.aClass93_Sub36_49.aClass166_Sub4_2.method15424()) ? 1 : 3;
	}

	@OriginalMember(owner = "client!ane", name = "p", descriptor = "(I)I", line = 33)
	@Override
	public int method16540(@OriginalArg(0) int arg0) {
		return Class136.method10214(this.aClass93_Sub36_49.aClass166_Sub4_2.method15424()) ? 1 : 3;
	}

	@OriginalMember(owner = "client!ane", name = "z", descriptor = "(I)I", line = 33)
	@Override
	public int method16549(@OriginalArg(0) int arg0) {
		return Class136.method10214(this.aClass93_Sub36_49.aClass166_Sub4_2.method15424()) ? 1 : 3;
	}

	@OriginalMember(owner = "client!ane", name = "d", descriptor = "(I)V", line = 38)
	@Override
	void method16546(@OriginalArg(0) int arg0) {
		this.anInt2379 = arg0 * -88839937;
	}

	@OriginalMember(owner = "client!ane", name = "k", descriptor = "(II)V", line = 38)
	@Override
	void method16545(@OriginalArg(0) int arg0) {
		this.anInt2379 = arg0 * -88839937;
	}

	@OriginalMember(owner = "client!ane", name = "c", descriptor = "(I)V", line = 38)
	@Override
	void method16551(@OriginalArg(0) int arg0) {
		this.anInt2379 = arg0 * -88839937;
	}

	@OriginalMember(owner = "client!ane", name = "y", descriptor = "(I)I", line = 42)
	public int method16058() {
		return this.anInt2379 * 960141055;
	}

	@OriginalMember(owner = "client!ane", name = "g", descriptor = "()I", line = 42)
	public int method16065() {
		return this.anInt2379 * 960141055;
	}

	@OriginalMember(owner = "client!ane", name = "i", descriptor = "()I", line = 42)
	public int method16066() {
		return this.anInt2379 * 960141055;
	}

	@OriginalMember(owner = "client!ane", name = "f", descriptor = "(I)Lclient!h;", line = 69)
	public static Class306 method16069() {
		@Pc(1) Class38 local1 = null;
		@Pc(65) Class306 local65;
		try {
			local1 = Class166_Sub18.method15743("3", client.aClass702_4.aString241, false);
			@Pc(14) byte[] local14 = new byte[(int) local1.method735()];
			@Pc(30) int local30;
			for (@Pc(16) int local16 = 0; local16 < local14.length; local16 += local30) {
				local30 = local1.method726(local14, local16, local14.length - local16);
				if (local30 == -1) {
					throw new EOFException();
				}
			}
			@Pc(50) Class306 local50 = new Class306(new Class93_Sub41(local14));
			return local50;
		} catch (@Pc(61) Exception local61) {
			local65 = new Class306();
		} finally {
			try {
				if (local1 != null) {
					local1.method732();
				}
			} catch (@Pc(84) Exception local84) {
			}
		}
		return local65;
	}

	@OriginalMember(owner = "client!ane", name = "sp", descriptor = "(Lclient!yf;I)V", line = 8257)
	static final void method16070(@OriginalArg(0) Class681 arg0) {
		@Pc(8) Class677 local8 = arg0.aBoolean875 ? arg0.aClass677_2 : arg0.aClass677_1;
		@Pc(11) Class312 local11 = local8.aClass312_13;
		@Pc(13) int local13 = -1;
		@Pc(15) int local15 = -1;
		@Pc(20) Class327 local20 = local11.method26878(Class694.aClass104_14);
		if (local20 != null) {
			local13 = local20.anInt4140 * -814657375;
			local15 = local20.anInt4141 * -764381181;
		}
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = local13;
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = local15;
	}

	@OriginalMember(owner = "client!ane", name = "auv", descriptor = "(Lclient!yf;S)V", line = 13365)
	static final void method16067(@OriginalArg(0) Class681 arg0) {
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = Class51.aClass93_Sub36_1.aClass166_Sub12_1.method15611();
	}

	@OriginalMember(owner = "client!ane", name = "bao", descriptor = "(Lclient!yf;I)V", line = 14348)
	static final void method16068(@OriginalArg(0) Class681 arg0) {
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = 0;
	}
}
