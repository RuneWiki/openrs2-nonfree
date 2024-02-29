package com.jagex;

import java.io.File;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fq")
class Class255 implements Interface57 {

	@OriginalMember(owner = "client!fq", name = "uq", descriptor = "I")
	static int anInt3806;

	// $FF: synthetic field
	@OriginalMember(owner = "client!fq", name = "this$0", descriptor = "Lclient!fw;")
	final Class261 this$0;

	@OriginalMember(owner = "client!fq", name = "<init>", descriptor = "(Lclient!fw;)V", line = 182)
	Class255(@OriginalArg(0) Class261 arg0) {
		this.this$0 = arg0;
	}

	@OriginalMember(owner = "client!fq", name = "p", descriptor = "(Ljava/lang/Object;[F[Ljava/lang/Object;I)V", line = 184)
	@Override
	public void method26203(@OriginalArg(0) Object arg0, @OriginalArg(1) float[] arg1, @OriginalArg(2) Object[] arg2) {
		@Pc(2) Class496 local2 = (Class496) arg0;
		@Pc(6) Class447 local6 = local2.method30136();
		@Pc(10) float local10 = local2.method30138();
		@Pc(14) float local14 = local2.method30141();
		@Pc(21) Class447 local21 = Class447.method29160(local6, this.this$0.method26269());
		@Pc(23) float local23 = 0.0F;
		@Pc(26) float local26 = local21.method29170();
		if (local26 >= local14) {
			local23 = 0.0F;
		}
		if (local26 <= local10) {
			local23 = 1.0F;
		} else {
			@Pc(51) float local51 = 1.0F - (local26 - local10) * (1.0F / (local14 - local10));
			if ((double) local51 < 0.0D || (double) local51 > 1.0D) {
				local51 = Math.min(Math.max(local51, 0.0F), 1.0F);
			}
			local23 = local51;
		}
		arg1[0] = local23;
		arg1[1] = local23;
	}

	@OriginalMember(owner = "client!fq", name = "c", descriptor = "(Ljava/lang/Object;[F[Ljava/lang/Object;)V", line = 184)
	@Override
	public void method26204(@OriginalArg(0) Object arg0, @OriginalArg(1) float[] arg1, @OriginalArg(2) Object[] arg2) {
		@Pc(2) Class496 local2 = (Class496) arg0;
		@Pc(6) Class447 local6 = local2.method30136();
		@Pc(10) float local10 = local2.method30138();
		@Pc(14) float local14 = local2.method30141();
		@Pc(21) Class447 local21 = Class447.method29160(local6, this.this$0.method26269());
		@Pc(23) float local23 = 0.0F;
		@Pc(26) float local26 = local21.method29170();
		if (local26 >= local14) {
			local23 = 0.0F;
		}
		if (local26 <= local10) {
			local23 = 1.0F;
		} else {
			@Pc(51) float local51 = 1.0F - (local26 - local10) * (1.0F / (local14 - local10));
			if ((double) local51 < 0.0D || (double) local51 > 1.0D) {
				local51 = Math.min(Math.max(local51, 0.0F), 1.0F);
			}
			local23 = local51;
		}
		arg1[0] = local23;
		arg1[1] = local23;
	}

	@OriginalMember(owner = "client!fq", name = "v", descriptor = "(Ljava/lang/Object;[F[Ljava/lang/Object;)V", line = 184)
	@Override
	public void method26205(@OriginalArg(0) Object arg0, @OriginalArg(1) float[] arg1, @OriginalArg(2) Object[] arg2) {
		@Pc(2) Class496 local2 = (Class496) arg0;
		@Pc(6) Class447 local6 = local2.method30136();
		@Pc(10) float local10 = local2.method30138();
		@Pc(14) float local14 = local2.method30141();
		@Pc(21) Class447 local21 = Class447.method29160(local6, this.this$0.method26269());
		@Pc(23) float local23 = 0.0F;
		@Pc(26) float local26 = local21.method29170();
		if (local26 >= local14) {
			local23 = 0.0F;
		}
		if (local26 <= local10) {
			local23 = 1.0F;
		} else {
			@Pc(51) float local51 = 1.0F - (local26 - local10) * (1.0F / (local14 - local10));
			if ((double) local51 < 0.0D || (double) local51 > 1.0D) {
				local51 = Math.min(Math.max(local51, 0.0F), 1.0F);
			}
			local23 = local51;
		}
		arg1[0] = local23;
		arg1[1] = local23;
	}

	@OriginalMember(owner = "client!fq", name = "w", descriptor = "(B)Ljava/io/File;", line = 349)
	public static File method26206() {
		return Class257.aFile2;
	}

	@OriginalMember(owner = "client!fq", name = "lt", descriptor = "(Ljava/lang/String;B)I", line = 11952)
	public static final int method26207(@OriginalArg(0) String arg0) {
		if (arg0 == null || arg0.length() == 0) {
			return -1;
		}
		for (@Pc(9) int local9 = 0; local9 < client.anInt3532 * 2103713403; local9++) {
			if (arg0.equalsIgnoreCase(client.aClass217Array1[local9].aString169)) {
				return local9;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!fq", name = "apl", descriptor = "(Lclient!yf;I)V", line = 12315)
	static final void method26208(@OriginalArg(0) Class665 arg0) {
		arg0.anInt5784 -= 308999563;
	}
}
