package com.jagex;

import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!abi")
public abstract class Class33 {

	@OriginalMember(owner = "client!abi", name = "bf", descriptor = "Lclient!acd;")
	static Class53 aClass53_11;

	@OriginalMember(owner = "client!abi", name = "p", descriptor = "Ljava/lang/String;")
	String aString63;

	@OriginalMember(owner = "client!abi", name = "c", descriptor = "I")
	int anInt2366;

	@OriginalMember(owner = "client!abi", name = "<init>", descriptor = "()V", line = 10)
	Class33() {
	}

	@OriginalMember(owner = "client!abi", name = "v", descriptor = "(B)Ljava/net/Socket;", line = 22)
	Socket method16809() throws IOException {
		return new Socket(this.aString63, this.anInt2366 * -766038025);
	}

	@OriginalMember(owner = "client!abi", name = "y", descriptor = "()Ljava/net/Socket;", line = 22)
	Socket method16810() throws IOException {
		return new Socket(this.aString63, this.anInt2366 * -766038025);
	}

	@OriginalMember(owner = "client!abi", name = "w", descriptor = "()Ljava/net/Socket;", line = 22)
	Socket method16811() throws IOException {
		return new Socket(this.aString63, this.anInt2366 * -766038025);
	}

	@OriginalMember(owner = "client!abi", name = "t", descriptor = "()Ljava/net/Socket;", line = 22)
	Socket method16812() throws IOException {
		return new Socket(this.aString63, this.anInt2366 * -766038025);
	}

	@OriginalMember(owner = "client!abi", name = "ds", descriptor = "(Lclient!dx;Lclient!akg;Lclient!hl;IIIII)V", line = 654)
	static void method16813(@OriginalArg(0) Class86 arg0, @OriginalArg(1) Class77_Sub30 arg1, @OriginalArg(2) Class302 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(3) int local3 = arg3 - 5;
		@Pc(7) int local7 = arg4 + 2;
		if (arg2.anInt4026 * 1313711519 != 0) {
			arg0.method19986(local3, local7, arg6 + 10, arg4 + arg5 - local7 + 1, arg2.anInt4026 * 1313711519);
		}
		if (arg2.anInt4049 * -2045123201 != 0) {
			arg0.method19982(local3, local7, arg6 + 10, arg5 + arg4 - local7 + 1, arg2.anInt4049 * -2045123201);
		}
		@Pc(60) int local60 = arg2.anInt4021 * -1512587879;
		if (arg1.aBoolean335 && arg2.anInt4038 * 261637687 != -1) {
			local60 = arg2.anInt4038 * 261637687;
		}
		Class581.aClass94_12.method7614(arg2.aString189, arg3, arg4, arg6, arg5, local60 | 0xFF000000, Class136_Sub1.aClass619_2.anInt5627 * 335392643, 1, 0, 0, null, null, null, 0, 0);
	}

	@OriginalMember(owner = "client!abi", name = "c", descriptor = "(B)Ljava/net/Socket;")
	public abstract Socket method16814() throws IOException;

	@OriginalMember(owner = "client!abi", name = "l", descriptor = "()Ljava/net/Socket;")
	public abstract Socket method16815() throws IOException;
}
