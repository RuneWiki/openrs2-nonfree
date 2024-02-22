package a.a;

import a.Class7;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("mudclient!a/a/k")
public final class Class7_Sub1 extends Class7 implements Runnable {

	@OriginalMember(owner = "mudclient!a/a/k", name = "M", descriptor = "[B")
	private byte[] aByteArray9;

	@OriginalMember(owner = "mudclient!a/a/k", name = "N", descriptor = "I")
	private int anInt241;

	@OriginalMember(owner = "mudclient!a/a/k", name = "O", descriptor = "I")
	private int anInt242;

	@OriginalMember(owner = "mudclient!a/a/k", name = "L", descriptor = "Z")
	private boolean aBoolean43 = false;

	@OriginalMember(owner = "mudclient!a/a/k", name = "P", descriptor = "Z")
	private boolean aBoolean44 = true;

	@OriginalMember(owner = "mudclient!a/a/k", name = "K", descriptor = "Ljava/net/Socket;")
	private Socket aSocket1;

	@OriginalMember(owner = "mudclient!a/a/k", name = "I", descriptor = "Ljava/io/InputStream;")
	private InputStream anInputStream1;

	@OriginalMember(owner = "mudclient!a/a/k", name = "J", descriptor = "Ljava/io/OutputStream;")
	private OutputStream anOutputStream1;

	@OriginalMember(owner = "mudclient!a/a/k", name = "<init>", descriptor = "(Ljava/net/Socket;Lmudclient!a/a/a;)V")
	public Class7_Sub1(@OriginalArg(0) Socket arg0, @OriginalArg(1) Applet_Sub1 arg1) throws IOException {
		this.aSocket1 = arg0;
		this.anInputStream1 = arg0.getInputStream();
		this.anOutputStream1 = arg0.getOutputStream();
		this.aBoolean44 = false;
		arg1.method466(this);
	}

	@OriginalMember(owner = "mudclient!a/a/k", name = "a", descriptor = "()V")
	@Override
	public void method268() {
		super.method268();
		this.aBoolean43 = true;
		try {
			if (this.anInputStream1 != null) {
				this.anInputStream1.close();
			}
			if (this.anOutputStream1 != null) {
				this.anOutputStream1.close();
			}
			if (this.aSocket1 != null) {
				this.aSocket1.close();
			}
		} catch (@Pc(24) IOException local24) {
			System.out.println("Error closing stream");
		}
		this.aBoolean44 = true;
		synchronized (this) {
			this.notify();
		}
		this.aByteArray9 = null;
	}

	@OriginalMember(owner = "mudclient!a/a/k", name = "b", descriptor = "()I")
	@Override
	public int method269() throws IOException {
		return this.aBoolean43 ? 0 : this.anInputStream1.read();
	}

	@OriginalMember(owner = "mudclient!a/a/k", name = "c", descriptor = "()I")
	@Override
	protected int method270() throws IOException {
		return this.aBoolean43 ? 0 : this.anInputStream1.available();
	}

	@OriginalMember(owner = "mudclient!a/a/k", name = "a", descriptor = "(II[B)V")
	@Override
	protected void method271(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2) throws IOException {
		if (this.aBoolean43) {
			return;
		}
		@Pc(22) int local22;
		for (@Pc(6) int local6 = 0; local6 < arg0; local6 += local22) {
			if ((local22 = this.anInputStream1.read(arg2, local6 + arg1, arg0 - local6)) <= 0) {
				throw new IOException("EOF");
			}
		}
	}

	@OriginalMember(owner = "mudclient!a/a/k", name = "a", descriptor = "([BII)V")
	@Override
	protected void method272(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		if (this.aBoolean43) {
			return;
		}
		if (this.aByteArray9 == null) {
			this.aByteArray9 = new byte[5000];
		}
		synchronized (this) {
			for (@Pc(17) int local17 = 0; local17 < arg2; local17++) {
				this.aByteArray9[this.anInt242] = arg0[local17 + arg1];
				this.anInt242 = (this.anInt242 + 1) % 5000;
				if (this.anInt242 == (this.anInt241 + 4900) % 5000) {
					throw new IOException("buffer overflow");
				}
			}
			this.notify();
		}
	}

	@OriginalMember(owner = "mudclient!a/a/k", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (!this.aBoolean44) {
			@Pc(38) int local38;
			@Pc(27) int local27;
			synchronized (this) {
				if (this.anInt242 == this.anInt241) {
					try {
						this.wait();
					} catch (@Pc(16) InterruptedException local16) {
					}
				}
				if (this.aBoolean44) {
					return;
				}
				local27 = this.anInt241;
				if (this.anInt242 >= this.anInt241) {
					local38 = this.anInt242 - this.anInt241;
				} else {
					local38 = 5000 - this.anInt241;
				}
			}
			if (local38 > 0) {
				try {
					this.anOutputStream1.write(this.aByteArray9, local27, local38);
				} catch (@Pc(62) IOException local62) {
					super.aBoolean42 = true;
					super.aString19 = "Twriter:" + local62;
				}
				this.anInt241 = (this.anInt241 + local38) % 5000;
				try {
					if (this.anInt242 == this.anInt241) {
						this.anOutputStream1.flush();
					}
				} catch (@Pc(92) IOException local92) {
					super.aBoolean42 = true;
					super.aString19 = "Twriter:" + local92;
				}
			}
		}
	}
}
