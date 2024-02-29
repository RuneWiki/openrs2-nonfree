package com.jagex;

import jaclib.ping.Ping;
import java.net.InetAddress;
import java.util.LinkedList;
import java.util.Queue;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!xk")
public class Class646 implements Runnable {

	@OriginalMember(owner = "client!xk", name = "p", descriptor = "Ljava/lang/Object;")
	final Object anObject27 = new Object();

	@OriginalMember(owner = "client!xk", name = "v", descriptor = "Ljava/util/Queue;")
	final Queue aQueue4 = new LinkedList();

	@OriginalMember(owner = "client!xk", name = "c", descriptor = "Ljava/lang/Thread;")
	Thread aThread12 = new Thread(this);

	@OriginalMember(owner = "client!xk", name = "<init>", descriptor = "()V", line = 12)
	public Class646() {
		this.aThread12.setDaemon(true);
		this.aThread12.start();
	}

	@OriginalMember(owner = "client!xk", name = "p", descriptor = "(Ljava/lang/String;I)Lclient!xc;", line = 19)
	public Class639 method32830(@OriginalArg(0) String arg0) {
		if (this.aThread12 == null) {
			throw new IllegalStateException("");
		} else if (arg0 == null) {
			throw new IllegalArgumentException("");
		} else {
			@Pc(21) Class639 local21 = new Class639(arg0);
			this.method32835(local21);
			return local21;
		}
	}

	@OriginalMember(owner = "client!xk", name = "y", descriptor = "(Ljava/lang/String;)Lclient!xc;", line = 19)
	public Class639 method32831(@OriginalArg(0) String arg0) {
		if (this.aThread12 == null) {
			throw new IllegalStateException("");
		} else if (arg0 == null) {
			throw new IllegalArgumentException("");
		} else {
			@Pc(21) Class639 local21 = new Class639(arg0);
			this.method32835(local21);
			return local21;
		}
	}

	@OriginalMember(owner = "client!xk", name = "l", descriptor = "(Ljava/lang/String;)Lclient!xc;", line = 19)
	public Class639 method32832(@OriginalArg(0) String arg0) {
		if (this.aThread12 == null) {
			throw new IllegalStateException("");
		} else if (arg0 == null) {
			throw new IllegalArgumentException("");
		} else {
			@Pc(21) Class639 local21 = new Class639(arg0);
			this.method32835(local21);
			return local21;
		}
	}

	@OriginalMember(owner = "client!xk", name = "c", descriptor = "(I)V", line = 27)
	public void method32833() {
		if (this.aThread12 == null) {
			return;
		}
		this.method32835(this.anObject27);
		try {
			this.aThread12.join();
		} catch (@Pc(14) InterruptedException local14) {
		}
		this.aThread12 = null;
	}

	@OriginalMember(owner = "client!xk", name = "w", descriptor = "()V", line = 27)
	public void method32834() {
		if (this.aThread12 == null) {
			return;
		}
		this.method32835(this.anObject27);
		try {
			this.aThread12.join();
		} catch (@Pc(14) InterruptedException local14) {
		}
		this.aThread12 = null;
	}

	@OriginalMember(owner = "client!xk", name = "v", descriptor = "(Ljava/lang/Object;I)V", line = 37)
	void method32835(@OriginalArg(0) Object arg0) {
		@Pc(3) Queue local3 = this.aQueue4;
		synchronized (this.aQueue4) {
			this.aQueue4.add(arg0);
			this.aQueue4.notify();
		}
	}

	@OriginalMember(owner = "client!xk", name = "t", descriptor = "(Ljava/lang/Object;)V", line = 37)
	void method32836(@OriginalArg(0) Object arg0) {
		@Pc(3) Queue local3 = this.aQueue4;
		synchronized (this.aQueue4) {
			this.aQueue4.add(arg0);
			this.aQueue4.notify();
		}
	}

	@OriginalMember(owner = "client!xk", name = "q", descriptor = "(Ljava/lang/Object;)V", line = 37)
	void method32837(@OriginalArg(0) Object arg0) {
		@Pc(3) Queue local3 = this.aQueue4;
		synchronized (this.aQueue4) {
			this.aQueue4.add(arg0);
			this.aQueue4.notify();
		}
	}

