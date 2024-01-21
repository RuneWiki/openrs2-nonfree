import java.applet.Applet;
import java.awt.EventQueue;
import java.awt.Toolkit;
import java.io.DataInputStream;
import java.io.File;
import java.lang.reflect.Method;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("loader!e")
public final class Class95 implements Runnable {

	@OriginalMember(owner = "loader!e", name = "p", descriptor = "Ljava/lang/reflect/Method;")
	private static Method aMethod3;

	@OriginalMember(owner = "loader!e", name = "e", descriptor = "Ljava/lang/String;")
	public static String aString7;

	@OriginalMember(owner = "loader!e", name = "k", descriptor = "Ljava/lang/String;")
	public static String aString8;

	@OriginalMember(owner = "loader!e", name = "j", descriptor = "Ljava/lang/reflect/Method;")
	private static Method aMethod4;

	@OriginalMember(owner = "loader!e", name = "q", descriptor = "Ljava/lang/String;")
	private static String aString9;

	@OriginalMember(owner = "loader!e", name = "b", descriptor = "I")
	private static final int anInt4170 = 1;

	@OriginalMember(owner = "loader!e", name = "g", descriptor = "[Lloader!qa;")
	private Class97[] aClass97Array1;

	@OriginalMember(owner = "loader!e", name = "h", descriptor = "Lloader!gf;")
	private Interface4 anInterface4_1;

	@OriginalMember(owner = "loader!e", name = "f", descriptor = "Lloader!hf;")
	private Class96 aClass96_1 = null;

	@OriginalMember(owner = "loader!e", name = "i", descriptor = "Lloader!hf;")
	private Class96 aClass96_2 = null;

	@OriginalMember(owner = "loader!e", name = "l", descriptor = "Lloader!qa;")
	private Class97 aClass97_3 = null;

	@OriginalMember(owner = "loader!e", name = "o", descriptor = "Lloader!qa;")
	private Class97 aClass97_2 = null;

	@OriginalMember(owner = "loader!e", name = "n", descriptor = "Z")
	private boolean aBoolean325 = false;

	@OriginalMember(owner = "loader!e", name = "s", descriptor = "Ljava/io/File;")
	private File aFile5 = null;

	@OriginalMember(owner = "loader!e", name = "a", descriptor = "Ljava/io/File;")
	public File aFile4 = null;

	@OriginalMember(owner = "loader!e", name = "m", descriptor = "Ljava/applet/Applet;")
	private Applet anApplet2 = null;

	@OriginalMember(owner = "loader!e", name = "d", descriptor = "Lloader!qa;")
	private Class97 aClass97_1 = null;

	@OriginalMember(owner = "loader!e", name = "r", descriptor = "Ljava/awt/EventQueue;")
	private EventQueue anEventQueue2;

