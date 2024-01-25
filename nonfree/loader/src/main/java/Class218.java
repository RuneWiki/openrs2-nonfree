import java.awt.DisplayMode;
import java.awt.Frame;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.lang.reflect.Field;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("loader!a")
public final class Class218 {

	@OriginalMember(owner = "loader!a", name = "b", descriptor = "Ljava/awt/DisplayMode;")
	private DisplayMode aDisplayMode1;

	@OriginalMember(owner = "loader!a", name = "a", descriptor = "Ljava/awt/GraphicsDevice;")
	private GraphicsDevice aGraphicsDevice1;

	@OriginalMember(owner = "loader!a", name = "<init>", descriptor = "()V")
	public Class218() throws Exception {
		@Pc(3) GraphicsEnvironment local3 = GraphicsEnvironment.getLocalGraphicsEnvironment();
		this.aGraphicsDevice1 = local3.getDefaultScreenDevice();
		if (!this.aGraphicsDevice1.isFullScreenSupported()) {
			@Pc(15) GraphicsDevice[] local15 = local3.getScreenDevices();
			for (@Pc(19) int local19 = 0; local19 < local15.length; local19++) {
				@Pc(31) GraphicsDevice local31 = local15[local19];
				if (local31 != null && local31.isFullScreenSupported()) {
					this.aGraphicsDevice1 = local31;
					return;
				}
			}
			throw new Exception();
		}
	}

	@OriginalMember(owner = "loader!a", name = "a", descriptor = "(ILjava/awt/Frame;IIII)V")
	public void method5690(@OriginalArg(1) Frame arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		this.aDisplayMode1 = this.aGraphicsDevice1.getDisplayMode();
		if (this.aDisplayMode1 == null) {
			throw new NullPointerException();
		}
		arg0.setUndecorated(true);
		arg0.enableInputMethods(false);
		this.method5691(arg0);
		if (arg1 == 0) {
			@Pc(37) int local37 = this.aDisplayMode1.getRefreshRate();
			@Pc(41) DisplayMode[] local41 = this.aGraphicsDevice1.getDisplayModes();
			@Pc(43) boolean local43 = false;
			for (@Pc(45) int local45 = 0; local45 < local41.length; local45++) {
				if (arg2 == local41[local45].getWidth() && arg3 == local41[local45].getHeight() && local41[local45].getBitDepth() == arg4) {
					@Pc(72) int local72 = local41[local45].getRefreshRate();
					if (!local43 || Math.abs(local72 - local37) < Math.abs(arg1 - local37)) {
						local43 = true;
						arg1 = local72;
					}
				}
			}
			if (!local43) {
				arg1 = local37;
			}
		}
		this.aGraphicsDevice1.setDisplayMode(new DisplayMode(arg2, arg3, arg4, arg1));
	}

	@OriginalMember(owner = "loader!a", name = "a", descriptor = "(ILjava/awt/Frame;)V")
	private void method5691(@OriginalArg(1) Frame arg0) {
		@Pc(1) boolean local1 = false;
		try {
			@Pc(6) Field local6 = Class.forName("sun.awt.Win32GraphicsDevice").getDeclaredField("valid");
			local6.setAccessible(true);
			@Pc(20) boolean local20 = (Boolean) local6.get(this.aGraphicsDevice1);
			if (local20) {
				local6.set(this.aGraphicsDevice1, Boolean.FALSE);
				local1 = true;
			}
		} catch (@Pc(31) Throwable local31) {
		}
		try {
			this.aGraphicsDevice1.setFullScreenWindow(arg0);
		} finally {
			if (local1) {
				try {
					@Pc(58) Field local58 = Class.forName("sun.awt.Win32GraphicsDevice").getDeclaredField("valid");
					local58.set(this.aGraphicsDevice1, Boolean.TRUE);
				} catch (@Pc(65) Throwable local65) {
				}
			}
		}
	}

	@OriginalMember(owner = "loader!a", name = "a", descriptor = "(Z)V")
	public void method5692() {
		if (this.aDisplayMode1 != null) {
			this.aGraphicsDevice1.setDisplayMode(this.aDisplayMode1);
			if (!this.aGraphicsDevice1.getDisplayMode().equals(this.aDisplayMode1)) {
				throw new RuntimeException("Did not return to correct resolution!");
			}
			this.aDisplayMode1 = null;
		}
		this.method5691(null);
	}

	@OriginalMember(owner = "loader!a", name = "a", descriptor = "(B)[I")
	public int[] method5693() {
		@Pc(3) DisplayMode[] local3 = this.aGraphicsDevice1.getDisplayModes();
		@Pc(9) int[] local9 = new int[local3.length << 2];
		for (@Pc(11) int local11 = 0; local11 < local3.length; local11++) {
			local9[local11 << 2] = local3[local11].getWidth();
			local9[(local11 << 2) + 1] = local3[local11].getHeight();
			local9[(local11 << 2) + 2] = local3[local11].getBitDepth();
			local9[(local11 << 2) + 3] = local3[local11].getRefreshRate();
		}
		return local9;
	}
}
