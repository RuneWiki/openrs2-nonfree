import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("loader!l")
final class RuntimeException_Sub5 extends RuntimeException {

	@OriginalMember(owner = "loader!l", name = "f", descriptor = "I")
	static int anInt5923;

	@OriginalMember(owner = "loader!l", name = "a", descriptor = "I")
	static int anInt5924;

	@OriginalMember(owner = "loader!l", name = "e", descriptor = "[C")
	private static char[] aCharArray15 = new char[64];

	@OriginalMember(owner = "loader!l", name = "d", descriptor = "Lloader!d;")
	static Class707 aClass707_11;

	@OriginalMember(owner = "loader!l", name = "b", descriptor = "Ljava/lang/String;")
	String aString250;

	@OriginalMember(owner = "loader!l", name = "c", descriptor = "Ljava/lang/Throwable;")
	private Throwable aThrowable2;

	@OriginalMember(owner = "loader!l", name = "a", descriptor = "(IC)I", line = 8)
	static final int method36615(@OriginalArg(0) int arg0, @OriginalArg(1) char arg1) {
		if (arg0 < 94) {
			aCharArray15 = null;
		}
		anInt5924++;
		return arg1 >= '\u0000' && arg1 < Class707_Sub1.anIntArray548.length ? Class707_Sub1.anIntArray548[arg1] : -1;
	}

	static {
		@Pc(103) int local103;
		for (local103 = 0; local103 < 26; local103++) {
			aCharArray15[local103] = (char) (local103 + 65);
		}
		for (local103 = 26; local103 < 52; local103++) {
			aCharArray15[local103] = (char) (local103 + 71);
		}
		for (local103 = 52; local103 < 62; local103++) {
			aCharArray15[local103] = (char) (local103 + 48 - 52);
		}
		aCharArray15[63] = '-';
		aCharArray15[62] = '*';
		@Pc(163) Class707_Sub1 local163 = new Class707_Sub1(100);
		((Class707_Sub1) local163).anObject39 = "clibs";
		aClass707_11 = local163;
	}