	@OriginalMember(owner = "loader!e", name = "c", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread2;

	@OriginalMember(owner = "loader!e", name = "<init>", descriptor = "(ZLjava/applet/Applet;ILjava/lang/String;I)V")
	public Class95(@OriginalArg(0) boolean arg0, @OriginalArg(1) Applet arg1, @OriginalArg(2) int arg2, @OriginalArg(3) String arg3, @OriginalArg(4) int arg4) {
		aString8 = "1.1";
		this.anApplet2 = arg1;
		aString7 = "Unknown";
		try {
			aString7 = System.getProperty("java.vendor");
			aString8 = System.getProperty("java.version");
		} catch (@Pc(43) Exception local43) {
		}
		try {
			aString9 = System.getProperty("user.home");
			if (aString9 != null) {
				aString9 = aString9 + "/";
			}
		} catch (@Pc(59) Exception local59) {
		}
		if (aString9 == null) {
			aString9 = "~/";
		}
		try {
			this.anEventQueue2 = Toolkit.getDefaultToolkit().getSystemEventQueue();
		} catch (@Pc(70) Throwable local70) {
		}
		try {
			if (arg1 == null) {
				aMethod4 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			} else {
				aMethod4 = arg1.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			}
		} catch (@Pc(98) Exception local98) {
		}
		try {
			if (arg1 == null) {
				aMethod3 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
			} else {
				aMethod3 = arg1.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
			}
		} catch (@Pc(126) Exception local126) {
		}
		this.method3071(arg3, arg2, arg4);
		this.aBoolean325 = false;
		this.aThread2 = new Thread(this);
		this.aThread2.setPriority(10);
		this.aThread2.setDaemon(true);
		this.aThread2.start();
	}

	@OriginalMember(owner = "loader!e", name = "a", descriptor = "(Ljava/lang/String;BII)V")
	private void method3071(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(34) String[] local34 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", aString9, "/tmp/", "" };
		if (arg1 < 32 || arg1 > 34) {
			arg1 = 32;
		}
		@Pc(78) String[] local78 = new String[] { ".jagex_cache_" + arg1, ".file_store_" + arg1 };
		for (@Pc(80) int local80 = 0; local80 < 2; local80++) {
			for (@Pc(85) int local85 = 0; local85 < local78.length; local85++) {
				for (@Pc(95) int local95 = 0; local95 < local34.length; local95++) {
					try {
						@Pc(103) String local103 = local34[local95];
						if (local103.length() > 0 && !(new File(local103)).exists()) {
							continue;
						}
						@Pc(128) File local128 = new File(local103 + local78[local85]);
						@Pc(140) boolean local140;
						if (local80 == 1 && !local128.exists()) {
							local140 = local128.mkdir();
							if (!local140) {
								continue;
							}
						}
						@Pc(154) File local154;
						if (this.aClass97_1 == null) {
							try {
								local154 = new File(local128, "random.dat");
								if (local80 == 1 || local154.exists()) {
									this.aClass97_1 = new Class97(local154, "rw", 25L);
								}
							} catch (@Pc(171) Exception local171) {
								this.aClass97_1 = null;
							}
						}
						if (this.aFile5 == null) {
							@Pc(228) int local228;
							try {
								local128 = new File(local128, arg0);
								if (local80 == 1 && !local128.exists()) {
									local140 = local128.mkdir();
									if (!local140) {
										continue;
									}
								}
								local154 = new File(local128, "main_file_cache.dat2");
								if (local80 == 0 && !local154.exists()) {
									continue;
								}
								this.aClass97_3 = new Class97(local154, "rw", 104857600L);
								this.aClass97Array1 = new Class97[16];
								for (local228 = 0; local228 < 16; local228++) {
									this.aClass97Array1[local228] = new Class97(new File(local128, "main_file_cache.idx" + local228), "rw", 1048576L);
								}
								this.aClass97_2 = new Class97(new File(local128, "main_file_cache.idx255"), "rw", 1048576L);
								this.aFile4 = this.aFile5 = local128;
							} catch (@Pc(274) Exception local274) {
								try {
									this.aClass97_3.method3098();
									for (local228 = 0; local228 < 16; local228++) {
										this.aClass97Array1[local228].method3098();
									}
									this.aClass97_2.method3098();
								} catch (@Pc(301) Exception local301) {
								}
								this.aFile4 = this.aFile5 = null;
								this.aClass97Array1 = null;
								this.aClass97_3 = this.aClass97_2 = null;
							}
						}
					} catch (@Pc(318) Exception local318) {
					}
					if (this.aClass97_1 != null && this.aFile5 != null) {
						return;
					}
				}
			}
		}
		if (this.aFile5 == null) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "loader!e", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(18) Class96 local18;
			synchronized (this) {
				while (true) {
					if (this.aBoolean325) {
						return;
					}
					if (this.aClass96_2 != null) {
						local18 = this.aClass96_2;
						this.aClass96_2 = this.aClass96_2.aClass96_3;
						if (this.aClass96_2 == null) {
							this.aClass96_1 = null;
						}
						break;
					}
					try {
						this.wait();
					} catch (@Pc(36) InterruptedException local36) {
					}
				}
			}
			try {
				@Pc(48) int local48 = local18.anInt4172;
				if (local48 == 1) {
					local18.anObject6 = new Socket(InetAddress.getByName((String) local18.anObject5), local18.anInt4171);
				} else if (local48 == 2) {
					@Pc(209) Thread local209 = new Thread((Runnable) local18.anObject5);
					local209.setDaemon(true);
					local209.start();
					local209.setPriority(local18.anInt4171);
					local18.anObject6 = local209;
				} else if (local48 == 4) {
					local18.anObject6 = new DataInputStream(((URL) local18.anObject5).openStream());
				} else {
					@Pc(98) Object[] local98;
					if (local48 == 8) {
						local98 = (Object[]) local18.anObject5;
						if (((Class) local98[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local18.anObject6 = ((Class) local98[0]).getDeclaredMethod((String) local98[1], (Class[]) local98[2]);
					} else if (local48 == 9) {
						local98 = (Object[]) local18.anObject5;
						if (((Class) local98[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local18.anObject6 = ((Class) local98[0]).getDeclaredField((String) local98[1]);
					} else if (local48 == 3) {
						@Pc(162) String local162 = (local18.anInt4171 >> 24 & 0xFF) + "." + (local18.anInt4171 >> 16 & 0xFF) + "." + (local18.anInt4171 >> 8 & 0xFF) + "." + (local18.anInt4171 & 0xFF);
						local18.anObject6 = InetAddress.getByName(local162).getHostName();
					}
				}
				local18.anInt4173 = 1;
			} catch (@Pc(226) ThreadDeath local226) {
				throw local226;
			} catch (@Pc(229) Throwable local229) {
				local18.anInt4173 = 2;
			}
		}
	}
}