	@OriginalMember(owner = "client!xk", name = "r", descriptor = "()V", line = 46)
	public void method32838() {
		while (true) {
			@Pc(3) Queue local3 = this.aQueue4;
			@Pc(31) Class639 local31;
			synchronized (this.aQueue4) {
				@Pc(8) Object local8;
				for (local8 = this.aQueue4.poll(); local8 == null; local8 = this.aQueue4.poll()) {
					try {
						this.aQueue4.wait();
					} catch (@Pc(16) InterruptedException local16) {
					}
				}
				if (local8 == this.anObject27) {
					return;
				}
				local31 = (Class639) local8;
			}
			@Pc(59) int local59;
			try {
				@Pc(44) byte[] local44 = InetAddress.getByName(local31.aString239).getAddress();
				local59 = Ping.p(local44[0], local44[1], local44[2], local44[3], 1000L);
			} catch (@Pc(61) Throwable local61) {
				local59 = 1000;
			}
			local31.anInt5718 = local59 * 1659133145;
		}
	}

	@OriginalMember(owner = "client!xk", name = "run", descriptor = "()V", line = 46)
	@Override
	public void run() {
		while (true) {
			@Pc(3) Queue local3 = this.aQueue4;
			@Pc(31) Class639 local31;
			synchronized (this.aQueue4) {
				@Pc(8) Object local8;
				for (local8 = this.aQueue4.poll(); local8 == null; local8 = this.aQueue4.poll()) {
					try {
						this.aQueue4.wait();
					} catch (@Pc(16) InterruptedException local16) {
					}
				}
				if (local8 == this.anObject27) {
					return;
				}
				local31 = (Class639) local8;
			}
			@Pc(59) int local59;
			try {
				@Pc(44) byte[] local44 = InetAddress.getByName(local31.aString239).getAddress();
				local59 = Ping.p(local44[0], local44[1], local44[2], local44[3], 1000L);
			} catch (@Pc(61) Throwable local61) {
				local59 = 1000;
			}
			local31.anInt5718 = local59 * 1659133145;
		}
	}

	@OriginalMember(owner = "client!xk", name = "g", descriptor = "()V", line = 46)
	public void method32839() {
		while (true) {
			@Pc(3) Queue local3 = this.aQueue4;
			@Pc(31) Class639 local31;
			synchronized (this.aQueue4) {
				@Pc(8) Object local8;
				for (local8 = this.aQueue4.poll(); local8 == null; local8 = this.aQueue4.poll()) {
					try {
						this.aQueue4.wait();
					} catch (@Pc(16) InterruptedException local16) {
					}
				}
				if (local8 == this.anObject27) {
					return;
				}
				local31 = (Class639) local8;
			}
			@Pc(59) int local59;
			try {
				@Pc(44) byte[] local44 = InetAddress.getByName(local31.aString239).getAddress();
				local59 = Ping.p(local44[0], local44[1], local44[2], local44[3], 1000L);
			} catch (@Pc(61) Throwable local61) {
				local59 = 1000;
			}
			local31.anInt5718 = local59 * 1659133145;
		}
	}

	@OriginalMember(owner = "client!xk", name = "kh", descriptor = "(B)V", line = 10278)
	static final void method32840() {
		Class525.aClass277Array5 = null;
		Class700.method36491(client.anInt3459 * -993629849, 0, 0, Class149_Sub4.anInt2368 * 1771907305, Class19.anInt108 * -1091172141, 0, 0, -1);
		if (Class525.aClass277Array5 != null) {
			Class143_Sub38.method16162(Class525.aClass277Array5, -1412584499, 0, 0, Class149_Sub4.anInt2368 * 1771907305, Class19.anInt108 * -1091172141, Class56.anInt189 * 2120696527, Class636.anInt5713 * -1225002575, Class58.aClass277_1 == client.aClass277_8 ? -1 : -360382511 * client.aClass277_8.anInt3952, true);
			Class525.aClass277Array5 = null;
		}
	}

	@OriginalMember(owner = "client!xk", name = "arj", descriptor = "(Lclient!yf;B)V", line = 12451)
	static final void method32841(@OriginalArg(0) Class665 arg0) {
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = Class35_Sub6.aClass77_Sub35_45.aClass143_Sub17_1.method15463() == 1 ? 1 : 0;
	}
}
