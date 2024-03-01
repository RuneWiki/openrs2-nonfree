package com.jagex;

import java.util.LinkedList;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ow")
public class Class379 implements Runnable {

	@OriginalMember(owner = "client!ow", name = "y", descriptor = "I")
	static int anInt4703;

	@OriginalMember(owner = "client!ow", name = "ga", descriptor = "Lclient!ly;")
	public static Class312 aClass312_1;

	@OriginalMember(owner = "client!ow", name = "p", descriptor = "Z")
	volatile boolean aBoolean740 = false;

	@OriginalMember(owner = "client!ow", name = "a", descriptor = "Ljava/util/LinkedList;")
	LinkedList aLinkedList1 = new LinkedList();

	@OriginalMember(owner = "client!ow", name = "g", descriptor = "Lclient!om;")
	Class370 aClass370_2 = new Class370(true);

	@OriginalMember(owner = "client!ow", name = "p", descriptor = "(Lclient!sj;I)V", line = 13)
	public void method27251(@OriginalArg(0) Class457 arg0) {
		this.aClass370_2.method27036(arg0);
	}

	@OriginalMember(owner = "client!ow", name = "u", descriptor = "(Lclient!sj;)V", line = 13)
	public void method27260(@OriginalArg(0) Class457 arg0) {
		this.aClass370_2.method27036(arg0);
	}

	@OriginalMember(owner = "client!ow", name = "y", descriptor = "(Lclient!sj;)V", line = 13)
	public void method27261(@OriginalArg(0) Class457 arg0) {
		this.aClass370_2.method27036(arg0);
	}

	@OriginalMember(owner = "client!ow", name = "a", descriptor = "(Lclient!oq;I)V", line = 17)
	public void method27252(@OriginalArg(0) Class374 arg0) {
		@Pc(3) LinkedList local3 = this.aLinkedList1;
		synchronized (this.aLinkedList1) {
			this.aLinkedList1.add(arg0);
			this.aLinkedList1.notify();
		}
	}

	@OriginalMember(owner = "client!ow", name = "b", descriptor = "()Z", line = 24)
	public boolean method27262() {
		return this.aBoolean740;
	}

	@OriginalMember(owner = "client!ow", name = "g", descriptor = "(I)Z", line = 24)
	public boolean method27266() {
		return this.aBoolean740;
	}

	@OriginalMember(owner = "client!ow", name = "l", descriptor = "(B)Lclient!om;", line = 28)
	public Class370 method27250() {
		return this.aClass370_2;
	}

	@OriginalMember(owner = "client!ow", name = "c", descriptor = "()Lclient!om;", line = 28)
	public Class370 method27263() {
		return this.aClass370_2;
	}

	@OriginalMember(owner = "client!ow", name = "e", descriptor = "()Lclient!om;", line = 28)
	public Class370 method27265() {
		return this.aClass370_2;
	}

	@OriginalMember(owner = "client!ow", name = "r", descriptor = "()Lclient!om;", line = 28)
	public Class370 method27267() {
		return this.aClass370_2;
	}

	@OriginalMember(owner = "client!ow", name = "z", descriptor = "()Lclient!om;", line = 28)
	public Class370 method27269() {
		return this.aClass370_2;
	}

	@OriginalMember(owner = "client!ow", name = "d", descriptor = "(Lclient!om;)V", line = 32)
	void method27253(@OriginalArg(0) Class370 arg0) {
		this.aClass370_2 = arg0;
	}

	@OriginalMember(owner = "client!ow", name = "h", descriptor = "(Lclient!om;B)V", line = 32)
	void method27255(@OriginalArg(0) Class370 arg0) {
		this.aClass370_2 = arg0;
	}

	@OriginalMember(owner = "client!ow", name = "run", descriptor = "()V", line = 37)
	@Override
	public void run() {
		while (true) {
			this.method27256();
		}
	}

	@OriginalMember(owner = "client!ow", name = "j", descriptor = "()V", line = 37)
	public void method27258() {
		while (true) {
			this.method27256();
		}
	}

	@OriginalMember(owner = "client!ow", name = "n", descriptor = "()V", line = 37)
	public void method27259() {
		while (true) {
			this.method27256();
		}
	}

