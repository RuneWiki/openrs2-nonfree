package a.a;

import a.Class11;
import a.Class8;
import java.applet.Applet;
import java.awt.Color;
import java.awt.Container;
import java.awt.Event;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.IndexColorModel;
import java.awt.image.MemoryImageSource;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("mudclient!a/a/a")
public class Applet_Sub1 extends Applet implements Runnable {

	@OriginalMember(owner = "mudclient!a/a/a", name = "g", descriptor = "Lmudclient!a/a/c;")
	protected static Frame_Sub1 aFrame_Sub1_3 = null;

	@OriginalMember(owner = "mudclient!a/a/a", name = "w", descriptor = "Ljava/lang/String;")
	private static String aString24 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";

	@OriginalMember(owner = "mudclient!a/a/a", name = "c", descriptor = "Ljava/lang/Thread;")
	private Thread aThread3;

	@OriginalMember(owner = "mudclient!a/a/a", name = "h", descriptor = "Z")
	private boolean aBoolean56;

	@OriginalMember(owner = "mudclient!a/a/a", name = "i", descriptor = "I")
	private int anInt347;

	@OriginalMember(owner = "mudclient!a/a/a", name = "j", descriptor = "I")
	private int anInt348;

	@OriginalMember(owner = "mudclient!a/a/a", name = "k", descriptor = "I")
	protected int anInt349;

	@OriginalMember(owner = "mudclient!a/a/a", name = "l", descriptor = "I")
	protected int anInt350;

	@OriginalMember(owner = "mudclient!a/a/a", name = "n", descriptor = "Ljava/lang/String;")
	private String aString22;

	@OriginalMember(owner = "mudclient!a/a/a", name = "p", descriptor = "I")
	private int anInt352;

	@OriginalMember(owner = "mudclient!a/a/a", name = "u", descriptor = "Ljava/awt/Image;")
	private Image anImage5;

	@OriginalMember(owner = "mudclient!a/a/a", name = "v", descriptor = "Ljava/awt/Graphics;")
	private Graphics aGraphics4;

	@OriginalMember(owner = "mudclient!a/a/a", name = "G", descriptor = "I")
	protected int anInt354;

	@OriginalMember(owner = "mudclient!a/a/a", name = "H", descriptor = "I")
	protected int anInt355;

	@OriginalMember(owner = "mudclient!a/a/a", name = "I", descriptor = "I")
	protected int anInt356;

	@OriginalMember(owner = "mudclient!a/a/a", name = "J", descriptor = "I")
	protected int anInt357;

	@OriginalMember(owner = "mudclient!a/a/a", name = "K", descriptor = "I")
	private int anInt358;

	@OriginalMember(owner = "mudclient!a/a/a", name = "L", descriptor = "I")
	protected int anInt359;

	@OriginalMember(owner = "mudclient!a/a/a", name = "a", descriptor = "I")
	private int anInt343 = 512;

	@OriginalMember(owner = "mudclient!a/a/a", name = "b", descriptor = "I")
	private int anInt344 = 384;

	@OriginalMember(owner = "mudclient!a/a/a", name = "d", descriptor = "I")
	private int anInt345 = 20;

	@OriginalMember(owner = "mudclient!a/a/a", name = "e", descriptor = "I")
	private int anInt346 = 1000;

	@OriginalMember(owner = "mudclient!a/a/a", name = "f", descriptor = "[J")
	private long[] aLongArray6 = new long[10];

	@OriginalMember(owner = "mudclient!a/a/a", name = "m", descriptor = "I")
	private int anInt351 = 1;

	@OriginalMember(owner = "mudclient!a/a/a", name = "o", descriptor = "Z")
	private boolean aBoolean57 = false;

	@OriginalMember(owner = "mudclient!a/a/a", name = "q", descriptor = "Ljava/lang/String;")
	private String aString23 = "Loading";

	@OriginalMember(owner = "mudclient!a/a/a", name = "r", descriptor = "Ljava/awt/Font;")
	private Font aFont7 = new Font("TimesRoman", 0, 15);

	@OriginalMember(owner = "mudclient!a/a/a", name = "s", descriptor = "Ljava/awt/Font;")
	private Font aFont8 = new Font("Helvetica", 1, 13);

