insert into cultura (idCultura, nome) values (1, 'Cereais'), (2, 'Hortaliças'), (3, 'Cana'), (4, 'Frutas'), (5, 'Pecuária'), (6, 'Flores'), (7, 'Café');

insert into area (idArea, tamanho) values (1, 'Até 50 ha'), (2, 'Até 500 ha'), (3, 'Acima de 500 ha');

insert into produto (idProduto, nome, descricao, idArea, imagem, capa, maisVendido) values (1, 'PJ 401', 'Desenvolvida para uma pulverização uniforme, custo reduzido de manutenção e alto rendimento operacional diário comparado com aplicações manuais. Bomba de pistões com camisa de cerâmica altamente resistente ao desgaste. A bomba reduz a quantidade de paradas para manutenção, proporcionando uma maior disponibilidade do equipamento para o produtor, garantindo a aplicação no momento correto.', 1, 'product_tour_14_1595617794587_PJ_401_14.jpg', 'product_header_image_landscape_1585240203017_pj_401.gif', 0), (2, 'Condorito 600', 'Desenvolvida para uma pulverização uniforme, custo reduzido de manutenção e alto rendimento operacional diário comparado com aplicações manuais. Comando CJ-42 com alívio rápido que evita sobrecarga de pressão no circuito defensivo. Manômetro com escala estendida e banho em glicerina, proporcionando melhor leitura.', 2, 'product_tour_6_1595617305449_CONDORITO_600_9.jpg', 'product_header_image_landscape_1595594057417_Condorito_600_pasto.jpg', 0), (3, 'Condor 600 M12 / M14', 'A abertura e o fechamento das barras são feitas manualmente permitindo que as operações sejam realizadas sem complicações. Melhor opção de baixo custo para alcançar uniformidade e rendimento operacional nas aplicações com as barras de 12 ou 14 metros.', 2, 'product_tour_5_1595618889621_CONDOR_M_12_6.jpg', 'product_header_image_landscape_1585311639320_condor_600_m12.gif', 0), (4, 'Condor 600 AM12 / AM14', 'Tanque de 600 litros, feito em polietileno, com acabamento polido das superfícies interna e externa para facilitar a limpeza. Resiste aos impactos e corrosões. Com barras de 12 e 14 metros o Condor 600 atende com qualidade aos mais diversos cultivos para o pequeno e médio produtor. O acionamento hidráulico permite ao operador total controle das barras, ganhando muito mais agilidade nas operações em campo.', 2, 'product_tour_1_1595619876555_CONDOR_AM_12_2.jpg', 'product_header_image_landscape_1587038663381_condor_600_am12.gif', 0), (5, 'Condor 800 M12', 'Melhor opção de baixo custo para alcançar uniformidade e rendimento operacional nas aplicações. Com barras de 12 metros o Condor 800 atende com qualidade aos mais diversos cultivos para o pequeno e médio produtor. A abertura e o fechamento das barras são feitas manualmente permitindo que as operações sejam realizadas sem complicações.', 2, 'product_tour_10_1595848280411_CONDOR_800_M_12_11.jpg', 'product_header_image_landscape_1585317154901_condor_800_m12.gif', 0), (6, 'Condor 800 AM12 / AM14', 'O acionamento hidráulico permite ao operador total controle das barras, ganhando muito mais agilidade nas operações em campo. Com 14 metros de barras o Condor 800 ganha alto rendimento operacional, sendo até 40% mais rápido no tempo de cobertura da área de atuação, aliado ao baixo índice de amassamento, reduz as perdas em até 29%.', 2, 'product_tour_15_1595853009697_CONDOR_800_AM_14_16.jpg', 'product_header_image_landscape_1587043070469_condor_800_am12.gif', 0), (7, 'Condor 800 AM18 / Multicontrol', 'Produzido para quem busca eficiência na pulverização, com alta tecnologia que proporciona economia e produtividade. O Condor 800 AM18 dispõe de comandos de pulverização e acionamento das barras. O agricultor pode escolher entre o comando Masterflow 4 vias (nas opções: alavanca, a cabo e elétrico) e o novo comando Multicontrol 6 vias.', 2, 'product_tour_1_1619616001155_Condor_800_Am18_Multicontrol_2.jpg', 'product_header_image_landscape_1587049513161_condor_800_am18.gif', 1), (8, 'Falcon AM14/Vortex', 'O ar das barras do falcon vortex melhora a penetração do defensivo no interior da plantação, produz uma excelente cobertura, inclusive na face inferior da folha. O Falcon AM14/Vortex dispõe de várias opções de comandos de pulverização e acionamento das barras. O agricultor pode escolher entre o comando Masterflow 4 vias com alavanca, Masterflow 4 vias a cabo, Masterflow elétrico ou Masterflow eletroeletrônico.', 2, 'product_tour_2_1595856213718_FALCON_VORTEX_16.jpg', 'product_header_image_landscape_1598528666377_Jacto_Falcon_Vortex_Caracteristicas_1.png', 0), (9, 'Condorito EM', 'A Linha EM foi desenvolvida especialmente para pulverização localizada, com alto rendimento operacional e custo reduzido de manutenção. O Condorito EM é equipado com lanças de pulverização, ou pode optar por equipar com pistolas de pulverização. Ideal para aplicação localizada. Possui de 1 a 2 enroladores de mangueira de longo alcance de acordo com a necessidade do cliente, possibilitando uma melhor movimentação na aplicação.', 2, 'product_tour_3_1595937790564_CONDORITO_EM_1_04.jpg', 'product_header_image_landscape_1588763272563_condorito_em.gif', 0), (10, 'Condor EM', 'A Linha EM foi desenvolvida especialmente para pulverização localizada, com alto rendimento operacional e custo reduzido de manutenção. Reservatório de 600 litros, feito em polietileno, com acabamento polido das superfícies interna e externa para facilitar a limpeza. Resiste aos impactos e corrosões', 2, 'product_tour_5_1595937970424_CONDOR_EM_6.jpg', 'product_header_image_landscape_1592244083158_condor_em.gif', 0), (11, 'BC 610 PEC', 'A Linha BC foi desenvolvida especialmente para aplicação em pastagens. Propicia alto rendimento operacional diário e custo reduzido de manutenção. Faixa de aplicação de até 10 metros. Barras fixas de 2,2 m de comprimento total equivalente à largura do trator, o que evita choques com obstáculos nas pastagens. Excelente para áreas de baixa mobilidade.', 3, 'product_tour_6_1595938541997_BC_610_PEC_15.jpg', 'product_header_image_landscape_1588686998349_bc_610_pec.gif', 0), (12, 'PH 400', 'O PH 400 aplica herbicida com eficiência e total proteção à planta. Asas protetoras em polietileno resistentes aos impactos e à corrosão são reguláveis também em altura e articuladas para acompanharem os desníveis do terreno. Altamente resistente aos impactos. As paredes lisas e o formato da peça facilitam o escoamento da calda e a limpeza interna.', 2, 'product_tour_13_1595938380298_PH_400_1.jpg', 'product_header_image_landscape_1588768329102_ph_400.gif', 0), (13, 'Coral PEC', 'A Coral PEC foi desenvolvida especialmente para pulverização em pastagens, com alto rendimento operacional diário e custo reduzido de manutenção. Faixa de aplicação de até 10 metros, com barras físicas de 2,2 metros, que acompanha a largura do trator evitando choque com os obstáculos das pastagens. Excelente para áreas de difícil mobilidade.', 2, 'product_tour_2_1595939173649_CORAL_PEC_3.jpg', 'product_header_image_landscape_1589243435283_coral_pec.gif', 0), (14, 'Coral B12', 'Coral B12 foi desenvolvido para uma pulverização uniforme, com alto rendimento operacional e custo reduzido. Tanque de 2.000 litros, feito em polietileno, com acabamento polido das superfícies interna e externa para facilitar a limpeza. Resiste aos impactos e corrosões.', 2, 'product_tour_13_1595614301956_CORAL_B_12_14.jpg', 'product_header_image_landscape_1589809000835_coral_b_12.gif', 1), (15, 'Coral AM14', 'O acionamento hidráulico permite ao operador total controle das barras, ganhando muito mais agilidade nas operações em campo. Tanque de 2.000 litros, feito em polietileno, com acabamento polido das superfícies interna e externa para facilitar a limpeza. Resiste aos impactos e corrosões.', 2, 'product_tour_3_1595614816862_CORAL_AM_14_4.jpg', 'product_header_image_landscape_1589821225834_coral_am_14.gif', 0), (16, 'Columbia Cross', 'Barras de 18 metros semi-hidráulicas, permite cobrir mais área em menos tempo. Suspensão trapezoidal. Com amortecedores e molas no quadro das barras, reduz o impacto das trepidações provocadas pelos desníveis do terreno, proporcionando maior estabilidade às barras, melhor qualidade de aplicação e excelente produção diária.', 2, 'product_tour_29_1595615803456_COLUMBIA_CROSS_TANDEN_2.jpg', 'product_header_image_landscape_1591730610798_columbia_cross.gif', 0), (17, 'Columbia AD18', 'Produzido para quem busca eficiência em pulverização, com alta tecnologia que proporciona economia e produtividade. Com 18 metros de barras o Columbia AD18 ganha alto rendimento operacional, sendo até 25% mais rápido no tempo de cobertura da área de atuação, aliado ao baixo índice de amassamento, reduz as perdas em até 22%.', 2, 'product_tour_1_1595616387374_COLUMBIA_AD_18__2.jpg', 'product_header_image_landscape_1589828466268_columbia_ad_18.gif', 0), (18, 'Advance 2000 AM18', 'Produzido para quem busca eficiência em pulverização. Com alta tecnologia, permite longas jornadas sem interrupção. Para um melhor controle de pulverização, a Linha Advance dispõe de várias opções de comandos de pulverização e acionamento das barras. O agricultor pode escolher entre o comando Masterflow, o comando Masterflow a cabo, o comando Masterflow elétrico e o comando Masterflow eletrônico.', 2, 'product_tour_0_1595612310536_ADVANCE_2000_AM_18_1.jpg', 'product_header_image_landscape_1589895787697_2000_am_18_capa.gif', 0), (19, 'Advance 2000 AM 18 Vortex', 'O ar das barras do Advance vortex além de melhorar a penetração do defensivo no interior da plantação, produz uma excelente cobertura, inclusive na face inferior da folha. Para um melhor controle de pulverização, a Linha Advance dispõe de várias opções de comandos de pulverização e acionamento das barras. O agricultor pode escolher entre o comando Masterflow, o comando Masterflow a cabo, o comando Masterflow elétrico e o comando Masterflow eletrônico.', 2, 'product_tour_15_1595611598493_ADVANCE_2000_VORTEX_16.jpg', 'product_header_image_landscape_1589912854129_2000_vortex_capa.gif', 0), (20, 'Advance 3000 AM18', 'Reduz o tempo que o operador gasta para abrir e fechar as barras e realizar manobras nos finais de rua. As operações são realizadas sem esforço físico e com total segurança ao operador. Permite grandes jornadas de trabalho. Produzido em polietileno resistente à corrosão, de fácil limpeza e design moderno.', 3, 'product_tour_7_1598612861723_ADVANCE_3000_AM_18_15.jpg', 'product_header_image_landscape_1589915679621_3000_am_18_capa.gif', 0), (21, 'Advance 3000 AM 18 Vortex', 'A redução da deriva evita a interrupção do trabalho em dias de vento mais forte. O ar das barras do Advance Vortex além de melhorar a penetração do defensivo no interior da plantação, produz uma excelente cobertura, inclusive na face inferior da folha. Para um melhor controle de pulverização, a Linha Advance dispõe de várias opções de comandos de pulverização e acionamento das barras. O agricultor pode escolher entre o comando Masterflow, o comando Masterflow a cabo, o comando Masterflow elétrico e o comando Masterflow eletrônico.', 3, 'product_tour_7_1598612861723_ADVANCE_3000_AM_18_15.jpg', 'product_header_image_landscape_1589980493368_3000_vortex_capa.gif', 0), (22, 'Advance 3000 AM21', 'Produzido para quem busca eficiência em pulverização. Com alta tecnologia, permite longas jornadas sem interrupção. Com 21 metros de barras o Advance AM21 ganha alto rendimento operacional, sendo até 15% mais rápido no tempo de cobertura da área de atuação, aliado ao baixo índice de amassamento, reduz as perdas em até 14%.', 3, 'product_tour_15_1595612663650_ADVANCE_3000_AM_21_15.jpg', 'product_header_image_landscape_1589986156150_3000_am21_capa.gif', 0), (23, 'Advance 3000 AM24 / Multicontrol', 'Produzido para quem busca eficiência na pulverização, com alta tecnologia que proporciona economia e produtividade. Com 24 metros de barras, o Advance 3000 AM24 ganha alto rendimento operacional, sendo até 12% mais rápido no tratamento do talhão, aliado ao baixo índice de amassamento, que reduz as perdas em até 13%.', 3, 'product_image_1619618473354_3000_am_24.gif', 'product_header_image_landscape_1598900115393_adv_3000_AM24_Multi.jpg', 0), (24, 'Advance 3000 AM24 / Tanden Arroz / Multicontrol', 'O eixo tanden alongado proporciona uma melhor estabilidade para a máquina e consequentemente para a barra. A maior distância entre eixos e a possibilidade da abertura da bitola, aumentam as distâncias dos pontos de apoio da máquina, absorvendo melhor as irregularidades do terreno. Gerencia toda a pulverização e garante que o volume seja aplicado corretamente, independente das variações de velocidade*. Barra de luz e corte de seções: indica ao operador a direção correta do caminhamento e corta automaticamente a pulverização onde o produto já foi aplicado. Desta forma Economiza produto e evita falhas e sobreposições que afetam a qualidade da aplicação.', 3, 'product_tour_0_1619619719817_Advance_3000_AM_24_Tandem_2.jpg', 'product_header_image_landscape_1595590900538_Admvance_3000_am24.jpg', 0);