	@OriginalMember(owner = "client!ow", name = "v", descriptor = "()V", line = 42)
	void method27254() {
		@Pc(5) LinkedList local5 = this.aLinkedList1;
		@Pc(16) Class374 local16;
		synchronized (this.aLinkedList1) {
			try {
				this.aLinkedList1.wait();
			} catch (@Pc(11) InterruptedException local11) {
			}
			local16 = (Class374) this.aLinkedList1.pollFirst();
		}
		try {
			if (local16 != null) {
				this.aBoolean740 = true;
				this.method27257(local16);
			}
		} catch (@Pc(39) Exception local39) {
		} finally {
			this.aBoolean740 = false;
		}
	}

	@OriginalMember(owner = "client!ow", name = "x", descriptor = "(B)V", line = 42)
	void method27256() {
		@Pc(5) LinkedList local5 = this.aLinkedList1;
		@Pc(16) Class374 local16;
		synchronized (this.aLinkedList1) {
			try {
				this.aLinkedList1.wait();
			} catch (@Pc(11) InterruptedException local11) {
			}
			local16 = (Class374) this.aLinkedList1.pollFirst();
		}
		try {
			if (local16 != null) {
				this.aBoolean740 = true;
				this.method27257(local16);
			}
		} catch (@Pc(39) Exception local39) {
		} finally {
			this.aBoolean740 = false;
		}
	}

	@OriginalMember(owner = "client!ow", name = "m", descriptor = "()V", line = 42)
	void method27264() {
		@Pc(5) LinkedList local5 = this.aLinkedList1;
		@Pc(16) Class374 local16;
		synchronized (this.aLinkedList1) {
			try {
				this.aLinkedList1.wait();
			} catch (@Pc(11) InterruptedException local11) {
			}
			local16 = (Class374) this.aLinkedList1.pollFirst();
		}
		try {
			if (local16 != null) {
				this.aBoolean740 = true;
				this.method27257(local16);
			}
		} catch (@Pc(39) Exception local39) {
		} finally {
			this.aBoolean740 = false;
		}
	}

	@OriginalMember(owner = "client!ow", name = "q", descriptor = "()V", line = 42)
	void method27268() {
		@Pc(5) LinkedList local5 = this.aLinkedList1;
		@Pc(16) Class374 local16;
		synchronized (this.aLinkedList1) {
			try {
				this.aLinkedList1.wait();
			} catch (@Pc(11) InterruptedException local11) {
			}
			local16 = (Class374) this.aLinkedList1.pollFirst();
		}
		try {
			if (local16 != null) {
				this.aBoolean740 = true;
				this.method27257(local16);
			}
		} catch (@Pc(39) Exception local39) {
		} finally {
			this.aBoolean740 = false;
		}
	}

	@OriginalMember(owner = "client!ow", name = "s", descriptor = "(IIB)Z", line = 58)
	public static boolean method27273(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (Class514.aClass48_6 == null || Class514.aClass48_6.method9518() == null) {
			return false;
		} else if (arg1 == arg0) {
			return true;
		} else {
			@Pc(20) Class275 local20 = Class514.aClass48_6.method9518().method25226(arg0);
			@Pc(27) Class275 local27 = Class514.aClass48_6.method9518().method25226(arg1);
			@Pc(29) Class275 local29 = local20;
			do {
				if (local29 == null) {
					local29 = local27;
					do {
						if (local29 == null) {
							return false;
						}
						local29 = local29.method25361();
						if (local20 == local29) {
							return true;
						}
					} while (local27 != local29);
					return false;
				}
				local29 = local29.method25361();
				if (local27 == local29) {
					return true;
				}
			} while (local29 != local20);
			return false;
		}
	}

	@OriginalMember(owner = "client!ow", name = "s", descriptor = "(Lclient!oq;I)V", line = 63)
	void method27257(@OriginalArg(0) Class374 arg0) {
		if (arg0.aClass380_3 == Class380.aClass380_9) {
			this.aClass370_2.method26968();
		} else {
			this.aClass370_2.method26969(arg0);
		}
		for (@Pc(18) boolean local18 = this.aClass370_2.method27055(); !local18; local18 = this.aClass370_2.method27055()) {
		}
		this.aClass370_2.method26963();
		client.aClass370_1.method26963();
	}

