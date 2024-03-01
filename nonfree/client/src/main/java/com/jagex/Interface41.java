package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!os")
public interface Interface41 {

	@OriginalMember(owner = "client!os", name = "g", descriptor = "(Ljava/lang/Object;[F[Ljava/lang/Object;)V")
	void method23175(@OriginalArg(0) Object arg0, @OriginalArg(1) float[] arg1, @OriginalArg(2) Object[] arg2);

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(Ljava/lang/Object;[F[Ljava/lang/Object;)V")
	void method23176(@OriginalArg(0) Object arg0, @OriginalArg(1) float[] arg1, @OriginalArg(2) Object[] arg2);

	@OriginalMember(owner = "client!os", name = "l", descriptor = "(Ljava/lang/Object;[F[Ljava/lang/Object;)V")
	void method23177(@OriginalArg(0) Object arg0, @OriginalArg(1) float[] arg1, @OriginalArg(2) Object[] arg2);

	@OriginalMember(owner = "client!os", name = "p", descriptor = "(Ljava/lang/Object;[F[Ljava/lang/Object;B)V")
	void method23178(@OriginalArg(0) Object arg0, @OriginalArg(1) float[] arg1, @OriginalArg(2) Object[] arg2);
}
