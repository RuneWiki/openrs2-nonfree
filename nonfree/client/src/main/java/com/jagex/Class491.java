package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ql")
public class Class491 {

	@OriginalMember(owner = "client!ql", name = "p", descriptor = "Lclient!ql;")
	static final Class491 aClass491_10 = new Class491(0);

	@OriginalMember(owner = "client!ql", name = "c", descriptor = "Lclient!ql;")
	public static final Class491 aClass491_7 = new Class491(1);

	@OriginalMember(owner = "client!ql", name = "v", descriptor = "Lclient!ql;")
	static final Class491 aClass491_2 = new Class491(2);

	@OriginalMember(owner = "client!ql", name = "l", descriptor = "Lclient!ql;")
	public static final Class491 aClass491_4 = new Class491(3);

	@OriginalMember(owner = "client!ql", name = "y", descriptor = "Lclient!ql;")
	public static final Class491 aClass491_5 = new Class491(4);

	@OriginalMember(owner = "client!ql", name = "w", descriptor = "Lclient!ql;")
	public static final Class491 aClass491_3 = new Class491(5);

	@OriginalMember(owner = "client!ql", name = "t", descriptor = "Lclient!ql;")
	static final Class491 aClass491_6 = new Class491(6);

	@OriginalMember(owner = "client!ql", name = "q", descriptor = "Lclient!ql;")
	static final Class491 aClass491_8 = new Class491(7);

	@OriginalMember(owner = "client!ql", name = "x", descriptor = "Lclient!ql;")
	static final Class491 aClass491_9 = new Class491(8);

	@OriginalMember(owner = "client!ql", name = "d", descriptor = "I")
	final int anInt5051;

	@OriginalMember(owner = "client!ql", name = "<init>", descriptor = "(I)V", line = 16)
	Class491(@OriginalArg(0) int arg0) {
		this.anInt5051 = arg0 * 1891043161;
	}

	@OriginalMember(owner = "client!ql", name = "l", descriptor = "(Lclient!sp;Lclient!sp;B)V", line = 40)
	public static void method30029(@OriginalArg(0) Class131 arg0, @OriginalArg(1) Class131 arg1) {
		if (arg0.aClass131_17 != null) {
			arg0.method23056();
		}
		arg0.aClass131_17 = arg1;
		arg0.aClass131_18 = arg1.aClass131_18;
		arg0.aClass131_17.aClass131_18 = arg0;
		arg0.aClass131_18.aClass131_17 = arg0;
	}

	@OriginalMember(owner = "client!ql", name = "jv", descriptor = "(Lclient!gm;Lclient!gh;Lclient!yf;I)V", line = 6151)
	static final void method30030(@OriginalArg(0) Class277 arg0, @OriginalArg(1) Class273 arg1, @OriginalArg(2) Class665 arg2) {
		arg0.aString180 = (String) arg2.anObjectArray45[(arg2.anInt5781 -= 1460193483) * 1485266147];
	}

	@OriginalMember(owner = "client!ql", name = "qk", descriptor = "(Lclient!yf;B)V", line = 7502)
	static final void method30031(@OriginalArg(0) Class665 arg0) {
		@Pc(8) Class662 local8 = arg0.aBoolean857 ? arg0.aClass662_1 : arg0.aClass662_2;
		@Pc(11) Class277 local11 = local8.aClass277_12;
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = local11.anInt3884 * 1943720095;
	}

	@OriginalMember(owner = "client!ql", name = "axy", descriptor = "(Lclient!yf;B)V", line = 13445)
	static final void method30032(@OriginalArg(0) Class665 arg0) {
		@Pc(3) Class104_Sub1_Sub1_Sub1_Sub1 local3 = (Class104_Sub1_Sub1_Sub1_Sub1) arg0.aClass104_Sub1_Sub1_Sub1_4;
		@Pc(6) Class333 local6 = local3.aClass333_1;
		if (local6.anIntArray437 != null) {
			local6 = local6.method27642(Class55.aClass124_1, Class55.aClass124_1);
		}
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = local6 == null ? 0 : 1;
	}
}