	@OriginalMember(owner = "client!ow", name = "t", descriptor = "(Lclient!oq;)V", line = 63)
	void method27270(@OriginalArg(0) Class374 arg0) {
		if (arg0.aClass380_3 == Class380.aClass380_9) {
			this.aClass370_2.method26968();
		} else {
			this.aClass370_2.method26969(arg0);
		}
		for (@Pc(18) boolean local18 = this.aClass370_2.method27055(); !local18; local18 = this.aClass370_2.method27055()) {
		}
		this.aClass370_2.method26963();
		client.aClass370_1.method26963();
	}

	@OriginalMember(owner = "client!ow", name = "m", descriptor = "(B)Z", line = 244)
	static boolean method27272() {
		Class190.anInt3670 = 860545150;
		Class615.aClass82_3 = client.aClass82_1;
		return Class65.method13153(Class190.aLong241 * -7592338111309603393L == -1L, true, "", "", Class190.aLong241 * -7592338111309603393L);
	}

	@OriginalMember(owner = "client!ow", name = "e", descriptor = "(Lclient!fw;Lclient!fo;I)V", line = 412)
	static void method27274(@OriginalArg(0) Class186 arg0, @OriginalArg(1) Class178 arg1) {
		if (arg1 == null) {
			return;
		}
		@Pc(76) int local76;
		if (arg1.anInt3491 * 18828465 == -1) {
			@Pc(122) Class178[] local122 = arg0.method23916();
			for (local76 = 0; local76 < local122.length && local122[local76] != arg1; local76++) {
			}
			if (local76 >= local122.length) {
				return;
			}
			Class567.method32931(local122, local76 + 1, local122, local76, local122.length - local76 - 1);
			local122[local122.length - 1] = arg1;
			return;
		}
		@Pc(15) Class178 local15 = arg0.method23917(arg1.anInt3500 * 610124465);
		if (local15 == null) {
			return;
		}
		if (local15.aClass178Array6 == local15.aClass178Array5) {
			local15.aClass178Array6 = new Class178[local15.aClass178Array5.length];
			local15.aClass178Array6[local15.aClass178Array6.length - 1] = arg1;
			Class567.method32931(local15.aClass178Array5, 0, local15.aClass178Array6, 0, arg1.anInt3491 * 18828465);
			Class567.method32931(local15.aClass178Array5, arg1.anInt3491 * 18828465 + 1, local15.aClass178Array6, arg1.anInt3491 * 18828465, local15.aClass178Array5.length - arg1.anInt3491 * 18828465 - 1);
			return;
		}
		local76 = 0;
		@Pc(79) Class178[] local79 = local15.aClass178Array6;
		while (local76 < local79.length && local79[local76] != arg1) {
			local76++;
		}
		if (local76 >= local79.length) {
			return;
		}
		Class567.method32931(local79, local76 + 1, local79, local76, local79.length - local76 - 1);
		local79[local15.aClass178Array6.length - 1] = arg1;
	}

	@OriginalMember(owner = "client!ow", name = "q", descriptor = "(II)V", line = 698)
	public static void method27271(@OriginalArg(0) int arg0) {
		Class265.anInt4208 = arg0 * -493774119;
		Class178.aClass161_19.method23224();
	}

	@OriginalMember(owner = "client!ow", name = "gp", descriptor = "(Lclient!vs;I)V", line = 5148)
	static final void method27277(@OriginalArg(0) Class536 arg0) {
		@Pc(8) Class534 local8 = arg0.aBoolean822 ? arg0.aClass534_2 : arg0.aClass534_1;
		@Pc(11) Class178 local11 = local8.aClass178_18;
		@Pc(14) Class186 local14 = local8.aClass186_4;
		Class209.method24239(local11, local14, arg0);
	}

	@OriginalMember(owner = "client!ow", name = "hb", descriptor = "(Lclient!vs;I)V", line = 5395)
	static final void method27275(@OriginalArg(0) Class536 arg0) {
		@Pc(12) int local12 = arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381];
		@Pc(16) Class178 local16 = Class375.method27235(local12);
		@Pc(22) Class186 local22 = Class178.aClass186Array1[local12 >> 16];
		Class174.method23395(local16, local22, true, 0, arg0);
	}

	@OriginalMember(owner = "client!ow", name = "yx", descriptor = "(Lclient!vs;B)V", line = 8561)
	static final void method27276(@OriginalArg(0) Class536 arg0) {
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = arg0.aClass245_4.aByte130;
	}
}