	@OriginalMember(owner = "mudclient!a/a/a", name = "t", descriptor = "Ljava/awt/Font;")
	private Font aFont9 = new Font("Helvetica", 0, 12);

	@OriginalMember(owner = "mudclient!a/a/a", name = "x", descriptor = "Z")
	private boolean aBoolean58 = false;

	@OriginalMember(owner = "mudclient!a/a/a", name = "y", descriptor = "Z")
	private boolean aBoolean59 = false;

	@OriginalMember(owner = "mudclient!a/a/a", name = "z", descriptor = "Z")
	protected boolean aBoolean60 = false;

	@OriginalMember(owner = "mudclient!a/a/a", name = "A", descriptor = "Z")
	protected boolean aBoolean61 = false;

	@OriginalMember(owner = "mudclient!a/a/a", name = "B", descriptor = "Z")
	private boolean aBoolean62 = false;

	@OriginalMember(owner = "mudclient!a/a/a", name = "C", descriptor = "Z")
	private boolean aBoolean63 = false;

	@OriginalMember(owner = "mudclient!a/a/a", name = "D", descriptor = "Z")
	private boolean aBoolean64 = false;

	@OriginalMember(owner = "mudclient!a/a/a", name = "E", descriptor = "Z")
	private boolean aBoolean65 = false;

	@OriginalMember(owner = "mudclient!a/a/a", name = "F", descriptor = "I")
	protected int anInt353 = 1;

	@OriginalMember(owner = "mudclient!a/a/a", name = "M", descriptor = "Z")
	protected boolean aBoolean66 = false;

	@OriginalMember(owner = "mudclient!a/a/a", name = "N", descriptor = "Ljava/lang/String;")
	protected String aString25 = "";

	@OriginalMember(owner = "mudclient!a/a/a", name = "O", descriptor = "Ljava/lang/String;")
	protected String aString26 = "";

	@OriginalMember(owner = "mudclient!a/a/a", name = "P", descriptor = "Ljava/lang/String;")
	protected String aString27 = "";

	@OriginalMember(owner = "mudclient!a/a/a", name = "Q", descriptor = "Ljava/lang/String;")
	protected String aString28 = "";

	@OriginalMember(owner = "mudclient!a/a/a", name = "a", descriptor = "()V")
	protected void method447() {
	}

	@OriginalMember(owner = "mudclient!a/a/a", name = "b", descriptor = "()V")
	protected synchronized void method448() {
	}

	@OriginalMember(owner = "mudclient!a/a/a", name = "c", descriptor = "()V")
	protected void method449() {
	}

	@OriginalMember(owner = "mudclient!a/a/a", name = "d", descriptor = "()V")
	protected synchronized void method450() {
	}

	@OriginalMember(owner = "mudclient!a/a/a", name = "e", descriptor = "()V")
	protected final void method451() {
	}