insert into culturas_do_produto (idProduto, idCultura) values (1, 1), (1, 2), (1, 3), (1, 4), (1, 5), (2, 1), (2, 2), (2, 3), (2, 6), (3, 1), (3, 2), (3, 3), (3, 6), (4, 1), (4, 2), (4, 3), (4, 6), (5, 1), (5, 2), (5, 3), (5, 6), (6, 1), (6, 2), (6, 3), (6, 6), (7, 1), (7, 2), (7, 3), (7, 6), (8, 4), (8, 6), (9, 5), (9, 4), (9, 6), (10, 5), (10, 4), (10, 6), (11, 5), (12, 1), (12, 2), (12, 7), (13, 5), (14, 6), (15, 1), (15, 2), (15, 3), (15, 6), (16, 1), (16, 2), (16, 3), (16, 6), (17, 1), (17, 2), (17, 3), (17, 6), (18, 1), (18, 2), (18, 3), (18, 6), (19, 1), (19, 2), (19, 3), (19, 4), (19, 6), (20, 1), (20, 2), (20, 3), (20, 6), (21, 1), (21, 2), (21, 3), (21, 4), (21, 6), (22, 1), (22, 2), (22, 3), (22, 6), (23, 1), (23, 2), (23, 3), (23, 6), (24, 1), (24, 2), (24, 3);