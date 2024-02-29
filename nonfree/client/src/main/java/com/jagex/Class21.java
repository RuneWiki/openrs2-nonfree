package com.jagex;

import java.nio.ByteBuffer;
import java.util.Arrays;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aav")
public class Class21 {

	@OriginalMember(owner = "client!aav", name = "p", descriptor = "Lclient!aav;")
	static final Class21 aClass21_1 = new Class21();

	@OriginalMember(owner = "client!aav", name = "c", descriptor = "Lclient!aav;")
	static final Class21 aClass21_4 = new Class21();

	@OriginalMember(owner = "client!aav", name = "v", descriptor = "Lclient!aav;")
	static final Class21 aClass21_3 = new Class21();

	@OriginalMember(owner = "client!aav", name = "l", descriptor = "Lclient!aav;")
	static final Class21 aClass21_2 = new Class21();

	@OriginalMember(owner = "client!aav", name = "<init>", descriptor = "()V", line = 9)
	Class21() {
	}

	@OriginalMember(owner = "client!aav", name = "c", descriptor = "(Ljava/lang/Object;ZB)[B", line = 25)
	public static byte[] method417(@OriginalArg(0) Object arg0, @OriginalArg(1) boolean arg1) {
		if (arg0 == null) {
			return null;
		} else if (arg0 instanceof byte[]) {
			@Pc(11) byte[] local11 = (byte[]) arg0;
			return arg1 ? Arrays.copyOf(local11, local11.length) : local11;
		} else if (arg0 instanceof ByteBuffer) {
			@Pc(26) ByteBuffer local26 = (ByteBuffer) arg0;
			@Pc(30) byte[] local30 = new byte[local26.capacity()];
			local26.position(0);
			local26.get(local30);
			return local30;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!aav", name = "v", descriptor = "(Lclient!pw;ILclient!aac;I)Lclient!aar;", line = 28)
	public static Class17 method418(@OriginalArg(0) Class478 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Interface1 arg2) {
		@Pc(4) byte[] local4 = arg0.method29745(arg1);
		return local4 == null ? null : new Class17(local4, arg2);
	}

	@OriginalMember(owner = "client!aav", name = "el", descriptor = "(Lclient!gm;Lclient!gh;Lclient!yf;S)V", line = 5353)
	static final void method419(@OriginalArg(0) Class277 arg0, @OriginalArg(1) Class273 arg1, @OriginalArg(2) Class665 arg2) {
		arg0.anInt3887 = arg2.anIntArray536[(arg2.anInt5784 -= 308999563) * 2088438307] * 13448961;
		Class461.method29531(arg0);
	}

	@OriginalMember(owner = "client!aav", name = "aqx", descriptor = "(Lclient!yf;B)V", line = 12331)
	static final void method420(@OriginalArg(0) Class665 arg0) {
		arg0.anInt5784 -= 308999563;
	}
}
