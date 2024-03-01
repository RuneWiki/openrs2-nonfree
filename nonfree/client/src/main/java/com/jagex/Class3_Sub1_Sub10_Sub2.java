package com.jagex;

import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aoq")
public class Class3_Sub1_Sub10_Sub2 extends Class3_Sub1_Sub10 {

	@OriginalMember(owner = "client!aoq", name = "u", descriptor = "Ljava/lang/ref/SoftReference;")
	SoftReference aSoftReference1;

	@OriginalMember(owner = "client!aoq", name = "<init>", descriptor = "(Ljava/lang/Object;I)V", line = 10)
	Class3_Sub1_Sub10_Sub2(@OriginalArg(0) Object arg0, @OriginalArg(1) int arg1) {
		super(arg1);
		this.aSoftReference1 = new SoftReference(arg0);
	}

	@OriginalMember(owner = "client!aoq", name = "h", descriptor = "()Ljava/lang/Object;", line = 15)
	@Override
	Object method21130() {
		return this.aSoftReference1.get();
	}

	@OriginalMember(owner = "client!aoq", name = "p", descriptor = "(B)Ljava/lang/Object;", line = 15)
	@Override
	Object method21132() {
		return this.aSoftReference1.get();
	}

	@OriginalMember(owner = "client!aoq", name = "l", descriptor = "()Ljava/lang/Object;", line = 15)
	@Override
	Object method21129() {
		return this.aSoftReference1.get();
	}

	@OriginalMember(owner = "client!aoq", name = "g", descriptor = "()Ljava/lang/Object;", line = 15)
	@Override
	Object method21128() {
		return this.aSoftReference1.get();
	}

	@OriginalMember(owner = "client!aoq", name = "u", descriptor = "()Z", line = 19)
	@Override
	boolean method21133() {
		return true;
	}

	@OriginalMember(owner = "client!aoq", name = "a", descriptor = "(I)Z", line = 19)
	@Override
	boolean method21127() {
		return true;
	}

	@OriginalMember(owner = "client!aoq", name = "x", descriptor = "()Z", line = 19)
	@Override
	boolean method21131() {
		return true;
	}

	@OriginalMember(owner = "client!aoq", name = "s", descriptor = "()Z", line = 19)
	@Override
	boolean method21126() {
		return true;
	}

	@OriginalMember(owner = "client!aoq", name = "a", descriptor = "(I)Lclient!mu;", line = 167)
	public static Class332 method21134() {
		@Pc(3) Class332 local3 = new Class332();
		local3.method26204(0.0F, 1.0F, 0.0F, (float) (Math.random() * 3.141592653589793D * 2.0D));
		@Pc(23) float local23 = (float) (Math.random() * 0.5D + 0.5D) * 256.0F;
		local3.method26203(local23 - 128.0F, 0.0F, 0.0F);
		local3.method26198(0.0F, 1.0F, 0.0F, (float) (Math.random() * 3.141592653589793D * 2.0D));
		return local3;
	}
}