	@OriginalMember(owner = "mudclient!a/a/a", name = "a", descriptor = "(IILjava/lang/String;Z)V")
	protected final void method452(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) boolean arg3) {
		this.aBoolean56 = false;
		System.out.println("Started application");
		this.anInt343 = arg0;
		this.anInt344 = arg1;
		aFrame_Sub1_3 = new Frame_Sub1(this, arg0, arg1, arg2, arg3, false);
		this.anInt351 = 1;
		this.aThread3 = new Thread(this);
		this.aThread3.start();
		this.aThread3.setPriority(1);
	}

	@OriginalMember(owner = "mudclient!a/a/a", name = "f", descriptor = "()Z")
	protected final boolean method453() {
		return this.aBoolean56;
	}

	@OriginalMember(owner = "mudclient!a/a/a", name = "a", descriptor = "(I)V")
	protected final void method454(@OriginalArg(0) int arg0) {
		this.anInt345 = 1000 / arg0;
	}

	@OriginalMember(owner = "mudclient!a/a/a", name = "g", descriptor = "()V")
	protected final void method455() {
		for (@Pc(1) int local1 = 0; local1 < 10; local1++) {
			this.aLongArray6[local1] = 0L;
		}
	}

	@OriginalMember(owner = "mudclient!a/a/a", name = "keyDown", descriptor = "(Ljava/awt/Event;I)Z")
	@Override
	public final synchronized boolean keyDown(@OriginalArg(0) Event arg0, @OriginalArg(1) int arg1) {
		this.method456(arg1);
		this.anInt358 = arg1;
		this.anInt359 = arg1;
		this.anInt350 = 0;
		if (arg1 == 1006) {
			this.aBoolean60 = true;
		}
		if (arg1 == 1007) {
			this.aBoolean61 = true;
		}
		if (arg1 == 1004) {
			this.aBoolean62 = true;
		}
		if (arg1 == 1005) {
			this.aBoolean63 = true;
		}
		if ((char) arg1 == ' ') {
			this.aBoolean64 = true;
		}
		if ((char) arg1 == 'n' || (char) arg1 == 'm') {
			this.aBoolean65 = true;
		}
		if ((char) arg1 == 'N' || (char) arg1 == 'M') {
			this.aBoolean65 = true;
		}
		if ((char) arg1 == '{') {
			this.aBoolean58 = true;
		}
		if ((char) arg1 == '}') {
			this.aBoolean59 = true;
		}
		if ((char) arg1 == 'ϰ') {
			this.aBoolean66 = !this.aBoolean66;
		}
		@Pc(94) boolean local94 = false;
		for (@Pc(96) int local96 = 0; local96 < aString24.length(); local96++) {
			if (arg1 == aString24.charAt(local96)) {
				local94 = true;
				break;
			}
		}
		if (local94 && this.aString25.length() < 20) {
			this.aString25 = this.aString25 + (char) arg1;
		}
		if (local94 && this.aString27.length() < 80) {
			this.aString27 = this.aString27 + (char) arg1;
		}
		if (arg1 == 8 && this.aString25.length() > 0) {
			this.aString25 = this.aString25.substring(0, this.aString25.length() - 1);
		}
		if (arg1 == 8 && this.aString27.length() > 0) {
			this.aString27 = this.aString27.substring(0, this.aString27.length() - 1);
		}
		if (arg1 == 10 || arg1 == 13) {
			this.aString26 = this.aString25;
			this.aString28 = this.aString27;
		}
		return true;
	}

	@OriginalMember(owner = "mudclient!a/a/a", name = "b", descriptor = "(I)V")
	protected void method456(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "mudclient!a/a/a", name = "keyUp", descriptor = "(Ljava/awt/Event;I)Z")
	@Override
	public final synchronized boolean keyUp(@OriginalArg(0) Event arg0, @OriginalArg(1) int arg1) {
		this.anInt358 = 0;
		if (arg1 == 1006) {
			this.aBoolean60 = false;
		}
		if (arg1 == 1007) {
			this.aBoolean61 = false;
		}
		if (arg1 == 1004) {
			this.aBoolean62 = false;
		}
		if (arg1 == 1005) {
			this.aBoolean63 = false;
		}
		if ((char) arg1 == ' ') {
			this.aBoolean64 = false;
		}
		if ((char) arg1 == 'n' || (char) arg1 == 'm') {
			this.aBoolean65 = false;
		}
		if ((char) arg1 == 'N' || (char) arg1 == 'M') {
			this.aBoolean65 = false;
		}
		if ((char) arg1 == '{') {
			this.aBoolean58 = false;
		}
		if ((char) arg1 == '}') {
			this.aBoolean59 = false;
		}
		return true;
	}

	@OriginalMember(owner = "mudclient!a/a/a", name = "mouseMove", descriptor = "(Ljava/awt/Event;II)Z")
	@Override
	public final synchronized boolean mouseMove(@OriginalArg(0) Event arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt354 = arg1;
		this.anInt355 = arg2 + this.anInt349;
		this.anInt356 = 0;
		this.anInt350 = 0;
		return true;
	}

	@OriginalMember(owner = "mudclient!a/a/a", name = "mouseUp", descriptor = "(Ljava/awt/Event;II)Z")
	@Override
	public final synchronized boolean mouseUp(@OriginalArg(0) Event arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt354 = arg1;
		this.anInt355 = arg2 + this.anInt349;
		this.anInt356 = 0;
		return true;
	}

	@OriginalMember(owner = "mudclient!a/a/a", name = "mouseDown", descriptor = "(Ljava/awt/Event;II)Z")
	@Override
	public final synchronized boolean mouseDown(@OriginalArg(0) Event arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt354 = arg1;
		this.anInt355 = arg2 + this.anInt349;
		if (arg0.metaDown()) {
			this.anInt356 = 2;
		} else {
			this.anInt356 = 1;
		}
		this.anInt357 = this.anInt356;
		this.anInt350 = 0;
		this.method457(this.anInt356, arg1, arg2);
		return true;
	}

	@OriginalMember(owner = "mudclient!a/a/a", name = "a", descriptor = "(III)V")
	protected void method457(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
	}

	@OriginalMember(owner = "mudclient!a/a/a", name = "mouseDrag", descriptor = "(Ljava/awt/Event;II)Z")
	@Override
	public final synchronized boolean mouseDrag(@OriginalArg(0) Event arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt354 = arg1;
		this.anInt355 = arg2 + this.anInt349;
		if (arg0.metaDown()) {
			this.anInt356 = 2;
		} else {
			this.anInt356 = 1;
		}
		return true;
	}

	@OriginalMember(owner = "mudclient!a/a/a", name = "init", descriptor = "()V")
	@Override
	public final void init() {
		this.aBoolean56 = true;
		System.out.println("Started applet");
		this.anInt343 = 512;
		this.anInt344 = 344;
		this.anInt351 = 1;
		Class11.anURL1 = this.getCodeBase();
		this.method466(this);
	}

	@OriginalMember(owner = "mudclient!a/a/a", name = "start", descriptor = "()V")
	@Override
	public final void start() {
		if (this.anInt347 >= 0) {
			this.anInt347 = 0;
		}
	}

	@OriginalMember(owner = "mudclient!a/a/a", name = "stop", descriptor = "()V")
	@Override
	public final void stop() {
		if (this.anInt347 >= 0) {
			this.anInt347 = 4000 / this.anInt345;
		}
	}

	@OriginalMember(owner = "mudclient!a/a/a", name = "destroy", descriptor = "()V")
	@Override
	public final void destroy() {
		this.anInt347 = -1;
		try {
			Thread.sleep(5000L);
		} catch (@Pc(6) Exception local6) {
		}
		if (this.anInt347 != -1) {
			return;
		}
		System.out.println("5 seconds expired, forcing kill");
		this.method458();
		if (this.aThread3 != null) {
			this.aThread3.stop();
			this.aThread3 = null;
		}
	}

	@OriginalMember(owner = "mudclient!a/a/a", name = "h", descriptor = "()V")
	private void method458() {
		this.anInt347 = -2;
		System.out.println("Closing program");
		this.method449();
		try {
			Thread.sleep(1000L);
		} catch (@Pc(11) Exception local11) {
		}
		if (aFrame_Sub1_3 != null) {
			aFrame_Sub1_3.dispose();
		}
		if (!this.aBoolean56) {
			System.exit(0);
		}
	}

	@OriginalMember(owner = "mudclient!a/a/a", name = "run", descriptor = "()V")
	@Override
	public final void run() {
		if (this.anInt351 == 1) {
			this.anInt351 = 2;
			this.aGraphics4 = this.getGraphics();
			this.method459();
			this.method460(0, "Loading...");
			this.method447();
			this.anInt351 = 0;
		}
		@Pc(25) int local25 = 0;
		@Pc(27) int local27 = 256;
		@Pc(29) int local29 = 1;
		@Pc(31) int local31 = 0;
		for (@Pc(33) int local33 = 0; local33 < 10; local33++) {
			this.aLongArray6[local33] = System.currentTimeMillis();
		}
		@Pc(46) long local46 = System.currentTimeMillis();
		while (this.anInt347 >= 0) {
			if (this.anInt347 > 0) {
				this.anInt347--;
				if (this.anInt347 == 0) {
					this.method458();
					this.aThread3 = null;
					return;
				}
			}
			@Pc(68) int local68 = local27;
			@Pc(70) int local70 = local29;
			local27 = 300;
			local29 = 1;
			local46 = System.currentTimeMillis();
			if (this.aLongArray6[local25] == 0L) {
				local27 = local68;
				local29 = local70;
			} else if (local46 > this.aLongArray6[local25]) {
				local27 = (int) ((long) (this.anInt345 * 2560) / (local46 - this.aLongArray6[local25]));
			}
			if (local27 < 25) {
				local27 = 25;
			}
			if (local27 > 256) {
				local27 = 256;
				local29 = (int) ((long) this.anInt345 - (local46 - this.aLongArray6[local25]) / 10L);
				if (local29 < this.anInt353) {
					local29 = this.anInt353;
				}
			}
			try {
				Thread.sleep((long) local29);
			} catch (@Pc(146) InterruptedException local146) {
			}
			this.aLongArray6[local25] = local46;
			local25 = (local25 + 1) % 10;
			@Pc(162) int local162;
			if (local29 > 1) {
				for (local162 = 0; local162 < 10; local162++) {
					if (this.aLongArray6[local162] != 0L) {
						this.aLongArray6[local162] += local29;
					}
				}
			}
			local162 = 0;
			while (local31 < 256) {
				this.method448();
				local31 += local27;
				local162++;
				if (local162 > this.anInt346) {
					local31 = 0;
					this.anInt348 += 6;
					if (this.anInt348 > 25) {
						this.anInt348 = 0;
						this.aBoolean66 = true;
					}
					break;
				}
			}
			this.anInt348--;
			local31 &= 0xFF;
			this.method450();
		}
		if (this.anInt347 == -1) {
			this.method458();
		}
		this.aThread3 = null;
	}

	@OriginalMember(owner = "mudclient!a/a/a", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final void update(@OriginalArg(0) Graphics arg0) {
		this.paint(arg0);
	}

	@OriginalMember(owner = "mudclient!a/a/a", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final void paint(@OriginalArg(0) Graphics arg0) {
		if (this.anInt351 == 2 && this.anImage5 != null) {
			this.method460(this.anInt352, this.aString23);
		} else if (this.anInt351 == 0) {
			this.method451();
		}
	}

	@OriginalMember(owner = "mudclient!a/a/a", name = "i", descriptor = "()V")
	private void method459() {
		this.aGraphics4.setColor(Color.black);
		this.aGraphics4.fillRect(0, 0, this.anInt343, this.anInt344);
		@Pc(18) byte[] local18 = this.method464("jagex.jag", "Jagex library", 0);
		if (local18 == null) {
			return;
		}
		@Pc(26) byte[] local26 = Class11.method319("logo.tga", 0, local18);
		this.anImage5 = this.method463(local26);
		Class3.method404(Class11.method319("h11p.jf", 0, local18));
		Class3.method404(Class11.method319("h12b.jf", 0, local18));
		Class3.method404(Class11.method319("h12p.jf", 0, local18));
		Class3.method404(Class11.method319("h13b.jf", 0, local18));
		Class3.method404(Class11.method319("h14b.jf", 0, local18));
		Class3.method404(Class11.method319("h16b.jf", 0, local18));
		Class3.method404(Class11.method319("h20b.jf", 0, local18));
		Class3.method404(Class11.method319("h24b.jf", 0, local18));
	}

	@OriginalMember(owner = "mudclient!a/a/a", name = "a", descriptor = "(ILjava/lang/String;)V")
	private void method460(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		try {
			@Pc(6) int local6 = (this.anInt343 - 281) / 2;
			@Pc(13) int local13 = (this.anInt344 - 148) / 2;
			this.aGraphics4.setColor(Color.black);
			this.aGraphics4.fillRect(0, 0, this.anInt343, this.anInt344);
			if (!this.aBoolean57) {
				this.aGraphics4.drawImage(this.anImage5, local6, local13, this);
			}
			local6 += 2;
			local13 += 90;
			this.anInt352 = arg0;
			this.aString23 = arg1;
			this.aGraphics4.setColor(new Color(132, 132, 132));
			if (this.aBoolean57) {
				this.aGraphics4.setColor(new Color(220, 0, 0));
			}
			this.aGraphics4.drawRect(local6 - 2, local13 - 2, 280, 23);
			this.aGraphics4.fillRect(local6, local13, arg0 * 277 / 100, 20);
			this.aGraphics4.setColor(new Color(198, 198, 198));
			if (this.aBoolean57) {
				this.aGraphics4.setColor(new Color(255, 255, 255));
			}
			this.method462(this.aGraphics4, arg1, this.aFont7, local6 + 138, local13 + 10);
			if (this.aBoolean57) {
				this.aGraphics4.setColor(new Color(132, 132, 152));
				this.method462(this.aGraphics4, "©2001-2002 Andrew Gower and Jagex Ltd", this.aFont9, local6 + 138, this.anInt344 - 20);
			} else {
				this.method462(this.aGraphics4, "Created by JAGeX - visit www.jagex.com", this.aFont8, local6 + 138, local13 + 30);
				this.method462(this.aGraphics4, "©2001-2002 Andrew Gower and Jagex Ltd", this.aFont8, local6 + 138, local13 + 44);
			}
			if (this.aString22 != null) {
				this.aGraphics4.setColor(Color.white);
				this.method462(this.aGraphics4, this.aString22, this.aFont8, local6 + 138, local13 - 120);
				return;
			}
		} catch (@Pc(200) Exception local200) {
		}
	}

	@OriginalMember(owner = "mudclient!a/a/a", name = "b", descriptor = "(ILjava/lang/String;)V")
	protected final void method461(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		try {
			@Pc(6) int local6 = (this.anInt343 - 281) / 2;
			@Pc(13) int local13 = (this.anInt344 - 148) / 2;
			@Pc(14) int local14 = local6 + 2;
			@Pc(15) int local15 = local13 + 90;
			this.anInt352 = arg0;
			this.aString23 = arg1;
			@Pc(27) int local27 = arg0 * 277 / 100;
			this.aGraphics4.setColor(new Color(132, 132, 132));
			if (this.aBoolean57) {
				this.aGraphics4.setColor(new Color(220, 0, 0));
			}
			this.aGraphics4.fillRect(local14, local15, local27, 20);
			this.aGraphics4.setColor(Color.black);
			this.aGraphics4.fillRect(local14 + local27, local15, 277 - local27, 20);
			this.aGraphics4.setColor(new Color(198, 198, 198));
			if (this.aBoolean57) {
				this.aGraphics4.setColor(new Color(255, 255, 255));
			}
			this.method462(this.aGraphics4, arg1, this.aFont7, local14 + 138, local15 + 10);
		} catch (@Pc(106) Exception local106) {
		}
	}

	@OriginalMember(owner = "mudclient!a/a/a", name = "a", descriptor = "(Ljava/awt/Graphics;Ljava/lang/String;Ljava/awt/Font;II)V")
	protected final void method462(@OriginalArg(0) Graphics arg0, @OriginalArg(1) String arg1, @OriginalArg(2) Font arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(3) Container local3;
		if (aFrame_Sub1_3 == null) {
			local3 = this;
		} else {
			local3 = aFrame_Sub1_3;
		}
		@Pc(11) FontMetrics local11 = local3.getFontMetrics(arg2);
		local11.stringWidth(arg1);
		arg0.setFont(arg2);
		arg0.drawString(arg1, arg3 - local11.stringWidth(arg1) / 2, arg4 + local11.getHeight() / 4);
	}

	@OriginalMember(owner = "mudclient!a/a/a", name = "a", descriptor = "([B)Ljava/awt/Image;")
	private Image method463(@OriginalArg(0) byte[] arg0) {
		@Pc(11) int local11 = arg0[13] * 256 + arg0[12];
		@Pc(21) int local21 = arg0[15] * 256 + arg0[14];
		@Pc(24) byte[] local24 = new byte[256];
		@Pc(27) byte[] local27 = new byte[256];
		@Pc(30) byte[] local30 = new byte[256];
		for (@Pc(32) int local32 = 0; local32 < 256; local32++) {
			local24[local32] = arg0[local32 * 3 + 20];
			local27[local32] = arg0[local32 * 3 + 19];
			local30[local32] = arg0[local32 * 3 + 18];
		}
		@Pc(77) IndexColorModel local77 = new IndexColorModel(8, 256, local24, local27, local30);
		@Pc(82) byte[] local82 = new byte[local11 * local21];
		@Pc(84) int local84 = 0;
		for (@Pc(88) int local88 = local21 - 1; local88 >= 0; local88--) {
			for (@Pc(92) int local92 = 0; local92 < local11; local92++) {
				local82[local84++] = arg0[local92 + local88 * local11 + 786];
			}
		}
		@Pc(124) MemoryImageSource local124 = new MemoryImageSource(local11, local21, local77, local82, 0, local11);
		return this.createImage(local124);
	}

	@OriginalMember(owner = "mudclient!a/a/a", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;I)[B")
	protected byte[] method464(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2) {
		System.out.println("Using default load");
		@Pc(4) int local4 = 0;
		@Pc(6) int local6 = 0;
		@Pc(8) byte[] local8 = null;
		try {
			this.method461(arg2, "Loading " + arg1 + " - 0%");
			@Pc(23) InputStream local23 = Class11.method302(arg0);
			@Pc(28) DataInputStream local28 = new DataInputStream(local23);
			@Pc(31) byte[] local31 = new byte[6];
			local28.readFully(local31, 0, 6);
			local4 = ((local31[0] & 0xFF) << 16) + ((local31[1] & 0xFF) << 8) + (local31[2] & 0xFF);
			local6 = ((local31[3] & 0xFF) << 16) + ((local31[4] & 0xFF) << 8) + (local31[5] & 0xFF);
			this.method461(arg2, "Loading " + arg1 + " - 5%");
			@Pc(94) int local94 = 0;
			local8 = new byte[local6];
			while (local94 < local6) {
				@Pc(103) int local103 = local6 - local94;
				if (local103 > 1000) {
					local103 = 1000;
				}
				local28.readFully(local8, local94, local103);
				local94 += local103;
				this.method461(arg2, "Loading " + arg1 + " - " + (local94 * 95 / local6 + 5) + "%");
			}
			local28.close();
		} catch (@Pc(146) IOException local146) {
		}
		this.method461(arg2, "Unpacking " + arg1);
		if (local6 == local4) {
			return local8;
		} else {
			@Pc(162) byte[] local162 = new byte[local4];
			Class8.method291(local162, local4, local8, local6, 0);
			return local162;
		}
	}

	@OriginalMember(owner = "mudclient!a/a/a", name = "getGraphics", descriptor = "()Ljava/awt/Graphics;")
	@Override
	public Graphics getGraphics() {
		return aFrame_Sub1_3 == null ? super.getGraphics() : aFrame_Sub1_3.getGraphics();
	}

	@OriginalMember(owner = "mudclient!a/a/a", name = "createImage", descriptor = "(II)Ljava/awt/Image;")
	@Override
	public Image createImage(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return aFrame_Sub1_3 == null ? super.createImage(arg0, arg1) : aFrame_Sub1_3.createImage(arg0, arg1);
	}

	@OriginalMember(owner = "mudclient!a/a/a", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
	@Override
	public URL getCodeBase() {
		return super.getCodeBase();
	}

	@OriginalMember(owner = "mudclient!a/a/a", name = "getDocumentBase", descriptor = "()Ljava/net/URL;")
	@Override
	public URL getDocumentBase() {
		return super.getDocumentBase();
	}

	@OriginalMember(owner = "mudclient!a/a/a", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
	@Override
	public String getParameter(@OriginalArg(0) String arg0) {
		return super.getParameter(arg0);
	}

	@OriginalMember(owner = "mudclient!a/a/a", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/net/Socket;")
	protected Socket method465(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) throws IOException {
		@Pc(11) Socket local11;
		if (this.method453()) {
			local11 = new Socket(InetAddress.getByName(this.getCodeBase().getHost()), arg1);
		} else {
			local11 = new Socket(InetAddress.getByName(arg0), arg1);
		}
		local11.setSoTimeout(30000);
		local11.setTcpNoDelay(true);
		return local11;
	}

	@OriginalMember(owner = "mudclient!a/a/a", name = "a", descriptor = "(Ljava/lang/Runnable;)V")
	public void method466(@OriginalArg(0) Runnable arg0) {
		@Pc(4) Thread local4 = new Thread(arg0);
		local4.setDaemon(true);
		local4.start();
	}
}