	@OriginalMember(owner = "loader!l", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V", line = 47)
	RuntimeException_Sub5(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		this.aString250 = arg1;
		this.aThrowable2 = arg0;
		this.initCause(arg0);
	}

	@OriginalMember(owner = "loader!l", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;I)V", line = 58)
	static final void method36616(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2) {
		@Pc(1) boolean local1 = Class707.aBoolean876;
		anInt5923++;
		try {
			@Pc(7) String local7 = "";
			@Pc(34) String local34;
			@Pc(55) String local55;
			@Pc(66) String local66;
			@Pc(69) String local69;
			@Pc(75) int local75;
			@Pc(91) String local91;
			@Pc(143) int local143;
			if (arg0 != null) {
				@Pc(13) Throwable var5;
				label1001: {
					var5 = arg0;
					if (arg0 instanceof RuntimeException_Sub5) {
						@Pc(19) RuntimeException_Sub5 local19 = (RuntimeException_Sub5) arg0;
						var5 = local19.aThrowable2;
						local34 = local19.aString250 + " | ";
						if (!local1) {
							break label1001;
						}
					}
					local34 = "";
				}
				@Pc(42) StringWriter local42 = new StringWriter();
				@Pc(47) PrintWriter local47 = new PrintWriter(local42);
				var5.printStackTrace(local47);
				local47.close();
				local55 = local42.toString();
				@Pc(63) BufferedReader local63 = new BufferedReader(new StringReader(local55));
				local66 = local63.readLine();
				while (true) {
					local69 = local63.readLine();
					if (local69 != null) {
						local75 = local69.indexOf(40);
						@Pc(82) int local82 = local69.indexOf(41, local75 + 1);
						if (local1) {
							break;
						}
						label990: {
							if (local75 == -1) {
								local91 = local69;
								if (!local1) {
									break label990;
								}
							}
							local91 = local69.substring(0, local75);
						}
						local91 = local91.trim();
						local91 = local91.substring(local91.lastIndexOf(32) + 1);
						local91 = local91.substring(local91.lastIndexOf(9) + 1);
						local34 = local34 + local91;
						if (local75 != -1 && local82 != -1) {
							local143 = local69.indexOf(".java:", local75);
							if (local143 >= 0) {
								local34 = local34 + local69.substring(5 - -local143, local82);
							}
						}
						local34 = local34 + ' ';
						if (!local1) {
							continue;
						}
					}
					local34 = local34 + "| " + local66;
					break;
				}
				local7 = local34;
			}
			if (arg1 != null) {
				if (arg0 != null) {
					local7 = local7 + " | ";
				}
				local7 = local7 + arg1;
			}
			@Pc(221) PrintStream local221 = System.out;
			local34 = local7;
			@Pc(229) int local229 = local7.indexOf("%0a");
			while (local229 != -1) {
				local34 = local34.substring(0, local229) + "\n" + local34.substring(local229 + "%0a".length());
				local229 = local34.indexOf("%0a", local229 - -"\n".length());
				if (local1) {
					return;
				}
				if (local1) {
					break;
				}
			}
			local221.println("Error: " + local34);
			@Pc(288) int local288 = local7.length();
			@Pc(293) StringBuilder local293 = new StringBuilder(local288);
			local229 = 0;
			while (local288 > local229) {
				@Pc(306) char local306 = local7.charAt(local229);
				if (local1) {
					return;
				}
				label1073: {
					if ((local306 < 'a' || local306 > 'z') && (local306 < 'A' || local306 > 'Z') && (local306 < '0' || local306 > '9') && local306 != '.' && local306 != '-' && local306 != '*' && local306 != '_') {
						if (local306 != ' ') {
							@Pc(406) byte var34;
							label1074: {
								if ((local306 <= '\u0000' || local306 >= '\u0080') && (local306 < ' ' || local306 > 'ÿ')) {
									if (local306 != '€') {
										if (local306 == '‚') {
											var34 = -126;
											if (!local1) {
												break label1074;
											}
										}
										if (local306 == 'ƒ') {
											var34 = -125;
											if (!local1) {
												break label1074;
											}
										}
										if (local306 == '„') {
											var34 = -124;
											if (!local1) {
												break label1074;
											}
										}
										if (local306 == '…') {
											var34 = -123;
											if (!local1) {
												break label1074;
											}
										}
										if (local306 != '†') {
											if (local306 == '‡') {
												var34 = -121;
												if (!local1) {
													break label1074;
												}
											}
											if (local306 != 'ˆ') {
												if (local306 != '‰') {
													if (local306 == 'Š') {
														var34 = -118;
														if (!local1) {
															break label1074;
														}
													}
													if (local306 == '‹') {
														var34 = -117;
														if (!local1) {
															break label1074;
														}
													}
													if (local306 == 'Œ') {
														var34 = -116;
														if (!local1) {
															break label1074;
														}
													}
													if (local306 == 'Ž') {
														var34 = -114;
														if (!local1) {
															break label1074;
														}
													}
													if (local306 == '‘') {
														var34 = -111;
														if (!local1) {
															break label1074;
														}
													}
													if (local306 == '’') {
														var34 = -110;
														if (!local1) {
															break label1074;
														}
													}
													if (local306 == '“') {
														var34 = -109;
														if (!local1) {
															break label1074;
														}
													}
													if (local306 == '”') {
														var34 = -108;
														if (!local1) {
															break label1074;
														}
													}
													if (local306 == '•') {
														var34 = -107;
														if (!local1) {
															break label1074;
														}
													}
													if (local306 != '–') {
														if (local306 != '—') {
															if (local306 == '˜') {
																var34 = -104;
																if (!local1) {
																	break label1074;
																}
															}
															if (local306 != '™') {
																if (local306 != 'š') {
																	if (local306 == '›') {
																		var34 = -101;
																		if (!local1) {
																			break label1074;
																		}
																	}
																	if (local306 != 'œ') {
																		if (local306 != 'ž') {
																			if (local306 != 'Ÿ') {
																				var34 = 63;
																				if (!local1) {
																					break label1074;
																				}
																			}
																			var34 = -97;
																			if (!local1) {
																				break label1074;
																			}
																		}
																		var34 = -98;
																		if (!local1) {
																			break label1074;
																		}
																	}
																	var34 = -100;
																	if (!local1) {
																		break label1074;
																	}
																}
																var34 = -102;
																if (!local1) {
																	break label1074;
																}
															}
															var34 = -103;
															if (!local1) {
																break label1074;
															}
														}
														var34 = -105;
														if (!local1) {
															break label1074;
														}
													}
													var34 = -106;
													if (!local1) {
														break label1074;
													}
												}
												var34 = -119;
												if (!local1) {
													break label1074;
												}
											}
											var34 = -120;
											if (!local1) {
												break label1074;
											}
										}
										var34 = -122;
										if (!local1) {
											break label1074;
										}
									}
									var34 = -128;
									if (!local1) {
										break label1074;
									}
								}
								var34 = (byte) local306;
							}
							@Pc(684) int var35;
							label852: {
								local293.append('%');
								var35 = var34 >> 4 & 0xF;
								if (var35 < 10) {
									local293.append((char) (48 - -var35));
									if (!local1) {
										break label852;
									}
								}
								local293.append((char) (var35 + 55));
							}
							label847: {
								var35 = var34 & 0xF;
								if (var35 < 10) {
									local293.append((char) (var35 + 48));
									if (!local1) {
										break label847;
									}
								}
								local293.append((char) (var35 + 55));
							}
							if (!local1) {
								break label1073;
							}
						}
						local293.append('+');
						if (!local1) {
							break label1073;
						}
					}
					local293.append(local306);
				}
				local229++;
				if (local1) {
					break;
				}
			}
			@Pc(759) String local759 = local293.toString();
			@Pc(763) URL local763 = null;
			if (arg2 > -61) {
				return;
			}
			if (Class707_Sub1_Sub1_Sub1_Sub1.anApplet5 != null) {
				local763 = Class707_Sub1_Sub1_Sub1_Sub1.anApplet5.getCodeBase();
			} else if (Class708.aClass707_7 != null) {
				local763 = Class707.method36606(-28662, Class708.aClass707_7);
			}
			if (local763 == null) {
				return;
			}
			local34 = "Unknown";
			@Pc(797) String local797 = "1.1";
			try {
				local34 = System.getProperty("java.vendor");
				local797 = System.getProperty("java.version");
			} catch (@Pc(809) Exception local809) {
			}
			@Pc(995) byte var18;
			@Pc(1262) int var19;
			@Pc(862) StringBuilder var36;
			@Pc(875) char var38;
			@Pc(864) int var39;
			@Pc(850) String var42;
			label1022: {
				local55 = "clienterror.ws?c=" + Class707_Sub1_Sub1_Sub1_Sub1_Sub1.anInt5917 * 343056763 + "&cs=" + Class707_Sub1_Sub1_Sub1_Sub1_Sub1.anInt5916 * -1848698863 + "&u=";
				if (Rs2Applet.aString249 == null) {
					var42 = "" + Class707_Sub1_Sub1_Sub1_Sub1_Sub1.aLong304 * -5241361465821465671L;
					if (!local1) {
						break label1022;
					}
				}
				local69 = Rs2Applet.aString249;
				local75 = local69.length();
				var36 = new StringBuilder(local75);
				var39 = 0;
				while (var39 < local75) {
					var38 = local69.charAt(var39);
					if (local1) {
						return;
					}
					label1078: {
						if (var38 >= 'a' && var38 <= 'z' || var38 >= 'A' && var38 <= 'Z' || var38 >= '0' && var38 <= '9' || var38 == '.' || var38 == '-' || var38 == '*' || var38 == '_') {
							var36.append(var38);
							if (!local1) {
								break label1078;
							}
						}
						if (var38 != ' ') {
							label1079: {
								if ((var38 <= '\u0000' || var38 >= '\u0080') && (var38 < ' ' || var38 > 'ÿ')) {
									if (var38 != '€') {
										if (var38 != '‚') {
											if (var38 == 'ƒ') {
												var18 = -125;
												if (!local1) {
													break label1079;
												}
											}
											if (var38 != '„') {
												if (var38 == '…') {
													var18 = -123;
													if (!local1) {
														break label1079;
													}
												}
												if (var38 != '†') {
													if (var38 != '‡') {
														if (var38 == 'ˆ') {
															var18 = -120;
															if (!local1) {
																break label1079;
															}
														}
														if (var38 != '‰') {
															if (var38 != 'Š') {
																if (var38 == '‹') {
																	var18 = -117;
																	if (!local1) {
																		break label1079;
																	}
																}
																if (var38 == 'Œ') {
																	var18 = -116;
																	if (!local1) {
																		break label1079;
																	}
																}
																if (var38 != 'Ž') {
																	if (var38 != '‘') {
																		if (var38 != '’') {
																			if (var38 != '“') {
																				if (var38 != '”') {
																					if (var38 == '•') {
																						var18 = -107;
																						if (!local1) {
																							break label1079;
																						}
																					}
																					if (var38 == '–') {
																						var18 = -106;
																						if (!local1) {
																							break label1079;
																						}
																					}
																					if (var38 == '—') {
																						var18 = -105;
																						if (!local1) {
																							break label1079;
																						}
																					}
																					if (var38 == '˜') {
																						var18 = -104;
																						if (!local1) {
																							break label1079;
																						}
																					}
																					if (var38 != '™') {
																						if (var38 == 'š') {
																							var18 = -102;
																							if (!local1) {
																								break label1079;
																							}
																						}
																						if (var38 == '›') {
																							var18 = -101;
																							if (!local1) {
																								break label1079;
																							}
																						}
																						if (var38 == 'œ') {
																							var18 = -100;
																							if (!local1) {
																								break label1079;
																							}
																						}
																						if (var38 != 'ž') {
																							if (var38 != 'Ÿ') {
																								var18 = 63;
																								if (!local1) {
																									break label1079;
																								}
																							}
																							var18 = -97;
																							if (!local1) {
																								break label1079;
																							}
																						}
																						var18 = -98;
																						if (!local1) {
																							break label1079;
																						}
																					}
																					var18 = -103;
																					if (!local1) {
																						break label1079;
																					}
																				}
																				var18 = -108;
																				if (!local1) {
																					break label1079;
																				}
																			}
																			var18 = -109;
																			if (!local1) {
																				break label1079;
																			}
																		}
																		var18 = -110;
																		if (!local1) {
																			break label1079;
																		}
																	}
																	var18 = -111;
																	if (!local1) {
																		break label1079;
																	}
																}
																var18 = -114;
																if (!local1) {
																	break label1079;
																}
															}
															var18 = -118;
															if (!local1) {
																break label1079;
															}
														}
														var18 = -119;
														if (!local1) {
															break label1079;
														}
													}
													var18 = -121;
													if (!local1) {
														break label1079;
													}
												}
												var18 = -122;
												if (!local1) {
													break label1079;
												}
											}
											var18 = -124;
											if (!local1) {
												break label1079;
											}
										}
										var18 = -126;
										if (!local1) {
											break label1079;
										}
									}
									var18 = -128;
									if (!local1) {
										break label1079;
									}
								}
								var18 = (byte) var38;
							}
							label701: {
								var36.append('%');
								var19 = var18 >> 4 & 0xF;
								if (var19 >= 10) {
									var36.append((char) (var19 - -55));
									if (!local1) {
										break label701;
									}
								}
								var36.append((char) (var19 + 48));
							}
							label696: {
								var19 = var18 & 0xF;
								if (var19 < 10) {
									var36.append((char) (var19 + 48));
									if (!local1) {
										break label696;
									}
								}
								var36.append((char) (55 - -var19));
							}
							if (!local1) {
								break label1078;
							}
						}
						var36.append('+');
					}
					var39++;
					if (local1) {
						break;
					}
				}
				local66 = var36.toString();
				var42 = local66;
			}
			local66 = local55 + var42 + "&v1=";
			local75 = local34.length();
			var36 = new StringBuilder(local75);
			var39 = 0;
			while (var39 < local75) {
				var38 = local34.charAt(var39);
				if (local1) {
					return;
				}
				label1080: {
					if (var38 >= 'a' && var38 <= 'z' || var38 >= 'A' && var38 <= 'Z' || var38 >= '0' && var38 <= '9' || var38 == '.' || var38 == '-' || var38 == '*' || var38 == '_') {
						var36.append(var38);
						if (!local1) {
							break label1080;
						}
					}
					if (var38 != ' ') {
						label1081: {
							if (var38 > '\u0000' && var38 < '\u0080' || var38 >= ' ' && var38 <= 'ÿ') {
								var18 = (byte) var38;
								if (!local1) {
									break label1081;
								}
							}
							if (var38 != '€') {
								if (var38 != '‚') {
									if (var38 != 'ƒ') {
										if (var38 != '„') {
											if (var38 == '…') {
												var18 = -123;
												if (!local1) {
													break label1081;
												}
											}
											if (var38 != '†') {
												if (var38 != '‡') {
													if (var38 == 'ˆ') {
														var18 = -120;
														if (!local1) {
															break label1081;
														}
													}
													if (var38 != '‰') {
														if (var38 == 'Š') {
															var18 = -118;
															if (!local1) {
																break label1081;
															}
														}
														if (var38 == '‹') {
															var18 = -117;
															if (!local1) {
																break label1081;
															}
														}
														if (var38 == 'Œ') {
															var18 = -116;
															if (!local1) {
																break label1081;
															}
														}
														if (var38 == 'Ž') {
															var18 = -114;
															if (!local1) {
																break label1081;
															}
														}
														if (var38 != '‘') {
															if (var38 != '’') {
																if (var38 != '“') {
																	if (var38 == '”') {
																		var18 = -108;
																		if (!local1) {
																			break label1081;
																		}
																	}
																	if (var38 == '•') {
																		var18 = -107;
																		if (!local1) {
																			break label1081;
																		}
																	}
																	if (var38 != '–') {
																		if (var38 == '—') {
																			var18 = -105;
																			if (!local1) {
																				break label1081;
																			}
																		}
																		if (var38 != '˜') {
																			if (var38 != '™') {
																				if (var38 != 'š') {
																					if (var38 != '›') {
																						if (var38 == 'œ') {
																							var18 = -100;
																							if (!local1) {
																								break label1081;
																							}
																						}
																						if (var38 == 'ž') {
																							var18 = -98;
																							if (!local1) {
																								break label1081;
																							}
																						}
																						if (var38 == 'Ÿ') {
																							var18 = -97;
																							if (!local1) {
																								break label1081;
																							}
																						}
																						var18 = 63;
																						if (!local1) {
																							break label1081;
																						}
																					}
																					var18 = -101;
																					if (!local1) {
																						break label1081;
																					}
																				}
																				var18 = -102;
																				if (!local1) {
																					break label1081;
																				}
																			}
																			var18 = -103;
																			if (!local1) {
																				break label1081;
																			}
																		}
																		var18 = -104;
																		if (!local1) {
																			break label1081;
																		}
																	}
																	var18 = -106;
																	if (!local1) {
																		break label1081;
																	}
																}
																var18 = -109;
																if (!local1) {
																	break label1081;
																}
															}
															var18 = -110;
															if (!local1) {
																break label1081;
															}
														}
														var18 = -111;
														if (!local1) {
															break label1081;
														}
													}
													var18 = -119;
													if (!local1) {
														break label1081;
													}
												}
												var18 = -121;
												if (!local1) {
													break label1081;
												}
											}
											var18 = -122;
											if (!local1) {
												break label1081;
											}
										}
										var18 = -124;
										if (!local1) {
											break label1081;
										}
									}
									var18 = -125;
									if (!local1) {
										break label1081;
									}
								}
								var18 = -126;
								if (!local1) {
									break label1081;
								}
							}
							var18 = -128;
						}
						label560: {
							var36.append('%');
							var19 = var18 >> 4 & 0xF;
							if (var19 < 10) {
								var36.append((char) (var19 + 48));
								if (!local1) {
									break label560;
								}
							}
							var36.append((char) (var19 + 55));
						}
						label555: {
							var19 = var18 & 0xF;
							if (var19 >= 10) {
								var36.append((char) (var19 + 55));
								if (!local1) {
									break label555;
								}
							}
							var36.append((char) (var19 + 48));
						}
						if (!local1) {
							break label1080;
						}
					}
					var36.append('+');
				}
				var39++;
				if (local1) {
					break;
				}
			}
			local69 = var36.toString();
			@Pc(1820) String local1820 = local66 + local69 + "&v2=";
			local143 = local797.length();
			@Pc(1828) StringBuilder local1828 = new StringBuilder(local143);
			@Pc(1830) int local1830 = 0;
			while (local1830 < local143) {
				@Pc(1841) char local1841 = local797.charAt(local1830);
				if (local1) {
					return;
				}
				label1084: {
					if (local1841 >= 'a' && local1841 <= 'z' || local1841 >= 'A' && local1841 <= 'Z' || local1841 >= '0' && local1841 <= '9' || local1841 == '.' || local1841 == '-' || local1841 == '*' || local1841 == '_') {
						local1828.append(local1841);
						if (!local1) {
							break label1084;
						}
					}
					if (local1841 == ' ') {
						local1828.append('+');
						if (!local1) {
							break label1084;
						}
					}
					@Pc(1953) byte var21;
					label1083: {
						if ((local1841 <= '\u0000' || local1841 >= '\u0080') && (local1841 < ' ' || local1841 > 'ÿ')) {
							if (local1841 == '€') {
								var21 = -128;
								if (!local1) {
									break label1083;
								}
							}
							if (local1841 != '‚') {
								if (local1841 == 'ƒ') {
									var21 = -125;
									if (!local1) {
										break label1083;
									}
								}
								if (local1841 == '„') {
									var21 = -124;
									if (!local1) {
										break label1083;
									}
								}
								if (local1841 != '…') {
									if (local1841 == '†') {
										var21 = -122;
										if (!local1) {
											break label1083;
										}
									}
									if (local1841 == '‡') {
										var21 = -121;
										if (!local1) {
											break label1083;
										}
									}
									if (local1841 == 'ˆ') {
										var21 = -120;
										if (!local1) {
											break label1083;
										}
									}
									if (local1841 == '‰') {
										var21 = -119;
										if (!local1) {
											break label1083;
										}
									}
									if (local1841 == 'Š') {
										var21 = -118;
										if (!local1) {
											break label1083;
										}
									}
									if (local1841 == '‹') {
										var21 = -117;
										if (!local1) {
											break label1083;
										}
									}
									if (local1841 == 'Œ') {
										var21 = -116;
										if (!local1) {
											break label1083;
										}
									}
									if (local1841 != 'Ž') {
										if (local1841 == '‘') {
											var21 = -111;
											if (!local1) {
												break label1083;
											}
										}
										if (local1841 != '’') {
											if (local1841 == '“') {
												var21 = -109;
												if (!local1) {
													break label1083;
												}
											}
											if (local1841 != '”') {
												if (local1841 != '•') {
													if (local1841 != '–') {
														if (local1841 == '—') {
															var21 = -105;
															if (!local1) {
																break label1083;
															}
														}
														if (local1841 != '˜') {
															if (local1841 == '™') {
																var21 = -103;
																if (!local1) {
																	break label1083;
																}
															}
															if (local1841 != 'š') {
																if (local1841 == '›') {
																	var21 = -101;
																	if (!local1) {
																		break label1083;
																	}
																}
																if (local1841 == 'œ') {
																	var21 = -100;
																	if (!local1) {
																		break label1083;
																	}
																}
																if (local1841 != 'ž') {
																	if (local1841 != 'Ÿ') {
																		var21 = 63;
																		if (!local1) {
																			break label1083;
																		}
																	}
																	var21 = -97;
																	if (!local1) {
																		break label1083;
																	}
																}
																var21 = -98;
																if (!local1) {
																	break label1083;
																}
															}
															var21 = -102;
															if (!local1) {
																break label1083;
															}
														}
														var21 = -104;
														if (!local1) {
															break label1083;
														}
													}
													var21 = -106;
													if (!local1) {
														break label1083;
													}
												}
												var21 = -107;
												if (!local1) {
													break label1083;
												}
											}
											var21 = -108;
											if (!local1) {
												break label1083;
											}
										}
										var21 = -110;
										if (!local1) {
											break label1083;
										}
									}
									var21 = -114;
									if (!local1) {
										break label1083;
									}
								}
								var21 = -123;
								if (!local1) {
									break label1083;
								}
							}
							var21 = -126;
							if (!local1) {
								break label1083;
							}
						}
						var21 = (byte) local1841;
					}
					@Pc(2240) int var22;
					label419: {
						local1828.append('%');
						var22 = var21 >> 4 & 0xF;
						if (var22 < 10) {
							local1828.append((char) (var22 - -48));
							if (!local1) {
								break label419;
							}
						}
						local1828.append((char) (var22 + 55));
					}
					var22 = var21 & 0xF;
					if (var22 >= 10) {
						local1828.append((char) (55 - -var22));
						if (!local1) {
							break label1084;
						}
					}
					local1828.append((char) (48 - -var22));
				}
				local1830++;
				if (local1) {
					break;
				}
			}
			local91 = local1828.toString();
			@Pc(2319) URL local2319 = new URL(local763, local1820 + local91 + "&e=" + local759);
			@Pc(2325) DataInputStream local2325 = new DataInputStream(local2319.openStream());
			local2325.read();
			local2325.close();
		} catch (@Pc(2332) Exception local2332) {
			local2332.printStackTrace();
		}
	}
}
