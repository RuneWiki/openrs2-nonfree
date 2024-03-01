package com.jagex;

import jaclib.ping.Ping;
import java.net.InetAddress;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uo")
public class Class508 implements Runnable {

	@OriginalMember(owner = "client!uo", name = "p", descriptor = "Ljava/lang/Object;")
	final Object anObject25 = new Object();

	@OriginalMember(owner = "client!uo", name = "g", descriptor = "Ljava/util/Queue;")
	final Queue aQueue3 = new LinkedList();

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "Ljava/lang/Thread;")
	Thread aThread12 = new Thread(this);

	@OriginalMember(owner = "client!uo", name = "<init>", descriptor = "()V", line = 12)
	public Class508() {
		this.aThread12.setDaemon(true);
		this.aThread12.start();
	}

	@OriginalMember(owner = "client!uo", name = "p", descriptor = "(ZB)Lclient!ry;", line = 15)
	public static Class446 method29569(@OriginalArg(0) boolean arg0) {
		@Pc(2) Stack local2 = Class446.aStack1;
		synchronized (Class446.aStack1) {
			@Pc(10) Class446 local10;
			if (Class446.aStack1.isEmpty()) {
				local10 = new Class446();
			} else {
				local10 = (Class446) Class446.aStack1.pop();
			}
			local10.aBoolean773 = arg0;
			return local10;
		}
	}

	@OriginalMember(owner = "client!uo", name = "p", descriptor = "(Ljava/lang/String;I)Lclient!un;", line = 19)
	public Class507 method29556(@OriginalArg(0) String arg0) {
		if (this.aThread12 == null) {
			throw new IllegalStateException("");
		} else if (arg0 == null) {
			throw new IllegalArgumentException("");
		} else {
			@Pc(20) Class507 local20 = new Class507(arg0);
			this.method29558(local20);
			return local20;
		}
	}

	@OriginalMember(owner = "client!uo", name = "l", descriptor = "(Ljava/lang/String;)Lclient!un;", line = 19)
	public Class507 method29560(@OriginalArg(0) String arg0) {
		if (this.aThread12 == null) {
			throw new IllegalStateException("");
		} else if (arg0 == null) {
			throw new IllegalArgumentException("");
		} else {
			@Pc(20) Class507 local20 = new Class507(arg0);
			this.method29558(local20);
			return local20;
		}
	}

	@OriginalMember(owner = "client!uo", name = "h", descriptor = "(Ljava/lang/String;)Lclient!un;", line = 19)
	public Class507 method29561(@OriginalArg(0) String arg0) {
		if (this.aThread12 == null) {
			throw new IllegalStateException("");
		} else if (arg0 == null) {
			throw new IllegalArgumentException("");
		} else {
			@Pc(20) Class507 local20 = new Class507(arg0);
			this.method29558(local20);
			return local20;
		}
	}

	@OriginalMember(owner = "client!uo", name = "x", descriptor = "()V", line = 27)
	public void method29555() {
		if (this.aThread12 == null) {
			return;
		}
		this.method29558(this.anObject25);
		try {
			this.aThread12.join();
		} catch (@Pc(14) InterruptedException local14) {
		}
		this.aThread12 = null;
	}

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(B)V", line = 27)
	public void method29557() {
		if (this.aThread12 == null) {
			return;
		}
		this.method29558(this.anObject25);
		try {
			this.aThread12.join();
		} catch (@Pc(14) InterruptedException local14) {
		}
		this.aThread12 = null;
	}

	@OriginalMember(owner = "client!uo", name = "g", descriptor = "(Ljava/lang/Object;I)V", line = 37)
	void method29558(@OriginalArg(0) Object arg0) {
		@Pc(3) Queue local3 = this.aQueue3;
		synchronized (this.aQueue3) {
			this.aQueue3.add(arg0);
			this.aQueue3.notify();
		}
	}

	@OriginalMember(owner = "client!uo", name = "u", descriptor = "(Ljava/lang/Object;)V", line = 37)
	void method29562(@OriginalArg(0) Object arg0) {
		@Pc(3) Queue local3 = this.aQueue3;
		synchronized (this.aQueue3) {
			this.aQueue3.add(arg0);
			this.aQueue3.notify();
		}
	}

	@OriginalMember(owner = "client!uo", name = "s", descriptor = "(Ljava/lang/Object;)V", line = 37)
	void method29563(@OriginalArg(0) Object arg0) {
		@Pc(3) Queue local3 = this.aQueue3;
		synchronized (this.aQueue3) {
			this.aQueue3.add(arg0);
			this.aQueue3.notify();
		}
	}

	@OriginalMember(owner = "client!uo", name = "run", descriptor = "()V", line = 46)
	@Override
	public void run() {
		while (true) {
			@Pc(3) Queue local3 = this.aQueue3;
			@Pc(30) Class507 local30;
			synchronized (this.aQueue3) {
				@Pc(8) Object local8;
				for (local8 = this.aQueue3.poll(); local8 == null; local8 = this.aQueue3.poll()) {
					try {
						this.aQueue3.wait();
					} catch (@Pc(15) InterruptedException local15) {
					}
				}
				if (local8 == this.anObject25) {
					return;
				}
				local30 = (Class507) local8;
			}
			@Pc(58) int local58;
			try {
				@Pc(43) byte[] local43 = InetAddress.getByName(local30.aString231).getAddress();
				local58 = Ping.p(local43[0], local43[1], local43[2], local43[3], 1000L);
			} catch (@Pc(60) Throwable local60) {
				local58 = 1000;
			}
			local30.anInt5256 = local58 * 694744615;
		}
	}

	@OriginalMember(owner = "client!uo", name = "n", descriptor = "()V", line = 46)
	public void method29559() {
		while (true) {
			@Pc(3) Queue local3 = this.aQueue3;
			@Pc(30) Class507 local30;
			synchronized (this.aQueue3) {
				@Pc(8) Object local8;
				for (local8 = this.aQueue3.poll(); local8 == null; local8 = this.aQueue3.poll()) {
					try {
						this.aQueue3.wait();
					} catch (@Pc(15) InterruptedException local15) {
					}
				}
				if (local8 == this.anObject25) {
					return;
				}
				local30 = (Class507) local8;
			}
			@Pc(58) int local58;
			try {
				@Pc(43) byte[] local43 = InetAddress.getByName(local30.aString231).getAddress();
				local58 = Ping.p(local43[0], local43[1], local43[2], local43[3], 1000L);
			} catch (@Pc(60) Throwable local60) {
				local58 = 1000;
			}
			local30.anInt5256 = local58 * 694744615;
		}
	}

	@OriginalMember(owner = "client!uo", name = "j", descriptor = "()V", line = 46)
	public void method29564() {
		while (true) {
			@Pc(3) Queue local3 = this.aQueue3;
			@Pc(30) Class507 local30;
			synchronized (this.aQueue3) {
				@Pc(8) Object local8;
				for (local8 = this.aQueue3.poll(); local8 == null; local8 = this.aQueue3.poll()) {
					try {
						this.aQueue3.wait();
					} catch (@Pc(15) InterruptedException local15) {
					}
				}
				if (local8 == this.anObject25) {
					return;
				}
				local30 = (Class507) local8;
			}
			@Pc(58) int local58;
			try {
				@Pc(43) byte[] local43 = InetAddress.getByName(local30.aString231).getAddress();
				local58 = Ping.p(local43[0], local43[1], local43[2], local43[3], 1000L);
			} catch (@Pc(60) Throwable local60) {
				local58 = 1000;
			}
			local30.anInt5256 = local58 * 694744615;
		}
	}

	@OriginalMember(owner = "client!uo", name = "bw", descriptor = "(Lclient!de;IIIIII)V", line = 1256)
	static void method29570(@OriginalArg(0) Class21 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if ((Class13_Sub11.aClass6_3 == null || Class350.aClass6_27 == null || Class626.aClass6_38 == null) && Class294.aClass359_54.method26674(Class3_Sub4.anInt1161 * -2009491159) && Class294.aClass359_54.method26674(Class60_Sub1.anInt1453 * 414100209) && Class294.aClass359_54.method26674(Class285.anInt4357 * -2108100827)) {
			@Pc(36) Class15 local36 = Class137.method22938(Class294.aClass359_54, Class60_Sub1.anInt1453 * 414100209, 0);
			Class350.aClass6_27 = arg0.method17089(local36, true);
			local36.method3445();
			Class450.aClass6_33 = arg0.method17089(local36, true);
			Class13_Sub11.aClass6_3 = arg0.method17089(Class137.method22938(Class294.aClass359_54, Class3_Sub4.anInt1161 * -2009491159, 0), true);
			@Pc(65) Class15 local65 = Class137.method22938(Class294.aClass359_54, Class285.anInt4357 * -2108100827, 0);
			Class626.aClass6_38 = arg0.method17089(local65, true);
			local65.method3445();
			Class277.aClass6_26 = arg0.method17089(local65, true);
		}
		if (Class13_Sub11.aClass6_3 == null || Class350.aClass6_27 == null || Class626.aClass6_38 == null) {
			return;
		}
		@Pc(93) int local93 = (arg3 - Class626.aClass6_38.method16782() * 2) / Class13_Sub11.aClass6_3.method16782();
		@Pc(95) int local95;
		for (local95 = 0; local95 < local93; local95++) {
			Class13_Sub11.aClass6_3.method16783(arg1 + Class626.aClass6_38.method16782() + local95 * Class13_Sub11.aClass6_3.method16782(), arg2 + arg4 - Class13_Sub11.aClass6_3.method16787());
		}
		local95 = (arg4 - arg5 - Class626.aClass6_38.method16787()) / Class350.aClass6_27.method16787();
		for (@Pc(129) int local129 = 0; local129 < local95; local129++) {
			Class350.aClass6_27.method16783(arg1, arg5 + arg2 + local129 * Class350.aClass6_27.method16787());
			Class450.aClass6_33.method16783(arg3 + arg1 - Class450.aClass6_33.method16782(), arg5 + arg2 + local129 * Class350.aClass6_27.method16787());
		}
		Class626.aClass6_38.method16783(arg1, arg4 + arg2 - Class626.aClass6_38.method16787());
		Class277.aClass6_26.method16783(arg3 + arg1 - Class626.aClass6_38.method16782(), arg2 + arg4 - Class626.aClass6_38.method16787());
	}

	@OriginalMember(owner = "client!uo", name = "cy", descriptor = "(Lclient!vs;I)V", line = 4487)
	static final void method29568(@OriginalArg(0) Class536 arg0) {
		@Pc(8) Class534 local8 = arg0.aBoolean822 ? arg0.aClass534_2 : arg0.aClass534_1;
		@Pc(11) Class178 local11 = local8.aClass178_18;
		@Pc(14) Class186 local14 = local8.aClass186_4;
		Class403.method27631(local11, local14, arg0);
	}

	@OriginalMember(owner = "client!uo", name = "pf", descriptor = "(Lclient!vs;I)V", line = 6916)
	static final void method29565(@OriginalArg(0) Class536 arg0) {
		@Pc(8) Class534 local8 = arg0.aBoolean822 ? arg0.aClass534_2 : arg0.aClass534_1;
		@Pc(11) Class178 local11 = local8.aClass178_18;
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = local11.anInt3518 * 351958085;
	}

	@OriginalMember(owner = "client!uo", name = "abq", descriptor = "(Lclient!vs;I)V", line = 8916)
	static final void method29566(@OriginalArg(0) Class536 arg0) {
		@Pc(13) String local13 = (String) arg0.anObjectArray42[(arg0.anInt5315 -= 790013775) * 996806575];
		@Pc(26) int local26 = arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381];
		arg0.anObjectArray42[(arg0.anInt5315 += 790013775) * 996806575 - 1] = local13 + local26;
	}

	@OriginalMember(owner = "client!uo", name = "afg", descriptor = "(Lclient!vs;B)V", line = 9898)
	static final void method29567(@OriginalArg(0) Class536 arg0) {
		arg0.anInt5319 -= 624249098;
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = -1;
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = -1;
	}
}
