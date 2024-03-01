package com.jagex;

import java.util.Queue;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lq")
public class Class304 {

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "Ljava/lang/Object;")
	public Object anObject17;

	@OriginalMember(owner = "client!lq", name = "p", descriptor = "I")
	public final int anInt4428;

	@OriginalMember(owner = "client!lq", name = "<init>", descriptor = "(I)V", line = 7)
	public Class304(@OriginalArg(0) int arg0) {
		this.anInt4428 = arg0 * 2122879425;
	}

	@OriginalMember(owner = "client!lq", name = "<init>", descriptor = "(ILjava/lang/Object;)V", line = 11)
	public Class304(@OriginalArg(0) int arg0, @OriginalArg(1) Object arg1) {
		this.anInt4428 = arg0 * 2122879425;
		this.anObject17 = arg1;
	}

	@OriginalMember(owner = "client!lq", name = "equals", descriptor = "(Ljava/lang/Object;)Z", line = 17)
	@Override
	public boolean equals(@OriginalArg(0) Object arg0) {
		if (!(arg0 instanceof Class304)) {
			return false;
		}
		@Pc(7) Class304 local7 = (Class304) arg0;
		if (local7.anObject17 == null && this.anObject17 != null) {
			return false;
		} else if (this.anObject17 == null && local7.anObject17 != null) {
			return false;
		} else {
			return local7.anInt4428 * 1628864065 == this.anInt4428 * 1628864065 && local7.anObject17.equals(this.anObject17);
		}
	}

	@OriginalMember(owner = "client!lq", name = "hm", descriptor = "(Ljava/lang/Object;)Z", line = 17)
	public boolean method25696(@OriginalArg(0) Object arg0) {
		if (!(arg0 instanceof Class304)) {
			return false;
		}
		@Pc(7) Class304 local7 = (Class304) arg0;
		if (local7.anObject17 == null && this.anObject17 != null) {
			return false;
		} else if (this.anObject17 == null && local7.anObject17 != null) {
			return false;
		} else {
			return local7.anInt4428 * 1628864065 == this.anInt4428 * 1628864065 && local7.anObject17.equals(this.anObject17);
		}
	}

	@OriginalMember(owner = "client!lq", name = "ib", descriptor = "(Ljava/lang/Object;)Z", line = 17)
	public boolean method25697(@OriginalArg(0) Object arg0) {
		if (!(arg0 instanceof Class304)) {
			return false;
		}
		@Pc(7) Class304 local7 = (Class304) arg0;
		if (local7.anObject17 == null && this.anObject17 != null) {
			return false;
		} else if (this.anObject17 == null && local7.anObject17 != null) {
			return false;
		} else {
			return local7.anInt4428 * 1628864065 == this.anInt4428 * 1628864065 && local7.anObject17.equals(this.anObject17);
		}
	}

	@OriginalMember(owner = "client!lq", name = "x", descriptor = "(B)V", line = 97)
	public static void method25702() {
		@Pc(2) Queue local2 = Class516.aQueue4;
		synchronized (Class516.aQueue4) {
			while (true) {
				@Pc(7) Class3_Sub22_Sub2 local7 = (Class3_Sub22_Sub2) Class516.aQueue4.poll();
				if (local7 == null) {
					return;
				}
				local7.method19859();
			}
		}
	}

	@OriginalMember(owner = "client!lq", name = "xc", descriptor = "(Lclient!vs;I)V", line = 8331)
	static final void method25698(@OriginalArg(0) Class536 arg0) {
		arg0.anInt5315 -= 1580027550;
		@Pc(14) String local14 = (String) arg0.anObjectArray42[arg0.anInt5315 * 996806575];
		@Pc(25) String local25 = (String) arg0.anObjectArray42[arg0.anInt5315 * 996806575 + 1];
		Class3_Sub24_Sub10.method18350(local14, local25);
	}

	@OriginalMember(owner = "client!lq", name = "akr", descriptor = "(Lclient!vs;I)V", line = 10911)
	static final void method25699(@OriginalArg(0) Class536 arg0) throws Exception_Sub4 {
		arg0.anInt5319 -= 1248498196;
		@Pc(13) int local13 = arg0.anIntArray496[arg0.anInt5319 * 960738381];
		@Pc(23) int local23 = arg0.anIntArray496[arg0.anInt5319 * 960738381 + 1];
		@Pc(33) int local33 = arg0.anIntArray496[arg0.anInt5319 * 960738381 + 2];
		@Pc(43) int local43 = arg0.anIntArray496[arg0.anInt5319 * 960738381 + 3];
		@Pc(51) Class320 local51 = Class320.method25891((float) local13, (float) local23, (float) local33);
		if (local51.aFloat259 == -1.0F) {
			local51.aFloat259 = Float.POSITIVE_INFINITY;
		}
		if (local51.aFloat260 == -1.0F) {
			local51.aFloat260 = Float.POSITIVE_INFINITY;
		}
		if (-1.0F == local51.aFloat261) {
			local51.aFloat261 = Float.POSITIVE_INFINITY;
		}
		Class80.aClass23_Sub1_1.method5809(local51);
		Class80.aClass23_Sub1_1.method5806((float) local43 / 1000.0F);
		local51.method25874();
	}

	@OriginalMember(owner = "client!lq", name = "ale", descriptor = "(Lclient!vs;B)V", line = 11194)
	static final void method25700(@OriginalArg(0) Class536 arg0) {
		if (client.anInt3039 * 1115111877 == 19) {
			@Pc(11) Class3_Sub23 local11 = Class269.method25284(Class311.aClass311_52, client.aClass82_1.aClass577_2);
			client.aClass82_1.method21601(local11);
		}
	}

	@OriginalMember(owner = "client!lq", name = "md", descriptor = "(S)V", line = 11817)
	static void method25703() {
		if (Class1.aClass527_1 != Class527.aClass527_6) {
			Class300.aClass300_8.method25643();
		}
	}

	@OriginalMember(owner = "client!lq", name = "avu", descriptor = "(Lclient!vs;B)V", line = 12801)
	static final void method25701(@OriginalArg(0) Class536 arg0) {
		Class144.method23068(Class58_Sub1.anInt1433 * -900186091);
	}
}
